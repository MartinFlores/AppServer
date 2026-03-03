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
import java.util.stream.Collectors;

@Controller("/api/v1/products")
public class ProductsController {
   public ProductsController() {
   }

   @Get("/all")
   public String getAllProducts() {
      try {
         List<Map<String, Object>> products = DBAdapter.query(
               "SELECT p.*, c.name as category_name FROM products p LEFT JOIN categories c ON p.category_id = c.id");

         // Fetch multiple categories for each product
         for (Map<String, Object> product : products) {
            long productId = ((Number) product.get("id")).longValue();
            List<Map<String, Object>> catIds = DBAdapter
                  .query("SELECT category_id FROM product_categories WHERE product_id = " + productId);
            product.put("category_ids",
                  catIds.stream().map(m -> m.get("category_id")).collect(Collectors.toList()));
         }

         return JsonResponse.create().put("status", "ok").put("data", products).send();
      } catch (Exception var2) {
         return JsonResponse.create().put("status", "error").put("message", var2.getMessage()).send();
      }
   }

   private void syncSchema() {
      try {
         DBAdapter.execSQL("ALTER TABLE products ADD COLUMN purchase_price REAL");
      } catch (Exception e) {
      }
      try {
         DBAdapter.execSQL("ALTER TABLE products ADD COLUMN stock INTEGER DEFAULT 0");
      } catch (Exception e) {
      }
      try {
         DBAdapter.execSQL(
               "CREATE TABLE IF NOT EXISTS product_categories (product_id INTEGER, category_id INTEGER, PRIMARY KEY(product_id, category_id), FOREIGN KEY(product_id) REFERENCES products(id), FOREIGN KEY(category_id) REFERENCES categories(id))");
      } catch (Exception e) {
      }
   }

   @Post("/create")
   public String createProduct(@Body com.martin.appserver.dto.ProductDto body) {
      syncSchema();
      try {
         Map<String, Object> data = new HashMap<>();
         data.put("name", body.name);
         data.put("description", body.description);
         data.put("price", body.price);
         data.put("purchase_price", body.purchase_price);
         data.put("stock", body.stock);
         data.put("status", body.status != null ? body.status : "available");
         data.put("created_at", System.currentTimeMillis());

         if (body.name == null || body.name.trim().isEmpty()) {
            return JsonResponse.create().put("status", "error").put("message", "El nombre es obligatorio").send();
         }
         if (body.price == null) {
            return JsonResponse.create().put("status", "error").put("message", "El precio es obligatorio").send();
         }

         long productId = DBAdapter.insert("products", data);

         if (productId == -1) {
            String error = DBAdapter.getLastError();
            return JsonResponse.create().put("status", "error")
                  .put("message", "Error de base de datos: " + (error != null ? error : "desconocido"))
                  .send();
         }

         // Helper junction table
         if (body.category_ids != null) {
            for (Long catId : body.category_ids) {
               Map<String, Object> junction = new HashMap<>();
               junction.put("product_id", productId);
               junction.put("category_id", catId);
               DBAdapter.insert("product_categories", junction);
            }
         }

         return JsonResponse.create().put("status", "ok").put("id", productId).send();
      } catch (Exception e) {
         return JsonResponse.create().put("status", "error").put("message", e.getMessage()).send();
      }
   }

   @Post("/update")
   public String updateProduct(@Body com.martin.appserver.dto.ProductDto body) {
      syncSchema();
      try {
         Map<String, Object> data = new HashMap<>();
         data.put("name", body.name);
         data.put("description", body.description);
         data.put("price", body.price);
         data.put("purchase_price", body.purchase_price);
         data.put("stock", body.stock);
         data.put("status", body.status);

         if (body.id == null) {
            return JsonResponse.create().put("status", "error").put("message", "ID de producto no proporcionado")
                  .send();
         }

         int rows = DBAdapter.update("products", data, "id = " + body.id);

         // Update junction table
         if (body.category_ids != null) {
            DBAdapter.execSQL("DELETE FROM product_categories WHERE product_id = " + body.id);
            for (Long catId : body.category_ids) {
               Map<String, Object> junction = new HashMap<>();
               junction.put("product_id", body.id);
               junction.put("category_id", catId);
               DBAdapter.insert("product_categories", junction);
            }
         }

         return JsonResponse.create().put("status", "ok").send();
      } catch (Exception e) {
         return JsonResponse.create().put("status", "error").put("message", e.getMessage()).send();
      }
   }

   @Post("/delete")
   public String deleteProduct(@Body com.martin.appserver.dto.ProductDto body) {
      try {
         DBAdapter.delete("products", "id = " + body.id);
         DBAdapter.delete("product_categories", "product_id = " + body.id);
         return JsonResponse.create().put("status", "ok").send();
      } catch (Exception e) {
         return JsonResponse.create().put("status", "error").put("message", e.getMessage()).send();
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
