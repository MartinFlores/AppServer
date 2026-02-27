---
layout: documentation
title: Extension
---

[&laquo; Back to index](index.html)
# Extension

Table of Contents:

* [AppServer](#AppServer)

## AppServer  {#AppServer}

Component for AppServer



### Properties  {#AppServer-Properties}

{:.properties}
None


### Events  {#AppServer-Events}

{:.events}
None


### Methods  {#AppServer-Methods}

{:.methods}

{:id="AppServer.ClearServerLogs" class="method"} <i/> ClearServerLogs()
: Limpia los logs del servidor

{:id="AppServer.GetLocalIp" class="method returns text"} <i/> GetLocalIp()
: Retorna la IP real del dispositivo en la red Wi-Fi

{:id="AppServer.GetServerLogs" class="method returns text"} <i/> GetServerLogs()
: Obtiene los logs del servidor

{:id="AppServer.InitializeFromCloud" class="method"} <i/> InitializeFromCloud(*webviewer*{:.component})
: Inicia con diagnóstico detallado

{:id="AppServer.ListPairedPrinters" class="method returns text"} <i/> ListPairedPrinters()
: Lista las impresoras Bluetooth vinculadas

{:id="AppServer.PrintTest" class="method"} <i/> PrintTest()
: Imprime un ticket de prueba

{:id="AppServer.RequestBluetoothPermissions" class="method"} <i/> RequestBluetoothPermissions()
: Solicita permisos de Bluetooth para Android 12+

{:id="AppServer.SavePrinter" class="method"} <i/> SavePrinter(*mac*{:.text},*name*{:.text})
: Guarda la impresora seleccionada por su MAC
