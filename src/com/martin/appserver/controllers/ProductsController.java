package com.martin.appserver.controllers;

import com.martin.appserver.database.DBAdapter;
import com.martin.appserver.routing.Body;
import com.martin.appserver.routing.Controller;
import com.martin.appserver.routing.Get;
import com.martin.appserver.routing.Post;
import com.martin.appserver.utils.JsonResponse;
import java.util.ArrayList;
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
         List<Map<String, Object>> products = DBAdapter.query("SELECT * FROM products");

         for (Map<String, Object> product : products) {
            long productId = ((Number) product.get("id")).longValue();

            // Fetch categories for this product
            List<Map<String, Object>> categoriesList = DBAdapter.query(
                  "SELECT c.id, c.name FROM categories c " +
                        "JOIN product_categories pc ON c.id = pc.category_id " +
                        "WHERE pc.product_id = " + productId);

            Map<String, String> categoriesMap = new HashMap<>();
            List<Long> categoryIds = new ArrayList<>();
            for (Map<String, Object> c : categoriesList) {
               String idStr = String.valueOf(c.get("id"));
               categoriesMap.put(idStr, (String) c.get("name"));
               categoryIds.add(((Number) c.get("id")).longValue());
            }
            product.put("categories", categoriesMap);
            product.put("category_ids", categoryIds);

            // Parse images string (JSON array) to actual list
            String imagesStr = (String) product.get("images");
            if (imagesStr != null && !imagesStr.isEmpty() && imagesStr.startsWith("[")) {
               try {
                  org.json.JSONArray arr = new org.json.JSONArray(imagesStr);
                  List<String> imagesList = new ArrayList<>();
                  for (int i = 0; i < arr.length(); i++) {
                     imagesList.add(arr.getString(i));
                  }
                  product.put("images", imagesList);
               } catch (Exception e) {
                  product.put("images", new ArrayList<String>());
               }
            } else {
               product.put("images", new ArrayList<String>());
            }
         }

         return JsonResponse.create().put("status", "ok").put("data", products).send();
      } catch (Exception e) {
         return JsonResponse.create().put("status", "error").put("message", e.getMessage()).send();
      }
   }

   @Post("/create")
   public String createProduct(@Body com.martin.appserver.dto.ProductDto body) {
      try {
         if (body.name == null || body.name.trim().isEmpty()) {
            return JsonResponse.create().put("status", "error").put("message", "El nombre es obligatorio").send();
         }
         if (body.price == null) {
            return JsonResponse.create().put("status", "error").put("message", "El precio es obligatorio").send();
         }

         Map<String, Object> data = new HashMap<>();
         data.put("name", body.name);
         data.put("description", body.description);
         data.put("price", body.price);
         data.put("purchase_price", body.purchase_price != null ? body.purchase_price : 0.0);
         data.put("stock", body.stock != null ? body.stock : 0);
         data.put("status", body.status != null ? body.status : "available");
         data.put("created_at", System.currentTimeMillis());

         if (body.images != null) {
            data.put("images", new org.json.JSONArray(body.images).toString());
         } else {
            data.put("images", "[]");
         }

         long productId = DBAdapter.insert("products", data);

         if (productId == -1) {
            String error = DBAdapter.getLastError();
            return JsonResponse.create().put("status", "error")
                  .put("message", "Error de base de datos: " + (error != null ? error : "desconocido"))
                  .send();
         }

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
      try {
         if (body.id == null) {
            return JsonResponse.create().put("status", "error").put("message", "ID de producto no proporcionado")
                  .send();
         }

         Map<String, Object> data = new HashMap<>();
         data.put("name", body.name);
         data.put("description", body.description);
         data.put("price", body.price);
         data.put("purchase_price", body.purchase_price);
         data.put("stock", body.stock);
         data.put("status", body.status);

         if (body.images != null) {
            data.put("images", new org.json.JSONArray(body.images).toString());
         }

         DBAdapter.update("products", data, "id = " + body.id);

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
      } catch (Exception e) {
         return JsonResponse.create().put("status", "error").put("message", e.getMessage()).send();
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
         DBAdapter.delete("product_categories", "category_id = " + body.id);
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
