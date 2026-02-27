// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
package com.martin.appserver.web;

import android.content.Context;
import com.martin.appserver.utils.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class WebAppManager {
   private static volatile String lastErrorMessage = null;

   public WebAppManager() {
   }

   public static boolean webAppExists(Context context) {
      File www = new File(context.getFilesDir(), "www");
      File index = new File(www, "index.html");
      return index.exists();
   }

   public static void downloadIfNeeded(final Context context) {
      if (webAppExists(context)) {
         Log.i("AppServer", "WebApp ya existe.");
      } else {
         Log.i("AppServer", "Descargando WebApp...");
         new Thread(new Runnable() {
            @Override
            public void run() {
               downloadIfNeededBlocking(context);
            }
         }).start();
      }
   }

   public static boolean downloadIfNeededBlocking(Context context) {
      if (webAppExists(context)) {
         Log.i("AppServer", "WebApp ya existe.");
         return true;
      } else {
         Log.i("AppServer", "Descargando WebApp (bloqueante)...");
         lastErrorMessage = null;

         try {
            URL url = new URL("https://github.com/MartinFlores/AppServer/releases/download/AppServer/webapp.zip");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.connect();
            InputStream input = connection.getInputStream();
            File zipFile = new File(context.getFilesDir(), "webapp.zip");
            FileOutputStream output = new FileOutputStream(zipFile);
            byte[] buffer = new byte[8192];

            int bytesRead;
            while ((bytesRead = input.read(buffer)) != -1) {
               output.write(buffer, 0, bytesRead);
            }

            output.close();
            input.close();
            unzip(zipFile, new File(context.getFilesDir(), "www"));
            zipFile.delete();
            Log.i("AppServer", "WebApp descargada y descomprimida.");
            return webAppExists(context);
         } catch (Exception var8) {
            Log.e("AppServer", "Error descargando WebApp", var8);
            lastErrorMessage = var8.getMessage();
            return false;
         }
      }
   }

   public static String getLastErrorMessage() {
      return lastErrorMessage;
   }

   private static void unzip(File zipFile, File targetDirectory) throws IOException {
      if (!targetDirectory.exists()) {
         targetDirectory.mkdirs();
      }

      byte[] buffer = new byte[8192];

      ZipInputStream zis;
      ZipEntry entry;
      for (zis = new ZipInputStream(new FileInputStream(zipFile)); (entry = zis.getNextEntry()) != null; zis
            .closeEntry()) {
         File newFile = new File(targetDirectory, entry.getName());
         if (entry.isDirectory()) {
            newFile.mkdirs();
         } else {
            (new File(newFile.getParent())).mkdirs();
            FileOutputStream fos = new FileOutputStream(newFile);

            int len;
            while ((len = zis.read(buffer)) > 0) {
               fos.write(buffer, 0, len);
            }

            fos.close();
         }
      }

      zis.close();
   }
}
