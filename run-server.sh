#!/bin/bash
PROJECT_DIR="$(pwd)"
APP_DIR="$PROJECT_DIR/app"


echo "🔧 Ejecutando npm run build en /app..."
cd "$APP_DIR" || exit 1
npm run build || exit 1

echo "🚀 Compilando AppServer..."

# Directorio base
BASE_DIR="/Users/martinflores/Desktop/appinventor-sources/appinventor/components"
SRC_DIR="$BASE_DIR/src"
BUILD_DIR="$BASE_DIR/build/standalone"
LIB_DIR="$BASE_DIR/lib"

# Crear directorio de compilación
mkdir -p "$BUILD_DIR"

# Compilar solo los controladores compatibles
javac -cp "$LIB_DIR/sqlite-jdbc.jar:$LIB_DIR/gson-2.8.9.jar:$BASE_DIR/../lib/json/json.jar" -d "$BUILD_DIR" \
  "$SRC_DIR/com/martin/appserver/StandaloneServer.java" \
  "$SRC_DIR/com/martin/appserver/server/"*.java \
  "$SRC_DIR/com/martin/appserver/routing/"*.java \
  "$SRC_DIR/com/martin/appserver/validation/"*.java \
  "$SRC_DIR/com/martin/appserver/dto/"*.java \
  "$SRC_DIR/com/martin/appserver/controllers/ConfigController.java" \
  "$SRC_DIR/com/martin/appserver/controllers/NetworkController.java" \
  "$SRC_DIR/com/martin/appserver/controllers/UsersController.java" \
  "$SRC_DIR/com/martin/appserver/controllers/CompanyConfigController.java" \
  "$SRC_DIR/com/martin/appserver/controllers/ConfigStatusController.java" \
  "$SRC_DIR/com/martin/appserver/controllers/LogsController.java" \
  "$SRC_DIR/com/martin/appserver/controllers/ShiftsController.java" \
  "$SRC_DIR/com/martin/appserver/controllers/ProductsController.java" \
  "$SRC_DIR/com/martin/appserver/controllers/OrdersController.java" \
  "$SRC_DIR/com/martin/appserver/controllers/AppsController.java" \
  "$SRC_DIR/com/martin/appserver/constants/ServerConstants.java" \
  "$SRC_DIR/com/martin/appserver/database/DBSchema.java" \
  "$SRC_DIR/com/martin/appserver/database/StandaloneDB.java" \
  "$SRC_DIR/com/martin/appserver/database/DBAdapter.java" \
  "$SRC_DIR/com/martin/appserver/utils/JsonResponse.java" \
  "$SRC_DIR/com/martin/appserver/utils/ServerLogger.java" \
  "$SRC_DIR/com/martin/appserver/utils/StandaloneNetworkUtils.java" \
  "$SRC_DIR/com/martin/appserver/utils/Log.java" \
  "$SRC_DIR/com/martin/appserver/utils/NetworkUtils.java" \
  "$SRC_DIR/com/martin/appserver/utils/MimeTypeMap.java" \
  "$SRC_DIR/com/martin/appserver/utils/QueryParser.java" \
  "$SRC_DIR/com/martin/appserver/utils/FileUtils.java" \
  "$SRC_DIR/com/martin/appserver/utils/JsonUtils.java" \
  "$SRC_DIR/com/martin/appserver/utils/ZipUtils.java" \
  "$SRC_DIR/android/database/Cursor.java"

if [ $? -eq 0 ]; then
    echo "✅ Compilación exitosa"
    echo ""
    
    # Ejecutar con todas las dependencias
    cd "$BUILD_DIR"
    java -cp ".:$LIB_DIR/sqlite-jdbc.jar:$LIB_DIR/slf4j-api.jar:$LIB_DIR/slf4j-simple.jar:$LIB_DIR/gson-2.8.9.jar:$BASE_DIR/../lib/json/json.jar" com.martin.appserver.StandaloneServer "../../app/dist"
else
    echo "❌ Error en la compilación"
    exit 1
fi
