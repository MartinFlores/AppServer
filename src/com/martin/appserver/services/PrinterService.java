package com.martin.appserver.services;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import android.util.Log;
import android.content.Context;
import android.os.Build;
import com.martin.appserver.database.DB;
import com.martin.appserver.database.DBAdapter;
import com.martin.appserver.utils.ServerLogger;
import org.json.JSONArray;
import org.json.JSONObject;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

public class PrinterService {
    private static final String TAG = "PrinterService";
    private static final UUID SPP_UUID = UUID.fromString("00001101-0000-1000-8000-00805F9B34FB");
    private static final String SETTINGS_KEY = "printer_config";

    public static JSONArray listPairedPrinters() {
        JSONArray array = new JSONArray();
        ServerLogger.log("Listing paired printers...");
        try {
            BluetoothAdapter adapter = BluetoothAdapter.getDefaultAdapter();
            if (adapter == null) {
                ServerLogger.log("Error: BluetoothAdapter is null (device might not support Bluetooth)");
                return array;
            }

            if (!adapter.isEnabled()) {
                ServerLogger.log("Warning: Bluetooth is disabled on the device");
            }

            // Check for modern Android permissions if possible
            Context ctx = DB.getContext();
            if (ctx != null && android.os.Build.VERSION.SDK_INT >= 31) {
                if (ctx.checkSelfPermission(
                        "android.permission.BLUETOOTH_CONNECT") != android.content.pm.PackageManager.PERMISSION_GRANTED) {
                    ServerLogger.log("Error: BLUETOOTH_CONNECT permission not granted (Android 12+)");
                }
            }

            Set<BluetoothDevice> pairedDevices = adapter.getBondedDevices();
            if (pairedDevices != null && pairedDevices.size() > 0) {
                ServerLogger.log("Found " + pairedDevices.size() + " paired devices in system");
                for (BluetoothDevice device : pairedDevices) {
                    JSONObject obj = new JSONObject();
                    String name = device.getName();
                    String address = device.getAddress();
                    ServerLogger.log("  - Device: " + name + " [" + address + "]");
                    obj.put("name", name != null ? name : "Unknown Device");
                    obj.put("mac", address);
                    array.put(obj);
                }
            } else {
                ServerLogger.log("No paired devices found by BluetoothAdapter");
            }
        } catch (Exception e) {
            String errorMsg = "Exception in listPairedPrinters: " + e.getMessage();
            Log.e(TAG, errorMsg, e);
            ServerLogger.log("ERROR: " + errorMsg);
        }
        return array;
    }

    public static void savePrinter(JSONObject printerConfig) {
        try {
            DBAdapter.execSQL("INSERT OR REPLACE INTO settings (key, value) VALUES ('" + SETTINGS_KEY + "', '"
                    + printerConfig.toString().replace("'", "''") + "')");
        } catch (Exception e) {
            Log.e(TAG, "Error saving printer config", e);
        }
    }

    public static JSONObject getSavedPrinter() {
        try {
            java.util.List<Map<String, Object>> results = DBAdapter
                    .query("SELECT value FROM settings WHERE key = '" + SETTINGS_KEY + "'");
            if (results != null && !results.isEmpty()) {
                return new JSONObject((String) results.get(0).get("value"));
            }
        } catch (Exception e) {
            Log.e(TAG, "Error getting saved printer", e);
        }
        return null;
    }

    public static boolean sendBytes(byte[] bytes) {
        JSONObject config = getSavedPrinter();
        if (config == null)
            return false;

        String mac = config.optString("mac");
        if (mac.isEmpty())
            return false;

        BluetoothAdapter adapter = BluetoothAdapter.getDefaultAdapter();
        if (adapter == null || !adapter.isEnabled())
            return false;

        BluetoothDevice device = adapter.getRemoteDevice(mac);
        BluetoothSocket socket = null;
        try {
            socket = device.createRfcommSocketToServiceRecord(SPP_UUID);
            socket.connect();
            OutputStream outputStream = socket.getOutputStream();
            outputStream.write(bytes);
            outputStream.flush();
            Thread.sleep(500); // Wait for transmission
            socket.close();
            return true;
        } catch (Exception e) {
            Log.e(TAG, "Error printing", e);
            try {
                if (socket != null)
                    socket.close();
            } catch (Exception ignored) {
            }
            return false;
        }
    }
}
