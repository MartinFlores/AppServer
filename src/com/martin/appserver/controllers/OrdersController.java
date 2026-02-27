// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
package com.martin.appserver.controllers;

import com.martin.appserver.database.DBAdapter;
import com.martin.appserver.dto.OrderDto;
import com.martin.appserver.routing.Body;
import com.martin.appserver.routing.Controller;
import com.martin.appserver.routing.Get;
import com.martin.appserver.routing.Post;
import com.martin.appserver.utils.JsonResponse;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@Controller("/api/v1/orders")
public class OrdersController {
   public OrdersController() {
   }

   @Post("/create")
   public String createOrder(@Body OrderDto body) {
      try {
         if (body.items != null && !body.items.isEmpty()) {
            double totalPaid = 0.0;
            if (body.payments != null && !body.payments.isEmpty()) {
               Iterator var4 = body.payments.iterator();

               while (var4.hasNext()) {
                  OrderDto.PaymentDto p = (OrderDto.PaymentDto) var4.next();
                  if (p.amount != null) {
                     totalPaid += p.amount;
                  }
               }
            } else if (body.payments == null && body.payment_method != null && body.total != null) {
               totalPaid = body.total;
            }

            double orderTotal = body.total != null ? body.total : 0.0;
            String status = totalPaid >= orderTotal - 0.01 ? "completed" : "open";
            Map<String, Object> orderData = new HashMap();
            orderData.put("user_id", body.user_id);
            orderData.put("shift_id", body.shift_id);
            String name = body.customer_name != null && !body.customer_name.trim().isEmpty() ? body.customer_name
                  : "Público General";
            orderData.put("customer_name", name);
            orderData.put("total", orderTotal);
            orderData.put("payment_method", body.payment_method != null ? body.payment_method : "Efectivo");
            orderData.put("status", status);
            orderData.put("created_at", System.currentTimeMillis());
            long orderId = DBAdapter.insert("orders", orderData);
            if (orderId <= 0L) {
               return JsonResponse.create().put("status", "error").put("message", "Error saving order header").send();
            } else {
               Iterator var11 = body.items.iterator();

               HashMap paymentData;
               while (var11.hasNext()) {
                  OrderDto.OrderItemDto item = (OrderDto.OrderItemDto) var11.next();
                  paymentData = new HashMap();
                  paymentData.put("order_id", orderId);
                  paymentData.put("product_id", item.product_id);
                  paymentData.put("quantity", item.quantity);
                  paymentData.put("price", item.price);
                  paymentData.put("subtotal", item.subtotal);
                  DBAdapter.insert("order_items", paymentData);
               }

               if (body.payments != null && !body.payments.isEmpty()) {
                  var11 = body.payments.iterator();

                  while (var11.hasNext()) {
                     OrderDto.PaymentDto payment = (OrderDto.PaymentDto) var11.next();
                     paymentData = new HashMap();
                     paymentData.put("order_id", orderId);
                     paymentData.put("payment_method", payment.payment_method);
                     paymentData.put("amount", payment.amount);
                     DBAdapter.insert("order_payments", paymentData);
                  }
               } else if (status.equals("completed")) {
                  paymentData = new HashMap();
                  paymentData.put("order_id", orderId);
                  paymentData.put("payment_method", body.payment_method != null ? body.payment_method : "Efectivo");
                  paymentData.put("amount", orderTotal);
                  DBAdapter.insert("order_payments", paymentData);
               }

               return JsonResponse.create().put("status", "ok").put("order_id", orderId).put("order_status", status)
                     .put("message",
                           status.equals("open") ? "Orden guardada como abierta" : "Orden procesada con éxito")
                     .send();
            }
         } else {
            return JsonResponse.create().put("status", "error").put("message", "No items in order").send();
         }
      } catch (Exception var14) {
         var14.printStackTrace();
         return JsonResponse.create().put("status", "error").put("message", var14.getMessage()).send();
      }
   }

   @Get("/shift")
   public String getOrdersByShift(Map<String, String> queryParams) {
      try {
         String shiftId = (String) queryParams.get("shift_id");
         if (shiftId == null) {
            return JsonResponse.create().put("status", "error").put("message", "Shift ID is required").send();
         } else {
            List<Map<String, Object>> orders = DBAdapter
                  .query("SELECT * FROM orders WHERE shift_id = " + shiftId + " ORDER BY created_at DESC");
            return JsonResponse.create().put("status", "ok").put("data", orders).send();
         }
      } catch (Exception var4) {
         return JsonResponse.create().put("status", "error").put("message", var4.getMessage()).send();
      }
   }

   @Get("/details")
   public String getOrderDetails(Map<String, String> queryParams) {
      try {
         String orderId = (String) queryParams.get("order_id");
         if (orderId == null) {
            return JsonResponse.create().put("status", "error").put("message", "Order ID is required").send();
         } else {
            List<Map<String, Object>> items = DBAdapter.query(
                  "SELECT oi.*, p.name as product_name, p.image as product_image FROM order_items oi JOIN products p ON oi.product_id = p.id WHERE oi.order_id = "
                        + orderId);
            List<Map<String, Object>> payments = DBAdapter
                  .query("SELECT * FROM order_payments WHERE order_id = " + orderId);
            return JsonResponse.create().put("status", "ok").put("items", items).put("payments", payments).send();
         }
      } catch (Exception var5) {
         return JsonResponse.create().put("status", "error").put("message", var5.getMessage()).send();
      }
   }

   @Get("/open")
   public String getOpenOrdersByShift(Map<String, String> queryParams) {
      try {
         String shiftId = (String) queryParams.get("shift_id");
         if (shiftId == null) {
            return JsonResponse.create().put("status", "error").put("message", "Shift ID is required").send();
         } else {
            String sql = "SELECT o.*, (SELECT SUM(amount) FROM order_payments WHERE order_id = o.id) as paid_amount FROM orders o WHERE o.shift_id = "
                  + shiftId + " AND o.status = 'open' ORDER BY o.created_at DESC";
            List<Map<String, Object>> orders = DBAdapter.query(sql);
            return JsonResponse.create().put("status", "ok").put("data", orders).send();
         }
      } catch (Exception var5) {
         return JsonResponse.create().put("status", "error").put("message", var5.getMessage()).send();
      }
   }

   @Post("/add-payment")
   public String addPayment(@Body Map<String, Object> body) {
      try {
         long orderId = ((Number) body.get("order_id")).longValue();
         double total;
         HashMap paymentData;
         List orderInfo;
         if (body.containsKey("payments") && body.get("payments") instanceof List) {
            orderInfo = (List) body.get("payments");
            Iterator var12 = orderInfo.iterator();

            while (var12.hasNext()) {
               Map<String, Object> p = (Map) var12.next();
               paymentData = new HashMap();
               paymentData.put("order_id", orderId);
               paymentData.put("payment_method", (String) p.get("payment_method"));
               paymentData.put("amount", ((Number) p.get("amount")).doubleValue());
               DBAdapter.insert("order_payments", paymentData);
            }
         } else if (body.containsKey("amount")) {
            String method = (String) body.get("payment_method");
            total = ((Number) body.get("amount")).doubleValue();
            paymentData = new HashMap();
            paymentData.put("order_id", orderId);
            paymentData.put("payment_method", method != null ? method : "Efectivo");
            paymentData.put("amount", total);
            DBAdapter.insert("order_payments", paymentData);
         }

         orderInfo = DBAdapter.query("SELECT total, (SELECT SUM(amount) FROM order_payments WHERE order_id = " + orderId
               + ") as paid FROM orders WHERE id = " + orderId);
         if (!orderInfo.isEmpty()) {
            total = ((Number) ((Map) orderInfo.get(0)).get("total")).doubleValue();
            double paid = ((Number) ((Map) orderInfo.get(0)).get("paid")).doubleValue();
            if (paid >= total - 0.01) {
               Map<String, Object> updateData = new HashMap();
               updateData.put("status", "completed");
               DBAdapter.update("orders", updateData, "id = " + orderId);
               return JsonResponse.create().put("status", "ok").put("order_status", "completed")
                     .put("message", "Orden liquidada por completo").send();
            }
         }

         return JsonResponse.create().put("status", "ok").put("order_status", "open")
               .put("message", "Abono(s) registrado(s) correctamente").send();
      } catch (Exception var10) {
         var10.printStackTrace();
         return JsonResponse.create().put("status", "error").put("message", var10.getMessage()).send();
      }
   }
}
