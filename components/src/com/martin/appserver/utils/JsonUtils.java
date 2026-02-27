// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
package com.martin.appserver.utils;

import android.database.Cursor;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public class JsonUtils {
   public JsonUtils() {
   }

   public static String JSON(Object data) {
      try {
         if (!(data instanceof JSONObject) && !(data instanceof JSONArray)) {
            return data instanceof Map ? (new JSONObject((Map) data)).toString() : JSONObject.wrap(data).toString();
         } else {
            return data.toString();
         }
      } catch (Exception var2) {
         return "{\"status\":\"error\",\"message\":\"JSON parse error\"}";
      }
   }

   public static JSONObject obj() {
      return new JSONObject();
   }

   public static JSONArray arr() {
      return new JSONArray();
   }

   public static String responseOk(Object data) {
      try {
         JSONObject res = new JSONObject();
         res.put("status", "ok");
         res.put("data", data);
         return res.toString();
      } catch (Exception var2) {
         return responseError("JSON build error");
      }
   }

   public static String responseError(String message) {
      try {
         JSONObject res = new JSONObject();
         res.put("status", "error");
         res.put("message", message);
         return res.toString();
      } catch (Exception var2) {
         return "{\"status\":\"error\",\"message\":\"fatal json error\"}";
      }
   }

   public static JSONArray cursorToJsonArray(Cursor cursor) {
      JSONArray array = new JSONArray();
      if (cursor == null) {
         return array;
      } else {
         while (cursor.moveToNext()) {
            JSONObject row = new JSONObject();

            for (int i = 0; i < cursor.getColumnCount(); ++i) {
               try {
                  String columnName = cursor.getColumnName(i);
                  switch (cursor.getType(i)) {
                     case 0:
                     default:
                        row.put(columnName, JSONObject.NULL);
                        break;
                     case 1:
                        row.put(columnName, cursor.getLong(i));
                        break;
                     case 2:
                        row.put(columnName, cursor.getDouble(i));
                        break;
                     case 3:
                        row.put(columnName, cursor.getString(i));
                        break;
                     case 4:
                        row.put(columnName, "BLOB");
                  }
               } catch (Exception var5) {
               }
            }

            array.put(row);
         }

         return array;
      }
   }
}
