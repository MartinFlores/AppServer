// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
package com.martin.appserver;

import com.martin.appserver.database.DBAdapter;
import com.martin.appserver.database.StandaloneDB;
import com.martin.appserver.routing.RouteRegistry;
import com.martin.appserver.routing.Router;
import com.martin.appserver.utils.ServerLogger;
import com.martin.appserver.utils.StandaloneNetworkUtils;
import com.martin.appserver.server.ClientHandler;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class StandaloneServer {
   private static final int PORT = 7979;
   private static final String WWW_ROOT = "www";

   public StandaloneServer() {
   }

   public static void main(String[] args) {
      String wwwRootPath = WWW_ROOT;
      if (args.length > 0) {
         wwwRootPath = args[0];
      }

      DBAdapter.initialize((Object) null);
      RouteRegistry.register();
      String localIp = StandaloneNetworkUtils.getLocalIp();
      ServerLogger.log("Servidor iniciado en puerto 7979");
      ServerLogger.log("Rutas registradas: " + Router.count());
      System.out.println("===========================================");
      System.out.println("AppServer iniciado en http://" + localIp + ":" + 7979);
      System.out.println("Rutas registradas: " + Router.count());
      System.out.println("===========================================");
      System.out.println("\nPresiona Ctrl+C para detener\n");

      try {
         ServerSocket serverSocket = new ServerSocket(7979, 50, (InetAddress) null);
         Throwable var3 = null;

         try {
            while (true) {
               Socket client = serverSocket.accept();
               (new Thread(new ClientHandler(client, new java.io.File(wwwRootPath)))).start();
            }
         } catch (Throwable var19) {
            var3 = var19;
            throw var19;
         } finally {
            if (serverSocket != null) {
               if (var3 != null) {
                  try {
                     serverSocket.close();
                  } catch (Throwable var18) {
                     var3.addSuppressed(var18);
                  }
               } else {
                  serverSocket.close();
               }
            }

         }
      } catch (IOException var21) {
         System.err.println("Error: " + var21.getMessage());
      } finally {
         StandaloneDB.close();
      }

   }
}
