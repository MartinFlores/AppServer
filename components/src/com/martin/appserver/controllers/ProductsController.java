// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
package com.martin.appserver.controllers;

import com.martin.appserver.database.DBAdapter;
import com.martin.appserver.routing.Controller;
import com.martin.appserver.routing.Get;
import com.martin.appserver.utils.JsonResponse;
import java.util.List;
import java.util.Map;

@Controller("/api/v1/products")
public class ProductsController {
   public ProductsController() {
   }

   @Get("/all")
   public String getAllProducts() {
      try {
         List<Map<String, Object>> products = DBAdapter.query("SELECT p.*, c.name as category_name FROM products p LEFT JOIN categories c ON p.category_id = c.id WHERE p.status = 'available'");
         return JsonResponse.create().put("status", "ok").put("data", products).send();
      } catch (Exception var2) {
         return JsonResponse.create().put("status", "error").put("message", var2.getMessage()).send();
      }
   }

   @Get("/categories")
   public String getCategories() {
      try {
         List<Map<String, Object>> categories = DBAdapter.query("SELECT * FROM categories");
         return JsonResponse.create().put("status", "ok").put("data", categories).send();
      } catch (Exception var2) {
         return JsonResponse.create().put("status", "error").put("message", var2.getMessage()).send();
      }
   }
}
