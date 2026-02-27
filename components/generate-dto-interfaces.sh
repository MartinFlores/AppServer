#!/bin/bash

DTO_DIR="./src/com/martin/AppServer/dto"
OUTPUT_DIR="./app/src/interfaces"

mkdir -p "$OUTPUT_DIR"

for java_file in "$DTO_DIR"/*.java; do
  [ -f "$java_file" ] || continue
  
  filename=$(basename "$java_file" .java)
  output_file="$OUTPUT_DIR/${filename}.ts"
  
  echo "// Auto-generated from ${filename}.java" > "$output_file"
  echo "" >> "$output_file"
  
  sed -n '/^public class/,/^}$/p' "$java_file" | while IFS= read -r line; do
    if echo "$line" | grep -q "^public class"; then
      className=$(echo "$line" | sed -E 's/.*class ([A-Za-z]+).*/\1/')
      if echo "$line" | grep -q "extends"; then
        extendsClass=$(echo "$line" | sed -E 's/.*extends ([A-Za-z]+).*/\1/')
        echo "export interface $className extends $extendsClass {" >> "$output_file"
      else
        echo "export interface $className {" >> "$output_file"
      fi
    elif echo "$line" | grep -q "public.*;"; then
      javaType=$(echo "$line" | sed -E 's/.*public ([A-Za-z<>]+) .*/\1/')
      fieldName=$(echo "$line" | sed -E 's/.*public [A-Za-z<>]+ ([a-zA-Z]+);.*/\1/')
      
      case "$javaType" in
        String) tsType="string" ;;
        int|long|double|float) tsType="number" ;;
        boolean) tsType="boolean" ;;
        *) tsType="any" ;;
      esac
      
      echo "  $fieldName: $tsType;" >> "$output_file"
    elif echo "$line" | grep -q "^}"; then
      echo "}" >> "$output_file"
      echo "" >> "$output_file"
    fi
  done
  
  echo "✓ Generado: $output_file"
done

echo "Conversión completada"
