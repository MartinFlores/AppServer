package com.martin.appserver;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build.VERSION;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.google.appinventor.components.annotations.DesignerComponent;
import com.google.appinventor.components.annotations.SimpleFunction;
import com.google.appinventor.components.annotations.SimpleObject;
import com.google.appinventor.components.common.ComponentCategory;
import com.google.appinventor.components.runtime.AndroidNonvisibleComponent;
import com.google.appinventor.components.runtime.ComponentContainer;
import com.google.appinventor.components.runtime.WebViewer;
import com.martin.appserver.database.DB;
import com.martin.appserver.routing.RouteRegistry;
import com.martin.appserver.server.HttpServer;
import com.martin.appserver.utils.NetworkUtils;
import com.martin.appserver.utils.ServerLogger;
import com.martin.appserver.utils.ZipUtils;
import com.martin.appserver.web.WebAppManager;
import java.io.File;
import java.io.InputStream;

@DesignerComponent(version = 16, category = ComponentCategory.EXTENSION, nonVisible = true)
@SimpleObject(external = true)
public class AppServer extends AndroidNonvisibleComponent {
   private HttpServer httpServer;
   private File wwwRoot;
   private final ComponentContainer container;

   public AppServer(ComponentContainer container) {
      super(container.$form());
      this.container = container;

      try {
         this.initializeWwwFolder();
         DB.initialize(container.$context());
         String[] sqlStatements = new String[] {
               "CREATE TABLE IF NOT EXISTS users (id INTEGER PRIMARY KEY AUTOINCREMENT, username TEXT NOT NULL, pin TEXT NOT NULL, created_at INTEGER NOT NULL)",
               "CREATE TABLE IF NOT EXISTS settings (key TEXT PRIMARY KEY, value TEXT)",
               "INSERT OR IGNORE INTO settings (key, value) VALUES ('db_version', '1')",
               "CREATE TABLE IF NOT EXISTS products (id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT NOT NULL, price REAL)",
               "INSERT OR IGNORE INTO products (name, price) VALUES ('Producto A', 10.99)",
               "INSERT OR IGNORE INTO products (name, price) VALUES ('Producto B', 20.50)",
               "INSERT OR IGNORE INTO products (name, price) VALUES ('Producto C', 5.00)" };

         for (String sql : sqlStatements) {
            DB.getDatabase().execSQL(sql);
         }
      } catch (Exception e) {
         AlertDialog.Builder builder = new AlertDialog.Builder(container.$context());
         builder.setTitle("Error");
         builder.setMessage("Error executing schema setup: " + e.getMessage());
         builder.setPositiveButton("OK", null);
         builder.show();
      }

   }

   @SimpleFunction(
      description = "Inicia con diagnóstico detallado"
   )
   public void InitializeFromCloud(final WebViewer webviewer) {
      final Context context = this.container.$context();
      if (!WebAppManager.webAppExists(context)) {
         AlertDialog.Builder builder = new AlertDialog.Builder(context);
         builder.setTitle("Descargando");
         builder.setMessage("Descargando WebApp por primera vez...");
         builder.setPositiveButton("OK", null);
         builder.show();
         
         new Thread(new Runnable() {
            @Override
            public void run() {
               if (WebAppManager.downloadIfNeededBlocking(context)) {
                  container.$form().runOnUiThread(new Runnable() {
                     @Override
                     public void run() {
                        StartServer();
                        openWebViewer(webviewer);
                     }
                  });
               }
            }
         }).start();
      } else {
         this.StartServer();
         this.openWebViewer(webviewer);
      }
   }

   private void openWebViewer(WebViewer webviewer) {
      String url = "http://" + this.GetLocalIp() + ":" + 7979 + "/app" + "?deviceRoot";
      webviewer.GoToUrl(url);

      try {
         View v = webviewer.getView();
         if (v instanceof WebView) {
            WebView wv = (WebView) v;
            WebSettings settings = wv.getSettings();
            settings.setBuiltInZoomControls(false);
            settings.setDisplayZoomControls(false);
            settings.setSupportZoom(false);
            settings.setDomStorageEnabled(true);
            settings.setJavaScriptEnabled(true);
            settings.setAllowFileAccess(true);
            settings.setAllowContentAccess(true);
            if (VERSION.SDK_INT >= 16) {
               settings.setAllowFileAccessFromFileURLs(true);
               settings.setAllowUniversalAccessFromFileURLs(true);
            }

            if (VERSION.SDK_INT >= 21) {
               settings.setMixedContentMode(0);
            }
         }
      } catch (Exception var6) {
      }

   }

   private void initializeWwwFolder() {
      this.wwwRoot = new File(this.container.$context().getFilesDir(), "www");
      if (!this.wwwRoot.exists()) {
         this.wwwRoot.mkdirs();
      }

   }

   private void extractWebApp(String zipFileName) {
      try {
         InputStream is = this.container.$form().openAsset(zipFileName);
         ZipUtils.unzipAssets(is, this.wwwRoot);
      } catch (Exception var3) {
      }

   }

   public void StartServer() {
      if (this.httpServer == null) {
         this.httpServer = new HttpServer(this.wwwRoot);
         RouteRegistry.register();
      }

      if (!this.httpServer.isRunning()) {
         this.httpServer.start();
      }

   }

   public void StopServer() {
      if (this.httpServer != null && this.httpServer.isRunning()) {
         this.httpServer.stop();
      }

   }

   @SimpleFunction(description = "Retorna la IP real del dispositivo en la red Wi-Fi")
   public String GetLocalIp() {
      return NetworkUtils.getLocalIp();
   }

   @SimpleFunction(description = "Obtiene los logs del servidor")
   public String GetServerLogs() {
      return ServerLogger.getLogs();
   }

   @SimpleFunction(description = "Limpia los logs del servidor")
   public void ClearServerLogs() {
      ServerLogger.clear();
   }
}
