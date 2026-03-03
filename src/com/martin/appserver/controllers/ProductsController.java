// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
package com.martin.appserver.controllers;

import com.martin.appserver.database.DBAdapter;
import com.martin.appserver.routing.Body;
import com.martin.appserver.routing.Controller;
import com.martin.appserver.routing.Get;
import com.martin.appserver.routing.Post;
import com.martin.appserver.utils.JsonResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller("/api/v1/products")
public class ProductsController {
   public ProductsController() {
   }

   @Get("/all")
   public String getAllProducts() {
      try {
         List<Map<String, Object>> products = DBAdapter.query(
               "SELECT p.*, c.name as category_name FROM products p LEFT JOIN categories c ON p.category_id = c.id WHERE p.status = 'available'");
         return JsonResponse.create().put("status", "ok").put("data", products).send();
      } catch (Exception var2) {
         return JsonResponse.create().put("status", "error").put("message", var2.getMessage()).send();
      }
   }

   @Get("/categories")
   public String getCategories() {
      try {
         List<Map<String, Object>> categories = DBAdapter.query("SELECT * FROM categories ORDER BY created_at ASC");
         return JsonResponse.create().put("status", "ok").put("data", categories).send();
      } catch (Exception var2) {
         return JsonResponse.create().put("status", "error").put("message", var2.getMessage()).send();
      }
   }

   @Post("/categories/create")
   public String createCategory(@Body com.martin.appserver.dto.CategoryDto body) {
      try {
         Map<String, Object> data = new HashMap<>();
         data.put("name", body.name);
         data.put("icon", body.icon != null ? body.icon : "Package");
         data.put("created_at", System.currentTimeMillis());
         long id = DBAdapter.insert("categories", data);
         return JsonResponse.create().put("status", "ok").put("id", id).send();
      } catch (Exception e) {
         return JsonResponse.create().put("status", "error").put("message", e.getMessage()).send();
      }
   }

   @Post("/categories/update")
   public String updateCategory(@Body com.martin.appserver.dto.CategoryDto body) {
      try {
         Map<String, Object> data = new HashMap<>();
         data.put("name", body.name);
         data.put("icon", body.icon != null ? body.icon : "Package");
         DBAdapter.update("categories", data, "id = " + body.id);
         return JsonResponse.create().put("status", "ok").send();
      } catch (Exception e) {
         return JsonResponse.create().put("status", "error").put("message", e.getMessage()).send();
      }
   }

   @Post("/categories/delete")
   public String deleteCategory(@Body com.martin.appserver.dto.CategoryDto body) {
      try {
         DBAdapter.delete("categories", "id = " + body.id);
         // Optionally update products to null category
         DBAdapter.execSQL("UPDATE products SET category_id = NULL WHERE category_id = " + body.id);
         return JsonResponse.create().put("status", "ok").send();
      } catch (Exception e) {
         return JsonResponse.create().put("status", "error").put("message", e.getMessage()).send();
      }
   }

   @Post("/categories/reorder")
   public String reorderCategories(@Body com.martin.appserver.dto.CategoryDto body) {
      try {
         if (body.reorder != null) {
            for (int i = 0; i < body.reorder.size(); i++) {
               // Using created_at as a simple way to maintain order for now
               // since the schema doesn't have an explicit 'order' field.
               // We add 1ms to each to ensure sequences.
               Map<String, Object> data = new HashMap<>();
               data.put("created_at", System.currentTimeMillis() + i);
               DBAdapter.update("categories", data, "id = " + body.reorder.get(i));
            }
         }
         return JsonResponse.create().put("status", "ok").send();
      } catch (Exception e) {
         return JsonResponse.create().put("status", "error").put("message", e.getMessage()).send();
      }
   }
}
