// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
package com.martin.appserver.controllers;

import com.martin.appserver.database.DBAdapter;
import com.martin.appserver.dto.CompanyDto;
import com.martin.appserver.routing.Body;
import com.martin.appserver.routing.Controller;
import com.martin.appserver.routing.Get;
import com.martin.appserver.routing.Post;
import com.martin.appserver.utils.JsonResponse;
import com.martin.appserver.utils.ServerLogger;
import com.martin.appserver.validation.ValidationException;
import com.martin.appserver.validation.Validator;
import java.util.HashMap;
import java.util.Map;

@Controller("/api/v1/config")
public class CompanyConfigController {
   public CompanyConfigController() {
   }

   @Get("/setup")
   public String getSett() {
      return "{\"status\":\"ok\",\"message\":\"Logs limpiados\"}";
   }

   @Post("/setup")
   public String setupCompany(@Body CompanyDto body) {
      ServerLogger.log("POST /setup recibido");

      try {
         if (body == null) {
            ServerLogger.log("Body es null");
            return JsonResponse.create().put("error", "Body null").send();
         } else {
            ServerLogger.log("Body: " + body.businessName);
            Validator.validate(body);
            Map<String, Object> data = new HashMap();
            data.put("company_name", body.businessName);
            data.put("username", body.username);
            data.put("pin", body.pin);
            data.put("primary_color", body.brandColor);
            data.put("updated_at", System.currentTimeMillis());
            int updated = DBAdapter.update("company_config", data, "id = 1");
            ServerLogger.log("Updated rows: " + updated);
            return updated > 0 ? JsonResponse.create().put("status", "ok").put("message", "Configuración guardada").put("company", data).send() : JsonResponse.create().put("error", "No se pudo guardar").send();
         }
      } catch (ValidationException var4) {
         ServerLogger.log("ValidationException: " + var4.getMessage());
         return JsonResponse.create().put("error", var4.getMessage()).send();
      } catch (Exception var5) {
         ServerLogger.log("Exception: " + var5.getMessage());
         return JsonResponse.create().put("error", var5.getMessage()).send();
      }
   }
}
