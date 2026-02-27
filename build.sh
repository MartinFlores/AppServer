#!/bin/bash

echo "🚀 Iniciando build limpio..."

# ==========================
# Variables
# ==========================

PROJECT_DIR="$(pwd)"
DIST_DIR="$PROJECT_DIR/dist"
APP_DIR="$PROJECT_DIR/app"
APP_DIST_DIR="$APP_DIR/dist"

# ==========================
# 1️⃣ Limpiar dist completo
# ==========================

echo "🧹 Eliminando dist anterior..."
rm -rf "$DIST_DIR"
mkdir -p "$DIST_DIR"

sleep 1


# ==========================
# 2️⃣ Build de la webapp y crear webapp.zip desde /app/dist
# ==========================

if [ ! -d "$APP_DIR" ]; then
  echo "❌ La carpeta /app no existe"
  exit 1
fi

echo "🔧 Ejecutando npm run build en /app..."
cd "$APP_DIR" || exit 1
npm run build || exit 1
cd "$PROJECT_DIR" || exit 1

if [ ! -d "$APP_DIST_DIR" ]; then
  echo "❌ No se encontró /app/dist después del build"
  exit 1
fi

echo "📦 Comprimiendo /app/dist → webapp.zip..."
cd "$APP_DIST_DIR" || exit 1
zip -r "$DIST_DIR/webapp.zip" . > /dev/null
cd "$PROJECT_DIR" || exit 1

# ==========================
# 3️⃣ Clean ANT
# ==========================

echo "🧹 Ejecutando ant clean..."
ant clean || exit 1

# ==========================
# 4️⃣ Compilar extensión
# ==========================

echo "🔨 Ejecutando ant extensions..."
ant extensions || exit 1

# ==========================
# 5️⃣ Copiar .aix más reciente
# ==========================

echo "📂 Moviendo .aix generado a dist..."

LATEST_AIX=$(find . -name "*.aix" -type f -print0 | xargs -0 ls -t | head -n 1)

if [ -z "$LATEST_AIX" ]; then
  echo "❌ No se encontró ningún archivo .aix"
  exit 1
fi

cp "$LATEST_AIX" "$DIST_DIR"


# ==========================
# 6️⃣ Subir webapp.zip al Release
# ==========================

echo "☁️ Subiendo webapp.zip al Release de GitHub..."

gh release upload AppServer "$DIST_DIR/webapp.zip" \
  --repo MartinFlores/AppServer \
  --clobber

echo "✅ webapp.zip actualizado en GitHub Release"

echo "✅ Build terminado correctamente!"
echo "📦 Archivos disponibles en /dist"
open "dist"
