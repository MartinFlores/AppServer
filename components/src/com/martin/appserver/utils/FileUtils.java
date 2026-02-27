// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
package com.martin.appserver.utils;

import com.martin.appserver.utils.MimeTypeMap;
import java.io.File;

public class FileUtils {
   public FileUtils() {
   }

   public static String normalizePath(String path) {
      return !path.equals("/") && !path.equals("/app") && !path.equals("/app/") ? path : "/index.html";
   }

   public static String cleanPath(String path) {
      return path.startsWith("/") ? path.substring(1) : path;
   }

   public static String getMimeType(String filePath) {
      String extension = MimeTypeMap.getFileExtensionFromUrl(filePath);
      String mimeType = MimeTypeMap.getSingleton().getMimeTypeFromExtension(extension);
      return mimeType != null ? mimeType : "application/octet-stream";
   }

   public static boolean isValidFile(File file) {
      return file.exists() && !file.isDirectory();
   }
}
