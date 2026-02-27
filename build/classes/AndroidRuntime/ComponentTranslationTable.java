package com.google.appinventor.client.editor.simple.components.i18n;

import java.util.HashMap;
import java.util.Map;

import com.google.gwt.core.client.GWT;

public class ComponentTranslationTable {
  private static final ComponentTranslations MESSAGES = GWT.create(ComponentTranslations.class);
  public static Map<String, String> myMap = map();

  private static String getName(String key) {
    String value = myMap.get(key);
    if (key == null) {
      return "**Missing key in ComponentTranslationTables**";
    } else {
      return value;
    }
  }

  public static String getPropertyName(String key) {
    String value = getName("PROPERTY-" + key);
    if(value == null) return key;
    return value;
  }

  public static String getPropertyDescription(String key) {
    String value = getName("PROPDESC-" + key);
    if(value == null) return key;
    return value;
  }

  public static String getMethodName(String key) {
    String value = getName("METHOD-" + key);
    if(value == null) return key;
    return value;
  }

  public static String getEventName(String key) {
    String value = getName("EVENT-" + key);
    if(value == null) return key;
    return value;
  }

  public static String getComponentName(String key) {
    String value = getName("COMPONENT-" + key);
    if(value == null) return key;
    return value;
  }

  public static String getCategoryName(String key) {
    String value = getName("CATEGORY-" + key);
    if(value == null) return key;
    return value;
  }

  public static String getComponentHelpString(String key) {
    String value = getName(key + "-helpString");
    if(value == null) return key;
    return value;
  }
  public static HashMap<String, String> map() {
    HashMap<String, String> map = new HashMap<String, String>();
    mapComponents(map);
    mapOptionLists(map);
    mapDescriptions(map);
    mapCategories(map);
    return map;
  }
  private static void mapComponents(Map<String, String> map) {


/* Component: AbsoluteArrangement */

    map.put("COMPONENT-AbsoluteArrangement", MESSAGES.absoluteArrangementComponentPallette());

    map.put("AbsoluteArrangement-helpString", MESSAGES.AbsoluteArrangementHelpStringComponentPallette());



/* Properties */

    map.put("PROPERTY-BackgroundColor", MESSAGES.BackgroundColorProperties());
    map.put("PROPERTY-Height", MESSAGES.HeightProperties());
    map.put("PROPERTY-HeightPercent", MESSAGES.HeightPercentProperties());
    map.put("PROPERTY-Image", MESSAGES.ImageProperties());
    map.put("PROPERTY-Left", MESSAGES.LeftProperties());
    map.put("PROPERTY-Top", MESSAGES.TopProperties());
    map.put("PROPERTY-Visible", MESSAGES.VisibleProperties());
    map.put("PROPERTY-Width", MESSAGES.WidthProperties());
    map.put("PROPERTY-WidthPercent", MESSAGES.WidthPercentProperties());


/* Events */



/* Methods */



/* Parameters */

    map.put("PARAM-notAlreadyHandled", MESSAGES.notAlreadyHandledParams());


/* Component: AccelerometerSensor */

    map.put("COMPONENT-AccelerometerSensor", MESSAGES.accelerometerSensorComponentPallette());

    map.put("AccelerometerSensor-helpString", MESSAGES.AccelerometerSensorHelpStringComponentPallette());



/* Properties */

    map.put("PROPERTY-Available", MESSAGES.AvailableProperties());
    map.put("PROPERTY-Enabled", MESSAGES.EnabledProperties());
    map.put("PROPERTY-LegacyMode", MESSAGES.LegacyModeProperties());
    map.put("PROPERTY-MinimumInterval", MESSAGES.MinimumIntervalProperties());
    map.put("PROPERTY-Sensitivity", MESSAGES.SensitivityProperties());
    map.put("PROPERTY-XAccel", MESSAGES.XAccelProperties());
    map.put("PROPERTY-YAccel", MESSAGES.YAccelProperties());
    map.put("PROPERTY-ZAccel", MESSAGES.ZAccelProperties());


/* Events */

    map.put("EVENT-AccelerationChanged", MESSAGES.AccelerationChangedEvents());
    map.put("EVENT-Shaking", MESSAGES.ShakingEvents());


/* Methods */



/* Parameters */

    map.put("PARAM-xAccel", MESSAGES.xAccelParams());
    map.put("PARAM-yAccel", MESSAGES.yAccelParams());
    map.put("PARAM-zAccel", MESSAGES.zAccelParams());


/* Component: ActivityStarter */

    map.put("COMPONENT-ActivityStarter", MESSAGES.activityStarterComponentPallette());

    map.put("ActivityStarter-helpString", MESSAGES.ActivityStarterHelpStringComponentPallette());



/* Properties */

    map.put("PROPERTY-Action", MESSAGES.ActionProperties());
    map.put("PROPERTY-ActivityClass", MESSAGES.ActivityClassProperties());
    map.put("PROPERTY-ActivityPackage", MESSAGES.ActivityPackageProperties());
    map.put("PROPERTY-DataType", MESSAGES.DataTypeProperties());
    map.put("PROPERTY-DataUri", MESSAGES.DataUriProperties());
    map.put("PROPERTY-ExtraKey", MESSAGES.ExtraKeyProperties());
    map.put("PROPERTY-ExtraValue", MESSAGES.ExtraValueProperties());
    map.put("PROPERTY-Extras", MESSAGES.ExtrasProperties());
    map.put("PROPERTY-Result", MESSAGES.ResultProperties());
    map.put("PROPERTY-ResultName", MESSAGES.ResultNameProperties());
    map.put("PROPERTY-ResultType", MESSAGES.ResultTypeProperties());
    map.put("PROPERTY-ResultUri", MESSAGES.ResultUriProperties());


/* Events */

    map.put("EVENT-ActivityCanceled", MESSAGES.ActivityCanceledEvents());
    map.put("EVENT-AfterActivity", MESSAGES.AfterActivityEvents());


/* Methods */

    map.put("METHOD-ResolveActivity", MESSAGES.ResolveActivityMethods());
    map.put("METHOD-StartActivity", MESSAGES.StartActivityMethods());


/* Parameters */

    map.put("PARAM-result", MESSAGES.resultParams());


/* Component: AnomalyDetection */

    map.put("COMPONENT-AnomalyDetection", MESSAGES.anomalyDetectionComponentPallette());

    map.put("AnomalyDetection-helpString", MESSAGES.AnomalyDetectionHelpStringComponentPallette());



/* Properties */



/* Events */



/* Methods */

    map.put("METHOD-CleanData", MESSAGES.CleanDataMethods());
    map.put("METHOD-DetectAnomalies", MESSAGES.DetectAnomaliesMethods());
    map.put("METHOD-DetectAnomaliesInChartData", MESSAGES.DetectAnomaliesInChartDataMethods());


/* Parameters */

    map.put("PARAM-anomaly", MESSAGES.anomalyParams());
    map.put("PARAM-xList", MESSAGES.xListParams());
    map.put("PARAM-yList", MESSAGES.yListParams());
    map.put("PARAM-dataList", MESSAGES.dataListParams());
    map.put("PARAM-threshold", MESSAGES.thresholdParams());
    map.put("PARAM-chartData", MESSAGES.chartDataParams());


/* Component: Ball */

    map.put("COMPONENT-Ball", MESSAGES.ballComponentPallette());

    map.put("Ball-helpString", MESSAGES.BallHelpStringComponentPallette());



/* Properties */

    map.put("PROPERTY-Heading", MESSAGES.HeadingProperties());
    map.put("PROPERTY-Interval", MESSAGES.IntervalProperties());
    map.put("PROPERTY-OriginAtCenter", MESSAGES.OriginAtCenterProperties());
    map.put("PROPERTY-PaintColor", MESSAGES.PaintColorProperties());
    map.put("PROPERTY-Radius", MESSAGES.RadiusProperties());
    map.put("PROPERTY-Speed", MESSAGES.SpeedProperties());
    map.put("PROPERTY-X", MESSAGES.XProperties());
    map.put("PROPERTY-Y", MESSAGES.YProperties());
    map.put("PROPERTY-Z", MESSAGES.ZProperties());


/* Events */

    map.put("EVENT-CollidedWith", MESSAGES.CollidedWithEvents());
    map.put("EVENT-Dragged", MESSAGES.DraggedEvents());
    map.put("EVENT-EdgeReached", MESSAGES.EdgeReachedEvents());
    map.put("EVENT-Flung", MESSAGES.FlungEvents());
    map.put("EVENT-NoLongerCollidingWith", MESSAGES.NoLongerCollidingWithEvents());
    map.put("EVENT-TouchDown", MESSAGES.TouchDownEvents());
    map.put("EVENT-TouchUp", MESSAGES.TouchUpEvents());
    map.put("EVENT-Touched", MESSAGES.TouchedEvents());


/* Methods */

    map.put("METHOD-Bounce", MESSAGES.BounceMethods());
    map.put("METHOD-CollidingWith", MESSAGES.CollidingWithMethods());
    map.put("METHOD-MoveIntoBounds", MESSAGES.MoveIntoBoundsMethods());
    map.put("METHOD-MoveTo", MESSAGES.MoveToMethods());
    map.put("METHOD-MoveToPoint", MESSAGES.MoveToPointMethods());
    map.put("METHOD-PointInDirection", MESSAGES.PointInDirectionMethods());
    map.put("METHOD-PointTowards", MESSAGES.PointTowardsMethods());


/* Parameters */

    map.put("PARAM-other", MESSAGES.otherParams());
    map.put("PARAM-startX", MESSAGES.startXParams());
    map.put("PARAM-startY", MESSAGES.startYParams());
    map.put("PARAM-prevX", MESSAGES.prevXParams());
    map.put("PARAM-prevY", MESSAGES.prevYParams());
    map.put("PARAM-currentX", MESSAGES.currentXParams());
    map.put("PARAM-currentY", MESSAGES.currentYParams());
    map.put("PARAM-edge", MESSAGES.edgeParams());
    map.put("PARAM-x", MESSAGES.xParams());
    map.put("PARAM-y", MESSAGES.yParams());
    map.put("PARAM-speed", MESSAGES.speedParams());
    map.put("PARAM-heading", MESSAGES.headingParams());
    map.put("PARAM-xvel", MESSAGES.xvelParams());
    map.put("PARAM-yvel", MESSAGES.yvelParams());
    map.put("PARAM-coordinates", MESSAGES.coordinatesParams());
    map.put("PARAM-target", MESSAGES.targetParams());


/* Component: BarcodeScanner */

    map.put("COMPONENT-BarcodeScanner", MESSAGES.barcodeScannerComponentPallette());

    map.put("BarcodeScanner-helpString", MESSAGES.BarcodeScannerHelpStringComponentPallette());



/* Properties */

    map.put("PROPERTY-UseExternalScanner", MESSAGES.UseExternalScannerProperties());


/* Events */

    map.put("EVENT-AfterScan", MESSAGES.AfterScanEvents());


/* Methods */

    map.put("METHOD-DoScan", MESSAGES.DoScanMethods());


/* Parameters */



/* Component: Barometer */

    map.put("COMPONENT-Barometer", MESSAGES.barometerComponentPallette());

    map.put("Barometer-helpString", MESSAGES.BarometerHelpStringComponentPallette());



/* Properties */

    map.put("PROPERTY-AirPressure", MESSAGES.AirPressureProperties());
    map.put("PROPERTY-RefreshTime", MESSAGES.RefreshTimeProperties());


/* Events */

    map.put("EVENT-AirPressureChanged", MESSAGES.AirPressureChangedEvents());


/* Methods */



/* Parameters */

    map.put("PARAM-pressure", MESSAGES.pressureParams());


/* Component: BluetoothClient */

    map.put("COMPONENT-BluetoothClient", MESSAGES.bluetoothClientComponentPallette());

    map.put("BluetoothClient-helpString", MESSAGES.BluetoothClientHelpStringComponentPallette());



/* Properties */

    map.put("PROPERTY-AddressesAndNames", MESSAGES.AddressesAndNamesProperties());
    map.put("PROPERTY-CharacterEncoding", MESSAGES.CharacterEncodingProperties());
    map.put("PROPERTY-DelimiterByte", MESSAGES.DelimiterByteProperties());
    map.put("PROPERTY-DisconnectOnError", MESSAGES.DisconnectOnErrorProperties());
    map.put("PROPERTY-HighByteFirst", MESSAGES.HighByteFirstProperties());
    map.put("PROPERTY-IsConnected", MESSAGES.IsConnectedProperties());
    map.put("PROPERTY-NoLocationNeeded", MESSAGES.NoLocationNeededProperties());
    map.put("PROPERTY-PollingRate", MESSAGES.PollingRateProperties());
    map.put("PROPERTY-Secure", MESSAGES.SecureProperties());


/* Events */



/* Methods */

    map.put("METHOD-BytesAvailableToReceive", MESSAGES.BytesAvailableToReceiveMethods());
    map.put("METHOD-Connect", MESSAGES.ConnectMethods());
    map.put("METHOD-ConnectWithUUID", MESSAGES.ConnectWithUUIDMethods());
    map.put("METHOD-Disconnect", MESSAGES.DisconnectMethods());
    map.put("METHOD-IsDevicePaired", MESSAGES.IsDevicePairedMethods());
    map.put("METHOD-ReceiveSigned1ByteNumber", MESSAGES.ReceiveSigned1ByteNumberMethods());
    map.put("METHOD-ReceiveSigned2ByteNumber", MESSAGES.ReceiveSigned2ByteNumberMethods());
    map.put("METHOD-ReceiveSigned4ByteNumber", MESSAGES.ReceiveSigned4ByteNumberMethods());
    map.put("METHOD-ReceiveSignedBytes", MESSAGES.ReceiveSignedBytesMethods());
    map.put("METHOD-ReceiveText", MESSAGES.ReceiveTextMethods());
    map.put("METHOD-ReceiveUnsigned1ByteNumber", MESSAGES.ReceiveUnsigned1ByteNumberMethods());
    map.put("METHOD-ReceiveUnsigned2ByteNumber", MESSAGES.ReceiveUnsigned2ByteNumberMethods());
    map.put("METHOD-ReceiveUnsigned4ByteNumber", MESSAGES.ReceiveUnsigned4ByteNumberMethods());
    map.put("METHOD-ReceiveUnsignedBytes", MESSAGES.ReceiveUnsignedBytesMethods());
    map.put("METHOD-Send1ByteNumber", MESSAGES.Send1ByteNumberMethods());
    map.put("METHOD-Send2ByteNumber", MESSAGES.Send2ByteNumberMethods());
    map.put("METHOD-Send4ByteNumber", MESSAGES.Send4ByteNumberMethods());
    map.put("METHOD-SendBytes", MESSAGES.SendBytesMethods());
    map.put("METHOD-SendText", MESSAGES.SendTextMethods());


/* Parameters */

    map.put("PARAM-address", MESSAGES.addressParams());
    map.put("PARAM-uuid", MESSAGES.uuidParams());
    map.put("PARAM-numberOfBytes", MESSAGES.numberOfBytesParams());
    map.put("PARAM-number", MESSAGES.numberParams());
    map.put("PARAM-list", MESSAGES.listParams());
    map.put("PARAM-text", MESSAGES.textParams());


/* Component: BluetoothServer */

    map.put("COMPONENT-BluetoothServer", MESSAGES.bluetoothServerComponentPallette());

    map.put("BluetoothServer-helpString", MESSAGES.BluetoothServerHelpStringComponentPallette());



/* Properties */

    map.put("PROPERTY-IsAccepting", MESSAGES.IsAcceptingProperties());


/* Events */

    map.put("EVENT-ConnectionAccepted", MESSAGES.ConnectionAcceptedEvents());


/* Methods */

    map.put("METHOD-AcceptConnection", MESSAGES.AcceptConnectionMethods());
    map.put("METHOD-AcceptConnectionWithUUID", MESSAGES.AcceptConnectionWithUUIDMethods());
    map.put("METHOD-StopAccepting", MESSAGES.StopAcceptingMethods());


/* Parameters */

    map.put("PARAM-serviceName", MESSAGES.serviceNameParams());


/* Component: Button */

    map.put("COMPONENT-Button", MESSAGES.buttonComponentPallette());

    map.put("Button-helpString", MESSAGES.ButtonHelpStringComponentPallette());



/* Properties */

    map.put("PROPERTY-FontBold", MESSAGES.FontBoldProperties());
    map.put("PROPERTY-FontItalic", MESSAGES.FontItalicProperties());
    map.put("PROPERTY-FontSize", MESSAGES.FontSizeProperties());
    map.put("PROPERTY-FontTypeface", MESSAGES.FontTypefaceProperties());
    map.put("PROPERTY-Shape", MESSAGES.ShapeProperties());
    map.put("PROPERTY-ShowFeedback", MESSAGES.ShowFeedbackProperties());
    map.put("PROPERTY-Text", MESSAGES.TextProperties());
    map.put("PROPERTY-TextAlignment", MESSAGES.TextAlignmentProperties());
    map.put("PROPERTY-TextColor", MESSAGES.TextColorProperties());


/* Events */

    map.put("EVENT-Click", MESSAGES.ClickEvents());
    map.put("EVENT-GotFocus", MESSAGES.GotFocusEvents());
    map.put("EVENT-LongClick", MESSAGES.LongClickEvents());
    map.put("EVENT-LostFocus", MESSAGES.LostFocusEvents());


/* Methods */



/* Parameters */



/* Component: Camcorder */

    map.put("COMPONENT-Camcorder", MESSAGES.camcorderComponentPallette());

    map.put("Camcorder-helpString", MESSAGES.CamcorderHelpStringComponentPallette());



/* Properties */



/* Events */

    map.put("EVENT-AfterRecording", MESSAGES.AfterRecordingEvents());


/* Methods */

    map.put("METHOD-RecordVideo", MESSAGES.RecordVideoMethods());


/* Parameters */

    map.put("PARAM-clip", MESSAGES.clipParams());


/* Component: Camera */

    map.put("COMPONENT-Camera", MESSAGES.cameraComponentPallette());

    map.put("Camera-helpString", MESSAGES.CameraHelpStringComponentPallette());



/* Properties */

    map.put("PROPERTY-UseFront", MESSAGES.UseFrontProperties());


/* Events */

    map.put("EVENT-AfterPicture", MESSAGES.AfterPictureEvents());


/* Methods */

    map.put("METHOD-TakePicture", MESSAGES.TakePictureMethods());


/* Parameters */

    map.put("PARAM-image", MESSAGES.imageParams());


/* Component: Canvas */

    map.put("COMPONENT-Canvas", MESSAGES.canvasComponentPallette());

    map.put("Canvas-helpString", MESSAGES.CanvasHelpStringComponentPallette());



/* Properties */

    map.put("PROPERTY-BackgroundImage", MESSAGES.BackgroundImageProperties());
    map.put("PROPERTY-BackgroundImageinBase64", MESSAGES.BackgroundImageinBase64Properties());
    map.put("PROPERTY-ExtendMovesOutsideCanvas", MESSAGES.ExtendMovesOutsideCanvasProperties());
    map.put("PROPERTY-LineWidth", MESSAGES.LineWidthProperties());
    map.put("PROPERTY-TapThreshold", MESSAGES.TapThresholdProperties());


/* Events */



/* Methods */

    map.put("METHOD-Clear", MESSAGES.ClearMethods());
    map.put("METHOD-DrawArc", MESSAGES.DrawArcMethods());
    map.put("METHOD-DrawCircle", MESSAGES.DrawCircleMethods());
    map.put("METHOD-DrawLine", MESSAGES.DrawLineMethods());
    map.put("METHOD-DrawPoint", MESSAGES.DrawPointMethods());
    map.put("METHOD-DrawShape", MESSAGES.DrawShapeMethods());
    map.put("METHOD-DrawText", MESSAGES.DrawTextMethods());
    map.put("METHOD-DrawTextAtAngle", MESSAGES.DrawTextAtAngleMethods());
    map.put("METHOD-GetBackgroundPixelColor", MESSAGES.GetBackgroundPixelColorMethods());
    map.put("METHOD-GetPixelColor", MESSAGES.GetPixelColorMethods());
    map.put("METHOD-Save", MESSAGES.SaveMethods());
    map.put("METHOD-SaveAs", MESSAGES.SaveAsMethods());
    map.put("METHOD-SetBackgroundPixelColor", MESSAGES.SetBackgroundPixelColorMethods());


/* Parameters */

    map.put("PARAM-draggedAnySprite", MESSAGES.draggedAnySpriteParams());
    map.put("PARAM-flungSprite", MESSAGES.flungSpriteParams());
    map.put("PARAM-touchedAnySprite", MESSAGES.touchedAnySpriteParams());
    map.put("PARAM-left", MESSAGES.leftParams());
    map.put("PARAM-top", MESSAGES.topParams());
    map.put("PARAM-right", MESSAGES.rightParams());
    map.put("PARAM-bottom", MESSAGES.bottomParams());
    map.put("PARAM-startAngle", MESSAGES.startAngleParams());
    map.put("PARAM-sweepAngle", MESSAGES.sweepAngleParams());
    map.put("PARAM-useCenter", MESSAGES.useCenterParams());
    map.put("PARAM-fill", MESSAGES.fillParams());
    map.put("PARAM-centerX", MESSAGES.centerXParams());
    map.put("PARAM-centerY", MESSAGES.centerYParams());
    map.put("PARAM-radius", MESSAGES.radiusParams());
    map.put("PARAM-x1", MESSAGES.x1Params());
    map.put("PARAM-y1", MESSAGES.y1Params());
    map.put("PARAM-x2", MESSAGES.x2Params());
    map.put("PARAM-y2", MESSAGES.y2Params());
    map.put("PARAM-pointList", MESSAGES.pointListParams());
    map.put("PARAM-angle", MESSAGES.angleParams());
    map.put("PARAM-fileName", MESSAGES.fileNameParams());
    map.put("PARAM-color", MESSAGES.colorParams());


/* Component: Chart */

    map.put("COMPONENT-Chart", MESSAGES.chartComponentPallette());

    map.put("Chart-helpString", MESSAGES.ChartHelpStringComponentPallette());



/* Properties */

    map.put("PROPERTY-AxesTextColor", MESSAGES.AxesTextColorProperties());
    map.put("PROPERTY-Description", MESSAGES.DescriptionProperties());
    map.put("PROPERTY-GridEnabled", MESSAGES.GridEnabledProperties());
    map.put("PROPERTY-Labels", MESSAGES.LabelsProperties());
    map.put("PROPERTY-LabelsFromString", MESSAGES.LabelsFromStringProperties());
    map.put("PROPERTY-LegendEnabled", MESSAGES.LegendEnabledProperties());
    map.put("PROPERTY-PieRadius", MESSAGES.PieRadiusProperties());
    map.put("PROPERTY-Type", MESSAGES.TypeProperties());
    map.put("PROPERTY-ValueFormat", MESSAGES.ValueFormatProperties());
    map.put("PROPERTY-XFromZero", MESSAGES.XFromZeroProperties());
    map.put("PROPERTY-YFromZero", MESSAGES.YFromZeroProperties());


/* Events */

    map.put("EVENT-EntryClick", MESSAGES.EntryClickEvents());


/* Methods */

    map.put("METHOD-ExtendDomainToInclude", MESSAGES.ExtendDomainToIncludeMethods());
    map.put("METHOD-ExtendRangeToInclude", MESSAGES.ExtendRangeToIncludeMethods());
    map.put("METHOD-ResetAxes", MESSAGES.ResetAxesMethods());
    map.put("METHOD-SetDomain", MESSAGES.SetDomainMethods());
    map.put("METHOD-SetRange", MESSAGES.SetRangeMethods());


/* Parameters */

    map.put("PARAM-series", MESSAGES.seriesParams());
    map.put("PARAM-minimum", MESSAGES.minimumParams());
    map.put("PARAM-maximum", MESSAGES.maximumParams());


/* Component: ChartData2D */

    map.put("COMPONENT-ChartData2D", MESSAGES.chartData2DComponentPallette());

    map.put("ChartData2D-helpString", MESSAGES.ChartData2DHelpStringComponentPallette());



/* Properties */

    map.put("PROPERTY-Color", MESSAGES.ColorProperties());
    map.put("PROPERTY-Colors", MESSAGES.ColorsProperties());
    map.put("PROPERTY-DataFileXColumn", MESSAGES.DataFileXColumnProperties());
    map.put("PROPERTY-DataFileYColumn", MESSAGES.DataFileYColumnProperties());
    map.put("PROPERTY-DataLabelColor", MESSAGES.DataLabelColorProperties());
    map.put("PROPERTY-DataSourceKey", MESSAGES.DataSourceKeyProperties());
    map.put("PROPERTY-ElementsFromPairs", MESSAGES.ElementsFromPairsProperties());
    map.put("PROPERTY-Label", MESSAGES.LabelProperties());
    map.put("PROPERTY-LineType", MESSAGES.LineTypeProperties());
    map.put("PROPERTY-PointShape", MESSAGES.PointShapeProperties());
    map.put("PROPERTY-Source", MESSAGES.SourceProperties());
    map.put("PROPERTY-SpreadsheetUseHeaders", MESSAGES.SpreadsheetUseHeadersProperties());
    map.put("PROPERTY-SpreadsheetXColumn", MESSAGES.SpreadsheetXColumnProperties());
    map.put("PROPERTY-SpreadsheetYColumn", MESSAGES.SpreadsheetYColumnProperties());
    map.put("PROPERTY-WebXColumn", MESSAGES.WebXColumnProperties());
    map.put("PROPERTY-WebYColumn", MESSAGES.WebYColumnProperties());


/* Events */



/* Methods */

    map.put("METHOD-AddEntry", MESSAGES.AddEntryMethods());
    map.put("METHOD-ChangeDataSource", MESSAGES.ChangeDataSourceMethods());
    map.put("METHOD-DoesEntryExist", MESSAGES.DoesEntryExistMethods());
    map.put("METHOD-DrawLineOfBestFit", MESSAGES.DrawLineOfBestFitMethods());
    map.put("METHOD-GetAllEntries", MESSAGES.GetAllEntriesMethods());
    map.put("METHOD-GetEntriesWithXValue", MESSAGES.GetEntriesWithXValueMethods());
    map.put("METHOD-GetEntriesWithYValue", MESSAGES.GetEntriesWithYValueMethods());
    map.put("METHOD-HighlightDataPoints", MESSAGES.HighlightDataPointsMethods());
    map.put("METHOD-ImportFromCloudDB", MESSAGES.ImportFromCloudDBMethods());
    map.put("METHOD-ImportFromDataFile", MESSAGES.ImportFromDataFileMethods());
    map.put("METHOD-ImportFromList", MESSAGES.ImportFromListMethods());
    map.put("METHOD-ImportFromSpreadsheet", MESSAGES.ImportFromSpreadsheetMethods());
    map.put("METHOD-ImportFromTinyDB", MESSAGES.ImportFromTinyDBMethods());
    map.put("METHOD-ImportFromWeb", MESSAGES.ImportFromWebMethods());
    map.put("METHOD-RemoveDataSource", MESSAGES.RemoveDataSourceMethods());
    map.put("METHOD-RemoveEntry", MESSAGES.RemoveEntryMethods());


/* Parameters */

    map.put("PARAM-source", MESSAGES.sourceParams());
    map.put("PARAM-keyValue", MESSAGES.keyValueParams());
    map.put("PARAM-dataPoints", MESSAGES.dataPointsParams());
    map.put("PARAM-cloudDB", MESSAGES.cloudDBParams());
    map.put("PARAM-tag", MESSAGES.tagParams());
    map.put("PARAM-dataFile", MESSAGES.dataFileParams());
    map.put("PARAM-xValueColumn", MESSAGES.xValueColumnParams());
    map.put("PARAM-yValueColumn", MESSAGES.yValueColumnParams());
    map.put("PARAM-spreadsheet", MESSAGES.spreadsheetParams());
    map.put("PARAM-xColumn", MESSAGES.xColumnParams());
    map.put("PARAM-yColumn", MESSAGES.yColumnParams());
    map.put("PARAM-useHeaders", MESSAGES.useHeadersParams());
    map.put("PARAM-tinyDB", MESSAGES.tinyDBParams());
    map.put("PARAM-web", MESSAGES.webParams());


/* Component: ChatBot */

    map.put("COMPONENT-ChatBot", MESSAGES.chatBotComponentPallette());

    map.put("ChatBot-helpString", MESSAGES.ChatBotHelpStringComponentPallette());



/* Properties */

    map.put("PROPERTY-ApiKey", MESSAGES.ApiKeyProperties());
    map.put("PROPERTY-Model", MESSAGES.ModelProperties());
    map.put("PROPERTY-Provider", MESSAGES.ProviderProperties());
    map.put("PROPERTY-System", MESSAGES.SystemProperties());
    map.put("PROPERTY-Token", MESSAGES.TokenProperties());


/* Events */

    map.put("EVENT-ErrorOccurred", MESSAGES.ErrorOccurredEvents());
    map.put("EVENT-GotResponse", MESSAGES.GotResponseEvents());
    map.put("EVENT-GotResponseWithImage", MESSAGES.GotResponseWithImageEvents());


/* Methods */

    map.put("METHOD-Converse", MESSAGES.ConverseMethods());
    map.put("METHOD-ConverseWithImage", MESSAGES.ConverseWithImageMethods());
    map.put("METHOD-CreateImage", MESSAGES.CreateImageMethods());
    map.put("METHOD-ResetConversation", MESSAGES.ResetConversationMethods());


/* Parameters */

    map.put("PARAM-responseCode", MESSAGES.responseCodeParams());
    map.put("PARAM-responseText", MESSAGES.responseTextParams());
    map.put("PARAM-question", MESSAGES.questionParams());
    map.put("PARAM-description", MESSAGES.descriptionParams());


/* Component: CheckBox */

    map.put("COMPONENT-CheckBox", MESSAGES.checkBoxComponentPallette());

    map.put("CheckBox-helpString", MESSAGES.CheckBoxHelpStringComponentPallette());



/* Properties */

    map.put("PROPERTY-Checked", MESSAGES.CheckedProperties());


/* Events */

    map.put("EVENT-Changed", MESSAGES.ChangedEvents());


/* Methods */



/* Parameters */



/* Component: Circle */

    map.put("COMPONENT-Circle", MESSAGES.circleComponentPallette());

    map.put("Circle-helpString", MESSAGES.CircleHelpStringComponentPallette());



/* Properties */

    map.put("PROPERTY-Draggable", MESSAGES.DraggableProperties());
    map.put("PROPERTY-EnableInfobox", MESSAGES.EnableInfoboxProperties());
    map.put("PROPERTY-FillColor", MESSAGES.FillColorProperties());
    map.put("PROPERTY-FillOpacity", MESSAGES.FillOpacityProperties());
    map.put("PROPERTY-Latitude", MESSAGES.LatitudeProperties());
    map.put("PROPERTY-Longitude", MESSAGES.LongitudeProperties());
    map.put("PROPERTY-StrokeColor", MESSAGES.StrokeColorProperties());
    map.put("PROPERTY-StrokeOpacity", MESSAGES.StrokeOpacityProperties());
    map.put("PROPERTY-StrokeWidth", MESSAGES.StrokeWidthProperties());
    map.put("PROPERTY-Title", MESSAGES.TitleProperties());


/* Events */

    map.put("EVENT-Drag", MESSAGES.DragEvents());
    map.put("EVENT-StartDrag", MESSAGES.StartDragEvents());
    map.put("EVENT-StopDrag", MESSAGES.StopDragEvents());


/* Methods */

    map.put("METHOD-DistanceToFeature", MESSAGES.DistanceToFeatureMethods());
    map.put("METHOD-DistanceToPoint", MESSAGES.DistanceToPointMethods());
    map.put("METHOD-HideInfobox", MESSAGES.HideInfoboxMethods());
    map.put("METHOD-SetLocation", MESSAGES.SetLocationMethods());
    map.put("METHOD-ShowInfobox", MESSAGES.ShowInfoboxMethods());


/* Parameters */

    map.put("PARAM-mapFeature", MESSAGES.mapFeatureParams());
    map.put("PARAM-centroids", MESSAGES.centroidsParams());
    map.put("PARAM-latitude", MESSAGES.latitudeParams());
    map.put("PARAM-longitude", MESSAGES.longitudeParams());
    map.put("PARAM-centroid", MESSAGES.centroidParams());


/* Component: CircularProgress */

    map.put("COMPONENT-CircularProgress", MESSAGES.circularProgressComponentPallette());

    map.put("CircularProgress-helpString", MESSAGES.CircularProgressHelpStringComponentPallette());



/* Properties */



/* Events */



/* Methods */



/* Parameters */



/* Component: Clock */

    map.put("COMPONENT-Clock", MESSAGES.clockComponentPallette());

    map.put("Clock-helpString", MESSAGES.ClockHelpStringComponentPallette());



/* Properties */

    map.put("PROPERTY-TimerAlwaysFires", MESSAGES.TimerAlwaysFiresProperties());
    map.put("PROPERTY-TimerEnabled", MESSAGES.TimerEnabledProperties());
    map.put("PROPERTY-TimerInterval", MESSAGES.TimerIntervalProperties());


/* Events */

    map.put("EVENT-Timer", MESSAGES.TimerEvents());


/* Methods */

    map.put("METHOD-AddDays", MESSAGES.AddDaysMethods());
    map.put("METHOD-AddDuration", MESSAGES.AddDurationMethods());
    map.put("METHOD-AddHours", MESSAGES.AddHoursMethods());
    map.put("METHOD-AddMinutes", MESSAGES.AddMinutesMethods());
    map.put("METHOD-AddMonths", MESSAGES.AddMonthsMethods());
    map.put("METHOD-AddSeconds", MESSAGES.AddSecondsMethods());
    map.put("METHOD-AddWeeks", MESSAGES.AddWeeksMethods());
    map.put("METHOD-AddYears", MESSAGES.AddYearsMethods());
    map.put("METHOD-DayOfMonth", MESSAGES.DayOfMonthMethods());
    map.put("METHOD-Duration", MESSAGES.DurationMethods());
    map.put("METHOD-DurationToDays", MESSAGES.DurationToDaysMethods());
    map.put("METHOD-DurationToHours", MESSAGES.DurationToHoursMethods());
    map.put("METHOD-DurationToMinutes", MESSAGES.DurationToMinutesMethods());
    map.put("METHOD-DurationToSeconds", MESSAGES.DurationToSecondsMethods());
    map.put("METHOD-DurationToWeeks", MESSAGES.DurationToWeeksMethods());
    map.put("METHOD-FormatDate", MESSAGES.FormatDateMethods());
    map.put("METHOD-FormatDateTime", MESSAGES.FormatDateTimeMethods());
    map.put("METHOD-FormatTime", MESSAGES.FormatTimeMethods());
    map.put("METHOD-GetMillis", MESSAGES.GetMillisMethods());
    map.put("METHOD-Hour", MESSAGES.HourMethods());
    map.put("METHOD-MakeDate", MESSAGES.MakeDateMethods());
    map.put("METHOD-MakeInstant", MESSAGES.MakeInstantMethods());
    map.put("METHOD-MakeInstantFromMillis", MESSAGES.MakeInstantFromMillisMethods());
    map.put("METHOD-MakeInstantFromParts", MESSAGES.MakeInstantFromPartsMethods());
    map.put("METHOD-MakeTime", MESSAGES.MakeTimeMethods());
    map.put("METHOD-Minute", MESSAGES.MinuteMethods());
    map.put("METHOD-Month", MESSAGES.MonthMethods());
    map.put("METHOD-MonthName", MESSAGES.MonthNameMethods());
    map.put("METHOD-Now", MESSAGES.NowMethods());
    map.put("METHOD-Second", MESSAGES.SecondMethods());
    map.put("METHOD-SystemTime", MESSAGES.SystemTimeMethods());
    map.put("METHOD-Weekday", MESSAGES.WeekdayMethods());
    map.put("METHOD-WeekdayName", MESSAGES.WeekdayNameMethods());
    map.put("METHOD-Year", MESSAGES.YearMethods());


/* Parameters */

    map.put("PARAM-instant", MESSAGES.instantParams());
    map.put("PARAM-quantity", MESSAGES.quantityParams());
    map.put("PARAM-start", MESSAGES.startParams());
    map.put("PARAM-end", MESSAGES.endParams());
    map.put("PARAM-duration", MESSAGES.durationParams());
    map.put("PARAM-pattern", MESSAGES.patternParams());
    map.put("PARAM-year", MESSAGES.yearParams());
    map.put("PARAM-month", MESSAGES.monthParams());
    map.put("PARAM-day", MESSAGES.dayParams());
    map.put("PARAM-from", MESSAGES.fromParams());
    map.put("PARAM-millis", MESSAGES.millisParams());
    map.put("PARAM-hour", MESSAGES.hourParams());
    map.put("PARAM-minute", MESSAGES.minuteParams());
    map.put("PARAM-second", MESSAGES.secondParams());


/* Component: CloudDB */

    map.put("COMPONENT-CloudDB", MESSAGES.cloudDBComponentPallette());

    map.put("CloudDB-helpString", MESSAGES.CloudDBHelpStringComponentPallette());



/* Properties */

    map.put("PROPERTY-DefaultRedisServer", MESSAGES.DefaultRedisServerProperties());
    map.put("PROPERTY-ProjectID", MESSAGES.ProjectIDProperties());
    map.put("PROPERTY-RedisPort", MESSAGES.RedisPortProperties());
    map.put("PROPERTY-RedisServer", MESSAGES.RedisServerProperties());
    map.put("PROPERTY-UseSSL", MESSAGES.UseSSLProperties());


/* Events */

    map.put("EVENT-CloudDBError", MESSAGES.CloudDBErrorEvents());
    map.put("EVENT-DataChanged", MESSAGES.DataChangedEvents());
    map.put("EVENT-FirstRemoved", MESSAGES.FirstRemovedEvents());
    map.put("EVENT-GotValue", MESSAGES.GotValueEvents());
    map.put("EVENT-TagList", MESSAGES.TagListEvents());
    map.put("EVENT-UpdateDone", MESSAGES.UpdateDoneEvents());


/* Methods */

    map.put("METHOD-AppendValueToList", MESSAGES.AppendValueToListMethods());
    map.put("METHOD-ClearTag", MESSAGES.ClearTagMethods());
    map.put("METHOD-CloudConnected", MESSAGES.CloudConnectedMethods());
    map.put("METHOD-GetTagList", MESSAGES.GetTagListMethods());
    map.put("METHOD-GetValue", MESSAGES.GetValueMethods());
    map.put("METHOD-RemoveFirstFromList", MESSAGES.RemoveFirstFromListMethods());
    map.put("METHOD-StoreValue", MESSAGES.StoreValueMethods());


/* Parameters */

    map.put("PARAM-message", MESSAGES.messageParams());
    map.put("PARAM-value", MESSAGES.valueParams());
    map.put("PARAM-operation", MESSAGES.operationParams());
    map.put("PARAM-itemToAdd", MESSAGES.itemToAddParams());
    map.put("PARAM-valueIfTagNotThere", MESSAGES.valueIfTagNotThereParams());
    map.put("PARAM-valueToStore", MESSAGES.valueToStoreParams());


/* Component: ContactPicker */

    map.put("COMPONENT-ContactPicker", MESSAGES.contactPickerComponentPallette());

    map.put("ContactPicker-helpString", MESSAGES.ContactPickerHelpStringComponentPallette());



/* Properties */

    map.put("PROPERTY-ContactName", MESSAGES.ContactNameProperties());
    map.put("PROPERTY-ContactUri", MESSAGES.ContactUriProperties());
    map.put("PROPERTY-EmailAddress", MESSAGES.EmailAddressProperties());
    map.put("PROPERTY-EmailAddressList", MESSAGES.EmailAddressListProperties());
    map.put("PROPERTY-PhoneNumber", MESSAGES.PhoneNumberProperties());
    map.put("PROPERTY-PhoneNumberList", MESSAGES.PhoneNumberListProperties());
    map.put("PROPERTY-Picture", MESSAGES.PictureProperties());


/* Events */

    map.put("EVENT-AfterPicking", MESSAGES.AfterPickingEvents());
    map.put("EVENT-BeforePicking", MESSAGES.BeforePickingEvents());


/* Methods */

    map.put("METHOD-Open", MESSAGES.OpenMethods());
    map.put("METHOD-ViewContact", MESSAGES.ViewContactMethods());


/* Parameters */

    map.put("PARAM-uri", MESSAGES.uriParams());


/* Component: DataFile */

    map.put("COMPONENT-DataFile", MESSAGES.dataFileComponentPallette());

    map.put("DataFile-helpString", MESSAGES.DataFileHelpStringComponentPallette());



/* Properties */

    map.put("PROPERTY-ColumnNames", MESSAGES.ColumnNamesProperties());
    map.put("PROPERTY-Columns", MESSAGES.ColumnsProperties());
    map.put("PROPERTY-DefaultScope", MESSAGES.DefaultScopeProperties());
    map.put("PROPERTY-Rows", MESSAGES.RowsProperties());
    map.put("PROPERTY-SourceFile", MESSAGES.SourceFileProperties());


/* Events */



/* Methods */

    map.put("METHOD-ReadFile", MESSAGES.ReadFileMethods());


/* Parameters */



/* Component: DatePicker */

    map.put("COMPONENT-DatePicker", MESSAGES.datePickerComponentPallette());

    map.put("DatePicker-helpString", MESSAGES.DatePickerHelpStringComponentPallette());



/* Properties */

    map.put("PROPERTY-Day", MESSAGES.DayProperties());
    map.put("PROPERTY-Instant", MESSAGES.InstantProperties());
    map.put("PROPERTY-Month", MESSAGES.MonthProperties());
    map.put("PROPERTY-MonthInText", MESSAGES.MonthInTextProperties());
    map.put("PROPERTY-Year", MESSAGES.YearProperties());


/* Events */

    map.put("EVENT-AfterDateSet", MESSAGES.AfterDateSetEvents());


/* Methods */

    map.put("METHOD-LaunchPicker", MESSAGES.LaunchPickerMethods());
    map.put("METHOD-SetDateToDisplay", MESSAGES.SetDateToDisplayMethods());
    map.put("METHOD-SetDateToDisplayFromInstant", MESSAGES.SetDateToDisplayFromInstantMethods());


/* Parameters */



/* Component: EmailPicker */

    map.put("COMPONENT-EmailPicker", MESSAGES.emailPickerComponentPallette());

    map.put("EmailPicker-helpString", MESSAGES.EmailPickerHelpStringComponentPallette());



/* Properties */

    map.put("PROPERTY-Hint", MESSAGES.HintProperties());
    map.put("PROPERTY-HintColor", MESSAGES.HintColorProperties());


/* Events */

    map.put("EVENT-TextChanged", MESSAGES.TextChangedEvents());


/* Methods */

    map.put("METHOD-MoveCursorTo", MESSAGES.MoveCursorToMethods());
    map.put("METHOD-MoveCursorToEnd", MESSAGES.MoveCursorToEndMethods());
    map.put("METHOD-MoveCursorToStart", MESSAGES.MoveCursorToStartMethods());
    map.put("METHOD-RequestFocus", MESSAGES.RequestFocusMethods());


/* Parameters */

    map.put("PARAM-position", MESSAGES.positionParams());


/* Component: Ev3ColorSensor */

    map.put("COMPONENT-Ev3ColorSensor", MESSAGES.ev3ColorSensorComponentPallette());

    map.put("Ev3ColorSensor-helpString", MESSAGES.Ev3ColorSensorHelpStringComponentPallette());



/* Properties */

    map.put("PROPERTY-AboveRangeEventEnabled", MESSAGES.AboveRangeEventEnabledProperties());
    map.put("PROPERTY-BelowRangeEventEnabled", MESSAGES.BelowRangeEventEnabledProperties());
    map.put("PROPERTY-BluetoothClient", MESSAGES.BluetoothClientProperties());
    map.put("PROPERTY-BottomOfRange", MESSAGES.BottomOfRangeProperties());
    map.put("PROPERTY-ColorChangedEventEnabled", MESSAGES.ColorChangedEventEnabledProperties());
    map.put("PROPERTY-Mode", MESSAGES.ModeProperties());
    map.put("PROPERTY-SensorPort", MESSAGES.SensorPortProperties());
    map.put("PROPERTY-TopOfRange", MESSAGES.TopOfRangeProperties());
    map.put("PROPERTY-WithinRangeEventEnabled", MESSAGES.WithinRangeEventEnabledProperties());


/* Events */

    map.put("EVENT-AboveRange", MESSAGES.AboveRangeEvents());
    map.put("EVENT-BelowRange", MESSAGES.BelowRangeEvents());
    map.put("EVENT-ColorChanged", MESSAGES.ColorChangedEvents());
    map.put("EVENT-WithinRange", MESSAGES.WithinRangeEvents());


/* Methods */

    map.put("METHOD-GetColorCode", MESSAGES.GetColorCodeMethods());
    map.put("METHOD-GetColorName", MESSAGES.GetColorNameMethods());
    map.put("METHOD-GetLightLevel", MESSAGES.GetLightLevelMethods());
    map.put("METHOD-SetAmbientMode", MESSAGES.SetAmbientModeMethods());
    map.put("METHOD-SetColorMode", MESSAGES.SetColorModeMethods());
    map.put("METHOD-SetReflectedMode", MESSAGES.SetReflectedModeMethods());


/* Parameters */

    map.put("PARAM-colorCode", MESSAGES.colorCodeParams());
    map.put("PARAM-colorName", MESSAGES.colorNameParams());


/* Component: Ev3Commands */

    map.put("COMPONENT-Ev3Commands", MESSAGES.ev3CommandsComponentPallette());

    map.put("Ev3Commands-helpString", MESSAGES.Ev3CommandsHelpStringComponentPallette());



/* Properties */



/* Events */



/* Methods */

    map.put("METHOD-GetBatteryCurrent", MESSAGES.GetBatteryCurrentMethods());
    map.put("METHOD-GetBatteryVoltage", MESSAGES.GetBatteryVoltageMethods());
    map.put("METHOD-GetFirmwareBuild", MESSAGES.GetFirmwareBuildMethods());
    map.put("METHOD-GetFirmwareVersion", MESSAGES.GetFirmwareVersionMethods());
    map.put("METHOD-GetHardwareVersion", MESSAGES.GetHardwareVersionMethods());
    map.put("METHOD-GetOSBuild", MESSAGES.GetOSBuildMethods());
    map.put("METHOD-GetOSVersion", MESSAGES.GetOSVersionMethods());
    map.put("METHOD-KeepAlive", MESSAGES.KeepAliveMethods());


/* Parameters */

    map.put("PARAM-minutes", MESSAGES.minutesParams());


/* Component: Ev3GyroSensor */

    map.put("COMPONENT-Ev3GyroSensor", MESSAGES.ev3GyroSensorComponentPallette());

    map.put("Ev3GyroSensor-helpString", MESSAGES.Ev3GyroSensorHelpStringComponentPallette());



/* Properties */

    map.put("PROPERTY-SensorValueChangedEventEnabled", MESSAGES.SensorValueChangedEventEnabledProperties());


/* Events */

    map.put("EVENT-SensorValueChanged", MESSAGES.SensorValueChangedEvents());


/* Methods */

    map.put("METHOD-GetSensorValue", MESSAGES.GetSensorValueMethods());
    map.put("METHOD-SetAngleMode", MESSAGES.SetAngleModeMethods());
    map.put("METHOD-SetRateMode", MESSAGES.SetRateModeMethods());


/* Parameters */

    map.put("PARAM-sensorValue", MESSAGES.sensorValueParams());


/* Component: Ev3Motors */

    map.put("COMPONENT-Ev3Motors", MESSAGES.ev3MotorsComponentPallette());

    map.put("Ev3Motors-helpString", MESSAGES.Ev3MotorsHelpStringComponentPallette());



/* Properties */

    map.put("PROPERTY-EnableSpeedRegulation", MESSAGES.EnableSpeedRegulationProperties());
    map.put("PROPERTY-MotorPorts", MESSAGES.MotorPortsProperties());
    map.put("PROPERTY-ReverseDirection", MESSAGES.ReverseDirectionProperties());
    map.put("PROPERTY-StopBeforeDisconnect", MESSAGES.StopBeforeDisconnectProperties());
    map.put("PROPERTY-TachoCountChangedEventEnabled", MESSAGES.TachoCountChangedEventEnabledProperties());
    map.put("PROPERTY-WheelDiameter", MESSAGES.WheelDiameterProperties());


/* Events */

    map.put("EVENT-TachoCountChanged", MESSAGES.TachoCountChangedEvents());


/* Methods */

    map.put("METHOD-GetTachoCount", MESSAGES.GetTachoCountMethods());
    map.put("METHOD-ResetTachoCount", MESSAGES.ResetTachoCountMethods());
    map.put("METHOD-RotateInDistance", MESSAGES.RotateInDistanceMethods());
    map.put("METHOD-RotateInDuration", MESSAGES.RotateInDurationMethods());
    map.put("METHOD-RotateInTachoCounts", MESSAGES.RotateInTachoCountsMethods());
    map.put("METHOD-RotateIndefinitely", MESSAGES.RotateIndefinitelyMethods());
    map.put("METHOD-RotateSyncInDistance", MESSAGES.RotateSyncInDistanceMethods());
    map.put("METHOD-RotateSyncInDuration", MESSAGES.RotateSyncInDurationMethods());
    map.put("METHOD-RotateSyncInTachoCounts", MESSAGES.RotateSyncInTachoCountsMethods());
    map.put("METHOD-RotateSyncIndefinitely", MESSAGES.RotateSyncIndefinitelyMethods());
    map.put("METHOD-Stop", MESSAGES.StopMethods());
    map.put("METHOD-ToggleDirection", MESSAGES.ToggleDirectionMethods());


/* Parameters */

    map.put("PARAM-tachoCount", MESSAGES.tachoCountParams());
    map.put("PARAM-power", MESSAGES.powerParams());
    map.put("PARAM-distance", MESSAGES.distanceParams());
    map.put("PARAM-useBrake", MESSAGES.useBrakeParams());
    map.put("PARAM-milliseconds", MESSAGES.millisecondsParams());
    map.put("PARAM-tachoCounts", MESSAGES.tachoCountsParams());
    map.put("PARAM-turnRatio", MESSAGES.turnRatioParams());


/* Component: Ev3Sound */

    map.put("COMPONENT-Ev3Sound", MESSAGES.ev3SoundComponentPallette());

    map.put("Ev3Sound-helpString", MESSAGES.Ev3SoundHelpStringComponentPallette());



/* Properties */



/* Events */



/* Methods */

    map.put("METHOD-PlayTone", MESSAGES.PlayToneMethods());
    map.put("METHOD-StopSound", MESSAGES.StopSoundMethods());


/* Parameters */

    map.put("PARAM-volume", MESSAGES.volumeParams());
    map.put("PARAM-frequency", MESSAGES.frequencyParams());


/* Component: Ev3TouchSensor */

    map.put("COMPONENT-Ev3TouchSensor", MESSAGES.ev3TouchSensorComponentPallette());

    map.put("Ev3TouchSensor-helpString", MESSAGES.Ev3TouchSensorHelpStringComponentPallette());



/* Properties */

    map.put("PROPERTY-PressedEventEnabled", MESSAGES.PressedEventEnabledProperties());
    map.put("PROPERTY-ReleasedEventEnabled", MESSAGES.ReleasedEventEnabledProperties());


/* Events */

    map.put("EVENT-Pressed", MESSAGES.PressedEvents());
    map.put("EVENT-Released", MESSAGES.ReleasedEvents());


/* Methods */

    map.put("METHOD-IsPressed", MESSAGES.IsPressedMethods());


/* Parameters */



/* Component: Ev3UI */

    map.put("COMPONENT-Ev3UI", MESSAGES.ev3UIComponentPallette());

    map.put("Ev3UI-helpString", MESSAGES.Ev3UIHelpStringComponentPallette());



/* Properties */



/* Events */



/* Methods */

    map.put("METHOD-DrawIcon", MESSAGES.DrawIconMethods());
    map.put("METHOD-DrawRect", MESSAGES.DrawRectMethods());
    map.put("METHOD-FillScreen", MESSAGES.FillScreenMethods());


/* Parameters */

    map.put("PARAM-type", MESSAGES.typeParams());
    map.put("PARAM-no", MESSAGES.noParams());
    map.put("PARAM-width", MESSAGES.widthParams());
    map.put("PARAM-height", MESSAGES.heightParams());


/* Component: Ev3UltrasonicSensor */

    map.put("COMPONENT-Ev3UltrasonicSensor", MESSAGES.ev3UltrasonicSensorComponentPallette());

    map.put("Ev3UltrasonicSensor-helpString", MESSAGES.Ev3UltrasonicSensorHelpStringComponentPallette());



/* Properties */

    map.put("PROPERTY-Unit", MESSAGES.UnitProperties());


/* Events */



/* Methods */

    map.put("METHOD-GetDistance", MESSAGES.GetDistanceMethods());
    map.put("METHOD-SetCmUnit", MESSAGES.SetCmUnitMethods());
    map.put("METHOD-SetInchUnit", MESSAGES.SetInchUnitMethods());


/* Parameters */



/* Component: FeatureCollection */

    map.put("COMPONENT-FeatureCollection", MESSAGES.featureCollectionComponentPallette());

    map.put("FeatureCollection-helpString", MESSAGES.FeatureCollectionHelpStringComponentPallette());



/* Properties */

    map.put("PROPERTY-Features", MESSAGES.FeaturesProperties());
    map.put("PROPERTY-FeaturesFromGeoJSON", MESSAGES.FeaturesFromGeoJSONProperties());


/* Events */

    map.put("EVENT-FeatureClick", MESSAGES.FeatureClickEvents());
    map.put("EVENT-FeatureDrag", MESSAGES.FeatureDragEvents());
    map.put("EVENT-FeatureLongClick", MESSAGES.FeatureLongClickEvents());
    map.put("EVENT-FeatureStartDrag", MESSAGES.FeatureStartDragEvents());
    map.put("EVENT-FeatureStopDrag", MESSAGES.FeatureStopDragEvents());
    map.put("EVENT-GotFeatures", MESSAGES.GotFeaturesEvents());
    map.put("EVENT-LoadError", MESSAGES.LoadErrorEvents());


/* Methods */

    map.put("METHOD-FeatureFromDescription", MESSAGES.FeatureFromDescriptionMethods());
    map.put("METHOD-LoadFromURL", MESSAGES.LoadFromURLMethods());


/* Parameters */

    map.put("PARAM-feature", MESSAGES.featureParams());
    map.put("PARAM-url", MESSAGES.urlParams());
    map.put("PARAM-features", MESSAGES.featuresParams());
    map.put("PARAM-errorMessage", MESSAGES.errorMessageParams());


/* Component: File */

    map.put("COMPONENT-File", MESSAGES.fileComponentPallette());

    map.put("File-helpString", MESSAGES.FileHelpStringComponentPallette());



/* Properties */

    map.put("PROPERTY-ReadPermission", MESSAGES.ReadPermissionProperties());
    map.put("PROPERTY-Scope", MESSAGES.ScopeProperties());
    map.put("PROPERTY-WritePermission", MESSAGES.WritePermissionProperties());


/* Events */

    map.put("EVENT-AfterFileSaved", MESSAGES.AfterFileSavedEvents());
    map.put("EVENT-GotText", MESSAGES.GotTextEvents());


/* Methods */

    map.put("METHOD-AppendToFile", MESSAGES.AppendToFileMethods());
    map.put("METHOD-CopyFile", MESSAGES.CopyFileMethods());
    map.put("METHOD-Delete", MESSAGES.DeleteMethods());
    map.put("METHOD-Exists", MESSAGES.ExistsMethods());
    map.put("METHOD-IsDirectory", MESSAGES.IsDirectoryMethods());
    map.put("METHOD-ListDirectory", MESSAGES.ListDirectoryMethods());
    map.put("METHOD-MakeDirectory", MESSAGES.MakeDirectoryMethods());
    map.put("METHOD-MakeFullPath", MESSAGES.MakeFullPathMethods());
    map.put("METHOD-MoveFile", MESSAGES.MoveFileMethods());
    map.put("METHOD-ReadFrom", MESSAGES.ReadFromMethods());
    map.put("METHOD-RemoveDirectory", MESSAGES.RemoveDirectoryMethods());
    map.put("METHOD-SaveFile", MESSAGES.SaveFileMethods());


/* Parameters */

    map.put("PARAM-fromScope", MESSAGES.fromScopeParams());
    map.put("PARAM-fromFileName", MESSAGES.fromFileNameParams());
    map.put("PARAM-toScope", MESSAGES.toScopeParams());
    map.put("PARAM-toFileName", MESSAGES.toFileNameParams());
    map.put("PARAM-scope", MESSAGES.scopeParams());
    map.put("PARAM-path", MESSAGES.pathParams());
    map.put("PARAM-directoryName", MESSAGES.directoryNameParams());
    map.put("PARAM-recursive", MESSAGES.recursiveParams());


/* Component: FilePicker */

    map.put("COMPONENT-FilePicker", MESSAGES.filePickerComponentPallette());

    map.put("FilePicker-helpString", MESSAGES.FilePickerHelpStringComponentPallette());



/* Properties */

    map.put("PROPERTY-MimeType", MESSAGES.MimeTypeProperties());
    map.put("PROPERTY-Selection", MESSAGES.SelectionProperties());


/* Events */



/* Methods */



/* Parameters */



/* Component: FirebaseDB */

    map.put("COMPONENT-FirebaseDB", MESSAGES.firebaseDBComponentPallette());

    map.put("FirebaseDB-helpString", MESSAGES.FirebaseDBHelpStringComponentPallette());



/* Properties */

    map.put("PROPERTY-DefaultURL", MESSAGES.DefaultURLProperties());
    map.put("PROPERTY-DeveloperBucket", MESSAGES.DeveloperBucketProperties());
    map.put("PROPERTY-FirebaseToken", MESSAGES.FirebaseTokenProperties());
    map.put("PROPERTY-FirebaseURL", MESSAGES.FirebaseURLProperties());
    map.put("PROPERTY-Persist", MESSAGES.PersistProperties());
    map.put("PROPERTY-ProjectBucket", MESSAGES.ProjectBucketProperties());


/* Events */

    map.put("EVENT-FirebaseError", MESSAGES.FirebaseErrorEvents());


/* Methods */

    map.put("METHOD-AppendValue", MESSAGES.AppendValueMethods());
    map.put("METHOD-RemoveFirst", MESSAGES.RemoveFirstMethods());
    map.put("METHOD-Unauthenticate", MESSAGES.UnauthenticateMethods());


/* Parameters */

    map.put("PARAM-valueToAdd", MESSAGES.valueToAddParams());


/* Component: Screen */

    map.put("COMPONENT-Screen", MESSAGES.screenComponentPallette());

    map.put("Screen-helpString", MESSAGES.ScreenHelpStringComponentPallette());



/* Properties */

    map.put("PROPERTY-AboutScreen", MESSAGES.AboutScreenProperties());
    map.put("PROPERTY-AccentColor", MESSAGES.AccentColorProperties());
    map.put("PROPERTY-ActionBar", MESSAGES.ActionBarProperties());
    map.put("PROPERTY-AlignHorizontal", MESSAGES.AlignHorizontalProperties());
    map.put("PROPERTY-AlignVertical", MESSAGES.AlignVerticalProperties());
    map.put("PROPERTY-AppName", MESSAGES.AppNameProperties());
    map.put("PROPERTY-BigDefaultText", MESSAGES.BigDefaultTextProperties());
    map.put("PROPERTY-BlocksToolkit", MESSAGES.BlocksToolkitProperties());
    map.put("PROPERTY-CloseScreenAnimation", MESSAGES.CloseScreenAnimationProperties());
    map.put("PROPERTY-DefaultFileScope", MESSAGES.DefaultFileScopeProperties());
    map.put("PROPERTY-HighContrast", MESSAGES.HighContrastProperties());
    map.put("PROPERTY-Icon", MESSAGES.IconProperties());
    map.put("PROPERTY-NSBluetoothAlwaysUsageDescription", MESSAGES.NSBluetoothAlwaysUsageDescriptionProperties());
    map.put("PROPERTY-NSBluetoothPeripheralUsageDescription", MESSAGES.NSBluetoothPeripheralUsageDescriptionProperties());
    map.put("PROPERTY-NSCameraUsageDescription", MESSAGES.NSCameraUsageDescriptionProperties());
    map.put("PROPERTY-NSContactsUsageDescription", MESSAGES.NSContactsUsageDescriptionProperties());
    map.put("PROPERTY-NSLocationWhenInUseUsageDescription", MESSAGES.NSLocationWhenInUseUsageDescriptionProperties());
    map.put("PROPERTY-NSMicrophoneUsageDescription", MESSAGES.NSMicrophoneUsageDescriptionProperties());
    map.put("PROPERTY-NSSpeechRecognitionUsageDescription", MESSAGES.NSSpeechRecognitionUsageDescriptionProperties());
    map.put("PROPERTY-OpenScreenAnimation", MESSAGES.OpenScreenAnimationProperties());
    map.put("PROPERTY-Platform", MESSAGES.PlatformProperties());
    map.put("PROPERTY-PlatformVersion", MESSAGES.PlatformVersionProperties());
    map.put("PROPERTY-PrimaryColor", MESSAGES.PrimaryColorProperties());
    map.put("PROPERTY-PrimaryColorDark", MESSAGES.PrimaryColorDarkProperties());
    map.put("PROPERTY-ScreenOrientation", MESSAGES.ScreenOrientationProperties());
    map.put("PROPERTY-Scrollable", MESSAGES.ScrollableProperties());
    map.put("PROPERTY-ShowListsAsJson", MESSAGES.ShowListsAsJsonProperties());
    map.put("PROPERTY-ShowStatusBar", MESSAGES.ShowStatusBarProperties());
    map.put("PROPERTY-Sizing", MESSAGES.SizingProperties());
    map.put("PROPERTY-Theme", MESSAGES.ThemeProperties());
    map.put("PROPERTY-TitleVisible", MESSAGES.TitleVisibleProperties());
    map.put("PROPERTY-TutorialURL", MESSAGES.TutorialURLProperties());
    map.put("PROPERTY-VersionCode", MESSAGES.VersionCodeProperties());
    map.put("PROPERTY-VersionName", MESSAGES.VersionNameProperties());


/* Events */

    map.put("EVENT-BackPressed", MESSAGES.BackPressedEvents());
    map.put("EVENT-Initialize", MESSAGES.InitializeEvents());
    map.put("EVENT-OtherScreenClosed", MESSAGES.OtherScreenClosedEvents());
    map.put("EVENT-PermissionDenied", MESSAGES.PermissionDeniedEvents());
    map.put("EVENT-PermissionGranted", MESSAGES.PermissionGrantedEvents());
    map.put("EVENT-ScreenOrientationChanged", MESSAGES.ScreenOrientationChangedEvents());


/* Methods */

    map.put("METHOD-AskForPermission", MESSAGES.AskForPermissionMethods());
    map.put("METHOD-HideKeyboard", MESSAGES.HideKeyboardMethods());


/* Parameters */

    map.put("PARAM-component", MESSAGES.componentParams());
    map.put("PARAM-functionName", MESSAGES.functionNameParams());
    map.put("PARAM-errorNumber", MESSAGES.errorNumberParams());
    map.put("PARAM-otherScreenName", MESSAGES.otherScreenNameParams());
    map.put("PARAM-permissionName", MESSAGES.permissionNameParams());


/* Component: FusiontablesControl */

    map.put("COMPONENT-FusiontablesControl", MESSAGES.fusiontablesControlComponentPallette());

    map.put("FusiontablesControl-helpString", MESSAGES.FusiontablesControlHelpStringComponentPallette());



/* Properties */

    map.put("PROPERTY-KeyFile", MESSAGES.KeyFileProperties());
    map.put("PROPERTY-LoadingDialogMessage", MESSAGES.LoadingDialogMessageProperties());
    map.put("PROPERTY-Query", MESSAGES.QueryProperties());
    map.put("PROPERTY-ServiceAccountEmail", MESSAGES.ServiceAccountEmailProperties());
    map.put("PROPERTY-ShowLoadingDialog", MESSAGES.ShowLoadingDialogProperties());
    map.put("PROPERTY-UseServiceAuthentication", MESSAGES.UseServiceAuthenticationProperties());


/* Events */

    map.put("EVENT-GotResult", MESSAGES.GotResultEvents());


/* Methods */

    map.put("METHOD-DoQuery", MESSAGES.DoQueryMethods());
    map.put("METHOD-ForgetLogin", MESSAGES.ForgetLoginMethods());
    map.put("METHOD-GetRows", MESSAGES.GetRowsMethods());
    map.put("METHOD-GetRowsWithConditions", MESSAGES.GetRowsWithConditionsMethods());
    map.put("METHOD-InsertRow", MESSAGES.InsertRowMethods());
    map.put("METHOD-SendQuery", MESSAGES.SendQueryMethods());


/* Parameters */

    map.put("PARAM-tableId", MESSAGES.tableIdParams());
    map.put("PARAM-columns", MESSAGES.columnsParams());
    map.put("PARAM-conditions", MESSAGES.conditionsParams());
    map.put("PARAM-values", MESSAGES.valuesParams());


/* Component: GameClient */

    map.put("COMPONENT-GameClient", MESSAGES.gameClientComponentPallette());

    map.put("GameClient-helpString", MESSAGES.GameClientHelpStringComponentPallette());



/* Properties */

    map.put("PROPERTY-GameId", MESSAGES.GameIdProperties());
    map.put("PROPERTY-InstanceId", MESSAGES.InstanceIdProperties());
    map.put("PROPERTY-InvitedInstances", MESSAGES.InvitedInstancesProperties());
    map.put("PROPERTY-JoinedInstances", MESSAGES.JoinedInstancesProperties());
    map.put("PROPERTY-Leader", MESSAGES.LeaderProperties());
    map.put("PROPERTY-Players", MESSAGES.PlayersProperties());
    map.put("PROPERTY-PublicInstances", MESSAGES.PublicInstancesProperties());
    map.put("PROPERTY-ServiceURL", MESSAGES.ServiceURLProperties());
    map.put("PROPERTY-ServiceUrl", MESSAGES.ServiceUrlProperties());
    map.put("PROPERTY-UserEmailAddress", MESSAGES.UserEmailAddressProperties());


/* Events */

    map.put("EVENT-FunctionCompleted", MESSAGES.FunctionCompletedEvents());
    map.put("EVENT-GotMessage", MESSAGES.GotMessageEvents());
    map.put("EVENT-Info", MESSAGES.InfoEvents());
    map.put("EVENT-InstanceIdChanged", MESSAGES.InstanceIdChangedEvents());
    map.put("EVENT-Invited", MESSAGES.InvitedEvents());
    map.put("EVENT-NewInstanceMade", MESSAGES.NewInstanceMadeEvents());
    map.put("EVENT-NewLeader", MESSAGES.NewLeaderEvents());
    map.put("EVENT-PlayerJoined", MESSAGES.PlayerJoinedEvents());
    map.put("EVENT-PlayerLeft", MESSAGES.PlayerLeftEvents());
    map.put("EVENT-ServerCommandFailure", MESSAGES.ServerCommandFailureEvents());
    map.put("EVENT-ServerCommandSuccess", MESSAGES.ServerCommandSuccessEvents());
    map.put("EVENT-UserEmailAddressSet", MESSAGES.UserEmailAddressSetEvents());
    map.put("EVENT-WebServiceError", MESSAGES.WebServiceErrorEvents());


/* Methods */

    map.put("METHOD-GetInstanceLists", MESSAGES.GetInstanceListsMethods());
    map.put("METHOD-GetMessages", MESSAGES.GetMessagesMethods());
    map.put("METHOD-Invite", MESSAGES.InviteMethods());
    map.put("METHOD-LeaveInstance", MESSAGES.LeaveInstanceMethods());
    map.put("METHOD-MakeNewInstance", MESSAGES.MakeNewInstanceMethods());
    map.put("METHOD-SendMessage", MESSAGES.SendMessageMethods());
    map.put("METHOD-ServerCommand", MESSAGES.ServerCommandMethods());
    map.put("METHOD-SetInstance", MESSAGES.SetInstanceMethods());
    map.put("METHOD-SetLeader", MESSAGES.SetLeaderMethods());


/* Parameters */

    map.put("PARAM-sender", MESSAGES.senderParams());
    map.put("PARAM-contents", MESSAGES.contentsParams());
    map.put("PARAM-instanceId", MESSAGES.instanceIdParams());
    map.put("PARAM-playerId", MESSAGES.playerIdParams());
    map.put("PARAM-command", MESSAGES.commandParams());
    map.put("PARAM-arguments", MESSAGES.argumentsParams());
    map.put("PARAM-response", MESSAGES.responseParams());
    map.put("PARAM-emailAddress", MESSAGES.emailAddressParams());
    map.put("PARAM-count", MESSAGES.countParams());
    map.put("PARAM-playerEmail", MESSAGES.playerEmailParams());
    map.put("PARAM-makePublic", MESSAGES.makePublicParams());
    map.put("PARAM-recipients", MESSAGES.recipientsParams());


/* Component: GyroscopeSensor */

    map.put("COMPONENT-GyroscopeSensor", MESSAGES.gyroscopeSensorComponentPallette());

    map.put("GyroscopeSensor-helpString", MESSAGES.GyroscopeSensorHelpStringComponentPallette());



/* Properties */

    map.put("PROPERTY-XAngularVelocity", MESSAGES.XAngularVelocityProperties());
    map.put("PROPERTY-YAngularVelocity", MESSAGES.YAngularVelocityProperties());
    map.put("PROPERTY-ZAngularVelocity", MESSAGES.ZAngularVelocityProperties());


/* Events */

    map.put("EVENT-GyroscopeChanged", MESSAGES.GyroscopeChangedEvents());


/* Methods */



/* Parameters */

    map.put("PARAM-xAngularVelocity", MESSAGES.xAngularVelocityParams());
    map.put("PARAM-yAngularVelocity", MESSAGES.yAngularVelocityParams());
    map.put("PARAM-zAngularVelocity", MESSAGES.zAngularVelocityParams());
    map.put("PARAM-timestamp", MESSAGES.timestampParams());


/* Component: HorizontalArrangement */

    map.put("COMPONENT-HorizontalArrangement", MESSAGES.horizontalArrangementComponentPallette());

    map.put("HorizontalArrangement-helpString", MESSAGES.HorizontalArrangementHelpStringComponentPallette());



/* Properties */



/* Events */



/* Methods */



/* Parameters */



/* Component: HorizontalScrollArrangement */

    map.put("COMPONENT-HorizontalScrollArrangement", MESSAGES.horizontalScrollArrangementComponentPallette());

    map.put("HorizontalScrollArrangement-helpString", MESSAGES.HorizontalScrollArrangementHelpStringComponentPallette());



/* Properties */



/* Events */



/* Methods */



/* Parameters */



/* Component: Hygrometer */

    map.put("COMPONENT-Hygrometer", MESSAGES.hygrometerComponentPallette());

    map.put("Hygrometer-helpString", MESSAGES.HygrometerHelpStringComponentPallette());



/* Properties */

    map.put("PROPERTY-Humidity", MESSAGES.HumidityProperties());


/* Events */

    map.put("EVENT-HumidityChanged", MESSAGES.HumidityChangedEvents());


/* Methods */



/* Parameters */

    map.put("PARAM-humidity", MESSAGES.humidityParams());


/* Component: Image */

    map.put("COMPONENT-Image", MESSAGES.imageComponentPallette());

    map.put("Image-helpString", MESSAGES.ImageHelpStringComponentPallette());



/* Properties */

    map.put("PROPERTY-AlternateText", MESSAGES.AlternateTextProperties());
    map.put("PROPERTY-Animation", MESSAGES.AnimationProperties());
    map.put("PROPERTY-Clickable", MESSAGES.ClickableProperties());
    map.put("PROPERTY-RotationAngle", MESSAGES.RotationAngleProperties());
    map.put("PROPERTY-ScalePictureToFit", MESSAGES.ScalePictureToFitProperties());
    map.put("PROPERTY-Scaling", MESSAGES.ScalingProperties());


/* Events */



/* Methods */



/* Parameters */



/* Component: ImageBot */

    map.put("COMPONENT-ImageBot", MESSAGES.imageBotComponentPallette());

    map.put("ImageBot-helpString", MESSAGES.ImageBotHelpStringComponentPallette());



/* Properties */

    map.put("PROPERTY-InvertMask", MESSAGES.InvertMaskProperties());
    map.put("PROPERTY-Size", MESSAGES.SizeProperties());


/* Events */

    map.put("EVENT-ImageCreated", MESSAGES.ImageCreatedEvents());
    map.put("EVENT-ImageEdited", MESSAGES.ImageEditedEvents());


/* Methods */

    map.put("METHOD-EditImage", MESSAGES.EditImageMethods());
    map.put("METHOD-EditImageWithMask", MESSAGES.EditImageWithMaskMethods());


/* Parameters */

    map.put("PARAM-imageSource", MESSAGES.imageSourceParams());
    map.put("PARAM-maskSource", MESSAGES.maskSourceParams());
    map.put("PARAM-prompt", MESSAGES.promptParams());


/* Component: ImagePicker */

    map.put("COMPONENT-ImagePicker", MESSAGES.imagePickerComponentPallette());

    map.put("ImagePicker-helpString", MESSAGES.ImagePickerHelpStringComponentPallette());



/* Properties */



/* Events */



/* Methods */



/* Parameters */



/* Component: ImageSprite */

    map.put("COMPONENT-ImageSprite", MESSAGES.imageSpriteComponentPallette());

    map.put("ImageSprite-helpString", MESSAGES.ImageSpriteHelpStringComponentPallette());



/* Properties */

    map.put("PROPERTY-MarkOrigin", MESSAGES.MarkOriginProperties());
    map.put("PROPERTY-OriginX", MESSAGES.OriginXProperties());
    map.put("PROPERTY-OriginY", MESSAGES.OriginYProperties());
    map.put("PROPERTY-Rotates", MESSAGES.RotatesProperties());


/* Events */



/* Methods */



/* Parameters */



/* Component: Label */

    map.put("COMPONENT-Label", MESSAGES.labelComponentPallette());

    map.put("Label-helpString", MESSAGES.LabelHelpStringComponentPallette());



/* Properties */

    map.put("PROPERTY-HTMLContent", MESSAGES.HTMLContentProperties());
    map.put("PROPERTY-HTMLFormat", MESSAGES.HTMLFormatProperties());
    map.put("PROPERTY-HasMargins", MESSAGES.HasMarginsProperties());


/* Events */



/* Methods */



/* Parameters */



/* Component: LightSensor */

    map.put("COMPONENT-LightSensor", MESSAGES.lightSensorComponentPallette());

    map.put("LightSensor-helpString", MESSAGES.LightSensorHelpStringComponentPallette());



/* Properties */

    map.put("PROPERTY-AverageLux", MESSAGES.AverageLuxProperties());
    map.put("PROPERTY-Lux", MESSAGES.LuxProperties());


/* Events */

    map.put("EVENT-LightChanged", MESSAGES.LightChangedEvents());


/* Methods */



/* Parameters */

    map.put("PARAM-lux", MESSAGES.luxParams());


/* Component: LineString */

    map.put("COMPONENT-LineString", MESSAGES.lineStringComponentPallette());

    map.put("LineString-helpString", MESSAGES.LineStringHelpStringComponentPallette());



/* Properties */

    map.put("PROPERTY-Points", MESSAGES.PointsProperties());
    map.put("PROPERTY-PointsFromString", MESSAGES.PointsFromStringProperties());


/* Events */



/* Methods */



/* Parameters */



/* Component: LinearProgress */

    map.put("COMPONENT-LinearProgress", MESSAGES.linearProgressComponentPallette());

    map.put("LinearProgress-helpString", MESSAGES.LinearProgressHelpStringComponentPallette());



/* Properties */

    map.put("PROPERTY-Indeterminate", MESSAGES.IndeterminateProperties());
    map.put("PROPERTY-IndeterminateColor", MESSAGES.IndeterminateColorProperties());
    map.put("PROPERTY-Maximum", MESSAGES.MaximumProperties());
    map.put("PROPERTY-Minimum", MESSAGES.MinimumProperties());
    map.put("PROPERTY-Progress", MESSAGES.ProgressProperties());
    map.put("PROPERTY-ProgressColor", MESSAGES.ProgressColorProperties());


/* Events */

    map.put("EVENT-ProgressChanged", MESSAGES.ProgressChangedEvents());


/* Methods */

    map.put("METHOD-IncrementProgressBy", MESSAGES.IncrementProgressByMethods());


/* Parameters */

    map.put("PARAM-progress", MESSAGES.progressParams());


/* Component: ListPicker */

    map.put("COMPONENT-ListPicker", MESSAGES.listPickerComponentPallette());

    map.put("ListPicker-helpString", MESSAGES.ListPickerHelpStringComponentPallette());



/* Properties */

    map.put("PROPERTY-Elements", MESSAGES.ElementsProperties());
    map.put("PROPERTY-ElementsFromString", MESSAGES.ElementsFromStringProperties());
    map.put("PROPERTY-ItemBackgroundColor", MESSAGES.ItemBackgroundColorProperties());
    map.put("PROPERTY-ItemTextColor", MESSAGES.ItemTextColorProperties());
    map.put("PROPERTY-SelectionIndex", MESSAGES.SelectionIndexProperties());
    map.put("PROPERTY-ShowFilterBar", MESSAGES.ShowFilterBarProperties());


/* Events */



/* Methods */



/* Parameters */



/* Component: ListView */

    map.put("COMPONENT-ListView", MESSAGES.listViewComponentPallette());

    map.put("ListView-helpString", MESSAGES.ListViewHelpStringComponentPallette());



/* Properties */

    map.put("PROPERTY-BounceEdgeEffect", MESSAGES.BounceEdgeEffectProperties());
    map.put("PROPERTY-DividerColor", MESSAGES.DividerColorProperties());
    map.put("PROPERTY-DividerThickness", MESSAGES.DividerThicknessProperties());
    map.put("PROPERTY-ElementColor", MESSAGES.ElementColorProperties());
    map.put("PROPERTY-ElementCornerRadius", MESSAGES.ElementCornerRadiusProperties());
    map.put("PROPERTY-ElementMarginsWidth", MESSAGES.ElementMarginsWidthProperties());
    map.put("PROPERTY-FontSizeDetail", MESSAGES.FontSizeDetailProperties());
    map.put("PROPERTY-FontTypefaceDetail", MESSAGES.FontTypefaceDetailProperties());
    map.put("PROPERTY-HintText", MESSAGES.HintTextProperties());
    map.put("PROPERTY-ImageHeight", MESSAGES.ImageHeightProperties());
    map.put("PROPERTY-ImageWidth", MESSAGES.ImageWidthProperties());
    map.put("PROPERTY-ListData", MESSAGES.ListDataProperties());
    map.put("PROPERTY-ListViewLayout", MESSAGES.ListViewLayoutProperties());
    map.put("PROPERTY-Orientation", MESSAGES.OrientationProperties());
    map.put("PROPERTY-SelectionColor", MESSAGES.SelectionColorProperties());
    map.put("PROPERTY-SelectionDetailText", MESSAGES.SelectionDetailTextProperties());
    map.put("PROPERTY-TextColorDetail", MESSAGES.TextColorDetailProperties());
    map.put("PROPERTY-TextSize", MESSAGES.TextSizeProperties());


/* Events */



/* Methods */

    map.put("METHOD-AddItem", MESSAGES.AddItemMethods());
    map.put("METHOD-AddItemAtIndex", MESSAGES.AddItemAtIndexMethods());
    map.put("METHOD-AddItems", MESSAGES.AddItemsMethods());
    map.put("METHOD-AddItemsAtIndex", MESSAGES.AddItemsAtIndexMethods());
    map.put("METHOD-CreateElement", MESSAGES.CreateElementMethods());
    map.put("METHOD-GetDetailText", MESSAGES.GetDetailTextMethods());
    map.put("METHOD-GetImageName", MESSAGES.GetImageNameMethods());
    map.put("METHOD-GetMainText", MESSAGES.GetMainTextMethods());
    map.put("METHOD-Refresh", MESSAGES.RefreshMethods());
    map.put("METHOD-RemoveItemAtIndex", MESSAGES.RemoveItemAtIndexMethods());


/* Parameters */

    map.put("PARAM-mainText", MESSAGES.mainTextParams());
    map.put("PARAM-detailText", MESSAGES.detailTextParams());
    map.put("PARAM-imageName", MESSAGES.imageNameParams());
    map.put("PARAM-index", MESSAGES.indexParams());
    map.put("PARAM-itemsList", MESSAGES.itemsListParams());
    map.put("PARAM-listElement", MESSAGES.listElementParams());


/* Component: LocationSensor */

    map.put("COMPONENT-LocationSensor", MESSAGES.locationSensorComponentPallette());

    map.put("LocationSensor-helpString", MESSAGES.LocationSensorHelpStringComponentPallette());



/* Properties */

    map.put("PROPERTY-Accuracy", MESSAGES.AccuracyProperties());
    map.put("PROPERTY-Altitude", MESSAGES.AltitudeProperties());
    map.put("PROPERTY-AvailableProviders", MESSAGES.AvailableProvidersProperties());
    map.put("PROPERTY-CurrentAddress", MESSAGES.CurrentAddressProperties());
    map.put("PROPERTY-DistanceInterval", MESSAGES.DistanceIntervalProperties());
    map.put("PROPERTY-HasAccuracy", MESSAGES.HasAccuracyProperties());
    map.put("PROPERTY-HasAltitude", MESSAGES.HasAltitudeProperties());
    map.put("PROPERTY-HasLongitudeLatitude", MESSAGES.HasLongitudeLatitudeProperties());
    map.put("PROPERTY-ProviderLocked", MESSAGES.ProviderLockedProperties());
    map.put("PROPERTY-ProviderName", MESSAGES.ProviderNameProperties());
    map.put("PROPERTY-TimeInterval", MESSAGES.TimeIntervalProperties());


/* Events */

    map.put("EVENT-GotAddress", MESSAGES.GotAddressEvents());
    map.put("EVENT-GotLocationFromAddress", MESSAGES.GotLocationFromAddressEvents());
    map.put("EVENT-LocationChanged", MESSAGES.LocationChangedEvents());
    map.put("EVENT-StatusChanged", MESSAGES.StatusChangedEvents());


/* Methods */

    map.put("METHOD-Geocode", MESSAGES.GeocodeMethods());
    map.put("METHOD-LatitudeFromAddress", MESSAGES.LatitudeFromAddressMethods());
    map.put("METHOD-LongitudeFromAddress", MESSAGES.LongitudeFromAddressMethods());
    map.put("METHOD-ReverseGeocode", MESSAGES.ReverseGeocodeMethods());


/* Parameters */

    map.put("PARAM-altitude", MESSAGES.altitudeParams());
    map.put("PARAM-provider", MESSAGES.providerParams());
    map.put("PARAM-status", MESSAGES.statusParams());
    map.put("PARAM-locationName", MESSAGES.locationNameParams());


/* Component: MagneticFieldSensor */

    map.put("COMPONENT-MagneticFieldSensor", MESSAGES.magneticFieldSensorComponentPallette());

    map.put("MagneticFieldSensor-helpString", MESSAGES.MagneticFieldSensorHelpStringComponentPallette());



/* Properties */

    map.put("PROPERTY-AbsoluteStrength", MESSAGES.AbsoluteStrengthProperties());
    map.put("PROPERTY-MaximumRange", MESSAGES.MaximumRangeProperties());
    map.put("PROPERTY-XStrength", MESSAGES.XStrengthProperties());
    map.put("PROPERTY-YStrength", MESSAGES.YStrengthProperties());
    map.put("PROPERTY-ZStrength", MESSAGES.ZStrengthProperties());


/* Events */

    map.put("EVENT-MagneticChanged", MESSAGES.MagneticChangedEvents());


/* Methods */



/* Parameters */

    map.put("PARAM-xStrength", MESSAGES.xStrengthParams());
    map.put("PARAM-yStrength", MESSAGES.yStrengthParams());
    map.put("PARAM-zStrength", MESSAGES.zStrengthParams());
    map.put("PARAM-absoluteStrength", MESSAGES.absoluteStrengthParams());


/* Component: Map */

    map.put("COMPONENT-Map", MESSAGES.mapComponentPallette());

    map.put("Map-helpString", MESSAGES.MapHelpStringComponentPallette());



/* Properties */

    map.put("PROPERTY-BoundingBox", MESSAGES.BoundingBoxProperties());
    map.put("PROPERTY-CenterFromString", MESSAGES.CenterFromStringProperties());
    map.put("PROPERTY-CustomUrl", MESSAGES.CustomUrlProperties());
    map.put("PROPERTY-EnablePan", MESSAGES.EnablePanProperties());
    map.put("PROPERTY-EnableRotation", MESSAGES.EnableRotationProperties());
    map.put("PROPERTY-EnableZoom", MESSAGES.EnableZoomProperties());
    map.put("PROPERTY-LocationSensor", MESSAGES.LocationSensorProperties());
    map.put("PROPERTY-MapType", MESSAGES.MapTypeProperties());
    map.put("PROPERTY-Rotation", MESSAGES.RotationProperties());
    map.put("PROPERTY-ScaleUnits", MESSAGES.ScaleUnitsProperties());
    map.put("PROPERTY-ShowCompass", MESSAGES.ShowCompassProperties());
    map.put("PROPERTY-ShowScale", MESSAGES.ShowScaleProperties());
    map.put("PROPERTY-ShowUser", MESSAGES.ShowUserProperties());
    map.put("PROPERTY-ShowZoom", MESSAGES.ShowZoomProperties());
    map.put("PROPERTY-UserLatitude", MESSAGES.UserLatitudeProperties());
    map.put("PROPERTY-UserLongitude", MESSAGES.UserLongitudeProperties());
    map.put("PROPERTY-ZoomLevel", MESSAGES.ZoomLevelProperties());


/* Events */

    map.put("EVENT-BoundsChange", MESSAGES.BoundsChangeEvents());
    map.put("EVENT-DoubleTapAtPoint", MESSAGES.DoubleTapAtPointEvents());
    map.put("EVENT-InvalidPoint", MESSAGES.InvalidPointEvents());
    map.put("EVENT-LongPressAtPoint", MESSAGES.LongPressAtPointEvents());
    map.put("EVENT-Ready", MESSAGES.ReadyEvents());
    map.put("EVENT-TapAtPoint", MESSAGES.TapAtPointEvents());
    map.put("EVENT-ZoomChange", MESSAGES.ZoomChangeEvents());


/* Methods */

    map.put("METHOD-CreateMarker", MESSAGES.CreateMarkerMethods());
    map.put("METHOD-PanTo", MESSAGES.PanToMethods());


/* Parameters */

    map.put("PARAM-zoom", MESSAGES.zoomParams());


/* Component: Marker */

    map.put("COMPONENT-Marker", MESSAGES.markerComponentPallette());

    map.put("Marker-helpString", MESSAGES.MarkerHelpStringComponentPallette());



/* Properties */

    map.put("PROPERTY-AnchorHorizontal", MESSAGES.AnchorHorizontalProperties());
    map.put("PROPERTY-AnchorVertical", MESSAGES.AnchorVerticalProperties());
    map.put("PROPERTY-ImageAsset", MESSAGES.ImageAssetProperties());


/* Events */



/* Methods */

    map.put("METHOD-BearingToFeature", MESSAGES.BearingToFeatureMethods());
    map.put("METHOD-BearingToPoint", MESSAGES.BearingToPointMethods());


/* Parameters */



/* Component: MediaStore */

    map.put("COMPONENT-MediaStore", MESSAGES.mediaStoreComponentPallette());

    map.put("MediaStore-helpString", MESSAGES.MediaStoreHelpStringComponentPallette());



/* Properties */



/* Events */

    map.put("EVENT-MediaStored", MESSAGES.MediaStoredEvents());


/* Methods */

    map.put("METHOD-PostMedia", MESSAGES.PostMediaMethods());


/* Parameters */

    map.put("PARAM-mediafile", MESSAGES.mediafileParams());


/* Component: Navigation */

    map.put("COMPONENT-Navigation", MESSAGES.navigationComponentPallette());

    map.put("Navigation-helpString", MESSAGES.NavigationHelpStringComponentPallette());



/* Properties */

    map.put("PROPERTY-EndLatitude", MESSAGES.EndLatitudeProperties());
    map.put("PROPERTY-EndLocation", MESSAGES.EndLocationProperties());
    map.put("PROPERTY-EndLongitude", MESSAGES.EndLongitudeProperties());
    map.put("PROPERTY-Language", MESSAGES.LanguageProperties());
    map.put("PROPERTY-ResponseContent", MESSAGES.ResponseContentProperties());
    map.put("PROPERTY-StartLatitude", MESSAGES.StartLatitudeProperties());
    map.put("PROPERTY-StartLocation", MESSAGES.StartLocationProperties());
    map.put("PROPERTY-StartLongitude", MESSAGES.StartLongitudeProperties());
    map.put("PROPERTY-TransportationMethod", MESSAGES.TransportationMethodProperties());


/* Events */

    map.put("EVENT-GotDirections", MESSAGES.GotDirectionsEvents());


/* Methods */

    map.put("METHOD-RequestDirections", MESSAGES.RequestDirectionsMethods());


/* Parameters */

    map.put("PARAM-directions", MESSAGES.directionsParams());
    map.put("PARAM-points", MESSAGES.pointsParams());


/* Component: NearField */

    map.put("COMPONENT-NearField", MESSAGES.nearFieldComponentPallette());

    map.put("NearField-helpString", MESSAGES.NearFieldHelpStringComponentPallette());



/* Properties */

    map.put("PROPERTY-LastMessage", MESSAGES.LastMessageProperties());
    map.put("PROPERTY-ReadMode", MESSAGES.ReadModeProperties());
    map.put("PROPERTY-TextToWrite", MESSAGES.TextToWriteProperties());
    map.put("PROPERTY-WriteType", MESSAGES.WriteTypeProperties());


/* Events */

    map.put("EVENT-TagRead", MESSAGES.TagReadEvents());
    map.put("EVENT-TagWritten", MESSAGES.TagWrittenEvents());


/* Methods */



/* Parameters */



/* Component: Notifier */

    map.put("COMPONENT-Notifier", MESSAGES.notifierComponentPallette());

    map.put("Notifier-helpString", MESSAGES.NotifierHelpStringComponentPallette());



/* Properties */

    map.put("PROPERTY-NotifierLength", MESSAGES.NotifierLengthProperties());


/* Events */

    map.put("EVENT-AfterChoosing", MESSAGES.AfterChoosingEvents());
    map.put("EVENT-AfterTextInput", MESSAGES.AfterTextInputEvents());
    map.put("EVENT-ChoosingCanceled", MESSAGES.ChoosingCanceledEvents());
    map.put("EVENT-TextInputCanceled", MESSAGES.TextInputCanceledEvents());


/* Methods */

    map.put("METHOD-DismissProgressDialog", MESSAGES.DismissProgressDialogMethods());
    map.put("METHOD-LogError", MESSAGES.LogErrorMethods());
    map.put("METHOD-LogInfo", MESSAGES.LogInfoMethods());
    map.put("METHOD-LogWarning", MESSAGES.LogWarningMethods());
    map.put("METHOD-ShowAlert", MESSAGES.ShowAlertMethods());
    map.put("METHOD-ShowChooseDialog", MESSAGES.ShowChooseDialogMethods());
    map.put("METHOD-ShowMessageDialog", MESSAGES.ShowMessageDialogMethods());
    map.put("METHOD-ShowPasswordDialog", MESSAGES.ShowPasswordDialogMethods());
    map.put("METHOD-ShowProgressDialog", MESSAGES.ShowProgressDialogMethods());
    map.put("METHOD-ShowTextDialog", MESSAGES.ShowTextDialogMethods());


/* Parameters */

    map.put("PARAM-choice", MESSAGES.choiceParams());
    map.put("PARAM-notice", MESSAGES.noticeParams());
    map.put("PARAM-title", MESSAGES.titleParams());
    map.put("PARAM-button1Text", MESSAGES.button1TextParams());
    map.put("PARAM-button2Text", MESSAGES.button2TextParams());
    map.put("PARAM-cancelable", MESSAGES.cancelableParams());
    map.put("PARAM-buttonText", MESSAGES.buttonTextParams());


/* Component: NxtColorSensor */

    map.put("COMPONENT-NxtColorSensor", MESSAGES.nxtColorSensorComponentPallette());

    map.put("NxtColorSensor-helpString", MESSAGES.NxtColorSensorHelpStringComponentPallette());



/* Properties */

    map.put("PROPERTY-DetectColor", MESSAGES.DetectColorProperties());
    map.put("PROPERTY-GenerateColor", MESSAGES.GenerateColorProperties());


/* Events */



/* Methods */

    map.put("METHOD-GetColor", MESSAGES.GetColorMethods());


/* Parameters */



/* Component: NxtDirectCommands */

    map.put("COMPONENT-NxtDirectCommands", MESSAGES.nxtDirectCommandsComponentPallette());

    map.put("NxtDirectCommands-helpString", MESSAGES.NxtDirectCommandsHelpStringComponentPallette());



/* Properties */



/* Events */



/* Methods */

    map.put("METHOD-DeleteFile", MESSAGES.DeleteFileMethods());
    map.put("METHOD-DownloadFile", MESSAGES.DownloadFileMethods());
    map.put("METHOD-GetBatteryLevel", MESSAGES.GetBatteryLevelMethods());
    map.put("METHOD-GetBrickName", MESSAGES.GetBrickNameMethods());
    map.put("METHOD-GetCurrentProgramName", MESSAGES.GetCurrentProgramNameMethods());
    map.put("METHOD-GetInputValues", MESSAGES.GetInputValuesMethods());
    map.put("METHOD-GetOutputState", MESSAGES.GetOutputStateMethods());
    map.put("METHOD-ListFiles", MESSAGES.ListFilesMethods());
    map.put("METHOD-LsGetStatus", MESSAGES.LsGetStatusMethods());
    map.put("METHOD-LsRead", MESSAGES.LsReadMethods());
    map.put("METHOD-LsWrite", MESSAGES.LsWriteMethods());
    map.put("METHOD-MessageRead", MESSAGES.MessageReadMethods());
    map.put("METHOD-MessageWrite", MESSAGES.MessageWriteMethods());
    map.put("METHOD-PlaySoundFile", MESSAGES.PlaySoundFileMethods());
    map.put("METHOD-ResetInputScaledValue", MESSAGES.ResetInputScaledValueMethods());
    map.put("METHOD-ResetMotorPosition", MESSAGES.ResetMotorPositionMethods());
    map.put("METHOD-SetBrickName", MESSAGES.SetBrickNameMethods());
    map.put("METHOD-SetInputMode", MESSAGES.SetInputModeMethods());
    map.put("METHOD-SetOutputState", MESSAGES.SetOutputStateMethods());
    map.put("METHOD-StartProgram", MESSAGES.StartProgramMethods());
    map.put("METHOD-StopProgram", MESSAGES.StopProgramMethods());
    map.put("METHOD-StopSoundPlayback", MESSAGES.StopSoundPlaybackMethods());


/* Parameters */

    map.put("PARAM-destination", MESSAGES.destinationParams());
    map.put("PARAM-sensorPortLetter", MESSAGES.sensorPortLetterParams());
    map.put("PARAM-motorPortLetter", MESSAGES.motorPortLetterParams());
    map.put("PARAM-wildcard", MESSAGES.wildcardParams());
    map.put("PARAM-rxDataLength", MESSAGES.rxDataLengthParams());
    map.put("PARAM-mailbox", MESSAGES.mailboxParams());
    map.put("PARAM-frequencyHz", MESSAGES.frequencyHzParams());
    map.put("PARAM-durationMs", MESSAGES.durationMsParams());
    map.put("PARAM-relative", MESSAGES.relativeParams());
    map.put("PARAM-name", MESSAGES.nameParams());
    map.put("PARAM-sensorType", MESSAGES.sensorTypeParams());
    map.put("PARAM-sensorMode", MESSAGES.sensorModeParams());
    map.put("PARAM-mode", MESSAGES.modeParams());
    map.put("PARAM-regulationMode", MESSAGES.regulationModeParams());
    map.put("PARAM-runState", MESSAGES.runStateParams());
    map.put("PARAM-tachoLimit", MESSAGES.tachoLimitParams());
    map.put("PARAM-programName", MESSAGES.programNameParams());


/* Component: NxtDrive */

    map.put("COMPONENT-NxtDrive", MESSAGES.nxtDriveComponentPallette());

    map.put("NxtDrive-helpString", MESSAGES.NxtDriveHelpStringComponentPallette());



/* Properties */

    map.put("PROPERTY-DriveMotors", MESSAGES.DriveMotorsProperties());


/* Events */



/* Methods */

    map.put("METHOD-MoveBackward", MESSAGES.MoveBackwardMethods());
    map.put("METHOD-MoveBackwardIndefinitely", MESSAGES.MoveBackwardIndefinitelyMethods());
    map.put("METHOD-MoveForward", MESSAGES.MoveForwardMethods());
    map.put("METHOD-MoveForwardIndefinitely", MESSAGES.MoveForwardIndefinitelyMethods());
    map.put("METHOD-TurnClockwiseIndefinitely", MESSAGES.TurnClockwiseIndefinitelyMethods());
    map.put("METHOD-TurnCounterClockwiseIndefinitely", MESSAGES.TurnCounterClockwiseIndefinitelyMethods());


/* Parameters */



/* Component: NxtLightSensor */

    map.put("COMPONENT-NxtLightSensor", MESSAGES.nxtLightSensorComponentPallette());

    map.put("NxtLightSensor-helpString", MESSAGES.NxtLightSensorHelpStringComponentPallette());



/* Properties */

    map.put("PROPERTY-GenerateLight", MESSAGES.GenerateLightProperties());


/* Events */



/* Methods */



/* Parameters */



/* Component: NxtSoundSensor */

    map.put("COMPONENT-NxtSoundSensor", MESSAGES.nxtSoundSensorComponentPallette());

    map.put("NxtSoundSensor-helpString", MESSAGES.NxtSoundSensorHelpStringComponentPallette());



/* Properties */



/* Events */



/* Methods */

    map.put("METHOD-GetSoundLevel", MESSAGES.GetSoundLevelMethods());


/* Parameters */



/* Component: NxtTouchSensor */

    map.put("COMPONENT-NxtTouchSensor", MESSAGES.nxtTouchSensorComponentPallette());

    map.put("NxtTouchSensor-helpString", MESSAGES.NxtTouchSensorHelpStringComponentPallette());



/* Properties */



/* Events */



/* Methods */



/* Parameters */



/* Component: NxtUltrasonicSensor */

    map.put("COMPONENT-NxtUltrasonicSensor", MESSAGES.nxtUltrasonicSensorComponentPallette());

    map.put("NxtUltrasonicSensor-helpString", MESSAGES.NxtUltrasonicSensorHelpStringComponentPallette());



/* Properties */



/* Events */



/* Methods */



/* Parameters */



/* Component: OrientationSensor */

    map.put("COMPONENT-OrientationSensor", MESSAGES.orientationSensorComponentPallette());

    map.put("OrientationSensor-helpString", MESSAGES.OrientationSensorHelpStringComponentPallette());



/* Properties */

    map.put("PROPERTY-Angle", MESSAGES.AngleProperties());
    map.put("PROPERTY-Azimuth", MESSAGES.AzimuthProperties());
    map.put("PROPERTY-Magnitude", MESSAGES.MagnitudeProperties());
    map.put("PROPERTY-Pitch", MESSAGES.PitchProperties());
    map.put("PROPERTY-Roll", MESSAGES.RollProperties());


/* Events */

    map.put("EVENT-OrientationChanged", MESSAGES.OrientationChangedEvents());


/* Methods */



/* Parameters */

    map.put("PARAM-azimuth", MESSAGES.azimuthParams());
    map.put("PARAM-pitch", MESSAGES.pitchParams());
    map.put("PARAM-roll", MESSAGES.rollParams());


/* Component: PasswordTextBox */

    map.put("COMPONENT-PasswordTextBox", MESSAGES.passwordTextBoxComponentPallette());

    map.put("PasswordTextBox-helpString", MESSAGES.PasswordTextBoxHelpStringComponentPallette());



/* Properties */

    map.put("PROPERTY-NumbersOnly", MESSAGES.NumbersOnlyProperties());
    map.put("PROPERTY-PasswordVisible", MESSAGES.PasswordVisibleProperties());


/* Events */



/* Methods */



/* Parameters */



/* Component: Pedometer */

    map.put("COMPONENT-Pedometer", MESSAGES.pedometerComponentPallette());

    map.put("Pedometer-helpString", MESSAGES.PedometerHelpStringComponentPallette());



/* Properties */

    map.put("PROPERTY-CalibrateStrideLength", MESSAGES.CalibrateStrideLengthProperties());
    map.put("PROPERTY-Distance", MESSAGES.DistanceProperties());
    map.put("PROPERTY-ElapsedTime", MESSAGES.ElapsedTimeProperties());
    map.put("PROPERTY-Moving", MESSAGES.MovingProperties());
    map.put("PROPERTY-SimpleSteps", MESSAGES.SimpleStepsProperties());
    map.put("PROPERTY-StopDetectionTimeout", MESSAGES.StopDetectionTimeoutProperties());
    map.put("PROPERTY-StrideLength", MESSAGES.StrideLengthProperties());
    map.put("PROPERTY-UseGPS", MESSAGES.UseGPSProperties());
    map.put("PROPERTY-WalkSteps", MESSAGES.WalkStepsProperties());


/* Events */

    map.put("EVENT-CalibrationFailed", MESSAGES.CalibrationFailedEvents());
    map.put("EVENT-GPSAvailable", MESSAGES.GPSAvailableEvents());
    map.put("EVENT-GPSLost", MESSAGES.GPSLostEvents());
    map.put("EVENT-SimpleStep", MESSAGES.SimpleStepEvents());
    map.put("EVENT-StartedMoving", MESSAGES.StartedMovingEvents());
    map.put("EVENT-StoppedMoving", MESSAGES.StoppedMovingEvents());
    map.put("EVENT-WalkStep", MESSAGES.WalkStepEvents());


/* Methods */

    map.put("METHOD-Pause", MESSAGES.PauseMethods());
    map.put("METHOD-Reset", MESSAGES.ResetMethods());
    map.put("METHOD-Resume", MESSAGES.ResumeMethods());
    map.put("METHOD-Start", MESSAGES.StartMethods());


/* Parameters */

    map.put("PARAM-simpleSteps", MESSAGES.simpleStepsParams());
    map.put("PARAM-walkSteps", MESSAGES.walkStepsParams());


/* Component: PhoneCall */

    map.put("COMPONENT-PhoneCall", MESSAGES.phoneCallComponentPallette());

    map.put("PhoneCall-helpString", MESSAGES.PhoneCallHelpStringComponentPallette());



/* Properties */



/* Events */

    map.put("EVENT-IncomingCallAnswered", MESSAGES.IncomingCallAnsweredEvents());
    map.put("EVENT-PhoneCallEnded", MESSAGES.PhoneCallEndedEvents());
    map.put("EVENT-PhoneCallStarted", MESSAGES.PhoneCallStartedEvents());


/* Methods */

    map.put("METHOD-MakePhoneCall", MESSAGES.MakePhoneCallMethods());
    map.put("METHOD-MakePhoneCallDirect", MESSAGES.MakePhoneCallDirectMethods());


/* Parameters */

    map.put("PARAM-phoneNumber", MESSAGES.phoneNumberParams());


/* Component: PhoneNumberPicker */

    map.put("COMPONENT-PhoneNumberPicker", MESSAGES.phoneNumberPickerComponentPallette());

    map.put("PhoneNumberPicker-helpString", MESSAGES.PhoneNumberPickerHelpStringComponentPallette());



/* Properties */



/* Events */



/* Methods */



/* Parameters */



/* Component: PhoneStatus */

    map.put("COMPONENT-PhoneStatus", MESSAGES.phoneStatusComponentPallette());

    map.put("PhoneStatus-helpString", MESSAGES.PhoneStatusHelpStringComponentPallette());



/* Properties */

    map.put("PROPERTY-WebRTC", MESSAGES.WebRTCProperties());


/* Events */

    map.put("EVENT-OnSettings", MESSAGES.OnSettingsEvents());


/* Methods */

    map.put("METHOD-GetInstaller", MESSAGES.GetInstallerMethods());
    map.put("METHOD-GetVersionName", MESSAGES.GetVersionNameMethods());
    map.put("METHOD-GetWifiIpAddress", MESSAGES.GetWifiIpAddressMethods());
    map.put("METHOD-InstallationId", MESSAGES.InstallationIdMethods());
    map.put("METHOD-SdkLevel", MESSAGES.SdkLevelMethods());
    map.put("METHOD-SetPopup", MESSAGES.SetPopupMethods());
    map.put("METHOD-doFault", MESSAGES.doFaultMethods());
    map.put("METHOD-installURL", MESSAGES.installURLMethods());
    map.put("METHOD-isConnected", MESSAGES.isConnectedMethods());
    map.put("METHOD-isDirect", MESSAGES.isDirectMethods());
    map.put("METHOD-setAssetsLoaded", MESSAGES.setAssetsLoadedMethods());
    map.put("METHOD-setHmacSeedReturnCode", MESSAGES.setHmacSeedReturnCodeMethods());
    map.put("METHOD-shutdown", MESSAGES.shutdownMethods());
    map.put("METHOD-startHTTPD", MESSAGES.startHTTPDMethods());
    map.put("METHOD-startWebRTC", MESSAGES.startWebRTCMethods());


/* Parameters */

    map.put("PARAM-page", MESSAGES.pageParams());
    map.put("PARAM-seed", MESSAGES.seedParams());
    map.put("PARAM-rendezvousServer", MESSAGES.rendezvousServerParams());
    map.put("PARAM-secure", MESSAGES.secureParams());
    map.put("PARAM-iceServers", MESSAGES.iceServersParams());


/* Component: Player */

    map.put("COMPONENT-Player", MESSAGES.playerComponentPallette());

    map.put("Player-helpString", MESSAGES.PlayerHelpStringComponentPallette());



/* Properties */

    map.put("PROPERTY-IsPlaying", MESSAGES.IsPlayingProperties());
    map.put("PROPERTY-Loop", MESSAGES.LoopProperties());
    map.put("PROPERTY-PlayOnlyInForeground", MESSAGES.PlayOnlyInForegroundProperties());
    map.put("PROPERTY-Volume", MESSAGES.VolumeProperties());


/* Events */

    map.put("EVENT-Completed", MESSAGES.CompletedEvents());
    map.put("EVENT-OtherPlayerStarted", MESSAGES.OtherPlayerStartedEvents());


/* Methods */

    map.put("METHOD-Vibrate", MESSAGES.VibrateMethods());


/* Parameters */



/* Component: Polygon */

    map.put("COMPONENT-Polygon", MESSAGES.polygonComponentPallette());

    map.put("Polygon-helpString", MESSAGES.PolygonHelpStringComponentPallette());



/* Properties */

    map.put("PROPERTY-HolePoints", MESSAGES.HolePointsProperties());
    map.put("PROPERTY-HolePointsFromString", MESSAGES.HolePointsFromStringProperties());


/* Events */



/* Methods */

    map.put("METHOD-Centroid", MESSAGES.CentroidMethods());


/* Parameters */



/* Component: ProximitySensor */

    map.put("COMPONENT-ProximitySensor", MESSAGES.proximitySensorComponentPallette());

    map.put("ProximitySensor-helpString", MESSAGES.ProximitySensorHelpStringComponentPallette());



/* Properties */

    map.put("PROPERTY-KeepRunningWhenOnPause", MESSAGES.KeepRunningWhenOnPauseProperties());


/* Events */

    map.put("EVENT-ProximityChanged", MESSAGES.ProximityChangedEvents());


/* Methods */



/* Parameters */



/* Component: Rectangle */

    map.put("COMPONENT-Rectangle", MESSAGES.rectangleComponentPallette());

    map.put("Rectangle-helpString", MESSAGES.RectangleHelpStringComponentPallette());



/* Properties */

    map.put("PROPERTY-EastLongitude", MESSAGES.EastLongitudeProperties());
    map.put("PROPERTY-NorthLatitude", MESSAGES.NorthLatitudeProperties());
    map.put("PROPERTY-SouthLatitude", MESSAGES.SouthLatitudeProperties());
    map.put("PROPERTY-WestLongitude", MESSAGES.WestLongitudeProperties());


/* Events */



/* Methods */

    map.put("METHOD-Bounds", MESSAGES.BoundsMethods());
    map.put("METHOD-Center", MESSAGES.CenterMethods());
    map.put("METHOD-SetCenter", MESSAGES.SetCenterMethods());


/* Parameters */



/* Component: Regression */

    map.put("COMPONENT-Regression", MESSAGES.regressionComponentPallette());

    map.put("Regression-helpString", MESSAGES.RegressionHelpStringComponentPallette());



/* Properties */



/* Events */



/* Methods */

    map.put("METHOD-CalculateLineOfBestFitValue", MESSAGES.CalculateLineOfBestFitValueMethods());


/* Parameters */



/* Component: Serial */

    map.put("COMPONENT-Serial", MESSAGES.serialComponentPallette());

    map.put("Serial-helpString", MESSAGES.SerialHelpStringComponentPallette());



/* Properties */

    map.put("PROPERTY-BaudRate", MESSAGES.BaudRateProperties());
    map.put("PROPERTY-BufferSize", MESSAGES.BufferSizeProperties());
    map.put("PROPERTY-IsInitialized", MESSAGES.IsInitializedProperties());
    map.put("PROPERTY-IsOpen", MESSAGES.IsOpenProperties());


/* Events */



/* Methods */

    map.put("METHOD-CloseSerial", MESSAGES.CloseSerialMethods());
    map.put("METHOD-InitializeSerial", MESSAGES.InitializeSerialMethods());
    map.put("METHOD-OpenSerial", MESSAGES.OpenSerialMethods());
    map.put("METHOD-PrintSerial", MESSAGES.PrintSerialMethods());
    map.put("METHOD-ReadSerial", MESSAGES.ReadSerialMethods());
    map.put("METHOD-WriteSerial", MESSAGES.WriteSerialMethods());


/* Parameters */

    map.put("PARAM-data", MESSAGES.dataParams());


/* Component: Sharing */

    map.put("COMPONENT-Sharing", MESSAGES.sharingComponentPallette());

    map.put("Sharing-helpString", MESSAGES.SharingHelpStringComponentPallette());



/* Properties */



/* Events */



/* Methods */

    map.put("METHOD-ShareFile", MESSAGES.ShareFileMethods());
    map.put("METHOD-ShareFileWithMessage", MESSAGES.ShareFileWithMessageMethods());
    map.put("METHOD-ShareMessage", MESSAGES.ShareMessageMethods());


/* Parameters */

    map.put("PARAM-file", MESSAGES.fileParams());


/* Component: Slider */

    map.put("COMPONENT-Slider", MESSAGES.sliderComponentPallette());

    map.put("Slider-helpString", MESSAGES.SliderHelpStringComponentPallette());



/* Properties */

    map.put("PROPERTY-ColorLeft", MESSAGES.ColorLeftProperties());
    map.put("PROPERTY-ColorRight", MESSAGES.ColorRightProperties());
    map.put("PROPERTY-MaxValue", MESSAGES.MaxValueProperties());
    map.put("PROPERTY-MinValue", MESSAGES.MinValueProperties());
    map.put("PROPERTY-NumberOfSteps", MESSAGES.NumberOfStepsProperties());
    map.put("PROPERTY-ThumbColor", MESSAGES.ThumbColorProperties());
    map.put("PROPERTY-ThumbEnabled", MESSAGES.ThumbEnabledProperties());
    map.put("PROPERTY-ThumbPosition", MESSAGES.ThumbPositionProperties());


/* Events */

    map.put("EVENT-PositionChanged", MESSAGES.PositionChangedEvents());


/* Methods */



/* Parameters */

    map.put("PARAM-thumbPosition", MESSAGES.thumbPositionParams());


/* Component: Sound */

    map.put("COMPONENT-Sound", MESSAGES.soundComponentPallette());

    map.put("Sound-helpString", MESSAGES.SoundHelpStringComponentPallette());



/* Properties */



/* Events */



/* Methods */

    map.put("METHOD-Play", MESSAGES.PlayMethods());


/* Parameters */

    map.put("PARAM-millisecs", MESSAGES.millisecsParams());


/* Component: SoundRecorder */

    map.put("COMPONENT-SoundRecorder", MESSAGES.soundRecorderComponentPallette());

    map.put("SoundRecorder-helpString", MESSAGES.SoundRecorderHelpStringComponentPallette());



/* Properties */

    map.put("PROPERTY-SavedRecording", MESSAGES.SavedRecordingProperties());


/* Events */

    map.put("EVENT-AfterSoundRecorded", MESSAGES.AfterSoundRecordedEvents());
    map.put("EVENT-StartedRecording", MESSAGES.StartedRecordingEvents());
    map.put("EVENT-StoppedRecording", MESSAGES.StoppedRecordingEvents());


/* Methods */



/* Parameters */

    map.put("PARAM-sound", MESSAGES.soundParams());


/* Component: SpeechRecognizer */

    map.put("COMPONENT-SpeechRecognizer", MESSAGES.speechRecognizerComponentPallette());

    map.put("SpeechRecognizer-helpString", MESSAGES.SpeechRecognizerHelpStringComponentPallette());



/* Properties */

    map.put("PROPERTY-UseLegacy", MESSAGES.UseLegacyProperties());


/* Events */

    map.put("EVENT-AfterGettingText", MESSAGES.AfterGettingTextEvents());
    map.put("EVENT-BeforeGettingText", MESSAGES.BeforeGettingTextEvents());


/* Methods */

    map.put("METHOD-GetText", MESSAGES.GetTextMethods());


/* Parameters */

    map.put("PARAM-partial", MESSAGES.partialParams());


/* Component: Spinner */

    map.put("COMPONENT-Spinner", MESSAGES.spinnerComponentPallette());

    map.put("Spinner-helpString", MESSAGES.SpinnerHelpStringComponentPallette());



/* Properties */

    map.put("PROPERTY-Prompt", MESSAGES.PromptProperties());


/* Events */

    map.put("EVENT-AfterSelecting", MESSAGES.AfterSelectingEvents());


/* Methods */

    map.put("METHOD-DisplayDropdown", MESSAGES.DisplayDropdownMethods());


/* Parameters */

    map.put("PARAM-selection", MESSAGES.selectionParams());


/* Component: Spreadsheet */

    map.put("COMPONENT-Spreadsheet", MESSAGES.spreadsheetComponentPallette());

    map.put("Spreadsheet-helpString", MESSAGES.SpreadsheetHelpStringComponentPallette());



/* Properties */

    map.put("PROPERTY-ApplicationName", MESSAGES.ApplicationNameProperties());
    map.put("PROPERTY-CredentialsJson", MESSAGES.CredentialsJsonProperties());
    map.put("PROPERTY-SpreadsheetID", MESSAGES.SpreadsheetIDProperties());


/* Events */

    map.put("EVENT-FinishedAddColumn", MESSAGES.FinishedAddColumnEvents());
    map.put("EVENT-FinishedAddRow", MESSAGES.FinishedAddRowEvents());
    map.put("EVENT-FinishedAddSheet", MESSAGES.FinishedAddSheetEvents());
    map.put("EVENT-FinishedClearRange", MESSAGES.FinishedClearRangeEvents());
    map.put("EVENT-FinishedDeleteSheet", MESSAGES.FinishedDeleteSheetEvents());
    map.put("EVENT-FinishedRemoveColumn", MESSAGES.FinishedRemoveColumnEvents());
    map.put("EVENT-FinishedRemoveRow", MESSAGES.FinishedRemoveRowEvents());
    map.put("EVENT-FinishedWriteCell", MESSAGES.FinishedWriteCellEvents());
    map.put("EVENT-FinishedWriteColumn", MESSAGES.FinishedWriteColumnEvents());
    map.put("EVENT-FinishedWriteRange", MESSAGES.FinishedWriteRangeEvents());
    map.put("EVENT-FinishedWriteRow", MESSAGES.FinishedWriteRowEvents());
    map.put("EVENT-GotCellData", MESSAGES.GotCellDataEvents());
    map.put("EVENT-GotColumnData", MESSAGES.GotColumnDataEvents());
    map.put("EVENT-GotRangeData", MESSAGES.GotRangeDataEvents());
    map.put("EVENT-GotRowData", MESSAGES.GotRowDataEvents());
    map.put("EVENT-GotSheetData", MESSAGES.GotSheetDataEvents());


/* Methods */

    map.put("METHOD-AddColumn", MESSAGES.AddColumnMethods());
    map.put("METHOD-AddRow", MESSAGES.AddRowMethods());
    map.put("METHOD-AddSheet", MESSAGES.AddSheetMethods());
    map.put("METHOD-ClearRange", MESSAGES.ClearRangeMethods());
    map.put("METHOD-DeleteSheet", MESSAGES.DeleteSheetMethods());
    map.put("METHOD-GetCellReference", MESSAGES.GetCellReferenceMethods());
    map.put("METHOD-GetRangeReference", MESSAGES.GetRangeReferenceMethods());
    map.put("METHOD-ReadCell", MESSAGES.ReadCellMethods());
    map.put("METHOD-ReadColumn", MESSAGES.ReadColumnMethods());
    map.put("METHOD-ReadRange", MESSAGES.ReadRangeMethods());
    map.put("METHOD-ReadRow", MESSAGES.ReadRowMethods());
    map.put("METHOD-ReadSheet", MESSAGES.ReadSheetMethods());
    map.put("METHOD-ReadWithExactFilter", MESSAGES.ReadWithExactFilterMethods());
    map.put("METHOD-ReadWithPartialFilter", MESSAGES.ReadWithPartialFilterMethods());
    map.put("METHOD-RemoveColumn", MESSAGES.RemoveColumnMethods());
    map.put("METHOD-RemoveRow", MESSAGES.RemoveRowMethods());
    map.put("METHOD-WriteCell", MESSAGES.WriteCellMethods());
    map.put("METHOD-WriteColumn", MESSAGES.WriteColumnMethods());
    map.put("METHOD-WriteRange", MESSAGES.WriteRangeMethods());
    map.put("METHOD-WriteRow", MESSAGES.WriteRowMethods());


/* Parameters */

    map.put("PARAM-columnNumber", MESSAGES.columnNumberParams());
    map.put("PARAM-rowNumber", MESSAGES.rowNumberParams());
    map.put("PARAM-sheetName", MESSAGES.sheetNameParams());
    map.put("PARAM-cellData", MESSAGES.cellDataParams());
    map.put("PARAM-columnData", MESSAGES.columnDataParams());
    map.put("PARAM-rangeData", MESSAGES.rangeDataParams());
    map.put("PARAM-rowDataList", MESSAGES.rowDataListParams());
    map.put("PARAM-sheetData", MESSAGES.sheetDataParams());
    map.put("PARAM-rangeReference", MESSAGES.rangeReferenceParams());
    map.put("PARAM-row", MESSAGES.rowParams());
    map.put("PARAM-column", MESSAGES.columnParams());
    map.put("PARAM-row1", MESSAGES.row1Params());
    map.put("PARAM-column1", MESSAGES.column1Params());
    map.put("PARAM-row2", MESSAGES.row2Params());
    map.put("PARAM-column2", MESSAGES.column2Params());
    map.put("PARAM-cellReference", MESSAGES.cellReferenceParams());
    map.put("PARAM-colID", MESSAGES.colIDParams());


/* Component: Switch */

    map.put("COMPONENT-Switch", MESSAGES.switchComponentPallette());

    map.put("Switch-helpString", MESSAGES.SwitchHelpStringComponentPallette());



/* Properties */

    map.put("PROPERTY-On", MESSAGES.OnProperties());
    map.put("PROPERTY-ThumbColorActive", MESSAGES.ThumbColorActiveProperties());
    map.put("PROPERTY-ThumbColorInactive", MESSAGES.ThumbColorInactiveProperties());
    map.put("PROPERTY-TrackColorActive", MESSAGES.TrackColorActiveProperties());
    map.put("PROPERTY-TrackColorInactive", MESSAGES.TrackColorInactiveProperties());


/* Events */



/* Methods */



/* Parameters */



/* Component: TableArrangement */

    map.put("COMPONENT-TableArrangement", MESSAGES.tableArrangementComponentPallette());

    map.put("TableArrangement-helpString", MESSAGES.TableArrangementHelpStringComponentPallette());



/* Properties */



/* Events */



/* Methods */



/* Parameters */



/* Component: TextBox */

    map.put("COMPONENT-TextBox", MESSAGES.textBoxComponentPallette());

    map.put("TextBox-helpString", MESSAGES.TextBoxHelpStringComponentPallette());



/* Properties */

    map.put("PROPERTY-MultiLine", MESSAGES.MultiLineProperties());
    map.put("PROPERTY-ReadOnly", MESSAGES.ReadOnlyProperties());


/* Events */



/* Methods */



/* Parameters */



/* Component: TextToSpeech */

    map.put("COMPONENT-TextToSpeech", MESSAGES.textToSpeechComponentPallette());

    map.put("TextToSpeech-helpString", MESSAGES.TextToSpeechHelpStringComponentPallette());



/* Properties */

    map.put("PROPERTY-AvailableCountries", MESSAGES.AvailableCountriesProperties());
    map.put("PROPERTY-AvailableLanguages", MESSAGES.AvailableLanguagesProperties());
    map.put("PROPERTY-Country", MESSAGES.CountryProperties());
    map.put("PROPERTY-SpeechRate", MESSAGES.SpeechRateProperties());


/* Events */

    map.put("EVENT-AfterSpeaking", MESSAGES.AfterSpeakingEvents());
    map.put("EVENT-BeforeSpeaking", MESSAGES.BeforeSpeakingEvents());


/* Methods */

    map.put("METHOD-Speak", MESSAGES.SpeakMethods());


/* Parameters */



/* Component: Texting */

    map.put("COMPONENT-Texting", MESSAGES.textingComponentPallette());

    map.put("Texting-helpString", MESSAGES.TextingHelpStringComponentPallette());



/* Properties */

    map.put("PROPERTY-GoogleVoiceEnabled", MESSAGES.GoogleVoiceEnabledProperties());
    map.put("PROPERTY-Message", MESSAGES.MessageProperties());
    map.put("PROPERTY-ReceivingEnabled", MESSAGES.ReceivingEnabledProperties());


/* Events */

    map.put("EVENT-MessageReceived", MESSAGES.MessageReceivedEvents());


/* Methods */

    map.put("METHOD-SendMessageDirect", MESSAGES.SendMessageDirectMethods());


/* Parameters */

    map.put("PARAM-messageText", MESSAGES.messageTextParams());


/* Component: Thermometer */

    map.put("COMPONENT-Thermometer", MESSAGES.thermometerComponentPallette());

    map.put("Thermometer-helpString", MESSAGES.ThermometerHelpStringComponentPallette());



/* Properties */

    map.put("PROPERTY-Temperature", MESSAGES.TemperatureProperties());


/* Events */

    map.put("EVENT-TemperatureChanged", MESSAGES.TemperatureChangedEvents());


/* Methods */



/* Parameters */

    map.put("PARAM-temperature", MESSAGES.temperatureParams());


/* Component: TimePicker */

    map.put("COMPONENT-TimePicker", MESSAGES.timePickerComponentPallette());

    map.put("TimePicker-helpString", MESSAGES.TimePickerHelpStringComponentPallette());



/* Properties */

    map.put("PROPERTY-Hour", MESSAGES.HourProperties());
    map.put("PROPERTY-Minute", MESSAGES.MinuteProperties());


/* Events */

    map.put("EVENT-AfterTimeSet", MESSAGES.AfterTimeSetEvents());


/* Methods */

    map.put("METHOD-SetTimeToDisplay", MESSAGES.SetTimeToDisplayMethods());
    map.put("METHOD-SetTimeToDisplayFromInstant", MESSAGES.SetTimeToDisplayFromInstantMethods());


/* Parameters */



/* Component: TinyDB */

    map.put("COMPONENT-TinyDB", MESSAGES.tinyDBComponentPallette());

    map.put("TinyDB-helpString", MESSAGES.TinyDBHelpStringComponentPallette());



/* Properties */

    map.put("PROPERTY-Namespace", MESSAGES.NamespaceProperties());


/* Events */



/* Methods */

    map.put("METHOD-ClearAll", MESSAGES.ClearAllMethods());
    map.put("METHOD-GetEntries", MESSAGES.GetEntriesMethods());
    map.put("METHOD-GetTags", MESSAGES.GetTagsMethods());


/* Parameters */



/* Component: TinyWebDB */

    map.put("COMPONENT-TinyWebDB", MESSAGES.tinyWebDBComponentPallette());

    map.put("TinyWebDB-helpString", MESSAGES.TinyWebDBHelpStringComponentPallette());



/* Properties */



/* Events */

    map.put("EVENT-ValueStored", MESSAGES.ValueStoredEvents());


/* Methods */



/* Parameters */

    map.put("PARAM-tagFromWebDB", MESSAGES.tagFromWebDBParams());
    map.put("PARAM-valueFromWebDB", MESSAGES.valueFromWebDBParams());


/* Component: Translator */

    map.put("COMPONENT-Translator", MESSAGES.translatorComponentPallette());

    map.put("Translator-helpString", MESSAGES.TranslatorHelpStringComponentPallette());



/* Properties */



/* Events */

    map.put("EVENT-GotTranslation", MESSAGES.GotTranslationEvents());


/* Methods */

    map.put("METHOD-RequestTranslation", MESSAGES.RequestTranslationMethods());


/* Parameters */

    map.put("PARAM-translation", MESSAGES.translationParams());
    map.put("PARAM-languageToTranslateTo", MESSAGES.languageToTranslateToParams());
    map.put("PARAM-textToTranslate", MESSAGES.textToTranslateParams());


/* Component: Trendline */

    map.put("COMPONENT-Trendline", MESSAGES.trendlineComponentPallette());

    map.put("Trendline-helpString", MESSAGES.TrendlineHelpStringComponentPallette());



/* Properties */

    map.put("PROPERTY-ChartData", MESSAGES.ChartDataProperties());
    map.put("PROPERTY-CorrelationCoefficient", MESSAGES.CorrelationCoefficientProperties());
    map.put("PROPERTY-ExponentialBase", MESSAGES.ExponentialBaseProperties());
    map.put("PROPERTY-ExponentialCoefficient", MESSAGES.ExponentialCoefficientProperties());
    map.put("PROPERTY-Extend", MESSAGES.ExtendProperties());
    map.put("PROPERTY-LinearCoefficient", MESSAGES.LinearCoefficientProperties());
    map.put("PROPERTY-LogarithmCoefficient", MESSAGES.LogarithmCoefficientProperties());
    map.put("PROPERTY-LogarithmConstant", MESSAGES.LogarithmConstantProperties());
    map.put("PROPERTY-Predictions", MESSAGES.PredictionsProperties());
    map.put("PROPERTY-QuadraticCoefficient", MESSAGES.QuadraticCoefficientProperties());
    map.put("PROPERTY-RSquared", MESSAGES.RSquaredProperties());
    map.put("PROPERTY-Results", MESSAGES.ResultsProperties());
    map.put("PROPERTY-StrokeStyle", MESSAGES.StrokeStyleProperties());
    map.put("PROPERTY-XIntercepts", MESSAGES.XInterceptsProperties());
    map.put("PROPERTY-YIntercept", MESSAGES.YInterceptProperties());


/* Events */

    map.put("EVENT-Updated", MESSAGES.UpdatedEvents());


/* Methods */

    map.put("METHOD-DisconnectFromChartData", MESSAGES.DisconnectFromChartDataMethods());
    map.put("METHOD-GetResultValue", MESSAGES.GetResultValueMethods());


/* Parameters */

    map.put("PARAM-results", MESSAGES.resultsParams());


/* Component: Twitter */

    map.put("COMPONENT-Twitter", MESSAGES.twitterComponentPallette());

    map.put("Twitter-helpString", MESSAGES.TwitterHelpStringComponentPallette());



/* Properties */

    map.put("PROPERTY-ConsumerKey", MESSAGES.ConsumerKeyProperties());
    map.put("PROPERTY-ConsumerSecret", MESSAGES.ConsumerSecretProperties());
    map.put("PROPERTY-DirectMessages", MESSAGES.DirectMessagesProperties());
    map.put("PROPERTY-Followers", MESSAGES.FollowersProperties());
    map.put("PROPERTY-FriendTimeline", MESSAGES.FriendTimelineProperties());
    map.put("PROPERTY-Mentions", MESSAGES.MentionsProperties());
    map.put("PROPERTY-SearchResults", MESSAGES.SearchResultsProperties());
    map.put("PROPERTY-TwitPic_API_Key", MESSAGES.TwitPic_API_KeyProperties());
    map.put("PROPERTY-Username", MESSAGES.UsernameProperties());


/* Events */

    map.put("EVENT-DirectMessagesReceived", MESSAGES.DirectMessagesReceivedEvents());
    map.put("EVENT-FollowersReceived", MESSAGES.FollowersReceivedEvents());
    map.put("EVENT-FriendTimelineReceived", MESSAGES.FriendTimelineReceivedEvents());
    map.put("EVENT-IsAuthorized", MESSAGES.IsAuthorizedEvents());
    map.put("EVENT-MentionsReceived", MESSAGES.MentionsReceivedEvents());
    map.put("EVENT-SearchSuccessful", MESSAGES.SearchSuccessfulEvents());


/* Methods */

    map.put("METHOD-Authorize", MESSAGES.AuthorizeMethods());
    map.put("METHOD-CheckAuthorized", MESSAGES.CheckAuthorizedMethods());
    map.put("METHOD-DeAuthorize", MESSAGES.DeAuthorizeMethods());
    map.put("METHOD-DirectMessage", MESSAGES.DirectMessageMethods());
    map.put("METHOD-Follow", MESSAGES.FollowMethods());
    map.put("METHOD-RequestDirectMessages", MESSAGES.RequestDirectMessagesMethods());
    map.put("METHOD-RequestFollowers", MESSAGES.RequestFollowersMethods());
    map.put("METHOD-RequestFriendTimeline", MESSAGES.RequestFriendTimelineMethods());
    map.put("METHOD-RequestMentions", MESSAGES.RequestMentionsMethods());
    map.put("METHOD-SearchTwitter", MESSAGES.SearchTwitterMethods());
    map.put("METHOD-StopFollowing", MESSAGES.StopFollowingMethods());
    map.put("METHOD-Tweet", MESSAGES.TweetMethods());
    map.put("METHOD-TweetWithImage", MESSAGES.TweetWithImageMethods());


/* Parameters */

    map.put("PARAM-messages", MESSAGES.messagesParams());
    map.put("PARAM-followers2", MESSAGES.followers2Params());
    map.put("PARAM-timeline", MESSAGES.timelineParams());
    map.put("PARAM-mentions", MESSAGES.mentionsParams());
    map.put("PARAM-searchResults", MESSAGES.searchResultsParams());
    map.put("PARAM-user", MESSAGES.userParams());
    map.put("PARAM-query", MESSAGES.queryParams());
    map.put("PARAM-imagePath", MESSAGES.imagePathParams());


/* Component: VerticalArrangement */

    map.put("COMPONENT-VerticalArrangement", MESSAGES.verticalArrangementComponentPallette());

    map.put("VerticalArrangement-helpString", MESSAGES.VerticalArrangementHelpStringComponentPallette());



/* Properties */



/* Events */



/* Methods */



/* Parameters */



/* Component: VerticalScrollArrangement */

    map.put("COMPONENT-VerticalScrollArrangement", MESSAGES.verticalScrollArrangementComponentPallette());

    map.put("VerticalScrollArrangement-helpString", MESSAGES.VerticalScrollArrangementHelpStringComponentPallette());



/* Properties */



/* Events */



/* Methods */



/* Parameters */



/* Component: VideoPlayer */

    map.put("COMPONENT-VideoPlayer", MESSAGES.videoPlayerComponentPallette());

    map.put("VideoPlayer-helpString", MESSAGES.VideoPlayerHelpStringComponentPallette());



/* Properties */

    map.put("PROPERTY-FullScreen", MESSAGES.FullScreenProperties());


/* Events */



/* Methods */

    map.put("METHOD-GetDuration", MESSAGES.GetDurationMethods());
    map.put("METHOD-SeekTo", MESSAGES.SeekToMethods());


/* Parameters */

    map.put("PARAM-ms", MESSAGES.msParams());


/* Component: Voting */

    map.put("COMPONENT-Voting", MESSAGES.votingComponentPallette());

    map.put("Voting-helpString", MESSAGES.VotingHelpStringComponentPallette());



/* Properties */

    map.put("PROPERTY-BallotOptions", MESSAGES.BallotOptionsProperties());
    map.put("PROPERTY-BallotQuestion", MESSAGES.BallotQuestionProperties());
    map.put("PROPERTY-UserChoice", MESSAGES.UserChoiceProperties());
    map.put("PROPERTY-UserId", MESSAGES.UserIdProperties());


/* Events */

    map.put("EVENT-GotBallot", MESSAGES.GotBallotEvents());
    map.put("EVENT-GotBallotConfirmation", MESSAGES.GotBallotConfirmationEvents());
    map.put("EVENT-NoOpenPoll", MESSAGES.NoOpenPollEvents());


/* Methods */

    map.put("METHOD-RequestBallot", MESSAGES.RequestBallotMethods());
    map.put("METHOD-SendBallot", MESSAGES.SendBallotMethods());


/* Parameters */



/* Component: Web */

    map.put("COMPONENT-Web", MESSAGES.webComponentPallette());

    map.put("Web-helpString", MESSAGES.WebHelpStringComponentPallette());



/* Properties */

    map.put("PROPERTY-AllowCookies", MESSAGES.AllowCookiesProperties());
    map.put("PROPERTY-RequestHeaders", MESSAGES.RequestHeadersProperties());
    map.put("PROPERTY-ResponseFileName", MESSAGES.ResponseFileNameProperties());
    map.put("PROPERTY-ResponseTextEncoding", MESSAGES.ResponseTextEncodingProperties());
    map.put("PROPERTY-SaveResponse", MESSAGES.SaveResponseProperties());
    map.put("PROPERTY-Timeout", MESSAGES.TimeoutProperties());
    map.put("PROPERTY-Url", MESSAGES.UrlProperties());


/* Events */

    map.put("EVENT-GotFile", MESSAGES.GotFileEvents());
    map.put("EVENT-TimedOut", MESSAGES.TimedOutEvents());


/* Methods */

    map.put("METHOD-BuildRequestData", MESSAGES.BuildRequestDataMethods());
    map.put("METHOD-ClearCookies", MESSAGES.ClearCookiesMethods());
    map.put("METHOD-Get", MESSAGES.GetMethods());
    map.put("METHOD-HtmlTextDecode", MESSAGES.HtmlTextDecodeMethods());
    map.put("METHOD-JsonObjectEncode", MESSAGES.JsonObjectEncodeMethods());
    map.put("METHOD-JsonTextDecode", MESSAGES.JsonTextDecodeMethods());
    map.put("METHOD-JsonTextDecodeWithDictionaries", MESSAGES.JsonTextDecodeWithDictionariesMethods());
    map.put("METHOD-PatchFile", MESSAGES.PatchFileMethods());
    map.put("METHOD-PatchText", MESSAGES.PatchTextMethods());
    map.put("METHOD-PatchTextWithEncoding", MESSAGES.PatchTextWithEncodingMethods());
    map.put("METHOD-PostFile", MESSAGES.PostFileMethods());
    map.put("METHOD-PostText", MESSAGES.PostTextMethods());
    map.put("METHOD-PostTextWithEncoding", MESSAGES.PostTextWithEncodingMethods());
    map.put("METHOD-PutFile", MESSAGES.PutFileMethods());
    map.put("METHOD-PutText", MESSAGES.PutTextMethods());
    map.put("METHOD-PutTextWithEncoding", MESSAGES.PutTextWithEncodingMethods());
    map.put("METHOD-UriDecode", MESSAGES.UriDecodeMethods());
    map.put("METHOD-UriEncode", MESSAGES.UriEncodeMethods());
    map.put("METHOD-XMLTextDecode", MESSAGES.XMLTextDecodeMethods());
    map.put("METHOD-XMLTextDecodeAsDictionary", MESSAGES.XMLTextDecodeAsDictionaryMethods());


/* Parameters */

    map.put("PARAM-responseType", MESSAGES.responseTypeParams());
    map.put("PARAM-responseContent", MESSAGES.responseContentParams());
    map.put("PARAM-htmlText", MESSAGES.htmlTextParams());
    map.put("PARAM-jsonObject", MESSAGES.jsonObjectParams());
    map.put("PARAM-jsonText", MESSAGES.jsonTextParams());
    map.put("PARAM-encoding", MESSAGES.encodingParams());
    map.put("PARAM-XmlText", MESSAGES.xmlTextParams());


/* Component: WebViewer */

    map.put("COMPONENT-WebViewer", MESSAGES.webViewerComponentPallette());

    map.put("WebViewer-helpString", MESSAGES.WebViewerHelpStringComponentPallette());



/* Properties */

    map.put("PROPERTY-CurrentPageTitle", MESSAGES.CurrentPageTitleProperties());
    map.put("PROPERTY-CurrentUrl", MESSAGES.CurrentUrlProperties());
    map.put("PROPERTY-FollowLinks", MESSAGES.FollowLinksProperties());
    map.put("PROPERTY-HomeUrl", MESSAGES.HomeUrlProperties());
    map.put("PROPERTY-IgnoreSslErrors", MESSAGES.IgnoreSslErrorsProperties());
    map.put("PROPERTY-PromptforPermission", MESSAGES.PromptforPermissionProperties());
    map.put("PROPERTY-UsesCamera", MESSAGES.UsesCameraProperties());
    map.put("PROPERTY-UsesLocation", MESSAGES.UsesLocationProperties());
    map.put("PROPERTY-UsesMicrophone", MESSAGES.UsesMicrophoneProperties());
    map.put("PROPERTY-WebViewString", MESSAGES.WebViewStringProperties());


/* Events */

    map.put("EVENT-BeforePageLoad", MESSAGES.BeforePageLoadEvents());
    map.put("EVENT-PageLoaded", MESSAGES.PageLoadedEvents());
    map.put("EVENT-WebViewStringChange", MESSAGES.WebViewStringChangeEvents());


/* Methods */

    map.put("METHOD-CanGoBack", MESSAGES.CanGoBackMethods());
    map.put("METHOD-CanGoForward", MESSAGES.CanGoForwardMethods());
    map.put("METHOD-ClearCaches", MESSAGES.ClearCachesMethods());
    map.put("METHOD-ClearLocations", MESSAGES.ClearLocationsMethods());
    map.put("METHOD-GoBack", MESSAGES.GoBackMethods());
    map.put("METHOD-GoForward", MESSAGES.GoForwardMethods());
    map.put("METHOD-GoHome", MESSAGES.GoHomeMethods());
    map.put("METHOD-GoToUrl", MESSAGES.GoToUrlMethods());
    map.put("METHOD-Reload", MESSAGES.ReloadMethods());
    map.put("METHOD-RunJavaScript", MESSAGES.RunJavaScriptMethods());
    map.put("METHOD-StopLoading", MESSAGES.StopLoadingMethods());


/* Parameters */

    map.put("PARAM-errorCode", MESSAGES.errorCodeParams());
    map.put("PARAM-failingUrl", MESSAGES.failingUrlParams());
    map.put("PARAM-js", MESSAGES.jsParams());


/* Component: YandexTranslate */

    map.put("COMPONENT-YandexTranslate", MESSAGES.yandexTranslateComponentPallette());

    map.put("YandexTranslate-helpString", MESSAGES.YandexTranslateHelpStringComponentPallette());



/* Properties */



/* Events */



/* Methods */



/* Parameters */

  }
  private static void mapOptionLists(Map<String, String> map) {


/* OptionList BestFitModel */

     map.put("OPTIONLIST-BestFitModel", MESSAGES.bestFitModelOptionList());
    map.put("OPTION-BestFitModelLinear", MESSAGES.bestFitModelLinearOption());
    map.put("OPTION-BestFitModelQuadratic", MESSAGES.bestFitModelQuadraticOption());
    map.put("OPTION-BestFitModelExponential", MESSAGES.bestFitModelExponentialOption());
    map.put("OPTION-BestFitModelLogarithmic", MESSAGES.bestFitModelLogarithmicOption());


/* OptionList ChartType */

     map.put("OPTIONLIST-ChartType", MESSAGES.chartTypeOptionList());
    map.put("OPTION-ChartTypeLine", MESSAGES.chartTypeLineOption());
    map.put("OPTION-ChartTypeScatter", MESSAGES.chartTypeScatterOption());
    map.put("OPTION-ChartTypeArea", MESSAGES.chartTypeAreaOption());
    map.put("OPTION-ChartTypeBar", MESSAGES.chartTypeBarOption());
    map.put("OPTION-ChartTypePie", MESSAGES.chartTypePieOption());


/* OptionList ColorSensorMode */

     map.put("OPTIONLIST-ColorSensorMode", MESSAGES.colorSensorModeOptionList());
    map.put("OPTION-ColorSensorModeReflected", MESSAGES.colorSensorModeReflectedOption());
    map.put("OPTION-ColorSensorModeAmbient", MESSAGES.colorSensorModeAmbientOption());
    map.put("OPTION-ColorSensorModeColor", MESSAGES.colorSensorModeColorOption());


/* OptionList Direction */

     map.put("OPTIONLIST-Direction", MESSAGES.directionOptionList());
    map.put("OPTION-DirectionNorth", MESSAGES.directionNorthOption());
    map.put("OPTION-DirectionNortheast", MESSAGES.directionNortheastOption());
    map.put("OPTION-DirectionEast", MESSAGES.directionEastOption());
    map.put("OPTION-DirectionSoutheast", MESSAGES.directionSoutheastOption());
    map.put("OPTION-DirectionSouth", MESSAGES.directionSouthOption());
    map.put("OPTION-DirectionSouthwest", MESSAGES.directionSouthwestOption());
    map.put("OPTION-DirectionWest", MESSAGES.directionWestOption());
    map.put("OPTION-DirectionNorthwest", MESSAGES.directionNorthwestOption());


/* OptionList EndedStatus */

     map.put("OPTIONLIST-EndedStatus", MESSAGES.endedStatusOptionList());
    map.put("OPTION-EndedStatusIncomingRejected", MESSAGES.endedStatusIncomingRejectedOption());
    map.put("OPTION-EndedStatusIncomingEnded", MESSAGES.endedStatusIncomingEndedOption());
    map.put("OPTION-EndedStatusOutgoingEnded", MESSAGES.endedStatusOutgoingEndedOption());


/* OptionList FileAction */

     map.put("OPTIONLIST-FileAction", MESSAGES.fileActionOptionList());
    map.put("OPTION-FileActionPickExistingFile", MESSAGES.fileActionPickExistingFileOption());
    map.put("OPTION-FileActionPickNewFile", MESSAGES.fileActionPickNewFileOption());
    map.put("OPTION-FileActionPickDirectory", MESSAGES.fileActionPickDirectoryOption());


/* OptionList FileScope */

     map.put("OPTIONLIST-FileScope", MESSAGES.fileScopeOptionList());
    map.put("OPTION-FileScopeApp", MESSAGES.fileScopeAppOption());
    map.put("OPTION-FileScopeAsset", MESSAGES.fileScopeAssetOption());
    map.put("OPTION-FileScopeCache", MESSAGES.fileScopeCacheOption());
    map.put("OPTION-FileScopeLegacy", MESSAGES.fileScopeLegacyOption());
    map.put("OPTION-FileScopePrivate", MESSAGES.fileScopePrivateOption());
    map.put("OPTION-FileScopeShared", MESSAGES.fileScopeSharedOption());


/* OptionList FileType */

     map.put("OPTIONLIST-FileType", MESSAGES.fileTypeOptionList());
    map.put("OPTION-FileTypeAny", MESSAGES.fileTypeAnyOption());
    map.put("OPTION-FileTypeAudio", MESSAGES.fileTypeAudioOption());
    map.put("OPTION-FileTypeImage", MESSAGES.fileTypeImageOption());
    map.put("OPTION-FileTypeVideo", MESSAGES.fileTypeVideoOption());


/* OptionList GyroSensorMode */

     map.put("OPTIONLIST-GyroSensorMode", MESSAGES.gyroSensorModeOptionList());
    map.put("OPTION-GyroSensorModeAngle", MESSAGES.gyroSensorModeAngleOption());
    map.put("OPTION-GyroSensorModeRate", MESSAGES.gyroSensorModeRateOption());


/* OptionList HorizontalAlignment */

     map.put("OPTIONLIST-HorizontalAlignment", MESSAGES.horizontalAlignmentOptionList());
    map.put("OPTION-HorizontalAlignmentLeft", MESSAGES.horizontalAlignmentLeftOption());
    map.put("OPTION-HorizontalAlignmentCenter", MESSAGES.horizontalAlignmentCenterOption());
    map.put("OPTION-HorizontalAlignmentRight", MESSAGES.horizontalAlignmentRightOption());


/* OptionList LOBFValues */

     map.put("OPTIONLIST-LOBFValues", MESSAGES.lOBFValuesOptionList());
    map.put("OPTION-LOBFValuesCorrCoef", MESSAGES.lOBFValuesCorrCoefOption());
    map.put("OPTION-LOBFValuesSlope", MESSAGES.lOBFValuesSlopeOption());
    map.put("OPTION-LOBFValuesYintercept", MESSAGES.lOBFValuesYinterceptOption());
    map.put("OPTION-LOBFValuesPredictions", MESSAGES.lOBFValuesPredictionsOption());
    map.put("OPTION-LOBFValuesAllValues", MESSAGES.lOBFValuesAllValuesOption());
    map.put("OPTION-LOBFValuesQuadraticCoefficient", MESSAGES.lOBFValuesQuadraticCoefficientOption());
    map.put("OPTION-LOBFValuesLinearCoefficient", MESSAGES.lOBFValuesLinearCoefficientOption());
    map.put("OPTION-LOBFValuesExponentialCoefficient", MESSAGES.lOBFValuesExponentialCoefficientOption());
    map.put("OPTION-LOBFValuesExponentialBase", MESSAGES.lOBFValuesExponentialBaseOption());
    map.put("OPTION-LOBFValuesLogarithmCoefficient", MESSAGES.lOBFValuesLogarithmCoefficientOption());
    map.put("OPTION-LOBFValuesLogarithmConstant", MESSAGES.lOBFValuesLogarithmConstantOption());
    map.put("OPTION-LOBFValuesXIntercepts", MESSAGES.lOBFValuesXInterceptsOption());
    map.put("OPTION-LOBFValuesRSquared", MESSAGES.lOBFValuesRSquaredOption());


/* OptionList LayoutType */

     map.put("OPTIONLIST-LayoutType", MESSAGES.layoutTypeOptionList());
    map.put("OPTION-LayoutTypeMainText", MESSAGES.layoutTypeMainTextOption());
    map.put("OPTION-LayoutTypeMainText_DetailText_Vertical", MESSAGES.layoutTypeMainText_DetailText_VerticalOption());
    map.put("OPTION-LayoutTypeMainText_DetailText_Horizontal", MESSAGES.layoutTypeMainText_DetailText_HorizontalOption());
    map.put("OPTION-LayoutTypeImage_MainText", MESSAGES.layoutTypeImage_MainTextOption());
    map.put("OPTION-LayoutTypeImage_MainText_DetailText_Vertical", MESSAGES.layoutTypeImage_MainText_DetailText_VerticalOption());
    map.put("OPTION-LayoutTypeImageTop_MainText_DetailText", MESSAGES.layoutTypeImageTop_MainText_DetailTextOption());


/* OptionList LineType */

     map.put("OPTIONLIST-LineType", MESSAGES.lineTypeOptionList());
    map.put("OPTION-LineTypeLinear", MESSAGES.lineTypeLinearOption());
    map.put("OPTION-LineTypeCurved", MESSAGES.lineTypeCurvedOption());
    map.put("OPTION-LineTypeStepped", MESSAGES.lineTypeSteppedOption());


/* OptionList ListOrientation */

     map.put("OPTIONLIST-ListOrientation", MESSAGES.listOrientationOptionList());
    map.put("OPTION-ListOrientationVertical", MESSAGES.listOrientationVerticalOption());
    map.put("OPTION-ListOrientationHorizontal", MESSAGES.listOrientationHorizontalOption());


/* OptionList MapType */

     map.put("OPTIONLIST-MapType", MESSAGES.mapTypeOptionList());
    map.put("OPTION-MapTypeRoad", MESSAGES.mapTypeRoadOption());
    map.put("OPTION-MapTypeAerial", MESSAGES.mapTypeAerialOption());
    map.put("OPTION-MapTypeTerrain", MESSAGES.mapTypeTerrainOption());
    map.put("OPTION-MapTypeCustom", MESSAGES.mapTypeCustomOption());


/* OptionList NxtMailbox */

     map.put("OPTIONLIST-NxtMailbox", MESSAGES.nxtMailboxOptionList());
    map.put("OPTION-NxtMailboxBox1", MESSAGES.nxtMailboxBox1Option());
    map.put("OPTION-NxtMailboxBox2", MESSAGES.nxtMailboxBox2Option());
    map.put("OPTION-NxtMailboxBox3", MESSAGES.nxtMailboxBox3Option());
    map.put("OPTION-NxtMailboxBox4", MESSAGES.nxtMailboxBox4Option());
    map.put("OPTION-NxtMailboxBox5", MESSAGES.nxtMailboxBox5Option());
    map.put("OPTION-NxtMailboxBox6", MESSAGES.nxtMailboxBox6Option());
    map.put("OPTION-NxtMailboxBox7", MESSAGES.nxtMailboxBox7Option());
    map.put("OPTION-NxtMailboxBox8", MESSAGES.nxtMailboxBox8Option());
    map.put("OPTION-NxtMailboxBox9", MESSAGES.nxtMailboxBox9Option());
    map.put("OPTION-NxtMailboxBox10", MESSAGES.nxtMailboxBox10Option());


/* OptionList NxtMotorMode */

     map.put("OPTIONLIST-NxtMotorMode", MESSAGES.nxtMotorModeOptionList());
    map.put("OPTION-NxtMotorModeOn", MESSAGES.nxtMotorModeOnOption());
    map.put("OPTION-NxtMotorModeBrake", MESSAGES.nxtMotorModeBrakeOption());
    map.put("OPTION-NxtMotorModeRegulated", MESSAGES.nxtMotorModeRegulatedOption());
    map.put("OPTION-NxtMotorModeCoast", MESSAGES.nxtMotorModeCoastOption());


/* OptionList NxtMotorPort */

     map.put("OPTIONLIST-NxtMotorPort", MESSAGES.nxtMotorPortOptionList());
    map.put("OPTION-NxtMotorPortPortA", MESSAGES.nxtMotorPortPortAOption());
    map.put("OPTION-NxtMotorPortPortB", MESSAGES.nxtMotorPortPortBOption());
    map.put("OPTION-NxtMotorPortPortC", MESSAGES.nxtMotorPortPortCOption());


/* OptionList NxtRegulationMode */

     map.put("OPTIONLIST-NxtRegulationMode", MESSAGES.nxtRegulationModeOptionList());
    map.put("OPTION-NxtRegulationModeDisabled", MESSAGES.nxtRegulationModeDisabledOption());
    map.put("OPTION-NxtRegulationModeSpeed", MESSAGES.nxtRegulationModeSpeedOption());
    map.put("OPTION-NxtRegulationModeSynchronization", MESSAGES.nxtRegulationModeSynchronizationOption());


/* OptionList NxtRunState */

     map.put("OPTIONLIST-NxtRunState", MESSAGES.nxtRunStateOptionList());
    map.put("OPTION-NxtRunStateDisabled", MESSAGES.nxtRunStateDisabledOption());
    map.put("OPTION-NxtRunStateRunning", MESSAGES.nxtRunStateRunningOption());
    map.put("OPTION-NxtRunStateRampUp", MESSAGES.nxtRunStateRampUpOption());
    map.put("OPTION-NxtRunStateRampDown", MESSAGES.nxtRunStateRampDownOption());


/* OptionList NxtSensorMode */

     map.put("OPTIONLIST-NxtSensorMode", MESSAGES.nxtSensorModeOptionList());
    map.put("OPTION-NxtSensorModeRaw", MESSAGES.nxtSensorModeRawOption());
    map.put("OPTION-NxtSensorModeBoolean", MESSAGES.nxtSensorModeBooleanOption());
    map.put("OPTION-NxtSensorModeTransitionCount", MESSAGES.nxtSensorModeTransitionCountOption());
    map.put("OPTION-NxtSensorModePeriodCount", MESSAGES.nxtSensorModePeriodCountOption());
    map.put("OPTION-NxtSensorModePercentage", MESSAGES.nxtSensorModePercentageOption());
    map.put("OPTION-NxtSensorModeRcxCelsius", MESSAGES.nxtSensorModeRcxCelsiusOption());
    map.put("OPTION-NxtSensorModeRcxFahrenheit", MESSAGES.nxtSensorModeRcxFahrenheitOption());
    map.put("OPTION-NxtSensorModeRcxAngleSteps", MESSAGES.nxtSensorModeRcxAngleStepsOption());


/* OptionList NxtSensorPort */

     map.put("OPTIONLIST-NxtSensorPort", MESSAGES.nxtSensorPortOptionList());
    map.put("OPTION-NxtSensorPortPort1", MESSAGES.nxtSensorPortPort1Option());
    map.put("OPTION-NxtSensorPortPort2", MESSAGES.nxtSensorPortPort2Option());
    map.put("OPTION-NxtSensorPortPort3", MESSAGES.nxtSensorPortPort3Option());
    map.put("OPTION-NxtSensorPortPort4", MESSAGES.nxtSensorPortPort4Option());


/* OptionList NxtSensorType */

     map.put("OPTIONLIST-NxtSensorType", MESSAGES.nxtSensorTypeOptionList());
    map.put("OPTION-NxtSensorTypeNoSensor", MESSAGES.nxtSensorTypeNoSensorOption());
    map.put("OPTION-NxtSensorTypeTouch", MESSAGES.nxtSensorTypeTouchOption());
    map.put("OPTION-NxtSensorTypeLightOn", MESSAGES.nxtSensorTypeLightOnOption());
    map.put("OPTION-NxtSensorTypeLightOff", MESSAGES.nxtSensorTypeLightOffOption());
    map.put("OPTION-NxtSensorTypeSoundDB", MESSAGES.nxtSensorTypeSoundDBOption());
    map.put("OPTION-NxtSensorTypeSoundDBA", MESSAGES.nxtSensorTypeSoundDBAOption());
    map.put("OPTION-NxtSensorTypeColorFull", MESSAGES.nxtSensorTypeColorFullOption());
    map.put("OPTION-NxtSensorTypeColorRed", MESSAGES.nxtSensorTypeColorRedOption());
    map.put("OPTION-NxtSensorTypeColorGreen", MESSAGES.nxtSensorTypeColorGreenOption());
    map.put("OPTION-NxtSensorTypeColorBlue", MESSAGES.nxtSensorTypeColorBlueOption());
    map.put("OPTION-NxtSensorTypeColorNone", MESSAGES.nxtSensorTypeColorNoneOption());
    map.put("OPTION-NxtSensorTypeDigital12C", MESSAGES.nxtSensorTypeDigital12COption());
    map.put("OPTION-NxtSensorTypeDigital12C9V", MESSAGES.nxtSensorTypeDigital12C9VOption());
    map.put("OPTION-NxtSensorTypeRcxTemperature", MESSAGES.nxtSensorTypeRcxTemperatureOption());
    map.put("OPTION-NxtSensorTypeRcxLight", MESSAGES.nxtSensorTypeRcxLightOption());
    map.put("OPTION-NxtSensorTypeRcxAngle", MESSAGES.nxtSensorTypeRcxAngleOption());


/* OptionList Permission */

     map.put("OPTIONLIST-Permission", MESSAGES.permissionOptionList());
    map.put("OPTION-PermissionCoarseLocation", MESSAGES.permissionCoarseLocationOption());
    map.put("OPTION-PermissionFineLocation", MESSAGES.permissionFineLocationOption());
    map.put("OPTION-PermissionMockLocation", MESSAGES.permissionMockLocationOption());
    map.put("OPTION-PermissionLocationExtraCommands", MESSAGES.permissionLocationExtraCommandsOption());
    map.put("OPTION-PermissionReadExternalStorage", MESSAGES.permissionReadExternalStorageOption());
    map.put("OPTION-PermissionWriteExternalStorage", MESSAGES.permissionWriteExternalStorageOption());
    map.put("OPTION-PermissionCamera", MESSAGES.permissionCameraOption());
    map.put("OPTION-PermissionAudio", MESSAGES.permissionAudioOption());
    map.put("OPTION-PermissionVibrate", MESSAGES.permissionVibrateOption());
    map.put("OPTION-PermissionInternet", MESSAGES.permissionInternetOption());
    map.put("OPTION-PermissionNearFieldCommunication", MESSAGES.permissionNearFieldCommunicationOption());
    map.put("OPTION-PermissionBluetooth", MESSAGES.permissionBluetoothOption());
    map.put("OPTION-PermissionBluetoothAdmin", MESSAGES.permissionBluetoothAdminOption());
    map.put("OPTION-PermissionWifiState", MESSAGES.permissionWifiStateOption());
    map.put("OPTION-PermissionNetworkState", MESSAGES.permissionNetworkStateOption());
    map.put("OPTION-PermissionAccountManager", MESSAGES.permissionAccountManagerOption());
    map.put("OPTION-PermissionManageAccounts", MESSAGES.permissionManageAccountsOption());
    map.put("OPTION-PermissionGetAccounts", MESSAGES.permissionGetAccountsOption());
    map.put("OPTION-PermissionReadContacts", MESSAGES.permissionReadContactsOption());
    map.put("OPTION-PermissionUseCredentials", MESSAGES.permissionUseCredentialsOption());
    map.put("OPTION-PermissionBluetoothAdvertise", MESSAGES.permissionBluetoothAdvertiseOption());
    map.put("OPTION-PermissionBluetoothConnect", MESSAGES.permissionBluetoothConnectOption());
    map.put("OPTION-PermissionBluetoothScan", MESSAGES.permissionBluetoothScanOption());
    map.put("OPTION-PermissionReadMediaImages", MESSAGES.permissionReadMediaImagesOption());
    map.put("OPTION-PermissionReadMediaVideo", MESSAGES.permissionReadMediaVideoOption());
    map.put("OPTION-PermissionReadMediaAudio", MESSAGES.permissionReadMediaAudioOption());


/* OptionList PointStyle */

     map.put("OPTIONLIST-PointStyle", MESSAGES.pointStyleOptionList());
    map.put("OPTION-PointStyleCircle", MESSAGES.pointStyleCircleOption());
    map.put("OPTION-PointStyleSquare", MESSAGES.pointStyleSquareOption());
    map.put("OPTION-PointStyleTriangle", MESSAGES.pointStyleTriangleOption());
    map.put("OPTION-PointStyleCross", MESSAGES.pointStyleCrossOption());
    map.put("OPTION-PointStyleX", MESSAGES.pointStyleXOption());


/* OptionList ReceivingState */

     map.put("OPTIONLIST-ReceivingState", MESSAGES.receivingStateOptionList());
    map.put("OPTION-ReceivingStateOff", MESSAGES.receivingStateOffOption());
    map.put("OPTION-ReceivingStateForeground", MESSAGES.receivingStateForegroundOption());
    map.put("OPTION-ReceivingStateAlways", MESSAGES.receivingStateAlwaysOption());


/* OptionList ScaleUnits */

     map.put("OPTIONLIST-ScaleUnits", MESSAGES.scaleUnitsOptionList());
    map.put("OPTION-ScaleUnitsMetric", MESSAGES.scaleUnitsMetricOption());
    map.put("OPTION-ScaleUnitsImperial", MESSAGES.scaleUnitsImperialOption());


/* OptionList ScreenAnimation */

     map.put("OPTIONLIST-ScreenAnimation", MESSAGES.screenAnimationOptionList());
    map.put("OPTION-ScreenAnimationDefault", MESSAGES.screenAnimationDefaultOption());
    map.put("OPTION-ScreenAnimationFade", MESSAGES.screenAnimationFadeOption());
    map.put("OPTION-ScreenAnimationZoom", MESSAGES.screenAnimationZoomOption());
    map.put("OPTION-ScreenAnimationSlideHorizontal", MESSAGES.screenAnimationSlideHorizontalOption());
    map.put("OPTION-ScreenAnimationSlideVertical", MESSAGES.screenAnimationSlideVerticalOption());
    map.put("OPTION-ScreenAnimationNone", MESSAGES.screenAnimationNoneOption());


/* OptionList ScreenOrientation */

     map.put("OPTIONLIST-ScreenOrientation", MESSAGES.screenOrientationOptionList());
    map.put("OPTION-ScreenOrientationUnspecified", MESSAGES.screenOrientationUnspecifiedOption());
    map.put("OPTION-ScreenOrientationLandscape", MESSAGES.screenOrientationLandscapeOption());
    map.put("OPTION-ScreenOrientationPortrait", MESSAGES.screenOrientationPortraitOption());
    map.put("OPTION-ScreenOrientationSensor", MESSAGES.screenOrientationSensorOption());
    map.put("OPTION-ScreenOrientationUser", MESSAGES.screenOrientationUserOption());
    map.put("OPTION-ScreenOrientationBehind", MESSAGES.screenOrientationBehindOption());
    map.put("OPTION-ScreenOrientationNoSensor", MESSAGES.screenOrientationNoSensorOption());
    map.put("OPTION-ScreenOrientationFullSensor", MESSAGES.screenOrientationFullSensorOption());
    map.put("OPTION-ScreenOrientationReverseLandscape", MESSAGES.screenOrientationReverseLandscapeOption());
    map.put("OPTION-ScreenOrientationReversePortrait", MESSAGES.screenOrientationReversePortraitOption());
    map.put("OPTION-ScreenOrientationSensorLandscape", MESSAGES.screenOrientationSensorLandscapeOption());
    map.put("OPTION-ScreenOrientationSensorPortrait", MESSAGES.screenOrientationSensorPortraitOption());


/* OptionList Sensitivity */

     map.put("OPTIONLIST-Sensitivity", MESSAGES.sensitivityOptionList());
    map.put("OPTION-SensitivityWeak", MESSAGES.sensitivityWeakOption());
    map.put("OPTION-SensitivityModerate", MESSAGES.sensitivityModerateOption());
    map.put("OPTION-SensitivityStrong", MESSAGES.sensitivityStrongOption());


/* OptionList StartedStatus */

     map.put("OPTIONLIST-StartedStatus", MESSAGES.startedStatusOptionList());
    map.put("OPTION-StartedStatusIncoming", MESSAGES.startedStatusIncomingOption());
    map.put("OPTION-StartedStatusOutgoing", MESSAGES.startedStatusOutgoingOption());


/* OptionList StrokeStyle */

     map.put("OPTIONLIST-StrokeStyle", MESSAGES.strokeStyleOptionList());
    map.put("OPTION-StrokeStyleSolid", MESSAGES.strokeStyleSolidOption());
    map.put("OPTION-StrokeStyleDashed", MESSAGES.strokeStyleDashedOption());
    map.put("OPTION-StrokeStyleDotted", MESSAGES.strokeStyleDottedOption());


/* OptionList TransportMethod */

     map.put("OPTIONLIST-TransportMethod", MESSAGES.transportMethodOptionList());
    map.put("OPTION-TransportMethodFoot", MESSAGES.transportMethodFootOption());
    map.put("OPTION-TransportMethodCar", MESSAGES.transportMethodCarOption());
    map.put("OPTION-TransportMethodBicycle", MESSAGES.transportMethodBicycleOption());
    map.put("OPTION-TransportMethodWheelchair", MESSAGES.transportMethodWheelchairOption());


/* OptionList UltrasonicSensorUnit */

     map.put("OPTIONLIST-UltrasonicSensorUnit", MESSAGES.ultrasonicSensorUnitOptionList());
    map.put("OPTION-UltrasonicSensorUnitCentimeters", MESSAGES.ultrasonicSensorUnitCentimetersOption());
    map.put("OPTION-UltrasonicSensorUnitInches", MESSAGES.ultrasonicSensorUnitInchesOption());


/* OptionList VerticalAlignment */

     map.put("OPTIONLIST-VerticalAlignment", MESSAGES.verticalAlignmentOptionList());
    map.put("OPTION-VerticalAlignmentTop", MESSAGES.verticalAlignmentTopOption());
    map.put("OPTION-VerticalAlignmentCenter", MESSAGES.verticalAlignmentCenterOption());
    map.put("OPTION-VerticalAlignmentBottom", MESSAGES.verticalAlignmentBottomOption());
  }
  private static void mapDescriptions(Map<String, String> map) {


    /* Descriptions */

    map.put("PROPDESC-AboutScreenPropertyDescriptions", MESSAGES.AboutScreenPropertyDescriptions());
    map.put("PROPDESC-AbsoluteArrangement.BackgroundColorPropertyDescriptions", MESSAGES.AbsoluteArrangement__BackgroundColorPropertyDescriptions());
    map.put("PROPDESC-AbsoluteArrangement.HeightPercentPropertyDescriptions", MESSAGES.AbsoluteArrangement__HeightPercentPropertyDescriptions());
    map.put("PROPDESC-AbsoluteArrangement.HeightPropertyDescriptions", MESSAGES.AbsoluteArrangement__HeightPropertyDescriptions());
    map.put("PROPDESC-AbsoluteArrangement.ImagePropertyDescriptions", MESSAGES.AbsoluteArrangement__ImagePropertyDescriptions());
    map.put("PROPDESC-AbsoluteArrangement.VisiblePropertyDescriptions", MESSAGES.AbsoluteArrangement__VisiblePropertyDescriptions());
    map.put("PROPDESC-AbsoluteArrangement.WidthPercentPropertyDescriptions", MESSAGES.AbsoluteArrangement__WidthPercentPropertyDescriptions());
    map.put("PROPDESC-AbsoluteArrangement.WidthPropertyDescriptions", MESSAGES.AbsoluteArrangement__WidthPropertyDescriptions());
    map.put("PROPDESC-AbsoluteStrengthPropertyDescriptions", MESSAGES.AbsoluteStrengthPropertyDescriptions());
    map.put("PROPDESC-AccelerometerSensor.AvailablePropertyDescriptions", MESSAGES.AccelerometerSensor__AvailablePropertyDescriptions());
    map.put("PROPDESC-AccelerometerSensor.EnabledPropertyDescriptions", MESSAGES.AccelerometerSensor__EnabledPropertyDescriptions());
    map.put("PROPDESC-AccelerometerSensor.LegacyModePropertyDescriptions", MESSAGES.AccelerometerSensor__LegacyModePropertyDescriptions());
    map.put("PROPDESC-AccelerometerSensor.MinimumIntervalPropertyDescriptions", MESSAGES.AccelerometerSensor__MinimumIntervalPropertyDescriptions());
    map.put("PROPDESC-AccentColorPropertyDescriptions", MESSAGES.AccentColorPropertyDescriptions());
    map.put("PROPDESC-AccuracyPropertyDescriptions", MESSAGES.AccuracyPropertyDescriptions());
    map.put("PROPDESC-ActionBarPropertyDescriptions", MESSAGES.ActionBarPropertyDescriptions());
    map.put("PROPDESC-ActivityClassPropertyDescriptions", MESSAGES.ActivityClassPropertyDescriptions());
    map.put("PROPDESC-ActivityPackagePropertyDescriptions", MESSAGES.ActivityPackagePropertyDescriptions());
    map.put("PROPDESC-ActivityStarter.ActionPropertyDescriptions", MESSAGES.ActivityStarter__ActionPropertyDescriptions());
    map.put("PROPDESC-ActivityStarter.ResultPropertyDescriptions", MESSAGES.ActivityStarter__ResultPropertyDescriptions());
    map.put("PROPDESC-AddressesAndNamesPropertyDescriptions", MESSAGES.AddressesAndNamesPropertyDescriptions());
    map.put("PROPDESC-AirPressurePropertyDescriptions", MESSAGES.AirPressurePropertyDescriptions());
    map.put("PROPDESC-AllowCookiesPropertyDescriptions", MESSAGES.AllowCookiesPropertyDescriptions());
    map.put("PROPDESC-AlternateTextPropertyDescriptions", MESSAGES.AlternateTextPropertyDescriptions());
    map.put("PROPDESC-AltitudePropertyDescriptions", MESSAGES.AltitudePropertyDescriptions());
    map.put("PROPDESC-AnchorHorizontalPropertyDescriptions", MESSAGES.AnchorHorizontalPropertyDescriptions());
    map.put("PROPDESC-AnchorVerticalPropertyDescriptions", MESSAGES.AnchorVerticalPropertyDescriptions());
    map.put("PROPDESC-AnglePropertyDescriptions", MESSAGES.AnglePropertyDescriptions());
    map.put("PROPDESC-AnimationPropertyDescriptions", MESSAGES.AnimationPropertyDescriptions());
    map.put("PROPDESC-AppNamePropertyDescriptions", MESSAGES.AppNamePropertyDescriptions());
    map.put("PROPDESC-ApplicationNamePropertyDescriptions", MESSAGES.ApplicationNamePropertyDescriptions());
    map.put("PROPDESC-AvailableCountriesPropertyDescriptions", MESSAGES.AvailableCountriesPropertyDescriptions());
    map.put("PROPDESC-AvailableLanguagesPropertyDescriptions", MESSAGES.AvailableLanguagesPropertyDescriptions());
    map.put("PROPDESC-AvailableProvidersPropertyDescriptions", MESSAGES.AvailableProvidersPropertyDescriptions());
    map.put("PROPDESC-AverageLuxPropertyDescriptions", MESSAGES.AverageLuxPropertyDescriptions());
    map.put("PROPDESC-AxesTextColorPropertyDescriptions", MESSAGES.AxesTextColorPropertyDescriptions());
    map.put("PROPDESC-AzimuthPropertyDescriptions", MESSAGES.AzimuthPropertyDescriptions());
    map.put("PROPDESC-BackgroundImageinBase64PropertyDescriptions", MESSAGES.BackgroundImageinBase64PropertyDescriptions());
    map.put("PROPDESC-Ball.EnabledPropertyDescriptions", MESSAGES.Ball__EnabledPropertyDescriptions());
    map.put("PROPDESC-Ball.HeadingPropertyDescriptions", MESSAGES.Ball__HeadingPropertyDescriptions());
    map.put("PROPDESC-Ball.IntervalPropertyDescriptions", MESSAGES.Ball__IntervalPropertyDescriptions());
    map.put("PROPDESC-Ball.PaintColorPropertyDescriptions", MESSAGES.Ball__PaintColorPropertyDescriptions());
    map.put("PROPDESC-Ball.RadiusPropertyDescriptions", MESSAGES.Ball__RadiusPropertyDescriptions());
    map.put("PROPDESC-Ball.SpeedPropertyDescriptions", MESSAGES.Ball__SpeedPropertyDescriptions());
    map.put("PROPDESC-Ball.VisiblePropertyDescriptions", MESSAGES.Ball__VisiblePropertyDescriptions());
    map.put("PROPDESC-Ball.XPropertyDescriptions", MESSAGES.Ball__XPropertyDescriptions());
    map.put("PROPDESC-Ball.YPropertyDescriptions", MESSAGES.Ball__YPropertyDescriptions());
    map.put("PROPDESC-Ball.ZPropertyDescriptions", MESSAGES.Ball__ZPropertyDescriptions());
    map.put("PROPDESC-BallotOptionsPropertyDescriptions", MESSAGES.BallotOptionsPropertyDescriptions());
    map.put("PROPDESC-BallotQuestionPropertyDescriptions", MESSAGES.BallotQuestionPropertyDescriptions());
    map.put("PROPDESC-BarcodeScanner.ResultPropertyDescriptions", MESSAGES.BarcodeScanner__ResultPropertyDescriptions());
    map.put("PROPDESC-Barometer.AvailablePropertyDescriptions", MESSAGES.Barometer__AvailablePropertyDescriptions());
    map.put("PROPDESC-Barometer.EnabledPropertyDescriptions", MESSAGES.Barometer__EnabledPropertyDescriptions());
    map.put("PROPDESC-BaudRatePropertyDescriptions", MESSAGES.BaudRatePropertyDescriptions());
    map.put("PROPDESC-BigDefaultTextPropertyDescriptions", MESSAGES.BigDefaultTextPropertyDescriptions());
    map.put("PROPDESC-BlocksToolkitPropertyDescriptions", MESSAGES.BlocksToolkitPropertyDescriptions());
    map.put("PROPDESC-BluetoothClientPropertyDescriptions", MESSAGES.BluetoothClientPropertyDescriptions());
    map.put("PROPDESC-BluetoothClient.AvailablePropertyDescriptions", MESSAGES.BluetoothClient__AvailablePropertyDescriptions());
    map.put("PROPDESC-BluetoothClient.EnabledPropertyDescriptions", MESSAGES.BluetoothClient__EnabledPropertyDescriptions());
    map.put("PROPDESC-BluetoothServer.AvailablePropertyDescriptions", MESSAGES.BluetoothServer__AvailablePropertyDescriptions());
    map.put("PROPDESC-BluetoothServer.EnabledPropertyDescriptions", MESSAGES.BluetoothServer__EnabledPropertyDescriptions());
    map.put("PROPDESC-BottomOfRangePropertyDescriptions", MESSAGES.BottomOfRangePropertyDescriptions());
    map.put("PROPDESC-BounceEdgeEffectPropertyDescriptions", MESSAGES.BounceEdgeEffectPropertyDescriptions());
    map.put("PROPDESC-BoundingBoxPropertyDescriptions", MESSAGES.BoundingBoxPropertyDescriptions());
    map.put("PROPDESC-BufferSizePropertyDescriptions", MESSAGES.BufferSizePropertyDescriptions());
    map.put("PROPDESC-Button.BackgroundColorPropertyDescriptions", MESSAGES.Button__BackgroundColorPropertyDescriptions());
    map.put("PROPDESC-Button.EnabledPropertyDescriptions", MESSAGES.Button__EnabledPropertyDescriptions());
    map.put("PROPDESC-Button.FontBoldPropertyDescriptions", MESSAGES.Button__FontBoldPropertyDescriptions());
    map.put("PROPDESC-Button.FontItalicPropertyDescriptions", MESSAGES.Button__FontItalicPropertyDescriptions());
    map.put("PROPDESC-Button.FontSizePropertyDescriptions", MESSAGES.Button__FontSizePropertyDescriptions());
    map.put("PROPDESC-Button.FontTypefacePropertyDescriptions", MESSAGES.Button__FontTypefacePropertyDescriptions());
    map.put("PROPDESC-Button.HeightPercentPropertyDescriptions", MESSAGES.Button__HeightPercentPropertyDescriptions());
    map.put("PROPDESC-Button.HeightPropertyDescriptions", MESSAGES.Button__HeightPropertyDescriptions());
    map.put("PROPDESC-Button.ImagePropertyDescriptions", MESSAGES.Button__ImagePropertyDescriptions());
    map.put("PROPDESC-Button.ShapePropertyDescriptions", MESSAGES.Button__ShapePropertyDescriptions());
    map.put("PROPDESC-Button.ShowFeedbackPropertyDescriptions", MESSAGES.Button__ShowFeedbackPropertyDescriptions());
    map.put("PROPDESC-Button.TextAlignmentPropertyDescriptions", MESSAGES.Button__TextAlignmentPropertyDescriptions());
    map.put("PROPDESC-Button.TextColorPropertyDescriptions", MESSAGES.Button__TextColorPropertyDescriptions());
    map.put("PROPDESC-Button.TextPropertyDescriptions", MESSAGES.Button__TextPropertyDescriptions());
    map.put("PROPDESC-Button.VisiblePropertyDescriptions", MESSAGES.Button__VisiblePropertyDescriptions());
    map.put("PROPDESC-Button.WidthPercentPropertyDescriptions", MESSAGES.Button__WidthPercentPropertyDescriptions());
    map.put("PROPDESC-Button.WidthPropertyDescriptions", MESSAGES.Button__WidthPropertyDescriptions());
    map.put("PROPDESC-CalibrateStrideLengthPropertyDescriptions", MESSAGES.CalibrateStrideLengthPropertyDescriptions());
    map.put("PROPDESC-Canvas.BackgroundColorPropertyDescriptions", MESSAGES.Canvas__BackgroundColorPropertyDescriptions());
    map.put("PROPDESC-Canvas.BackgroundImagePropertyDescriptions", MESSAGES.Canvas__BackgroundImagePropertyDescriptions());
    map.put("PROPDESC-Canvas.FontSizePropertyDescriptions", MESSAGES.Canvas__FontSizePropertyDescriptions());
    map.put("PROPDESC-Canvas.HeightPercentPropertyDescriptions", MESSAGES.Canvas__HeightPercentPropertyDescriptions());
    map.put("PROPDESC-Canvas.HeightPropertyDescriptions", MESSAGES.Canvas__HeightPropertyDescriptions());
    map.put("PROPDESC-Canvas.PaintColorPropertyDescriptions", MESSAGES.Canvas__PaintColorPropertyDescriptions());
    map.put("PROPDESC-Canvas.TextAlignmentPropertyDescriptions", MESSAGES.Canvas__TextAlignmentPropertyDescriptions());
    map.put("PROPDESC-Canvas.VisiblePropertyDescriptions", MESSAGES.Canvas__VisiblePropertyDescriptions());
    map.put("PROPDESC-Canvas.WidthPercentPropertyDescriptions", MESSAGES.Canvas__WidthPercentPropertyDescriptions());
    map.put("PROPDESC-Canvas.WidthPropertyDescriptions", MESSAGES.Canvas__WidthPropertyDescriptions());
    map.put("PROPDESC-CenterFromStringPropertyDescriptions", MESSAGES.CenterFromStringPropertyDescriptions());
    map.put("PROPDESC-CharacterEncodingPropertyDescriptions", MESSAGES.CharacterEncodingPropertyDescriptions());
    map.put("PROPDESC-ChartData2D.ColorPropertyDescriptions", MESSAGES.ChartData2D__ColorPropertyDescriptions());
    map.put("PROPDESC-ChartData2D.SourcePropertyDescriptions", MESSAGES.ChartData2D__SourcePropertyDescriptions());
    map.put("PROPDESC-ChartDataPropertyDescriptions", MESSAGES.ChartDataPropertyDescriptions());
    map.put("PROPDESC-Chart.BackgroundColorPropertyDescriptions", MESSAGES.Chart__BackgroundColorPropertyDescriptions());
    map.put("PROPDESC-Chart.DescriptionPropertyDescriptions", MESSAGES.Chart__DescriptionPropertyDescriptions());
    map.put("PROPDESC-Chart.HeightPercentPropertyDescriptions", MESSAGES.Chart__HeightPercentPropertyDescriptions());
    map.put("PROPDESC-Chart.HeightPropertyDescriptions", MESSAGES.Chart__HeightPropertyDescriptions());
    map.put("PROPDESC-Chart.TypePropertyDescriptions", MESSAGES.Chart__TypePropertyDescriptions());
    map.put("PROPDESC-Chart.VisiblePropertyDescriptions", MESSAGES.Chart__VisiblePropertyDescriptions());
    map.put("PROPDESC-Chart.WidthPercentPropertyDescriptions", MESSAGES.Chart__WidthPercentPropertyDescriptions());
    map.put("PROPDESC-Chart.WidthPropertyDescriptions", MESSAGES.Chart__WidthPropertyDescriptions());
    map.put("PROPDESC-ChatBot.ApiKeyPropertyDescriptions", MESSAGES.ChatBot__ApiKeyPropertyDescriptions());
    map.put("PROPDESC-ChatBot.ModelPropertyDescriptions", MESSAGES.ChatBot__ModelPropertyDescriptions());
    map.put("PROPDESC-ChatBot.TokenPropertyDescriptions", MESSAGES.ChatBot__TokenPropertyDescriptions());
    map.put("PROPDESC-CheckBox.BackgroundColorPropertyDescriptions", MESSAGES.CheckBox__BackgroundColorPropertyDescriptions());
    map.put("PROPDESC-CheckBox.EnabledPropertyDescriptions", MESSAGES.CheckBox__EnabledPropertyDescriptions());
    map.put("PROPDESC-CheckBox.FontBoldPropertyDescriptions", MESSAGES.CheckBox__FontBoldPropertyDescriptions());
    map.put("PROPDESC-CheckBox.FontItalicPropertyDescriptions", MESSAGES.CheckBox__FontItalicPropertyDescriptions());
    map.put("PROPDESC-CheckBox.FontSizePropertyDescriptions", MESSAGES.CheckBox__FontSizePropertyDescriptions());
    map.put("PROPDESC-CheckBox.FontTypefacePropertyDescriptions", MESSAGES.CheckBox__FontTypefacePropertyDescriptions());
    map.put("PROPDESC-CheckBox.HeightPercentPropertyDescriptions", MESSAGES.CheckBox__HeightPercentPropertyDescriptions());
    map.put("PROPDESC-CheckBox.HeightPropertyDescriptions", MESSAGES.CheckBox__HeightPropertyDescriptions());
    map.put("PROPDESC-CheckBox.TextColorPropertyDescriptions", MESSAGES.CheckBox__TextColorPropertyDescriptions());
    map.put("PROPDESC-CheckBox.TextPropertyDescriptions", MESSAGES.CheckBox__TextPropertyDescriptions());
    map.put("PROPDESC-CheckBox.VisiblePropertyDescriptions", MESSAGES.CheckBox__VisiblePropertyDescriptions());
    map.put("PROPDESC-CheckBox.WidthPercentPropertyDescriptions", MESSAGES.CheckBox__WidthPercentPropertyDescriptions());
    map.put("PROPDESC-CheckBox.WidthPropertyDescriptions", MESSAGES.CheckBox__WidthPropertyDescriptions());
    map.put("PROPDESC-CheckedPropertyDescriptions", MESSAGES.CheckedPropertyDescriptions());
    map.put("PROPDESC-Circle.DescriptionPropertyDescriptions", MESSAGES.Circle__DescriptionPropertyDescriptions());
    map.put("PROPDESC-Circle.DraggablePropertyDescriptions", MESSAGES.Circle__DraggablePropertyDescriptions());
    map.put("PROPDESC-Circle.EnableInfoboxPropertyDescriptions", MESSAGES.Circle__EnableInfoboxPropertyDescriptions());
    map.put("PROPDESC-Circle.FillColorPropertyDescriptions", MESSAGES.Circle__FillColorPropertyDescriptions());
    map.put("PROPDESC-Circle.LatitudePropertyDescriptions", MESSAGES.Circle__LatitudePropertyDescriptions());
    map.put("PROPDESC-Circle.LongitudePropertyDescriptions", MESSAGES.Circle__LongitudePropertyDescriptions());
    map.put("PROPDESC-Circle.RadiusPropertyDescriptions", MESSAGES.Circle__RadiusPropertyDescriptions());
    map.put("PROPDESC-Circle.StrokeColorPropertyDescriptions", MESSAGES.Circle__StrokeColorPropertyDescriptions());
    map.put("PROPDESC-Circle.StrokeWidthPropertyDescriptions", MESSAGES.Circle__StrokeWidthPropertyDescriptions());
    map.put("PROPDESC-Circle.TitlePropertyDescriptions", MESSAGES.Circle__TitlePropertyDescriptions());
    map.put("PROPDESC-Circle.TypePropertyDescriptions", MESSAGES.Circle__TypePropertyDescriptions());
    map.put("PROPDESC-Circle.VisiblePropertyDescriptions", MESSAGES.Circle__VisiblePropertyDescriptions());
    map.put("PROPDESC-CircularProgress.ColorPropertyDescriptions", MESSAGES.CircularProgress__ColorPropertyDescriptions());
    map.put("PROPDESC-CircularProgress.HeightPercentPropertyDescriptions", MESSAGES.CircularProgress__HeightPercentPropertyDescriptions());
    map.put("PROPDESC-CircularProgress.HeightPropertyDescriptions", MESSAGES.CircularProgress__HeightPropertyDescriptions());
    map.put("PROPDESC-CircularProgress.VisiblePropertyDescriptions", MESSAGES.CircularProgress__VisiblePropertyDescriptions());
    map.put("PROPDESC-CircularProgress.WidthPercentPropertyDescriptions", MESSAGES.CircularProgress__WidthPercentPropertyDescriptions());
    map.put("PROPDESC-CircularProgress.WidthPropertyDescriptions", MESSAGES.CircularProgress__WidthPropertyDescriptions());
    map.put("PROPDESC-ClickablePropertyDescriptions", MESSAGES.ClickablePropertyDescriptions());
    map.put("PROPDESC-CloseScreenAnimationPropertyDescriptions", MESSAGES.CloseScreenAnimationPropertyDescriptions());
    map.put("PROPDESC-CloudDB.TokenPropertyDescriptions", MESSAGES.CloudDB__TokenPropertyDescriptions());
    map.put("PROPDESC-ColorLeftPropertyDescriptions", MESSAGES.ColorLeftPropertyDescriptions());
    map.put("PROPDESC-ColorRightPropertyDescriptions", MESSAGES.ColorRightPropertyDescriptions());
    map.put("PROPDESC-ColorsPropertyDescriptions", MESSAGES.ColorsPropertyDescriptions());
    map.put("PROPDESC-ColumnNamesPropertyDescriptions", MESSAGES.ColumnNamesPropertyDescriptions());
    map.put("PROPDESC-ColumnPropertyDescriptions", MESSAGES.ColumnPropertyDescriptions());
    map.put("PROPDESC-ConsumerKeyPropertyDescriptions", MESSAGES.ConsumerKeyPropertyDescriptions());
    map.put("PROPDESC-ConsumerSecretPropertyDescriptions", MESSAGES.ConsumerSecretPropertyDescriptions());
    map.put("PROPDESC-ContactNamePropertyDescriptions", MESSAGES.ContactNamePropertyDescriptions());
    map.put("PROPDESC-ContactPicker.BackgroundColorPropertyDescriptions", MESSAGES.ContactPicker__BackgroundColorPropertyDescriptions());
    map.put("PROPDESC-ContactPicker.EnabledPropertyDescriptions", MESSAGES.ContactPicker__EnabledPropertyDescriptions());
    map.put("PROPDESC-ContactPicker.FontBoldPropertyDescriptions", MESSAGES.ContactPicker__FontBoldPropertyDescriptions());
    map.put("PROPDESC-ContactPicker.FontItalicPropertyDescriptions", MESSAGES.ContactPicker__FontItalicPropertyDescriptions());
    map.put("PROPDESC-ContactPicker.FontSizePropertyDescriptions", MESSAGES.ContactPicker__FontSizePropertyDescriptions());
    map.put("PROPDESC-ContactPicker.FontTypefacePropertyDescriptions", MESSAGES.ContactPicker__FontTypefacePropertyDescriptions());
    map.put("PROPDESC-ContactPicker.HeightPercentPropertyDescriptions", MESSAGES.ContactPicker__HeightPercentPropertyDescriptions());
    map.put("PROPDESC-ContactPicker.HeightPropertyDescriptions", MESSAGES.ContactPicker__HeightPropertyDescriptions());
    map.put("PROPDESC-ContactPicker.ImagePropertyDescriptions", MESSAGES.ContactPicker__ImagePropertyDescriptions());
    map.put("PROPDESC-ContactPicker.PhoneNumberPropertyDescriptions", MESSAGES.ContactPicker__PhoneNumberPropertyDescriptions());
    map.put("PROPDESC-ContactPicker.PicturePropertyDescriptions", MESSAGES.ContactPicker__PicturePropertyDescriptions());
    map.put("PROPDESC-ContactPicker.ShapePropertyDescriptions", MESSAGES.ContactPicker__ShapePropertyDescriptions());
    map.put("PROPDESC-ContactPicker.ShowFeedbackPropertyDescriptions", MESSAGES.ContactPicker__ShowFeedbackPropertyDescriptions());
    map.put("PROPDESC-ContactPicker.TextAlignmentPropertyDescriptions", MESSAGES.ContactPicker__TextAlignmentPropertyDescriptions());
    map.put("PROPDESC-ContactPicker.TextColorPropertyDescriptions", MESSAGES.ContactPicker__TextColorPropertyDescriptions());
    map.put("PROPDESC-ContactPicker.TextPropertyDescriptions", MESSAGES.ContactPicker__TextPropertyDescriptions());
    map.put("PROPDESC-ContactPicker.VisiblePropertyDescriptions", MESSAGES.ContactPicker__VisiblePropertyDescriptions());
    map.put("PROPDESC-ContactPicker.WidthPercentPropertyDescriptions", MESSAGES.ContactPicker__WidthPercentPropertyDescriptions());
    map.put("PROPDESC-ContactPicker.WidthPropertyDescriptions", MESSAGES.ContactPicker__WidthPropertyDescriptions());
    map.put("PROPDESC-ContactUriPropertyDescriptions", MESSAGES.ContactUriPropertyDescriptions());
    map.put("PROPDESC-CorrelationCoefficientPropertyDescriptions", MESSAGES.CorrelationCoefficientPropertyDescriptions());
    map.put("PROPDESC-CountryPropertyDescriptions", MESSAGES.CountryPropertyDescriptions());
    map.put("PROPDESC-CredentialsJsonPropertyDescriptions", MESSAGES.CredentialsJsonPropertyDescriptions());
    map.put("PROPDESC-CurrentAddressPropertyDescriptions", MESSAGES.CurrentAddressPropertyDescriptions());
    map.put("PROPDESC-CurrentPageTitlePropertyDescriptions", MESSAGES.CurrentPageTitlePropertyDescriptions());
    map.put("PROPDESC-CurrentUrlPropertyDescriptions", MESSAGES.CurrentUrlPropertyDescriptions());
    map.put("PROPDESC-CustomUrlPropertyDescriptions", MESSAGES.CustomUrlPropertyDescriptions());
    map.put("PROPDESC-DataFileXColumnPropertyDescriptions", MESSAGES.DataFileXColumnPropertyDescriptions());
    map.put("PROPDESC-DataFileYColumnPropertyDescriptions", MESSAGES.DataFileYColumnPropertyDescriptions());
    map.put("PROPDESC-DataFile.ColumnsPropertyDescriptions", MESSAGES.DataFile__ColumnsPropertyDescriptions());
    map.put("PROPDESC-DataFile.LegacyModePropertyDescriptions", MESSAGES.DataFile__LegacyModePropertyDescriptions());
    map.put("PROPDESC-DataFile.RowsPropertyDescriptions", MESSAGES.DataFile__RowsPropertyDescriptions());
    map.put("PROPDESC-DataLabelColorPropertyDescriptions", MESSAGES.DataLabelColorPropertyDescriptions());
    map.put("PROPDESC-DataSourceKeyPropertyDescriptions", MESSAGES.DataSourceKeyPropertyDescriptions());
    map.put("PROPDESC-DataTypePropertyDescriptions", MESSAGES.DataTypePropertyDescriptions());
    map.put("PROPDESC-DataUriPropertyDescriptions", MESSAGES.DataUriPropertyDescriptions());
    map.put("PROPDESC-DatePicker.BackgroundColorPropertyDescriptions", MESSAGES.DatePicker__BackgroundColorPropertyDescriptions());
    map.put("PROPDESC-DatePicker.EnabledPropertyDescriptions", MESSAGES.DatePicker__EnabledPropertyDescriptions());
    map.put("PROPDESC-DatePicker.FontBoldPropertyDescriptions", MESSAGES.DatePicker__FontBoldPropertyDescriptions());
    map.put("PROPDESC-DatePicker.FontItalicPropertyDescriptions", MESSAGES.DatePicker__FontItalicPropertyDescriptions());
    map.put("PROPDESC-DatePicker.FontSizePropertyDescriptions", MESSAGES.DatePicker__FontSizePropertyDescriptions());
    map.put("PROPDESC-DatePicker.FontTypefacePropertyDescriptions", MESSAGES.DatePicker__FontTypefacePropertyDescriptions());
    map.put("PROPDESC-DatePicker.HeightPercentPropertyDescriptions", MESSAGES.DatePicker__HeightPercentPropertyDescriptions());
    map.put("PROPDESC-DatePicker.HeightPropertyDescriptions", MESSAGES.DatePicker__HeightPropertyDescriptions());
    map.put("PROPDESC-DatePicker.ImagePropertyDescriptions", MESSAGES.DatePicker__ImagePropertyDescriptions());
    map.put("PROPDESC-DatePicker.InstantPropertyDescriptions", MESSAGES.DatePicker__InstantPropertyDescriptions());
    map.put("PROPDESC-DatePicker.ShapePropertyDescriptions", MESSAGES.DatePicker__ShapePropertyDescriptions());
    map.put("PROPDESC-DatePicker.ShowFeedbackPropertyDescriptions", MESSAGES.DatePicker__ShowFeedbackPropertyDescriptions());
    map.put("PROPDESC-DatePicker.TextAlignmentPropertyDescriptions", MESSAGES.DatePicker__TextAlignmentPropertyDescriptions());
    map.put("PROPDESC-DatePicker.TextColorPropertyDescriptions", MESSAGES.DatePicker__TextColorPropertyDescriptions());
    map.put("PROPDESC-DatePicker.TextPropertyDescriptions", MESSAGES.DatePicker__TextPropertyDescriptions());
    map.put("PROPDESC-DatePicker.VisiblePropertyDescriptions", MESSAGES.DatePicker__VisiblePropertyDescriptions());
    map.put("PROPDESC-DatePicker.WidthPercentPropertyDescriptions", MESSAGES.DatePicker__WidthPercentPropertyDescriptions());
    map.put("PROPDESC-DatePicker.WidthPropertyDescriptions", MESSAGES.DatePicker__WidthPropertyDescriptions());
    map.put("PROPDESC-DayPropertyDescriptions", MESSAGES.DayPropertyDescriptions());
    map.put("PROPDESC-DefaultFileScopePropertyDescriptions", MESSAGES.DefaultFileScopePropertyDescriptions());
    map.put("PROPDESC-DefaultRedisServerPropertyDescriptions", MESSAGES.DefaultRedisServerPropertyDescriptions());
    map.put("PROPDESC-DefaultScopePropertyDescriptions", MESSAGES.DefaultScopePropertyDescriptions());
    map.put("PROPDESC-DefaultURLPropertyDescriptions", MESSAGES.DefaultURLPropertyDescriptions());
    map.put("PROPDESC-DelimiterBytePropertyDescriptions", MESSAGES.DelimiterBytePropertyDescriptions());
    map.put("PROPDESC-DetectColorPropertyDescriptions", MESSAGES.DetectColorPropertyDescriptions());
    map.put("PROPDESC-DeveloperBucketPropertyDescriptions", MESSAGES.DeveloperBucketPropertyDescriptions());
    map.put("PROPDESC-DirectMessagesPropertyDescriptions", MESSAGES.DirectMessagesPropertyDescriptions());
    map.put("PROPDESC-DisconnectOnErrorPropertyDescriptions", MESSAGES.DisconnectOnErrorPropertyDescriptions());
    map.put("PROPDESC-DistanceIntervalPropertyDescriptions", MESSAGES.DistanceIntervalPropertyDescriptions());
    map.put("PROPDESC-DividerColorPropertyDescriptions", MESSAGES.DividerColorPropertyDescriptions());
    map.put("PROPDESC-DividerThicknessPropertyDescriptions", MESSAGES.DividerThicknessPropertyDescriptions());
    map.put("PROPDESC-DriveMotorsPropertyDescriptions", MESSAGES.DriveMotorsPropertyDescriptions());
    map.put("PROPDESC-EastLongitudePropertyDescriptions", MESSAGES.EastLongitudePropertyDescriptions());
    map.put("PROPDESC-ElapsedTimePropertyDescriptions", MESSAGES.ElapsedTimePropertyDescriptions());
    map.put("PROPDESC-ElementColorPropertyDescriptions", MESSAGES.ElementColorPropertyDescriptions());
    map.put("PROPDESC-ElementCornerRadiusPropertyDescriptions", MESSAGES.ElementCornerRadiusPropertyDescriptions());
    map.put("PROPDESC-ElementMarginsWidthPropertyDescriptions", MESSAGES.ElementMarginsWidthPropertyDescriptions());
    map.put("PROPDESC-ElementsFromPairsPropertyDescriptions", MESSAGES.ElementsFromPairsPropertyDescriptions());
    map.put("PROPDESC-EmailAddressListPropertyDescriptions", MESSAGES.EmailAddressListPropertyDescriptions());
    map.put("PROPDESC-EmailAddressPropertyDescriptions", MESSAGES.EmailAddressPropertyDescriptions());
    map.put("PROPDESC-EmailPicker.BackgroundColorPropertyDescriptions", MESSAGES.EmailPicker__BackgroundColorPropertyDescriptions());
    map.put("PROPDESC-EmailPicker.EnabledPropertyDescriptions", MESSAGES.EmailPicker__EnabledPropertyDescriptions());
    map.put("PROPDESC-EmailPicker.FontBoldPropertyDescriptions", MESSAGES.EmailPicker__FontBoldPropertyDescriptions());
    map.put("PROPDESC-EmailPicker.FontItalicPropertyDescriptions", MESSAGES.EmailPicker__FontItalicPropertyDescriptions());
    map.put("PROPDESC-EmailPicker.FontSizePropertyDescriptions", MESSAGES.EmailPicker__FontSizePropertyDescriptions());
    map.put("PROPDESC-EmailPicker.FontTypefacePropertyDescriptions", MESSAGES.EmailPicker__FontTypefacePropertyDescriptions());
    map.put("PROPDESC-EmailPicker.HeightPercentPropertyDescriptions", MESSAGES.EmailPicker__HeightPercentPropertyDescriptions());
    map.put("PROPDESC-EmailPicker.HeightPropertyDescriptions", MESSAGES.EmailPicker__HeightPropertyDescriptions());
    map.put("PROPDESC-EmailPicker.HintColorPropertyDescriptions", MESSAGES.EmailPicker__HintColorPropertyDescriptions());
    map.put("PROPDESC-EmailPicker.HintPropertyDescriptions", MESSAGES.EmailPicker__HintPropertyDescriptions());
    map.put("PROPDESC-EmailPicker.TextAlignmentPropertyDescriptions", MESSAGES.EmailPicker__TextAlignmentPropertyDescriptions());
    map.put("PROPDESC-EmailPicker.TextColorPropertyDescriptions", MESSAGES.EmailPicker__TextColorPropertyDescriptions());
    map.put("PROPDESC-EmailPicker.TextPropertyDescriptions", MESSAGES.EmailPicker__TextPropertyDescriptions());
    map.put("PROPDESC-EmailPicker.VisiblePropertyDescriptions", MESSAGES.EmailPicker__VisiblePropertyDescriptions());
    map.put("PROPDESC-EmailPicker.WidthPercentPropertyDescriptions", MESSAGES.EmailPicker__WidthPercentPropertyDescriptions());
    map.put("PROPDESC-EmailPicker.WidthPropertyDescriptions", MESSAGES.EmailPicker__WidthPropertyDescriptions());
    map.put("PROPDESC-EnablePanPropertyDescriptions", MESSAGES.EnablePanPropertyDescriptions());
    map.put("PROPDESC-EnableRotationPropertyDescriptions", MESSAGES.EnableRotationPropertyDescriptions());
    map.put("PROPDESC-EnableSpeedRegulationPropertyDescriptions", MESSAGES.EnableSpeedRegulationPropertyDescriptions());
    map.put("PROPDESC-EnableZoomPropertyDescriptions", MESSAGES.EnableZoomPropertyDescriptions());
    map.put("PROPDESC-EndLatitudePropertyDescriptions", MESSAGES.EndLatitudePropertyDescriptions());
    map.put("PROPDESC-EndLocationPropertyDescriptions", MESSAGES.EndLocationPropertyDescriptions());
    map.put("PROPDESC-EndLongitudePropertyDescriptions", MESSAGES.EndLongitudePropertyDescriptions());
    map.put("PROPDESC-Ev3ColorSensor.AboveRangeEventEnabledPropertyDescriptions", MESSAGES.Ev3ColorSensor__AboveRangeEventEnabledPropertyDescriptions());
    map.put("PROPDESC-Ev3ColorSensor.BelowRangeEventEnabledPropertyDescriptions", MESSAGES.Ev3ColorSensor__BelowRangeEventEnabledPropertyDescriptions());
    map.put("PROPDESC-Ev3ColorSensor.ColorChangedEventEnabledPropertyDescriptions", MESSAGES.Ev3ColorSensor__ColorChangedEventEnabledPropertyDescriptions());
    map.put("PROPDESC-Ev3ColorSensor.WithinRangeEventEnabledPropertyDescriptions", MESSAGES.Ev3ColorSensor__WithinRangeEventEnabledPropertyDescriptions());
    map.put("PROPDESC-Ev3Motors.StopBeforeDisconnectPropertyDescriptions", MESSAGES.Ev3Motors__StopBeforeDisconnectPropertyDescriptions());
    map.put("PROPDESC-Ev3Motors.WheelDiameterPropertyDescriptions", MESSAGES.Ev3Motors__WheelDiameterPropertyDescriptions());
    map.put("PROPDESC-Ev3TouchSensor.PressedEventEnabledPropertyDescriptions", MESSAGES.Ev3TouchSensor__PressedEventEnabledPropertyDescriptions());
    map.put("PROPDESC-Ev3UltrasonicSensor.AboveRangeEventEnabledPropertyDescriptions", MESSAGES.Ev3UltrasonicSensor__AboveRangeEventEnabledPropertyDescriptions());
    map.put("PROPDESC-Ev3UltrasonicSensor.BelowRangeEventEnabledPropertyDescriptions", MESSAGES.Ev3UltrasonicSensor__BelowRangeEventEnabledPropertyDescriptions());
    map.put("PROPDESC-Ev3UltrasonicSensor.WithinRangeEventEnabledPropertyDescriptions", MESSAGES.Ev3UltrasonicSensor__WithinRangeEventEnabledPropertyDescriptions());
    map.put("PROPDESC-ExponentialBasePropertyDescriptions", MESSAGES.ExponentialBasePropertyDescriptions());
    map.put("PROPDESC-ExponentialCoefficientPropertyDescriptions", MESSAGES.ExponentialCoefficientPropertyDescriptions());
    map.put("PROPDESC-ExtendMovesOutsideCanvasPropertyDescriptions", MESSAGES.ExtendMovesOutsideCanvasPropertyDescriptions());
    map.put("PROPDESC-ExtendPropertyDescriptions", MESSAGES.ExtendPropertyDescriptions());
    map.put("PROPDESC-ExtraKeyPropertyDescriptions", MESSAGES.ExtraKeyPropertyDescriptions());
    map.put("PROPDESC-ExtraValuePropertyDescriptions", MESSAGES.ExtraValuePropertyDescriptions());
    map.put("PROPDESC-ExtrasPropertyDescriptions", MESSAGES.ExtrasPropertyDescriptions());
    map.put("PROPDESC-FeatureCollection.FeaturesPropertyDescriptions", MESSAGES.FeatureCollection__FeaturesPropertyDescriptions());
    map.put("PROPDESC-FeatureCollection.HeightPercentPropertyDescriptions", MESSAGES.FeatureCollection__HeightPercentPropertyDescriptions());
    map.put("PROPDESC-FeatureCollection.HeightPropertyDescriptions", MESSAGES.FeatureCollection__HeightPropertyDescriptions());
    map.put("PROPDESC-FeatureCollection.SourcePropertyDescriptions", MESSAGES.FeatureCollection__SourcePropertyDescriptions());
    map.put("PROPDESC-FeatureCollection.VisiblePropertyDescriptions", MESSAGES.FeatureCollection__VisiblePropertyDescriptions());
    map.put("PROPDESC-FeatureCollection.WidthPercentPropertyDescriptions", MESSAGES.FeatureCollection__WidthPercentPropertyDescriptions());
    map.put("PROPDESC-FeatureCollection.WidthPropertyDescriptions", MESSAGES.FeatureCollection__WidthPropertyDescriptions());
    map.put("PROPDESC-FeaturesFromGeoJSONPropertyDescriptions", MESSAGES.FeaturesFromGeoJSONPropertyDescriptions());
    map.put("PROPDESC-FilePicker.ActionPropertyDescriptions", MESSAGES.FilePicker__ActionPropertyDescriptions());
    map.put("PROPDESC-FilePicker.BackgroundColorPropertyDescriptions", MESSAGES.FilePicker__BackgroundColorPropertyDescriptions());
    map.put("PROPDESC-FilePicker.EnabledPropertyDescriptions", MESSAGES.FilePicker__EnabledPropertyDescriptions());
    map.put("PROPDESC-FilePicker.FontBoldPropertyDescriptions", MESSAGES.FilePicker__FontBoldPropertyDescriptions());
    map.put("PROPDESC-FilePicker.FontItalicPropertyDescriptions", MESSAGES.FilePicker__FontItalicPropertyDescriptions());
    map.put("PROPDESC-FilePicker.FontSizePropertyDescriptions", MESSAGES.FilePicker__FontSizePropertyDescriptions());
    map.put("PROPDESC-FilePicker.FontTypefacePropertyDescriptions", MESSAGES.FilePicker__FontTypefacePropertyDescriptions());
    map.put("PROPDESC-FilePicker.HeightPercentPropertyDescriptions", MESSAGES.FilePicker__HeightPercentPropertyDescriptions());
    map.put("PROPDESC-FilePicker.HeightPropertyDescriptions", MESSAGES.FilePicker__HeightPropertyDescriptions());
    map.put("PROPDESC-FilePicker.ImagePropertyDescriptions", MESSAGES.FilePicker__ImagePropertyDescriptions());
    map.put("PROPDESC-FilePicker.SelectionPropertyDescriptions", MESSAGES.FilePicker__SelectionPropertyDescriptions());
    map.put("PROPDESC-FilePicker.ShapePropertyDescriptions", MESSAGES.FilePicker__ShapePropertyDescriptions());
    map.put("PROPDESC-FilePicker.ShowFeedbackPropertyDescriptions", MESSAGES.FilePicker__ShowFeedbackPropertyDescriptions());
    map.put("PROPDESC-FilePicker.TextAlignmentPropertyDescriptions", MESSAGES.FilePicker__TextAlignmentPropertyDescriptions());
    map.put("PROPDESC-FilePicker.TextColorPropertyDescriptions", MESSAGES.FilePicker__TextColorPropertyDescriptions());
    map.put("PROPDESC-FilePicker.TextPropertyDescriptions", MESSAGES.FilePicker__TextPropertyDescriptions());
    map.put("PROPDESC-FilePicker.VisiblePropertyDescriptions", MESSAGES.FilePicker__VisiblePropertyDescriptions());
    map.put("PROPDESC-FilePicker.WidthPercentPropertyDescriptions", MESSAGES.FilePicker__WidthPercentPropertyDescriptions());
    map.put("PROPDESC-FilePicker.WidthPropertyDescriptions", MESSAGES.FilePicker__WidthPropertyDescriptions());
    map.put("PROPDESC-File.LegacyModePropertyDescriptions", MESSAGES.File__LegacyModePropertyDescriptions());
    map.put("PROPDESC-FillOpacityPropertyDescriptions", MESSAGES.FillOpacityPropertyDescriptions());
    map.put("PROPDESC-FirebaseTokenPropertyDescriptions", MESSAGES.FirebaseTokenPropertyDescriptions());
    map.put("PROPDESC-FirebaseURLPropertyDescriptions", MESSAGES.FirebaseURLPropertyDescriptions());
    map.put("PROPDESC-FollowLinksPropertyDescriptions", MESSAGES.FollowLinksPropertyDescriptions());
    map.put("PROPDESC-FollowersPropertyDescriptions", MESSAGES.FollowersPropertyDescriptions());
    map.put("PROPDESC-FontSizeDetailPropertyDescriptions", MESSAGES.FontSizeDetailPropertyDescriptions());
    map.put("PROPDESC-FontTypefaceDetailPropertyDescriptions", MESSAGES.FontTypefaceDetailPropertyDescriptions());
    map.put("PROPDESC-FriendTimelinePropertyDescriptions", MESSAGES.FriendTimelinePropertyDescriptions());
    map.put("PROPDESC-FullScreenPropertyDescriptions", MESSAGES.FullScreenPropertyDescriptions());
    map.put("PROPDESC-FusiontablesControl.ApiKeyPropertyDescriptions", MESSAGES.FusiontablesControl__ApiKeyPropertyDescriptions());
    map.put("PROPDESC-GameClient.ServiceURLPropertyDescriptions", MESSAGES.GameClient__ServiceURLPropertyDescriptions());
    map.put("PROPDESC-GameClient.UserEmailAddressPropertyDescriptions", MESSAGES.GameClient__UserEmailAddressPropertyDescriptions());
    map.put("PROPDESC-GameIdPropertyDescriptions", MESSAGES.GameIdPropertyDescriptions());
    map.put("PROPDESC-GenerateColorPropertyDescriptions", MESSAGES.GenerateColorPropertyDescriptions());
    map.put("PROPDESC-GenerateLightPropertyDescriptions", MESSAGES.GenerateLightPropertyDescriptions());
    map.put("PROPDESC-GoogleVoiceEnabledPropertyDescriptions", MESSAGES.GoogleVoiceEnabledPropertyDescriptions());
    map.put("PROPDESC-GridEnabledPropertyDescriptions", MESSAGES.GridEnabledPropertyDescriptions());
    map.put("PROPDESC-GyroscopeSensor.AvailablePropertyDescriptions", MESSAGES.GyroscopeSensor__AvailablePropertyDescriptions());
    map.put("PROPDESC-GyroscopeSensor.EnabledPropertyDescriptions", MESSAGES.GyroscopeSensor__EnabledPropertyDescriptions());
    map.put("PROPDESC-HTMLContentPropertyDescriptions", MESSAGES.HTMLContentPropertyDescriptions());
    map.put("PROPDESC-HTMLFormatPropertyDescriptions", MESSAGES.HTMLFormatPropertyDescriptions());
    map.put("PROPDESC-HasAccuracyPropertyDescriptions", MESSAGES.HasAccuracyPropertyDescriptions());
    map.put("PROPDESC-HasAltitudePropertyDescriptions", MESSAGES.HasAltitudePropertyDescriptions());
    map.put("PROPDESC-HasLongitudeLatitudePropertyDescriptions", MESSAGES.HasLongitudeLatitudePropertyDescriptions());
    map.put("PROPDESC-HasMarginsPropertyDescriptions", MESSAGES.HasMarginsPropertyDescriptions());
    map.put("PROPDESC-HighByteFirstPropertyDescriptions", MESSAGES.HighByteFirstPropertyDescriptions());
    map.put("PROPDESC-HighContrastPropertyDescriptions", MESSAGES.HighContrastPropertyDescriptions());
    map.put("PROPDESC-HintTextPropertyDescriptions", MESSAGES.HintTextPropertyDescriptions());
    map.put("PROPDESC-HolePointsFromStringPropertyDescriptions", MESSAGES.HolePointsFromStringPropertyDescriptions());
    map.put("PROPDESC-HolePointsPropertyDescriptions", MESSAGES.HolePointsPropertyDescriptions());
    map.put("PROPDESC-HomeUrlPropertyDescriptions", MESSAGES.HomeUrlPropertyDescriptions());
    map.put("PROPDESC-HorizontalArrangement.AlignHorizontalPropertyDescriptions", MESSAGES.HorizontalArrangement__AlignHorizontalPropertyDescriptions());
    map.put("PROPDESC-HorizontalArrangement.AlignVerticalPropertyDescriptions", MESSAGES.HorizontalArrangement__AlignVerticalPropertyDescriptions());
    map.put("PROPDESC-HorizontalArrangement.BackgroundColorPropertyDescriptions", MESSAGES.HorizontalArrangement__BackgroundColorPropertyDescriptions());
    map.put("PROPDESC-HorizontalArrangement.HeightPercentPropertyDescriptions", MESSAGES.HorizontalArrangement__HeightPercentPropertyDescriptions());
    map.put("PROPDESC-HorizontalArrangement.HeightPropertyDescriptions", MESSAGES.HorizontalArrangement__HeightPropertyDescriptions());
    map.put("PROPDESC-HorizontalArrangement.ImagePropertyDescriptions", MESSAGES.HorizontalArrangement__ImagePropertyDescriptions());
    map.put("PROPDESC-HorizontalArrangement.VisiblePropertyDescriptions", MESSAGES.HorizontalArrangement__VisiblePropertyDescriptions());
    map.put("PROPDESC-HorizontalArrangement.WidthPercentPropertyDescriptions", MESSAGES.HorizontalArrangement__WidthPercentPropertyDescriptions());
    map.put("PROPDESC-HorizontalArrangement.WidthPropertyDescriptions", MESSAGES.HorizontalArrangement__WidthPropertyDescriptions());
    map.put("PROPDESC-HorizontalScrollArrangement.AlignHorizontalPropertyDescriptions", MESSAGES.HorizontalScrollArrangement__AlignHorizontalPropertyDescriptions());
    map.put("PROPDESC-HorizontalScrollArrangement.AlignVerticalPropertyDescriptions", MESSAGES.HorizontalScrollArrangement__AlignVerticalPropertyDescriptions());
    map.put("PROPDESC-HorizontalScrollArrangement.BackgroundColorPropertyDescriptions", MESSAGES.HorizontalScrollArrangement__BackgroundColorPropertyDescriptions());
    map.put("PROPDESC-HorizontalScrollArrangement.HeightPercentPropertyDescriptions", MESSAGES.HorizontalScrollArrangement__HeightPercentPropertyDescriptions());
    map.put("PROPDESC-HorizontalScrollArrangement.HeightPropertyDescriptions", MESSAGES.HorizontalScrollArrangement__HeightPropertyDescriptions());
    map.put("PROPDESC-HorizontalScrollArrangement.ImagePropertyDescriptions", MESSAGES.HorizontalScrollArrangement__ImagePropertyDescriptions());
    map.put("PROPDESC-HorizontalScrollArrangement.VisiblePropertyDescriptions", MESSAGES.HorizontalScrollArrangement__VisiblePropertyDescriptions());
    map.put("PROPDESC-HorizontalScrollArrangement.WidthPercentPropertyDescriptions", MESSAGES.HorizontalScrollArrangement__WidthPercentPropertyDescriptions());
    map.put("PROPDESC-HorizontalScrollArrangement.WidthPropertyDescriptions", MESSAGES.HorizontalScrollArrangement__WidthPropertyDescriptions());
    map.put("PROPDESC-HourPropertyDescriptions", MESSAGES.HourPropertyDescriptions());
    map.put("PROPDESC-HumidityPropertyDescriptions", MESSAGES.HumidityPropertyDescriptions());
    map.put("PROPDESC-Hygrometer.AvailablePropertyDescriptions", MESSAGES.Hygrometer__AvailablePropertyDescriptions());
    map.put("PROPDESC-Hygrometer.EnabledPropertyDescriptions", MESSAGES.Hygrometer__EnabledPropertyDescriptions());
    map.put("PROPDESC-IconPropertyDescriptions", MESSAGES.IconPropertyDescriptions());
    map.put("PROPDESC-IgnoreSslErrorsPropertyDescriptions", MESSAGES.IgnoreSslErrorsPropertyDescriptions());
    map.put("PROPDESC-ImageAssetPropertyDescriptions", MESSAGES.ImageAssetPropertyDescriptions());
    map.put("PROPDESC-ImageBot.ApiKeyPropertyDescriptions", MESSAGES.ImageBot__ApiKeyPropertyDescriptions());
    map.put("PROPDESC-ImageBot.TokenPropertyDescriptions", MESSAGES.ImageBot__TokenPropertyDescriptions());
    map.put("PROPDESC-ImageHeightPropertyDescriptions", MESSAGES.ImageHeightPropertyDescriptions());
    map.put("PROPDESC-ImagePicker.BackgroundColorPropertyDescriptions", MESSAGES.ImagePicker__BackgroundColorPropertyDescriptions());
    map.put("PROPDESC-ImagePicker.EnabledPropertyDescriptions", MESSAGES.ImagePicker__EnabledPropertyDescriptions());
    map.put("PROPDESC-ImagePicker.FontBoldPropertyDescriptions", MESSAGES.ImagePicker__FontBoldPropertyDescriptions());
    map.put("PROPDESC-ImagePicker.FontItalicPropertyDescriptions", MESSAGES.ImagePicker__FontItalicPropertyDescriptions());
    map.put("PROPDESC-ImagePicker.FontSizePropertyDescriptions", MESSAGES.ImagePicker__FontSizePropertyDescriptions());
    map.put("PROPDESC-ImagePicker.FontTypefacePropertyDescriptions", MESSAGES.ImagePicker__FontTypefacePropertyDescriptions());
    map.put("PROPDESC-ImagePicker.HeightPercentPropertyDescriptions", MESSAGES.ImagePicker__HeightPercentPropertyDescriptions());
    map.put("PROPDESC-ImagePicker.HeightPropertyDescriptions", MESSAGES.ImagePicker__HeightPropertyDescriptions());
    map.put("PROPDESC-ImagePicker.ImagePropertyDescriptions", MESSAGES.ImagePicker__ImagePropertyDescriptions());
    map.put("PROPDESC-ImagePicker.SelectionPropertyDescriptions", MESSAGES.ImagePicker__SelectionPropertyDescriptions());
    map.put("PROPDESC-ImagePicker.ShapePropertyDescriptions", MESSAGES.ImagePicker__ShapePropertyDescriptions());
    map.put("PROPDESC-ImagePicker.ShowFeedbackPropertyDescriptions", MESSAGES.ImagePicker__ShowFeedbackPropertyDescriptions());
    map.put("PROPDESC-ImagePicker.TextAlignmentPropertyDescriptions", MESSAGES.ImagePicker__TextAlignmentPropertyDescriptions());
    map.put("PROPDESC-ImagePicker.TextColorPropertyDescriptions", MESSAGES.ImagePicker__TextColorPropertyDescriptions());
    map.put("PROPDESC-ImagePicker.TextPropertyDescriptions", MESSAGES.ImagePicker__TextPropertyDescriptions());
    map.put("PROPDESC-ImagePicker.VisiblePropertyDescriptions", MESSAGES.ImagePicker__VisiblePropertyDescriptions());
    map.put("PROPDESC-ImagePicker.WidthPercentPropertyDescriptions", MESSAGES.ImagePicker__WidthPercentPropertyDescriptions());
    map.put("PROPDESC-ImagePicker.WidthPropertyDescriptions", MESSAGES.ImagePicker__WidthPropertyDescriptions());
    map.put("PROPDESC-ImageSprite.EnabledPropertyDescriptions", MESSAGES.ImageSprite__EnabledPropertyDescriptions());
    map.put("PROPDESC-ImageSprite.HeadingPropertyDescriptions", MESSAGES.ImageSprite__HeadingPropertyDescriptions());
    map.put("PROPDESC-ImageSprite.HeightPropertyDescriptions", MESSAGES.ImageSprite__HeightPropertyDescriptions());
    map.put("PROPDESC-ImageSprite.IntervalPropertyDescriptions", MESSAGES.ImageSprite__IntervalPropertyDescriptions());
    map.put("PROPDESC-ImageSprite.PicturePropertyDescriptions", MESSAGES.ImageSprite__PicturePropertyDescriptions());
    map.put("PROPDESC-ImageSprite.SpeedPropertyDescriptions", MESSAGES.ImageSprite__SpeedPropertyDescriptions());
    map.put("PROPDESC-ImageSprite.VisiblePropertyDescriptions", MESSAGES.ImageSprite__VisiblePropertyDescriptions());
    map.put("PROPDESC-ImageSprite.WidthPropertyDescriptions", MESSAGES.ImageSprite__WidthPropertyDescriptions());
    map.put("PROPDESC-ImageSprite.XPropertyDescriptions", MESSAGES.ImageSprite__XPropertyDescriptions());
    map.put("PROPDESC-ImageSprite.YPropertyDescriptions", MESSAGES.ImageSprite__YPropertyDescriptions());
    map.put("PROPDESC-ImageSprite.ZPropertyDescriptions", MESSAGES.ImageSprite__ZPropertyDescriptions());
    map.put("PROPDESC-ImageWidthPropertyDescriptions", MESSAGES.ImageWidthPropertyDescriptions());
    map.put("PROPDESC-Image.HeightPercentPropertyDescriptions", MESSAGES.Image__HeightPercentPropertyDescriptions());
    map.put("PROPDESC-Image.HeightPropertyDescriptions", MESSAGES.Image__HeightPropertyDescriptions());
    map.put("PROPDESC-Image.PicturePropertyDescriptions", MESSAGES.Image__PicturePropertyDescriptions());
    map.put("PROPDESC-Image.VisiblePropertyDescriptions", MESSAGES.Image__VisiblePropertyDescriptions());
    map.put("PROPDESC-Image.WidthPercentPropertyDescriptions", MESSAGES.Image__WidthPercentPropertyDescriptions());
    map.put("PROPDESC-Image.WidthPropertyDescriptions", MESSAGES.Image__WidthPropertyDescriptions());
    map.put("PROPDESC-IndeterminateColorPropertyDescriptions", MESSAGES.IndeterminateColorPropertyDescriptions());
    map.put("PROPDESC-IndeterminatePropertyDescriptions", MESSAGES.IndeterminatePropertyDescriptions());
    map.put("PROPDESC-InstanceIdPropertyDescriptions", MESSAGES.InstanceIdPropertyDescriptions());
    map.put("PROPDESC-InvertMaskPropertyDescriptions", MESSAGES.InvertMaskPropertyDescriptions());
    map.put("PROPDESC-InvitedInstancesPropertyDescriptions", MESSAGES.InvitedInstancesPropertyDescriptions());
    map.put("PROPDESC-IsAcceptingPropertyDescriptions", MESSAGES.IsAcceptingPropertyDescriptions());
    map.put("PROPDESC-IsConnectedPropertyDescriptions", MESSAGES.IsConnectedPropertyDescriptions());
    map.put("PROPDESC-IsInitializedPropertyDescriptions", MESSAGES.IsInitializedPropertyDescriptions());
    map.put("PROPDESC-IsOpenPropertyDescriptions", MESSAGES.IsOpenPropertyDescriptions());
    map.put("PROPDESC-IsPlayingPropertyDescriptions", MESSAGES.IsPlayingPropertyDescriptions());
    map.put("PROPDESC-ItemBackgroundColorPropertyDescriptions", MESSAGES.ItemBackgroundColorPropertyDescriptions());
    map.put("PROPDESC-ItemTextColorPropertyDescriptions", MESSAGES.ItemTextColorPropertyDescriptions());
    map.put("PROPDESC-JoinedInstancesPropertyDescriptions", MESSAGES.JoinedInstancesPropertyDescriptions());
    map.put("PROPDESC-KeepRunningWhenOnPausePropertyDescriptions", MESSAGES.KeepRunningWhenOnPausePropertyDescriptions());
    map.put("PROPDESC-KeyFilePropertyDescriptions", MESSAGES.KeyFilePropertyDescriptions());
    map.put("PROPDESC-LabelPropertyDescriptions", MESSAGES.LabelPropertyDescriptions());
    map.put("PROPDESC-Label.BackgroundColorPropertyDescriptions", MESSAGES.Label__BackgroundColorPropertyDescriptions());
    map.put("PROPDESC-Label.FontBoldPropertyDescriptions", MESSAGES.Label__FontBoldPropertyDescriptions());
    map.put("PROPDESC-Label.FontItalicPropertyDescriptions", MESSAGES.Label__FontItalicPropertyDescriptions());
    map.put("PROPDESC-Label.FontSizePropertyDescriptions", MESSAGES.Label__FontSizePropertyDescriptions());
    map.put("PROPDESC-Label.FontTypefacePropertyDescriptions", MESSAGES.Label__FontTypefacePropertyDescriptions());
    map.put("PROPDESC-Label.HeightPercentPropertyDescriptions", MESSAGES.Label__HeightPercentPropertyDescriptions());
    map.put("PROPDESC-Label.HeightPropertyDescriptions", MESSAGES.Label__HeightPropertyDescriptions());
    map.put("PROPDESC-Label.TextAlignmentPropertyDescriptions", MESSAGES.Label__TextAlignmentPropertyDescriptions());
    map.put("PROPDESC-Label.TextColorPropertyDescriptions", MESSAGES.Label__TextColorPropertyDescriptions());
    map.put("PROPDESC-Label.TextPropertyDescriptions", MESSAGES.Label__TextPropertyDescriptions());
    map.put("PROPDESC-Label.VisiblePropertyDescriptions", MESSAGES.Label__VisiblePropertyDescriptions());
    map.put("PROPDESC-Label.WidthPercentPropertyDescriptions", MESSAGES.Label__WidthPercentPropertyDescriptions());
    map.put("PROPDESC-Label.WidthPropertyDescriptions", MESSAGES.Label__WidthPropertyDescriptions());
    map.put("PROPDESC-LabelsFromStringPropertyDescriptions", MESSAGES.LabelsFromStringPropertyDescriptions());
    map.put("PROPDESC-LabelsPropertyDescriptions", MESSAGES.LabelsPropertyDescriptions());
    map.put("PROPDESC-LastMessagePropertyDescriptions", MESSAGES.LastMessagePropertyDescriptions());
    map.put("PROPDESC-LeaderPropertyDescriptions", MESSAGES.LeaderPropertyDescriptions());
    map.put("PROPDESC-LeftPropertyDescriptions", MESSAGES.LeftPropertyDescriptions());
    map.put("PROPDESC-LegendEnabledPropertyDescriptions", MESSAGES.LegendEnabledPropertyDescriptions());
    map.put("PROPDESC-LightSensor.AvailablePropertyDescriptions", MESSAGES.LightSensor__AvailablePropertyDescriptions());
    map.put("PROPDESC-LightSensor.EnabledPropertyDescriptions", MESSAGES.LightSensor__EnabledPropertyDescriptions());
    map.put("PROPDESC-LineString.DescriptionPropertyDescriptions", MESSAGES.LineString__DescriptionPropertyDescriptions());
    map.put("PROPDESC-LineString.DraggablePropertyDescriptions", MESSAGES.LineString__DraggablePropertyDescriptions());
    map.put("PROPDESC-LineString.EnableInfoboxPropertyDescriptions", MESSAGES.LineString__EnableInfoboxPropertyDescriptions());
    map.put("PROPDESC-LineString.PointsFromStringPropertyDescriptions", MESSAGES.LineString__PointsFromStringPropertyDescriptions());
    map.put("PROPDESC-LineString.PointsPropertyDescriptions", MESSAGES.LineString__PointsPropertyDescriptions());
    map.put("PROPDESC-LineString.StrokeColorPropertyDescriptions", MESSAGES.LineString__StrokeColorPropertyDescriptions());
    map.put("PROPDESC-LineString.StrokeWidthPropertyDescriptions", MESSAGES.LineString__StrokeWidthPropertyDescriptions());
    map.put("PROPDESC-LineString.TitlePropertyDescriptions", MESSAGES.LineString__TitlePropertyDescriptions());
    map.put("PROPDESC-LineString.TypePropertyDescriptions", MESSAGES.LineString__TypePropertyDescriptions());
    map.put("PROPDESC-LineString.VisiblePropertyDescriptions", MESSAGES.LineString__VisiblePropertyDescriptions());
    map.put("PROPDESC-LineTypePropertyDescriptions", MESSAGES.LineTypePropertyDescriptions());
    map.put("PROPDESC-LineWidthPropertyDescriptions", MESSAGES.LineWidthPropertyDescriptions());
    map.put("PROPDESC-LinearCoefficientPropertyDescriptions", MESSAGES.LinearCoefficientPropertyDescriptions());
    map.put("PROPDESC-LinearProgress.VisiblePropertyDescriptions", MESSAGES.LinearProgress__VisiblePropertyDescriptions());
    map.put("PROPDESC-LinearProgress.WidthPercentPropertyDescriptions", MESSAGES.LinearProgress__WidthPercentPropertyDescriptions());
    map.put("PROPDESC-LinearProgress.WidthPropertyDescriptions", MESSAGES.LinearProgress__WidthPropertyDescriptions());
    map.put("PROPDESC-ListDataPropertyDescriptions", MESSAGES.ListDataPropertyDescriptions());
    map.put("PROPDESC-ListPicker.BackgroundColorPropertyDescriptions", MESSAGES.ListPicker__BackgroundColorPropertyDescriptions());
    map.put("PROPDESC-ListPicker.ElementsFromStringPropertyDescriptions", MESSAGES.ListPicker__ElementsFromStringPropertyDescriptions());
    map.put("PROPDESC-ListPicker.ElementsPropertyDescriptions", MESSAGES.ListPicker__ElementsPropertyDescriptions());
    map.put("PROPDESC-ListPicker.EnabledPropertyDescriptions", MESSAGES.ListPicker__EnabledPropertyDescriptions());
    map.put("PROPDESC-ListPicker.FontBoldPropertyDescriptions", MESSAGES.ListPicker__FontBoldPropertyDescriptions());
    map.put("PROPDESC-ListPicker.FontItalicPropertyDescriptions", MESSAGES.ListPicker__FontItalicPropertyDescriptions());
    map.put("PROPDESC-ListPicker.FontSizePropertyDescriptions", MESSAGES.ListPicker__FontSizePropertyDescriptions());
    map.put("PROPDESC-ListPicker.FontTypefacePropertyDescriptions", MESSAGES.ListPicker__FontTypefacePropertyDescriptions());
    map.put("PROPDESC-ListPicker.HeightPercentPropertyDescriptions", MESSAGES.ListPicker__HeightPercentPropertyDescriptions());
    map.put("PROPDESC-ListPicker.HeightPropertyDescriptions", MESSAGES.ListPicker__HeightPropertyDescriptions());
    map.put("PROPDESC-ListPicker.ImagePropertyDescriptions", MESSAGES.ListPicker__ImagePropertyDescriptions());
    map.put("PROPDESC-ListPicker.SelectionIndexPropertyDescriptions", MESSAGES.ListPicker__SelectionIndexPropertyDescriptions());
    map.put("PROPDESC-ListPicker.SelectionPropertyDescriptions", MESSAGES.ListPicker__SelectionPropertyDescriptions());
    map.put("PROPDESC-ListPicker.ShapePropertyDescriptions", MESSAGES.ListPicker__ShapePropertyDescriptions());
    map.put("PROPDESC-ListPicker.ShowFeedbackPropertyDescriptions", MESSAGES.ListPicker__ShowFeedbackPropertyDescriptions());
    map.put("PROPDESC-ListPicker.ShowFilterBarPropertyDescriptions", MESSAGES.ListPicker__ShowFilterBarPropertyDescriptions());
    map.put("PROPDESC-ListPicker.TextAlignmentPropertyDescriptions", MESSAGES.ListPicker__TextAlignmentPropertyDescriptions());
    map.put("PROPDESC-ListPicker.TextColorPropertyDescriptions", MESSAGES.ListPicker__TextColorPropertyDescriptions());
    map.put("PROPDESC-ListPicker.TextPropertyDescriptions", MESSAGES.ListPicker__TextPropertyDescriptions());
    map.put("PROPDESC-ListPicker.TitlePropertyDescriptions", MESSAGES.ListPicker__TitlePropertyDescriptions());
    map.put("PROPDESC-ListPicker.VisiblePropertyDescriptions", MESSAGES.ListPicker__VisiblePropertyDescriptions());
    map.put("PROPDESC-ListPicker.WidthPercentPropertyDescriptions", MESSAGES.ListPicker__WidthPercentPropertyDescriptions());
    map.put("PROPDESC-ListPicker.WidthPropertyDescriptions", MESSAGES.ListPicker__WidthPropertyDescriptions());
    map.put("PROPDESC-ListViewLayoutPropertyDescriptions", MESSAGES.ListViewLayoutPropertyDescriptions());
    map.put("PROPDESC-ListView.BackgroundColorPropertyDescriptions", MESSAGES.ListView__BackgroundColorPropertyDescriptions());
    map.put("PROPDESC-ListView.ElementsFromStringPropertyDescriptions", MESSAGES.ListView__ElementsFromStringPropertyDescriptions());
    map.put("PROPDESC-ListView.ElementsPropertyDescriptions", MESSAGES.ListView__ElementsPropertyDescriptions());
    map.put("PROPDESC-ListView.FontSizePropertyDescriptions", MESSAGES.ListView__FontSizePropertyDescriptions());
    map.put("PROPDESC-ListView.FontTypefacePropertyDescriptions", MESSAGES.ListView__FontTypefacePropertyDescriptions());
    map.put("PROPDESC-ListView.HeightPercentPropertyDescriptions", MESSAGES.ListView__HeightPercentPropertyDescriptions());
    map.put("PROPDESC-ListView.HeightPropertyDescriptions", MESSAGES.ListView__HeightPropertyDescriptions());
    map.put("PROPDESC-ListView.SelectionIndexPropertyDescriptions", MESSAGES.ListView__SelectionIndexPropertyDescriptions());
    map.put("PROPDESC-ListView.SelectionPropertyDescriptions", MESSAGES.ListView__SelectionPropertyDescriptions());
    map.put("PROPDESC-ListView.ShowFilterBarPropertyDescriptions", MESSAGES.ListView__ShowFilterBarPropertyDescriptions());
    map.put("PROPDESC-ListView.TextColorPropertyDescriptions", MESSAGES.ListView__TextColorPropertyDescriptions());
    map.put("PROPDESC-ListView.VisiblePropertyDescriptions", MESSAGES.ListView__VisiblePropertyDescriptions());
    map.put("PROPDESC-ListView.WidthPercentPropertyDescriptions", MESSAGES.ListView__WidthPercentPropertyDescriptions());
    map.put("PROPDESC-ListView.WidthPropertyDescriptions", MESSAGES.ListView__WidthPropertyDescriptions());
    map.put("PROPDESC-LoadingDialogMessagePropertyDescriptions", MESSAGES.LoadingDialogMessagePropertyDescriptions());
    map.put("PROPDESC-LocationSensorPropertyDescriptions", MESSAGES.LocationSensorPropertyDescriptions());
    map.put("PROPDESC-LocationSensor.EnabledPropertyDescriptions", MESSAGES.LocationSensor__EnabledPropertyDescriptions());
    map.put("PROPDESC-LocationSensor.LatitudePropertyDescriptions", MESSAGES.LocationSensor__LatitudePropertyDescriptions());
    map.put("PROPDESC-LocationSensor.LongitudePropertyDescriptions", MESSAGES.LocationSensor__LongitudePropertyDescriptions());
    map.put("PROPDESC-LogarithmCoefficientPropertyDescriptions", MESSAGES.LogarithmCoefficientPropertyDescriptions());
    map.put("PROPDESC-LogarithmConstantPropertyDescriptions", MESSAGES.LogarithmConstantPropertyDescriptions());
    map.put("PROPDESC-LoopPropertyDescriptions", MESSAGES.LoopPropertyDescriptions());
    map.put("PROPDESC-LuxPropertyDescriptions", MESSAGES.LuxPropertyDescriptions());
    map.put("PROPDESC-MagneticFieldSensor.AvailablePropertyDescriptions", MESSAGES.MagneticFieldSensor__AvailablePropertyDescriptions());
    map.put("PROPDESC-MagneticFieldSensor.EnabledPropertyDescriptions", MESSAGES.MagneticFieldSensor__EnabledPropertyDescriptions());
    map.put("PROPDESC-MagneticFieldSensor.MaximumRangePropertyDescriptions", MESSAGES.MagneticFieldSensor__MaximumRangePropertyDescriptions());
    map.put("PROPDESC-MagnitudePropertyDescriptions", MESSAGES.MagnitudePropertyDescriptions());
    map.put("PROPDESC-MapTypePropertyDescriptions", MESSAGES.MapTypePropertyDescriptions());
    map.put("PROPDESC-Map.FeaturesPropertyDescriptions", MESSAGES.Map__FeaturesPropertyDescriptions());
    map.put("PROPDESC-Map.HeightPercentPropertyDescriptions", MESSAGES.Map__HeightPercentPropertyDescriptions());
    map.put("PROPDESC-Map.HeightPropertyDescriptions", MESSAGES.Map__HeightPropertyDescriptions());
    map.put("PROPDESC-Map.LatitudePropertyDescriptions", MESSAGES.Map__LatitudePropertyDescriptions());
    map.put("PROPDESC-Map.LongitudePropertyDescriptions", MESSAGES.Map__LongitudePropertyDescriptions());
    map.put("PROPDESC-Map.VisiblePropertyDescriptions", MESSAGES.Map__VisiblePropertyDescriptions());
    map.put("PROPDESC-Map.WidthPercentPropertyDescriptions", MESSAGES.Map__WidthPercentPropertyDescriptions());
    map.put("PROPDESC-Map.WidthPropertyDescriptions", MESSAGES.Map__WidthPropertyDescriptions());
    map.put("PROPDESC-MarkOriginPropertyDescriptions", MESSAGES.MarkOriginPropertyDescriptions());
    map.put("PROPDESC-Marker.DescriptionPropertyDescriptions", MESSAGES.Marker__DescriptionPropertyDescriptions());
    map.put("PROPDESC-Marker.DraggablePropertyDescriptions", MESSAGES.Marker__DraggablePropertyDescriptions());
    map.put("PROPDESC-Marker.EnableInfoboxPropertyDescriptions", MESSAGES.Marker__EnableInfoboxPropertyDescriptions());
    map.put("PROPDESC-Marker.FillColorPropertyDescriptions", MESSAGES.Marker__FillColorPropertyDescriptions());
    map.put("PROPDESC-Marker.HeightPercentPropertyDescriptions", MESSAGES.Marker__HeightPercentPropertyDescriptions());
    map.put("PROPDESC-Marker.HeightPropertyDescriptions", MESSAGES.Marker__HeightPropertyDescriptions());
    map.put("PROPDESC-Marker.LatitudePropertyDescriptions", MESSAGES.Marker__LatitudePropertyDescriptions());
    map.put("PROPDESC-Marker.LongitudePropertyDescriptions", MESSAGES.Marker__LongitudePropertyDescriptions());
    map.put("PROPDESC-Marker.StrokeColorPropertyDescriptions", MESSAGES.Marker__StrokeColorPropertyDescriptions());
    map.put("PROPDESC-Marker.StrokeWidthPropertyDescriptions", MESSAGES.Marker__StrokeWidthPropertyDescriptions());
    map.put("PROPDESC-Marker.TitlePropertyDescriptions", MESSAGES.Marker__TitlePropertyDescriptions());
    map.put("PROPDESC-Marker.TypePropertyDescriptions", MESSAGES.Marker__TypePropertyDescriptions());
    map.put("PROPDESC-Marker.VisiblePropertyDescriptions", MESSAGES.Marker__VisiblePropertyDescriptions());
    map.put("PROPDESC-Marker.WidthPercentPropertyDescriptions", MESSAGES.Marker__WidthPercentPropertyDescriptions());
    map.put("PROPDESC-Marker.WidthPropertyDescriptions", MESSAGES.Marker__WidthPropertyDescriptions());
    map.put("PROPDESC-MaxValuePropertyDescriptions", MESSAGES.MaxValuePropertyDescriptions());
    map.put("PROPDESC-MaximumPropertyDescriptions", MESSAGES.MaximumPropertyDescriptions());
    map.put("PROPDESC-MediaStore.ServiceURLPropertyDescriptions", MESSAGES.MediaStore__ServiceURLPropertyDescriptions());
    map.put("PROPDESC-MentionsPropertyDescriptions", MESSAGES.MentionsPropertyDescriptions());
    map.put("PROPDESC-MessagePropertyDescriptions", MESSAGES.MessagePropertyDescriptions());
    map.put("PROPDESC-MimeTypePropertyDescriptions", MESSAGES.MimeTypePropertyDescriptions());
    map.put("PROPDESC-MinValuePropertyDescriptions", MESSAGES.MinValuePropertyDescriptions());
    map.put("PROPDESC-MinimumPropertyDescriptions", MESSAGES.MinimumPropertyDescriptions());
    map.put("PROPDESC-MinutePropertyDescriptions", MESSAGES.MinutePropertyDescriptions());
    map.put("PROPDESC-ModePropertyDescriptions", MESSAGES.ModePropertyDescriptions());
    map.put("PROPDESC-MonthInTextPropertyDescriptions", MESSAGES.MonthInTextPropertyDescriptions());
    map.put("PROPDESC-MonthPropertyDescriptions", MESSAGES.MonthPropertyDescriptions());
    map.put("PROPDESC-MotorPortsPropertyDescriptions", MESSAGES.MotorPortsPropertyDescriptions());
    map.put("PROPDESC-MovingPropertyDescriptions", MESSAGES.MovingPropertyDescriptions());
    map.put("PROPDESC-MultiLinePropertyDescriptions", MESSAGES.MultiLinePropertyDescriptions());
    map.put("PROPDESC-NSBluetoothAlwaysUsageDescriptionPropertyDescriptions", MESSAGES.NSBluetoothAlwaysUsageDescriptionPropertyDescriptions());
    map.put("PROPDESC-NSBluetoothPeripheralUsageDescriptionPropertyDescriptions", MESSAGES.NSBluetoothPeripheralUsageDescriptionPropertyDescriptions());
    map.put("PROPDESC-NSCameraUsageDescriptionPropertyDescriptions", MESSAGES.NSCameraUsageDescriptionPropertyDescriptions());
    map.put("PROPDESC-NSContactsUsageDescriptionPropertyDescriptions", MESSAGES.NSContactsUsageDescriptionPropertyDescriptions());
    map.put("PROPDESC-NSLocationWhenInUseUsageDescriptionPropertyDescriptions", MESSAGES.NSLocationWhenInUseUsageDescriptionPropertyDescriptions());
    map.put("PROPDESC-NSMicrophoneUsageDescriptionPropertyDescriptions", MESSAGES.NSMicrophoneUsageDescriptionPropertyDescriptions());
    map.put("PROPDESC-NSSpeechRecognitionUsageDescriptionPropertyDescriptions", MESSAGES.NSSpeechRecognitionUsageDescriptionPropertyDescriptions());
    map.put("PROPDESC-NamespacePropertyDescriptions", MESSAGES.NamespacePropertyDescriptions());
    map.put("PROPDESC-Navigation.ApiKeyPropertyDescriptions", MESSAGES.Navigation__ApiKeyPropertyDescriptions());
    map.put("PROPDESC-Navigation.LanguagePropertyDescriptions", MESSAGES.Navigation__LanguagePropertyDescriptions());
    map.put("PROPDESC-Navigation.ServiceURLPropertyDescriptions", MESSAGES.Navigation__ServiceURLPropertyDescriptions());
    map.put("PROPDESC-NoLocationNeededPropertyDescriptions", MESSAGES.NoLocationNeededPropertyDescriptions());
    map.put("PROPDESC-NorthLatitudePropertyDescriptions", MESSAGES.NorthLatitudePropertyDescriptions());
    map.put("PROPDESC-NotifierLengthPropertyDescriptions", MESSAGES.NotifierLengthPropertyDescriptions());
    map.put("PROPDESC-Notifier.BackgroundColorPropertyDescriptions", MESSAGES.Notifier__BackgroundColorPropertyDescriptions());
    map.put("PROPDESC-Notifier.TextColorPropertyDescriptions", MESSAGES.Notifier__TextColorPropertyDescriptions());
    map.put("PROPDESC-NumberOfStepsPropertyDescriptions", MESSAGES.NumberOfStepsPropertyDescriptions());
    map.put("PROPDESC-NxtColorSensor.AboveRangeEventEnabledPropertyDescriptions", MESSAGES.NxtColorSensor__AboveRangeEventEnabledPropertyDescriptions());
    map.put("PROPDESC-NxtColorSensor.BelowRangeEventEnabledPropertyDescriptions", MESSAGES.NxtColorSensor__BelowRangeEventEnabledPropertyDescriptions());
    map.put("PROPDESC-NxtColorSensor.ColorChangedEventEnabledPropertyDescriptions", MESSAGES.NxtColorSensor__ColorChangedEventEnabledPropertyDescriptions());
    map.put("PROPDESC-NxtColorSensor.WithinRangeEventEnabledPropertyDescriptions", MESSAGES.NxtColorSensor__WithinRangeEventEnabledPropertyDescriptions());
    map.put("PROPDESC-NxtDrive.StopBeforeDisconnectPropertyDescriptions", MESSAGES.NxtDrive__StopBeforeDisconnectPropertyDescriptions());
    map.put("PROPDESC-NxtDrive.WheelDiameterPropertyDescriptions", MESSAGES.NxtDrive__WheelDiameterPropertyDescriptions());
    map.put("PROPDESC-NxtLightSensor.AboveRangeEventEnabledPropertyDescriptions", MESSAGES.NxtLightSensor__AboveRangeEventEnabledPropertyDescriptions());
    map.put("PROPDESC-NxtLightSensor.BelowRangeEventEnabledPropertyDescriptions", MESSAGES.NxtLightSensor__BelowRangeEventEnabledPropertyDescriptions());
    map.put("PROPDESC-NxtLightSensor.WithinRangeEventEnabledPropertyDescriptions", MESSAGES.NxtLightSensor__WithinRangeEventEnabledPropertyDescriptions());
    map.put("PROPDESC-NxtSoundSensor.AboveRangeEventEnabledPropertyDescriptions", MESSAGES.NxtSoundSensor__AboveRangeEventEnabledPropertyDescriptions());
    map.put("PROPDESC-NxtSoundSensor.BelowRangeEventEnabledPropertyDescriptions", MESSAGES.NxtSoundSensor__BelowRangeEventEnabledPropertyDescriptions());
    map.put("PROPDESC-NxtSoundSensor.WithinRangeEventEnabledPropertyDescriptions", MESSAGES.NxtSoundSensor__WithinRangeEventEnabledPropertyDescriptions());
    map.put("PROPDESC-NxtTouchSensor.PressedEventEnabledPropertyDescriptions", MESSAGES.NxtTouchSensor__PressedEventEnabledPropertyDescriptions());
    map.put("PROPDESC-NxtUltrasonicSensor.AboveRangeEventEnabledPropertyDescriptions", MESSAGES.NxtUltrasonicSensor__AboveRangeEventEnabledPropertyDescriptions());
    map.put("PROPDESC-NxtUltrasonicSensor.BelowRangeEventEnabledPropertyDescriptions", MESSAGES.NxtUltrasonicSensor__BelowRangeEventEnabledPropertyDescriptions());
    map.put("PROPDESC-NxtUltrasonicSensor.WithinRangeEventEnabledPropertyDescriptions", MESSAGES.NxtUltrasonicSensor__WithinRangeEventEnabledPropertyDescriptions());
    map.put("PROPDESC-OnPropertyDescriptions", MESSAGES.OnPropertyDescriptions());
    map.put("PROPDESC-OpenScreenAnimationPropertyDescriptions", MESSAGES.OpenScreenAnimationPropertyDescriptions());
    map.put("PROPDESC-OrientationPropertyDescriptions", MESSAGES.OrientationPropertyDescriptions());
    map.put("PROPDESC-OrientationSensor.AvailablePropertyDescriptions", MESSAGES.OrientationSensor__AvailablePropertyDescriptions());
    map.put("PROPDESC-OrientationSensor.EnabledPropertyDescriptions", MESSAGES.OrientationSensor__EnabledPropertyDescriptions());
    map.put("PROPDESC-OrientationSensor.PitchPropertyDescriptions", MESSAGES.OrientationSensor__PitchPropertyDescriptions());
    map.put("PROPDESC-OriginAtCenterPropertyDescriptions", MESSAGES.OriginAtCenterPropertyDescriptions());
    map.put("PROPDESC-OriginXPropertyDescriptions", MESSAGES.OriginXPropertyDescriptions());
    map.put("PROPDESC-OriginYPropertyDescriptions", MESSAGES.OriginYPropertyDescriptions());
    map.put("PROPDESC-PasswordTextBox.BackgroundColorPropertyDescriptions", MESSAGES.PasswordTextBox__BackgroundColorPropertyDescriptions());
    map.put("PROPDESC-PasswordTextBox.EnabledPropertyDescriptions", MESSAGES.PasswordTextBox__EnabledPropertyDescriptions());
    map.put("PROPDESC-PasswordTextBox.FontBoldPropertyDescriptions", MESSAGES.PasswordTextBox__FontBoldPropertyDescriptions());
    map.put("PROPDESC-PasswordTextBox.FontItalicPropertyDescriptions", MESSAGES.PasswordTextBox__FontItalicPropertyDescriptions());
    map.put("PROPDESC-PasswordTextBox.FontSizePropertyDescriptions", MESSAGES.PasswordTextBox__FontSizePropertyDescriptions());
    map.put("PROPDESC-PasswordTextBox.FontTypefacePropertyDescriptions", MESSAGES.PasswordTextBox__FontTypefacePropertyDescriptions());
    map.put("PROPDESC-PasswordTextBox.HeightPercentPropertyDescriptions", MESSAGES.PasswordTextBox__HeightPercentPropertyDescriptions());
    map.put("PROPDESC-PasswordTextBox.HeightPropertyDescriptions", MESSAGES.PasswordTextBox__HeightPropertyDescriptions());
    map.put("PROPDESC-PasswordTextBox.HintColorPropertyDescriptions", MESSAGES.PasswordTextBox__HintColorPropertyDescriptions());
    map.put("PROPDESC-PasswordTextBox.HintPropertyDescriptions", MESSAGES.PasswordTextBox__HintPropertyDescriptions());
    map.put("PROPDESC-PasswordTextBox.NumbersOnlyPropertyDescriptions", MESSAGES.PasswordTextBox__NumbersOnlyPropertyDescriptions());
    map.put("PROPDESC-PasswordTextBox.TextAlignmentPropertyDescriptions", MESSAGES.PasswordTextBox__TextAlignmentPropertyDescriptions());
    map.put("PROPDESC-PasswordTextBox.TextColorPropertyDescriptions", MESSAGES.PasswordTextBox__TextColorPropertyDescriptions());
    map.put("PROPDESC-PasswordTextBox.TextPropertyDescriptions", MESSAGES.PasswordTextBox__TextPropertyDescriptions());
    map.put("PROPDESC-PasswordTextBox.VisiblePropertyDescriptions", MESSAGES.PasswordTextBox__VisiblePropertyDescriptions());
    map.put("PROPDESC-PasswordTextBox.WidthPercentPropertyDescriptions", MESSAGES.PasswordTextBox__WidthPercentPropertyDescriptions());
    map.put("PROPDESC-PasswordTextBox.WidthPropertyDescriptions", MESSAGES.PasswordTextBox__WidthPropertyDescriptions());
    map.put("PROPDESC-PasswordVisiblePropertyDescriptions", MESSAGES.PasswordVisiblePropertyDescriptions());
    map.put("PROPDESC-Pedometer.DistancePropertyDescriptions", MESSAGES.Pedometer__DistancePropertyDescriptions());
    map.put("PROPDESC-PersistPropertyDescriptions", MESSAGES.PersistPropertyDescriptions());
    map.put("PROPDESC-PhoneCall.PhoneNumberPropertyDescriptions", MESSAGES.PhoneCall__PhoneNumberPropertyDescriptions());
    map.put("PROPDESC-PhoneNumberListPropertyDescriptions", MESSAGES.PhoneNumberListPropertyDescriptions());
    map.put("PROPDESC-PhoneNumberPicker.BackgroundColorPropertyDescriptions", MESSAGES.PhoneNumberPicker__BackgroundColorPropertyDescriptions());
    map.put("PROPDESC-PhoneNumberPicker.EnabledPropertyDescriptions", MESSAGES.PhoneNumberPicker__EnabledPropertyDescriptions());
    map.put("PROPDESC-PhoneNumberPicker.FontBoldPropertyDescriptions", MESSAGES.PhoneNumberPicker__FontBoldPropertyDescriptions());
    map.put("PROPDESC-PhoneNumberPicker.FontItalicPropertyDescriptions", MESSAGES.PhoneNumberPicker__FontItalicPropertyDescriptions());
    map.put("PROPDESC-PhoneNumberPicker.FontSizePropertyDescriptions", MESSAGES.PhoneNumberPicker__FontSizePropertyDescriptions());
    map.put("PROPDESC-PhoneNumberPicker.FontTypefacePropertyDescriptions", MESSAGES.PhoneNumberPicker__FontTypefacePropertyDescriptions());
    map.put("PROPDESC-PhoneNumberPicker.HeightPercentPropertyDescriptions", MESSAGES.PhoneNumberPicker__HeightPercentPropertyDescriptions());
    map.put("PROPDESC-PhoneNumberPicker.HeightPropertyDescriptions", MESSAGES.PhoneNumberPicker__HeightPropertyDescriptions());
    map.put("PROPDESC-PhoneNumberPicker.ImagePropertyDescriptions", MESSAGES.PhoneNumberPicker__ImagePropertyDescriptions());
    map.put("PROPDESC-PhoneNumberPicker.PhoneNumberPropertyDescriptions", MESSAGES.PhoneNumberPicker__PhoneNumberPropertyDescriptions());
    map.put("PROPDESC-PhoneNumberPicker.PicturePropertyDescriptions", MESSAGES.PhoneNumberPicker__PicturePropertyDescriptions());
    map.put("PROPDESC-PhoneNumberPicker.ShapePropertyDescriptions", MESSAGES.PhoneNumberPicker__ShapePropertyDescriptions());
    map.put("PROPDESC-PhoneNumberPicker.ShowFeedbackPropertyDescriptions", MESSAGES.PhoneNumberPicker__ShowFeedbackPropertyDescriptions());
    map.put("PROPDESC-PhoneNumberPicker.TextAlignmentPropertyDescriptions", MESSAGES.PhoneNumberPicker__TextAlignmentPropertyDescriptions());
    map.put("PROPDESC-PhoneNumberPicker.TextColorPropertyDescriptions", MESSAGES.PhoneNumberPicker__TextColorPropertyDescriptions());
    map.put("PROPDESC-PhoneNumberPicker.TextPropertyDescriptions", MESSAGES.PhoneNumberPicker__TextPropertyDescriptions());
    map.put("PROPDESC-PhoneNumberPicker.VisiblePropertyDescriptions", MESSAGES.PhoneNumberPicker__VisiblePropertyDescriptions());
    map.put("PROPDESC-PhoneNumberPicker.WidthPercentPropertyDescriptions", MESSAGES.PhoneNumberPicker__WidthPercentPropertyDescriptions());
    map.put("PROPDESC-PhoneNumberPicker.WidthPropertyDescriptions", MESSAGES.PhoneNumberPicker__WidthPropertyDescriptions());
    map.put("PROPDESC-PieRadiusPropertyDescriptions", MESSAGES.PieRadiusPropertyDescriptions());
    map.put("PROPDESC-PlatformPropertyDescriptions", MESSAGES.PlatformPropertyDescriptions());
    map.put("PROPDESC-PlatformVersionPropertyDescriptions", MESSAGES.PlatformVersionPropertyDescriptions());
    map.put("PROPDESC-PlayOnlyInForegroundPropertyDescriptions", MESSAGES.PlayOnlyInForegroundPropertyDescriptions());
    map.put("PROPDESC-Player.SourcePropertyDescriptions", MESSAGES.Player__SourcePropertyDescriptions());
    map.put("PROPDESC-Player.VolumePropertyDescriptions", MESSAGES.Player__VolumePropertyDescriptions());
    map.put("PROPDESC-PlayersPropertyDescriptions", MESSAGES.PlayersPropertyDescriptions());
    map.put("PROPDESC-PointShapePropertyDescriptions", MESSAGES.PointShapePropertyDescriptions());
    map.put("PROPDESC-PollingRatePropertyDescriptions", MESSAGES.PollingRatePropertyDescriptions());
    map.put("PROPDESC-Polygon.DescriptionPropertyDescriptions", MESSAGES.Polygon__DescriptionPropertyDescriptions());
    map.put("PROPDESC-Polygon.DraggablePropertyDescriptions", MESSAGES.Polygon__DraggablePropertyDescriptions());
    map.put("PROPDESC-Polygon.EnableInfoboxPropertyDescriptions", MESSAGES.Polygon__EnableInfoboxPropertyDescriptions());
    map.put("PROPDESC-Polygon.FillColorPropertyDescriptions", MESSAGES.Polygon__FillColorPropertyDescriptions());
    map.put("PROPDESC-Polygon.PointsFromStringPropertyDescriptions", MESSAGES.Polygon__PointsFromStringPropertyDescriptions());
    map.put("PROPDESC-Polygon.PointsPropertyDescriptions", MESSAGES.Polygon__PointsPropertyDescriptions());
    map.put("PROPDESC-Polygon.StrokeColorPropertyDescriptions", MESSAGES.Polygon__StrokeColorPropertyDescriptions());
    map.put("PROPDESC-Polygon.StrokeWidthPropertyDescriptions", MESSAGES.Polygon__StrokeWidthPropertyDescriptions());
    map.put("PROPDESC-Polygon.TitlePropertyDescriptions", MESSAGES.Polygon__TitlePropertyDescriptions());
    map.put("PROPDESC-Polygon.TypePropertyDescriptions", MESSAGES.Polygon__TypePropertyDescriptions());
    map.put("PROPDESC-Polygon.VisiblePropertyDescriptions", MESSAGES.Polygon__VisiblePropertyDescriptions());
    map.put("PROPDESC-PredictionsPropertyDescriptions", MESSAGES.PredictionsPropertyDescriptions());
    map.put("PROPDESC-PrimaryColorDarkPropertyDescriptions", MESSAGES.PrimaryColorDarkPropertyDescriptions());
    map.put("PROPDESC-PrimaryColorPropertyDescriptions", MESSAGES.PrimaryColorPropertyDescriptions());
    map.put("PROPDESC-ProgressColorPropertyDescriptions", MESSAGES.ProgressColorPropertyDescriptions());
    map.put("PROPDESC-ProgressPropertyDescriptions", MESSAGES.ProgressPropertyDescriptions());
    map.put("PROPDESC-ProjectBucketPropertyDescriptions", MESSAGES.ProjectBucketPropertyDescriptions());
    map.put("PROPDESC-ProjectIDPropertyDescriptions", MESSAGES.ProjectIDPropertyDescriptions());
    map.put("PROPDESC-PromptPropertyDescriptions", MESSAGES.PromptPropertyDescriptions());
    map.put("PROPDESC-PromptforPermissionPropertyDescriptions", MESSAGES.PromptforPermissionPropertyDescriptions());
    map.put("PROPDESC-ProviderLockedPropertyDescriptions", MESSAGES.ProviderLockedPropertyDescriptions());
    map.put("PROPDESC-ProviderNamePropertyDescriptions", MESSAGES.ProviderNamePropertyDescriptions());
    map.put("PROPDESC-ProviderPropertyDescriptions", MESSAGES.ProviderPropertyDescriptions());
    map.put("PROPDESC-ProximitySensor.AvailablePropertyDescriptions", MESSAGES.ProximitySensor__AvailablePropertyDescriptions());
    map.put("PROPDESC-ProximitySensor.DistancePropertyDescriptions", MESSAGES.ProximitySensor__DistancePropertyDescriptions());
    map.put("PROPDESC-ProximitySensor.EnabledPropertyDescriptions", MESSAGES.ProximitySensor__EnabledPropertyDescriptions());
    map.put("PROPDESC-ProximitySensor.MaximumRangePropertyDescriptions", MESSAGES.ProximitySensor__MaximumRangePropertyDescriptions());
    map.put("PROPDESC-PublicInstancesPropertyDescriptions", MESSAGES.PublicInstancesPropertyDescriptions());
    map.put("PROPDESC-QuadraticCoefficientPropertyDescriptions", MESSAGES.QuadraticCoefficientPropertyDescriptions());
    map.put("PROPDESC-QueryPropertyDescriptions", MESSAGES.QueryPropertyDescriptions());
    map.put("PROPDESC-RSquaredPropertyDescriptions", MESSAGES.RSquaredPropertyDescriptions());
    map.put("PROPDESC-ReadModePropertyDescriptions", MESSAGES.ReadModePropertyDescriptions());
    map.put("PROPDESC-ReadOnlyPropertyDescriptions", MESSAGES.ReadOnlyPropertyDescriptions());
    map.put("PROPDESC-ReadPermissionPropertyDescriptions", MESSAGES.ReadPermissionPropertyDescriptions());
    map.put("PROPDESC-ReceivingEnabledPropertyDescriptions", MESSAGES.ReceivingEnabledPropertyDescriptions());
    map.put("PROPDESC-Rectangle.DescriptionPropertyDescriptions", MESSAGES.Rectangle__DescriptionPropertyDescriptions());
    map.put("PROPDESC-Rectangle.DraggablePropertyDescriptions", MESSAGES.Rectangle__DraggablePropertyDescriptions());
    map.put("PROPDESC-Rectangle.EnableInfoboxPropertyDescriptions", MESSAGES.Rectangle__EnableInfoboxPropertyDescriptions());
    map.put("PROPDESC-Rectangle.FillColorPropertyDescriptions", MESSAGES.Rectangle__FillColorPropertyDescriptions());
    map.put("PROPDESC-Rectangle.StrokeColorPropertyDescriptions", MESSAGES.Rectangle__StrokeColorPropertyDescriptions());
    map.put("PROPDESC-Rectangle.StrokeWidthPropertyDescriptions", MESSAGES.Rectangle__StrokeWidthPropertyDescriptions());
    map.put("PROPDESC-Rectangle.TitlePropertyDescriptions", MESSAGES.Rectangle__TitlePropertyDescriptions());
    map.put("PROPDESC-Rectangle.TypePropertyDescriptions", MESSAGES.Rectangle__TypePropertyDescriptions());
    map.put("PROPDESC-Rectangle.VisiblePropertyDescriptions", MESSAGES.Rectangle__VisiblePropertyDescriptions());
    map.put("PROPDESC-RedisPortPropertyDescriptions", MESSAGES.RedisPortPropertyDescriptions());
    map.put("PROPDESC-RedisServerPropertyDescriptions", MESSAGES.RedisServerPropertyDescriptions());
    map.put("PROPDESC-RefreshTimePropertyDescriptions", MESSAGES.RefreshTimePropertyDescriptions());
    map.put("PROPDESC-ReleasedEventEnabledPropertyDescriptions", MESSAGES.ReleasedEventEnabledPropertyDescriptions());
    map.put("PROPDESC-RequestHeadersPropertyDescriptions", MESSAGES.RequestHeadersPropertyDescriptions());
    map.put("PROPDESC-ResponseContentPropertyDescriptions", MESSAGES.ResponseContentPropertyDescriptions());
    map.put("PROPDESC-ResponseFileNamePropertyDescriptions", MESSAGES.ResponseFileNamePropertyDescriptions());
    map.put("PROPDESC-ResponseTextEncodingPropertyDescriptions", MESSAGES.ResponseTextEncodingPropertyDescriptions());
    map.put("PROPDESC-ResultNamePropertyDescriptions", MESSAGES.ResultNamePropertyDescriptions());
    map.put("PROPDESC-ResultTypePropertyDescriptions", MESSAGES.ResultTypePropertyDescriptions());
    map.put("PROPDESC-ResultUriPropertyDescriptions", MESSAGES.ResultUriPropertyDescriptions());
    map.put("PROPDESC-ResultsPropertyDescriptions", MESSAGES.ResultsPropertyDescriptions());
    map.put("PROPDESC-ReverseDirectionPropertyDescriptions", MESSAGES.ReverseDirectionPropertyDescriptions());
    map.put("PROPDESC-RollPropertyDescriptions", MESSAGES.RollPropertyDescriptions());
    map.put("PROPDESC-RotatesPropertyDescriptions", MESSAGES.RotatesPropertyDescriptions());
    map.put("PROPDESC-RotationAnglePropertyDescriptions", MESSAGES.RotationAnglePropertyDescriptions());
    map.put("PROPDESC-RotationPropertyDescriptions", MESSAGES.RotationPropertyDescriptions());
    map.put("PROPDESC-RowPropertyDescriptions", MESSAGES.RowPropertyDescriptions());
    map.put("PROPDESC-SaveResponsePropertyDescriptions", MESSAGES.SaveResponsePropertyDescriptions());
    map.put("PROPDESC-SavedRecordingPropertyDescriptions", MESSAGES.SavedRecordingPropertyDescriptions());
    map.put("PROPDESC-ScalePictureToFitPropertyDescriptions", MESSAGES.ScalePictureToFitPropertyDescriptions());
    map.put("PROPDESC-ScaleUnitsPropertyDescriptions", MESSAGES.ScaleUnitsPropertyDescriptions());
    map.put("PROPDESC-ScalingPropertyDescriptions", MESSAGES.ScalingPropertyDescriptions());
    map.put("PROPDESC-ScopePropertyDescriptions", MESSAGES.ScopePropertyDescriptions());
    map.put("PROPDESC-ScreenOrientationPropertyDescriptions", MESSAGES.ScreenOrientationPropertyDescriptions());
    map.put("PROPDESC-Screen.AlignHorizontalPropertyDescriptions", MESSAGES.Screen__AlignHorizontalPropertyDescriptions());
    map.put("PROPDESC-Screen.AlignVerticalPropertyDescriptions", MESSAGES.Screen__AlignVerticalPropertyDescriptions());
    map.put("PROPDESC-Screen.BackgroundColorPropertyDescriptions", MESSAGES.Screen__BackgroundColorPropertyDescriptions());
    map.put("PROPDESC-Screen.BackgroundImagePropertyDescriptions", MESSAGES.Screen__BackgroundImagePropertyDescriptions());
    map.put("PROPDESC-Screen.HeightPropertyDescriptions", MESSAGES.Screen__HeightPropertyDescriptions());
    map.put("PROPDESC-Screen.TitlePropertyDescriptions", MESSAGES.Screen__TitlePropertyDescriptions());
    map.put("PROPDESC-Screen.WidthPropertyDescriptions", MESSAGES.Screen__WidthPropertyDescriptions());
    map.put("PROPDESC-ScrollablePropertyDescriptions", MESSAGES.ScrollablePropertyDescriptions());
    map.put("PROPDESC-SearchResultsPropertyDescriptions", MESSAGES.SearchResultsPropertyDescriptions());
    map.put("PROPDESC-SecurePropertyDescriptions", MESSAGES.SecurePropertyDescriptions());
    map.put("PROPDESC-SelectionColorPropertyDescriptions", MESSAGES.SelectionColorPropertyDescriptions());
    map.put("PROPDESC-SelectionDetailTextPropertyDescriptions", MESSAGES.SelectionDetailTextPropertyDescriptions());
    map.put("PROPDESC-SensitivityPropertyDescriptions", MESSAGES.SensitivityPropertyDescriptions());
    map.put("PROPDESC-SensorPortPropertyDescriptions", MESSAGES.SensorPortPropertyDescriptions());
    map.put("PROPDESC-SensorValueChangedEventEnabledPropertyDescriptions", MESSAGES.SensorValueChangedEventEnabledPropertyDescriptions());
    map.put("PROPDESC-ServiceAccountEmailPropertyDescriptions", MESSAGES.ServiceAccountEmailPropertyDescriptions());
    map.put("PROPDESC-ServiceUrlPropertyDescriptions", MESSAGES.ServiceUrlPropertyDescriptions());
    map.put("PROPDESC-ShowCompassPropertyDescriptions", MESSAGES.ShowCompassPropertyDescriptions());
    map.put("PROPDESC-ShowListsAsJsonPropertyDescriptions", MESSAGES.ShowListsAsJsonPropertyDescriptions());
    map.put("PROPDESC-ShowLoadingDialogPropertyDescriptions", MESSAGES.ShowLoadingDialogPropertyDescriptions());
    map.put("PROPDESC-ShowScalePropertyDescriptions", MESSAGES.ShowScalePropertyDescriptions());
    map.put("PROPDESC-ShowShadowPropertyDescriptions", MESSAGES.ShowShadowPropertyDescriptions());
    map.put("PROPDESC-ShowStatusBarPropertyDescriptions", MESSAGES.ShowStatusBarPropertyDescriptions());
    map.put("PROPDESC-ShowUserPropertyDescriptions", MESSAGES.ShowUserPropertyDescriptions());
    map.put("PROPDESC-ShowZoomPropertyDescriptions", MESSAGES.ShowZoomPropertyDescriptions());
    map.put("PROPDESC-SimpleStepsPropertyDescriptions", MESSAGES.SimpleStepsPropertyDescriptions());
    map.put("PROPDESC-SizePropertyDescriptions", MESSAGES.SizePropertyDescriptions());
    map.put("PROPDESC-SizingPropertyDescriptions", MESSAGES.SizingPropertyDescriptions());
    map.put("PROPDESC-Slider.HeightPercentPropertyDescriptions", MESSAGES.Slider__HeightPercentPropertyDescriptions());
    map.put("PROPDESC-Slider.VisiblePropertyDescriptions", MESSAGES.Slider__VisiblePropertyDescriptions());
    map.put("PROPDESC-Slider.WidthPercentPropertyDescriptions", MESSAGES.Slider__WidthPercentPropertyDescriptions());
    map.put("PROPDESC-Slider.WidthPropertyDescriptions", MESSAGES.Slider__WidthPropertyDescriptions());
    map.put("PROPDESC-Sound.MinimumIntervalPropertyDescriptions", MESSAGES.Sound__MinimumIntervalPropertyDescriptions());
    map.put("PROPDESC-Sound.SourcePropertyDescriptions", MESSAGES.Sound__SourcePropertyDescriptions());
    map.put("PROPDESC-SourceFilePropertyDescriptions", MESSAGES.SourceFilePropertyDescriptions());
    map.put("PROPDESC-SouthLatitudePropertyDescriptions", MESSAGES.SouthLatitudePropertyDescriptions());
    map.put("PROPDESC-SpeechRatePropertyDescriptions", MESSAGES.SpeechRatePropertyDescriptions());
    map.put("PROPDESC-SpeechRecognizer.LanguagePropertyDescriptions", MESSAGES.SpeechRecognizer__LanguagePropertyDescriptions());
    map.put("PROPDESC-SpeechRecognizer.ResultPropertyDescriptions", MESSAGES.SpeechRecognizer__ResultPropertyDescriptions());
    map.put("PROPDESC-Spinner.ElementsFromStringPropertyDescriptions", MESSAGES.Spinner__ElementsFromStringPropertyDescriptions());
    map.put("PROPDESC-Spinner.ElementsPropertyDescriptions", MESSAGES.Spinner__ElementsPropertyDescriptions());
    map.put("PROPDESC-Spinner.HeightPercentPropertyDescriptions", MESSAGES.Spinner__HeightPercentPropertyDescriptions());
    map.put("PROPDESC-Spinner.HeightPropertyDescriptions", MESSAGES.Spinner__HeightPropertyDescriptions());
    map.put("PROPDESC-Spinner.SelectionIndexPropertyDescriptions", MESSAGES.Spinner__SelectionIndexPropertyDescriptions());
    map.put("PROPDESC-Spinner.SelectionPropertyDescriptions", MESSAGES.Spinner__SelectionPropertyDescriptions());
    map.put("PROPDESC-Spinner.VisiblePropertyDescriptions", MESSAGES.Spinner__VisiblePropertyDescriptions());
    map.put("PROPDESC-Spinner.WidthPercentPropertyDescriptions", MESSAGES.Spinner__WidthPercentPropertyDescriptions());
    map.put("PROPDESC-Spinner.WidthPropertyDescriptions", MESSAGES.Spinner__WidthPropertyDescriptions());
    map.put("PROPDESC-SpreadsheetIDPropertyDescriptions", MESSAGES.SpreadsheetIDPropertyDescriptions());
    map.put("PROPDESC-SpreadsheetUseHeadersPropertyDescriptions", MESSAGES.SpreadsheetUseHeadersPropertyDescriptions());
    map.put("PROPDESC-SpreadsheetXColumnPropertyDescriptions", MESSAGES.SpreadsheetXColumnPropertyDescriptions());
    map.put("PROPDESC-SpreadsheetYColumnPropertyDescriptions", MESSAGES.SpreadsheetYColumnPropertyDescriptions());
    map.put("PROPDESC-StartLatitudePropertyDescriptions", MESSAGES.StartLatitudePropertyDescriptions());
    map.put("PROPDESC-StartLocationPropertyDescriptions", MESSAGES.StartLocationPropertyDescriptions());
    map.put("PROPDESC-StartLongitudePropertyDescriptions", MESSAGES.StartLongitudePropertyDescriptions());
    map.put("PROPDESC-StopDetectionTimeoutPropertyDescriptions", MESSAGES.StopDetectionTimeoutPropertyDescriptions());
    map.put("PROPDESC-StrideLengthPropertyDescriptions", MESSAGES.StrideLengthPropertyDescriptions());
    map.put("PROPDESC-StrokeOpacityPropertyDescriptions", MESSAGES.StrokeOpacityPropertyDescriptions());
    map.put("PROPDESC-StrokeStylePropertyDescriptions", MESSAGES.StrokeStylePropertyDescriptions());
    map.put("PROPDESC-Switch.BackgroundColorPropertyDescriptions", MESSAGES.Switch__BackgroundColorPropertyDescriptions());
    map.put("PROPDESC-Switch.EnabledPropertyDescriptions", MESSAGES.Switch__EnabledPropertyDescriptions());
    map.put("PROPDESC-Switch.FontBoldPropertyDescriptions", MESSAGES.Switch__FontBoldPropertyDescriptions());
    map.put("PROPDESC-Switch.FontItalicPropertyDescriptions", MESSAGES.Switch__FontItalicPropertyDescriptions());
    map.put("PROPDESC-Switch.FontSizePropertyDescriptions", MESSAGES.Switch__FontSizePropertyDescriptions());
    map.put("PROPDESC-Switch.FontTypefacePropertyDescriptions", MESSAGES.Switch__FontTypefacePropertyDescriptions());
    map.put("PROPDESC-Switch.HeightPercentPropertyDescriptions", MESSAGES.Switch__HeightPercentPropertyDescriptions());
    map.put("PROPDESC-Switch.HeightPropertyDescriptions", MESSAGES.Switch__HeightPropertyDescriptions());
    map.put("PROPDESC-Switch.TextColorPropertyDescriptions", MESSAGES.Switch__TextColorPropertyDescriptions());
    map.put("PROPDESC-Switch.TextPropertyDescriptions", MESSAGES.Switch__TextPropertyDescriptions());
    map.put("PROPDESC-Switch.VisiblePropertyDescriptions", MESSAGES.Switch__VisiblePropertyDescriptions());
    map.put("PROPDESC-Switch.WidthPercentPropertyDescriptions", MESSAGES.Switch__WidthPercentPropertyDescriptions());
    map.put("PROPDESC-Switch.WidthPropertyDescriptions", MESSAGES.Switch__WidthPropertyDescriptions());
    map.put("PROPDESC-SystemPropertyDescriptions", MESSAGES.SystemPropertyDescriptions());
    map.put("PROPDESC-TableArrangement.ColumnsPropertyDescriptions", MESSAGES.TableArrangement__ColumnsPropertyDescriptions());
    map.put("PROPDESC-TableArrangement.HeightPercentPropertyDescriptions", MESSAGES.TableArrangement__HeightPercentPropertyDescriptions());
    map.put("PROPDESC-TableArrangement.HeightPropertyDescriptions", MESSAGES.TableArrangement__HeightPropertyDescriptions());
    map.put("PROPDESC-TableArrangement.RowsPropertyDescriptions", MESSAGES.TableArrangement__RowsPropertyDescriptions());
    map.put("PROPDESC-TableArrangement.VisiblePropertyDescriptions", MESSAGES.TableArrangement__VisiblePropertyDescriptions());
    map.put("PROPDESC-TableArrangement.WidthPercentPropertyDescriptions", MESSAGES.TableArrangement__WidthPercentPropertyDescriptions());
    map.put("PROPDESC-TableArrangement.WidthPropertyDescriptions", MESSAGES.TableArrangement__WidthPropertyDescriptions());
    map.put("PROPDESC-TachoCountChangedEventEnabledPropertyDescriptions", MESSAGES.TachoCountChangedEventEnabledPropertyDescriptions());
    map.put("PROPDESC-TapThresholdPropertyDescriptions", MESSAGES.TapThresholdPropertyDescriptions());
    map.put("PROPDESC-TemperaturePropertyDescriptions", MESSAGES.TemperaturePropertyDescriptions());
    map.put("PROPDESC-TextBox.BackgroundColorPropertyDescriptions", MESSAGES.TextBox__BackgroundColorPropertyDescriptions());
    map.put("PROPDESC-TextBox.EnabledPropertyDescriptions", MESSAGES.TextBox__EnabledPropertyDescriptions());
    map.put("PROPDESC-TextBox.FontBoldPropertyDescriptions", MESSAGES.TextBox__FontBoldPropertyDescriptions());
    map.put("PROPDESC-TextBox.FontItalicPropertyDescriptions", MESSAGES.TextBox__FontItalicPropertyDescriptions());
    map.put("PROPDESC-TextBox.FontSizePropertyDescriptions", MESSAGES.TextBox__FontSizePropertyDescriptions());
    map.put("PROPDESC-TextBox.FontTypefacePropertyDescriptions", MESSAGES.TextBox__FontTypefacePropertyDescriptions());
    map.put("PROPDESC-TextBox.HeightPercentPropertyDescriptions", MESSAGES.TextBox__HeightPercentPropertyDescriptions());
    map.put("PROPDESC-TextBox.HeightPropertyDescriptions", MESSAGES.TextBox__HeightPropertyDescriptions());
    map.put("PROPDESC-TextBox.HintColorPropertyDescriptions", MESSAGES.TextBox__HintColorPropertyDescriptions());
    map.put("PROPDESC-TextBox.HintPropertyDescriptions", MESSAGES.TextBox__HintPropertyDescriptions());
    map.put("PROPDESC-TextBox.NumbersOnlyPropertyDescriptions", MESSAGES.TextBox__NumbersOnlyPropertyDescriptions());
    map.put("PROPDESC-TextBox.TextAlignmentPropertyDescriptions", MESSAGES.TextBox__TextAlignmentPropertyDescriptions());
    map.put("PROPDESC-TextBox.TextColorPropertyDescriptions", MESSAGES.TextBox__TextColorPropertyDescriptions());
    map.put("PROPDESC-TextBox.TextPropertyDescriptions", MESSAGES.TextBox__TextPropertyDescriptions());
    map.put("PROPDESC-TextBox.VisiblePropertyDescriptions", MESSAGES.TextBox__VisiblePropertyDescriptions());
    map.put("PROPDESC-TextBox.WidthPercentPropertyDescriptions", MESSAGES.TextBox__WidthPercentPropertyDescriptions());
    map.put("PROPDESC-TextBox.WidthPropertyDescriptions", MESSAGES.TextBox__WidthPropertyDescriptions());
    map.put("PROPDESC-TextColorDetailPropertyDescriptions", MESSAGES.TextColorDetailPropertyDescriptions());
    map.put("PROPDESC-TextSizePropertyDescriptions", MESSAGES.TextSizePropertyDescriptions());
    map.put("PROPDESC-TextToSpeech.LanguagePropertyDescriptions", MESSAGES.TextToSpeech__LanguagePropertyDescriptions());
    map.put("PROPDESC-TextToSpeech.PitchPropertyDescriptions", MESSAGES.TextToSpeech__PitchPropertyDescriptions());
    map.put("PROPDESC-TextToSpeech.ResultPropertyDescriptions", MESSAGES.TextToSpeech__ResultPropertyDescriptions());
    map.put("PROPDESC-TextToWritePropertyDescriptions", MESSAGES.TextToWritePropertyDescriptions());
    map.put("PROPDESC-Texting.PhoneNumberPropertyDescriptions", MESSAGES.Texting__PhoneNumberPropertyDescriptions());
    map.put("PROPDESC-ThemePropertyDescriptions", MESSAGES.ThemePropertyDescriptions());
    map.put("PROPDESC-Thermometer.AvailablePropertyDescriptions", MESSAGES.Thermometer__AvailablePropertyDescriptions());
    map.put("PROPDESC-Thermometer.EnabledPropertyDescriptions", MESSAGES.Thermometer__EnabledPropertyDescriptions());
    map.put("PROPDESC-ThumbColorActivePropertyDescriptions", MESSAGES.ThumbColorActivePropertyDescriptions());
    map.put("PROPDESC-ThumbColorInactivePropertyDescriptions", MESSAGES.ThumbColorInactivePropertyDescriptions());
    map.put("PROPDESC-ThumbColorPropertyDescriptions", MESSAGES.ThumbColorPropertyDescriptions());
    map.put("PROPDESC-ThumbEnabledPropertyDescriptions", MESSAGES.ThumbEnabledPropertyDescriptions());
    map.put("PROPDESC-ThumbPositionPropertyDescriptions", MESSAGES.ThumbPositionPropertyDescriptions());
    map.put("PROPDESC-TimeIntervalPropertyDescriptions", MESSAGES.TimeIntervalPropertyDescriptions());
    map.put("PROPDESC-TimePicker.BackgroundColorPropertyDescriptions", MESSAGES.TimePicker__BackgroundColorPropertyDescriptions());
    map.put("PROPDESC-TimePicker.EnabledPropertyDescriptions", MESSAGES.TimePicker__EnabledPropertyDescriptions());
    map.put("PROPDESC-TimePicker.FontBoldPropertyDescriptions", MESSAGES.TimePicker__FontBoldPropertyDescriptions());
    map.put("PROPDESC-TimePicker.FontItalicPropertyDescriptions", MESSAGES.TimePicker__FontItalicPropertyDescriptions());
    map.put("PROPDESC-TimePicker.FontSizePropertyDescriptions", MESSAGES.TimePicker__FontSizePropertyDescriptions());
    map.put("PROPDESC-TimePicker.FontTypefacePropertyDescriptions", MESSAGES.TimePicker__FontTypefacePropertyDescriptions());
    map.put("PROPDESC-TimePicker.HeightPercentPropertyDescriptions", MESSAGES.TimePicker__HeightPercentPropertyDescriptions());
    map.put("PROPDESC-TimePicker.HeightPropertyDescriptions", MESSAGES.TimePicker__HeightPropertyDescriptions());
    map.put("PROPDESC-TimePicker.ImagePropertyDescriptions", MESSAGES.TimePicker__ImagePropertyDescriptions());
    map.put("PROPDESC-TimePicker.InstantPropertyDescriptions", MESSAGES.TimePicker__InstantPropertyDescriptions());
    map.put("PROPDESC-TimePicker.ShapePropertyDescriptions", MESSAGES.TimePicker__ShapePropertyDescriptions());
    map.put("PROPDESC-TimePicker.ShowFeedbackPropertyDescriptions", MESSAGES.TimePicker__ShowFeedbackPropertyDescriptions());
    map.put("PROPDESC-TimePicker.TextAlignmentPropertyDescriptions", MESSAGES.TimePicker__TextAlignmentPropertyDescriptions());
    map.put("PROPDESC-TimePicker.TextColorPropertyDescriptions", MESSAGES.TimePicker__TextColorPropertyDescriptions());
    map.put("PROPDESC-TimePicker.TextPropertyDescriptions", MESSAGES.TimePicker__TextPropertyDescriptions());
    map.put("PROPDESC-TimePicker.VisiblePropertyDescriptions", MESSAGES.TimePicker__VisiblePropertyDescriptions());
    map.put("PROPDESC-TimePicker.WidthPercentPropertyDescriptions", MESSAGES.TimePicker__WidthPercentPropertyDescriptions());
    map.put("PROPDESC-TimePicker.WidthPropertyDescriptions", MESSAGES.TimePicker__WidthPropertyDescriptions());
    map.put("PROPDESC-TimeoutPropertyDescriptions", MESSAGES.TimeoutPropertyDescriptions());
    map.put("PROPDESC-TimerAlwaysFiresPropertyDescriptions", MESSAGES.TimerAlwaysFiresPropertyDescriptions());
    map.put("PROPDESC-TimerEnabledPropertyDescriptions", MESSAGES.TimerEnabledPropertyDescriptions());
    map.put("PROPDESC-TimerIntervalPropertyDescriptions", MESSAGES.TimerIntervalPropertyDescriptions());
    map.put("PROPDESC-TinyWebDB.ServiceURLPropertyDescriptions", MESSAGES.TinyWebDB__ServiceURLPropertyDescriptions());
    map.put("PROPDESC-TitleVisiblePropertyDescriptions", MESSAGES.TitleVisiblePropertyDescriptions());
    map.put("PROPDESC-TopOfRangePropertyDescriptions", MESSAGES.TopOfRangePropertyDescriptions());
    map.put("PROPDESC-TopPropertyDescriptions", MESSAGES.TopPropertyDescriptions());
    map.put("PROPDESC-TrackColorActivePropertyDescriptions", MESSAGES.TrackColorActivePropertyDescriptions());
    map.put("PROPDESC-TrackColorInactivePropertyDescriptions", MESSAGES.TrackColorInactivePropertyDescriptions());
    map.put("PROPDESC-Translator.ApiKeyPropertyDescriptions", MESSAGES.Translator__ApiKeyPropertyDescriptions());
    map.put("PROPDESC-TransportationMethodPropertyDescriptions", MESSAGES.TransportationMethodPropertyDescriptions());
    map.put("PROPDESC-Trendline.ColorPropertyDescriptions", MESSAGES.Trendline__ColorPropertyDescriptions());
    map.put("PROPDESC-Trendline.ModelPropertyDescriptions", MESSAGES.Trendline__ModelPropertyDescriptions());
    map.put("PROPDESC-Trendline.StrokeWidthPropertyDescriptions", MESSAGES.Trendline__StrokeWidthPropertyDescriptions());
    map.put("PROPDESC-Trendline.VisiblePropertyDescriptions", MESSAGES.Trendline__VisiblePropertyDescriptions());
    map.put("PROPDESC-TutorialURLPropertyDescriptions", MESSAGES.TutorialURLPropertyDescriptions());
    map.put("PROPDESC-TwitPic_API_KeyPropertyDescriptions", MESSAGES.TwitPic_API_KeyPropertyDescriptions());
    map.put("PROPDESC-UnitPropertyDescriptions", MESSAGES.UnitPropertyDescriptions());
    map.put("PROPDESC-UrlPropertyDescriptions", MESSAGES.UrlPropertyDescriptions());
    map.put("PROPDESC-UseExternalScannerPropertyDescriptions", MESSAGES.UseExternalScannerPropertyDescriptions());
    map.put("PROPDESC-UseFrontPropertyDescriptions", MESSAGES.UseFrontPropertyDescriptions());
    map.put("PROPDESC-UseGPSPropertyDescriptions", MESSAGES.UseGPSPropertyDescriptions());
    map.put("PROPDESC-UseLegacyPropertyDescriptions", MESSAGES.UseLegacyPropertyDescriptions());
    map.put("PROPDESC-UseSSLPropertyDescriptions", MESSAGES.UseSSLPropertyDescriptions());
    map.put("PROPDESC-UseServiceAuthenticationPropertyDescriptions", MESSAGES.UseServiceAuthenticationPropertyDescriptions());
    map.put("PROPDESC-UserChoicePropertyDescriptions", MESSAGES.UserChoicePropertyDescriptions());
    map.put("PROPDESC-UserIdPropertyDescriptions", MESSAGES.UserIdPropertyDescriptions());
    map.put("PROPDESC-UserLatitudePropertyDescriptions", MESSAGES.UserLatitudePropertyDescriptions());
    map.put("PROPDESC-UserLongitudePropertyDescriptions", MESSAGES.UserLongitudePropertyDescriptions());
    map.put("PROPDESC-UsernamePropertyDescriptions", MESSAGES.UsernamePropertyDescriptions());
    map.put("PROPDESC-UsesCameraPropertyDescriptions", MESSAGES.UsesCameraPropertyDescriptions());
    map.put("PROPDESC-UsesLocationPropertyDescriptions", MESSAGES.UsesLocationPropertyDescriptions());
    map.put("PROPDESC-UsesMicrophonePropertyDescriptions", MESSAGES.UsesMicrophonePropertyDescriptions());
    map.put("PROPDESC-ValueFormatPropertyDescriptions", MESSAGES.ValueFormatPropertyDescriptions());
    map.put("PROPDESC-VersionCodePropertyDescriptions", MESSAGES.VersionCodePropertyDescriptions());
    map.put("PROPDESC-VersionNamePropertyDescriptions", MESSAGES.VersionNamePropertyDescriptions());
    map.put("PROPDESC-VerticalArrangement.AlignHorizontalPropertyDescriptions", MESSAGES.VerticalArrangement__AlignHorizontalPropertyDescriptions());
    map.put("PROPDESC-VerticalArrangement.AlignVerticalPropertyDescriptions", MESSAGES.VerticalArrangement__AlignVerticalPropertyDescriptions());
    map.put("PROPDESC-VerticalArrangement.BackgroundColorPropertyDescriptions", MESSAGES.VerticalArrangement__BackgroundColorPropertyDescriptions());
    map.put("PROPDESC-VerticalArrangement.HeightPercentPropertyDescriptions", MESSAGES.VerticalArrangement__HeightPercentPropertyDescriptions());
    map.put("PROPDESC-VerticalArrangement.HeightPropertyDescriptions", MESSAGES.VerticalArrangement__HeightPropertyDescriptions());
    map.put("PROPDESC-VerticalArrangement.ImagePropertyDescriptions", MESSAGES.VerticalArrangement__ImagePropertyDescriptions());
    map.put("PROPDESC-VerticalArrangement.VisiblePropertyDescriptions", MESSAGES.VerticalArrangement__VisiblePropertyDescriptions());
    map.put("PROPDESC-VerticalArrangement.WidthPercentPropertyDescriptions", MESSAGES.VerticalArrangement__WidthPercentPropertyDescriptions());
    map.put("PROPDESC-VerticalArrangement.WidthPropertyDescriptions", MESSAGES.VerticalArrangement__WidthPropertyDescriptions());
    map.put("PROPDESC-VerticalScrollArrangement.AlignHorizontalPropertyDescriptions", MESSAGES.VerticalScrollArrangement__AlignHorizontalPropertyDescriptions());
    map.put("PROPDESC-VerticalScrollArrangement.AlignVerticalPropertyDescriptions", MESSAGES.VerticalScrollArrangement__AlignVerticalPropertyDescriptions());
    map.put("PROPDESC-VerticalScrollArrangement.BackgroundColorPropertyDescriptions", MESSAGES.VerticalScrollArrangement__BackgroundColorPropertyDescriptions());
    map.put("PROPDESC-VerticalScrollArrangement.HeightPercentPropertyDescriptions", MESSAGES.VerticalScrollArrangement__HeightPercentPropertyDescriptions());
    map.put("PROPDESC-VerticalScrollArrangement.HeightPropertyDescriptions", MESSAGES.VerticalScrollArrangement__HeightPropertyDescriptions());
    map.put("PROPDESC-VerticalScrollArrangement.ImagePropertyDescriptions", MESSAGES.VerticalScrollArrangement__ImagePropertyDescriptions());
    map.put("PROPDESC-VerticalScrollArrangement.VisiblePropertyDescriptions", MESSAGES.VerticalScrollArrangement__VisiblePropertyDescriptions());
    map.put("PROPDESC-VerticalScrollArrangement.WidthPercentPropertyDescriptions", MESSAGES.VerticalScrollArrangement__WidthPercentPropertyDescriptions());
    map.put("PROPDESC-VerticalScrollArrangement.WidthPropertyDescriptions", MESSAGES.VerticalScrollArrangement__WidthPropertyDescriptions());
    map.put("PROPDESC-VideoPlayer.HeightPercentPropertyDescriptions", MESSAGES.VideoPlayer__HeightPercentPropertyDescriptions());
    map.put("PROPDESC-VideoPlayer.HeightPropertyDescriptions", MESSAGES.VideoPlayer__HeightPropertyDescriptions());
    map.put("PROPDESC-VideoPlayer.SourcePropertyDescriptions", MESSAGES.VideoPlayer__SourcePropertyDescriptions());
    map.put("PROPDESC-VideoPlayer.VisiblePropertyDescriptions", MESSAGES.VideoPlayer__VisiblePropertyDescriptions());
    map.put("PROPDESC-VideoPlayer.VolumePropertyDescriptions", MESSAGES.VideoPlayer__VolumePropertyDescriptions());
    map.put("PROPDESC-VideoPlayer.WidthPercentPropertyDescriptions", MESSAGES.VideoPlayer__WidthPercentPropertyDescriptions());
    map.put("PROPDESC-VideoPlayer.WidthPropertyDescriptions", MESSAGES.VideoPlayer__WidthPropertyDescriptions());
    map.put("PROPDESC-Voting.ServiceURLPropertyDescriptions", MESSAGES.Voting__ServiceURLPropertyDescriptions());
    map.put("PROPDESC-Voting.UserEmailAddressPropertyDescriptions", MESSAGES.Voting__UserEmailAddressPropertyDescriptions());
    map.put("PROPDESC-WalkStepsPropertyDescriptions", MESSAGES.WalkStepsPropertyDescriptions());
    map.put("PROPDESC-WebRTCPropertyDescriptions", MESSAGES.WebRTCPropertyDescriptions());
    map.put("PROPDESC-WebViewStringPropertyDescriptions", MESSAGES.WebViewStringPropertyDescriptions());
    map.put("PROPDESC-WebViewer.HeightPercentPropertyDescriptions", MESSAGES.WebViewer__HeightPercentPropertyDescriptions());
    map.put("PROPDESC-WebViewer.HeightPropertyDescriptions", MESSAGES.WebViewer__HeightPropertyDescriptions());
    map.put("PROPDESC-WebViewer.VisiblePropertyDescriptions", MESSAGES.WebViewer__VisiblePropertyDescriptions());
    map.put("PROPDESC-WebViewer.WidthPercentPropertyDescriptions", MESSAGES.WebViewer__WidthPercentPropertyDescriptions());
    map.put("PROPDESC-WebViewer.WidthPropertyDescriptions", MESSAGES.WebViewer__WidthPropertyDescriptions());
    map.put("PROPDESC-WebXColumnPropertyDescriptions", MESSAGES.WebXColumnPropertyDescriptions());
    map.put("PROPDESC-WebYColumnPropertyDescriptions", MESSAGES.WebYColumnPropertyDescriptions());
    map.put("PROPDESC-WestLongitudePropertyDescriptions", MESSAGES.WestLongitudePropertyDescriptions());
    map.put("PROPDESC-WritePermissionPropertyDescriptions", MESSAGES.WritePermissionPropertyDescriptions());
    map.put("PROPDESC-WriteTypePropertyDescriptions", MESSAGES.WriteTypePropertyDescriptions());
    map.put("PROPDESC-XAccelPropertyDescriptions", MESSAGES.XAccelPropertyDescriptions());
    map.put("PROPDESC-XAngularVelocityPropertyDescriptions", MESSAGES.XAngularVelocityPropertyDescriptions());
    map.put("PROPDESC-XFromZeroPropertyDescriptions", MESSAGES.XFromZeroPropertyDescriptions());
    map.put("PROPDESC-XInterceptsPropertyDescriptions", MESSAGES.XInterceptsPropertyDescriptions());
    map.put("PROPDESC-XStrengthPropertyDescriptions", MESSAGES.XStrengthPropertyDescriptions());
    map.put("PROPDESC-YAccelPropertyDescriptions", MESSAGES.YAccelPropertyDescriptions());
    map.put("PROPDESC-YAngularVelocityPropertyDescriptions", MESSAGES.YAngularVelocityPropertyDescriptions());
    map.put("PROPDESC-YFromZeroPropertyDescriptions", MESSAGES.YFromZeroPropertyDescriptions());
    map.put("PROPDESC-YInterceptPropertyDescriptions", MESSAGES.YInterceptPropertyDescriptions());
    map.put("PROPDESC-YStrengthPropertyDescriptions", MESSAGES.YStrengthPropertyDescriptions());
    map.put("PROPDESC-YandexTranslate.ApiKeyPropertyDescriptions", MESSAGES.YandexTranslate__ApiKeyPropertyDescriptions());
    map.put("PROPDESC-YearPropertyDescriptions", MESSAGES.YearPropertyDescriptions());
    map.put("PROPDESC-ZAccelPropertyDescriptions", MESSAGES.ZAccelPropertyDescriptions());
    map.put("PROPDESC-ZAngularVelocityPropertyDescriptions", MESSAGES.ZAngularVelocityPropertyDescriptions());
    map.put("PROPDESC-ZStrengthPropertyDescriptions", MESSAGES.ZStrengthPropertyDescriptions());
    map.put("PROPDESC-ZoomLevelPropertyDescriptions", MESSAGES.ZoomLevelPropertyDescriptions());
    map.put("METHODDESC-AcceptConnectionMethodDescriptions", MESSAGES.AcceptConnectionMethodDescriptions());
    map.put("METHODDESC-AcceptConnectionWithUUIDMethodDescriptions", MESSAGES.AcceptConnectionWithUUIDMethodDescriptions());
    map.put("METHODDESC-AddColumnMethodDescriptions", MESSAGES.AddColumnMethodDescriptions());
    map.put("METHODDESC-AddDaysMethodDescriptions", MESSAGES.AddDaysMethodDescriptions());
    map.put("METHODDESC-AddDurationMethodDescriptions", MESSAGES.AddDurationMethodDescriptions());
    map.put("METHODDESC-AddEntryMethodDescriptions", MESSAGES.AddEntryMethodDescriptions());
    map.put("METHODDESC-AddHoursMethodDescriptions", MESSAGES.AddHoursMethodDescriptions());
    map.put("METHODDESC-AddItemAtIndexMethodDescriptions", MESSAGES.AddItemAtIndexMethodDescriptions());
    map.put("METHODDESC-AddItemMethodDescriptions", MESSAGES.AddItemMethodDescriptions());
    map.put("METHODDESC-AddItemsAtIndexMethodDescriptions", MESSAGES.AddItemsAtIndexMethodDescriptions());
    map.put("METHODDESC-AddItemsMethodDescriptions", MESSAGES.AddItemsMethodDescriptions());
    map.put("METHODDESC-AddMinutesMethodDescriptions", MESSAGES.AddMinutesMethodDescriptions());
    map.put("METHODDESC-AddMonthsMethodDescriptions", MESSAGES.AddMonthsMethodDescriptions());
    map.put("METHODDESC-AddRowMethodDescriptions", MESSAGES.AddRowMethodDescriptions());
    map.put("METHODDESC-AddSecondsMethodDescriptions", MESSAGES.AddSecondsMethodDescriptions());
    map.put("METHODDESC-AddSheetMethodDescriptions", MESSAGES.AddSheetMethodDescriptions());
    map.put("METHODDESC-AddWeeksMethodDescriptions", MESSAGES.AddWeeksMethodDescriptions());
    map.put("METHODDESC-AddYearsMethodDescriptions", MESSAGES.AddYearsMethodDescriptions());
    map.put("METHODDESC-AppendToFileMethodDescriptions", MESSAGES.AppendToFileMethodDescriptions());
    map.put("METHODDESC-AppendValueMethodDescriptions", MESSAGES.AppendValueMethodDescriptions());
    map.put("METHODDESC-AppendValueToListMethodDescriptions", MESSAGES.AppendValueToListMethodDescriptions());
    map.put("METHODDESC-AskForPermissionMethodDescriptions", MESSAGES.AskForPermissionMethodDescriptions());
    map.put("METHODDESC-AuthorizeMethodDescriptions", MESSAGES.AuthorizeMethodDescriptions());
    map.put("METHODDESC-Ball.BounceMethodDescriptions", MESSAGES.Ball__BounceMethodDescriptions());
    map.put("METHODDESC-Ball.CollidingWithMethodDescriptions", MESSAGES.Ball__CollidingWithMethodDescriptions());
    map.put("METHODDESC-Ball.MoveIntoBoundsMethodDescriptions", MESSAGES.Ball__MoveIntoBoundsMethodDescriptions());
    map.put("METHODDESC-Ball.MoveToMethodDescriptions", MESSAGES.Ball__MoveToMethodDescriptions());
    map.put("METHODDESC-Ball.MoveToPointMethodDescriptions", MESSAGES.Ball__MoveToPointMethodDescriptions());
    map.put("METHODDESC-Ball.PointInDirectionMethodDescriptions", MESSAGES.Ball__PointInDirectionMethodDescriptions());
    map.put("METHODDESC-Ball.PointTowardsMethodDescriptions", MESSAGES.Ball__PointTowardsMethodDescriptions());
    map.put("METHODDESC-BearingToFeatureMethodDescriptions", MESSAGES.BearingToFeatureMethodDescriptions());
    map.put("METHODDESC-BearingToPointMethodDescriptions", MESSAGES.BearingToPointMethodDescriptions());
    map.put("METHODDESC-BoundsMethodDescriptions", MESSAGES.BoundsMethodDescriptions());
    map.put("METHODDESC-BuildRequestDataMethodDescriptions", MESSAGES.BuildRequestDataMethodDescriptions());
    map.put("METHODDESC-BytesAvailableToReceiveMethodDescriptions", MESSAGES.BytesAvailableToReceiveMethodDescriptions());
    map.put("METHODDESC-CalculateLineOfBestFitValueMethodDescriptions", MESSAGES.CalculateLineOfBestFitValueMethodDescriptions());
    map.put("METHODDESC-CanGoBackMethodDescriptions", MESSAGES.CanGoBackMethodDescriptions());
    map.put("METHODDESC-CanGoForwardMethodDescriptions", MESSAGES.CanGoForwardMethodDescriptions());
    map.put("METHODDESC-Canvas.ClearMethodDescriptions", MESSAGES.Canvas__ClearMethodDescriptions());
    map.put("METHODDESC-Canvas.DrawCircleMethodDescriptions", MESSAGES.Canvas__DrawCircleMethodDescriptions());
    map.put("METHODDESC-Canvas.DrawLineMethodDescriptions", MESSAGES.Canvas__DrawLineMethodDescriptions());
    map.put("METHODDESC-Canvas.DrawPointMethodDescriptions", MESSAGES.Canvas__DrawPointMethodDescriptions());
    map.put("METHODDESC-Canvas.SaveMethodDescriptions", MESSAGES.Canvas__SaveMethodDescriptions());
    map.put("METHODDESC-CenterMethodDescriptions", MESSAGES.CenterMethodDescriptions());
    map.put("METHODDESC-CentroidMethodDescriptions", MESSAGES.CentroidMethodDescriptions());
    map.put("METHODDESC-ChangeDataSourceMethodDescriptions", MESSAGES.ChangeDataSourceMethodDescriptions());
    map.put("METHODDESC-ChartData2D.ClearMethodDescriptions", MESSAGES.ChartData2D__ClearMethodDescriptions());
    map.put("METHODDESC-ChatBot.CreateImageMethodDescriptions", MESSAGES.ChatBot__CreateImageMethodDescriptions());
    map.put("METHODDESC-CheckAuthorizedMethodDescriptions", MESSAGES.CheckAuthorizedMethodDescriptions());
    map.put("METHODDESC-Circle.DistanceToPointMethodDescriptions", MESSAGES.Circle__DistanceToPointMethodDescriptions());
    map.put("METHODDESC-Circle.SetLocationMethodDescriptions", MESSAGES.Circle__SetLocationMethodDescriptions());
    map.put("METHODDESC-Circle.ShowInfoboxMethodDescriptions", MESSAGES.Circle__ShowInfoboxMethodDescriptions());
    map.put("METHODDESC-CleanDataMethodDescriptions", MESSAGES.CleanDataMethodDescriptions());
    map.put("METHODDESC-ClearAllMethodDescriptions", MESSAGES.ClearAllMethodDescriptions());
    map.put("METHODDESC-ClearCachesMethodDescriptions", MESSAGES.ClearCachesMethodDescriptions());
    map.put("METHODDESC-ClearLocationsMethodDescriptions", MESSAGES.ClearLocationsMethodDescriptions());
    map.put("METHODDESC-ClearRangeMethodDescriptions", MESSAGES.ClearRangeMethodDescriptions());
    map.put("METHODDESC-ClearServerLogsMethodDescriptions", MESSAGES.ClearServerLogsMethodDescriptions());
    map.put("METHODDESC-CloseSerialMethodDescriptions", MESSAGES.CloseSerialMethodDescriptions());
    map.put("METHODDESC-CloudConnectedMethodDescriptions", MESSAGES.CloudConnectedMethodDescriptions());
    map.put("METHODDESC-CloudDB.ClearTagMethodDescriptions", MESSAGES.CloudDB__ClearTagMethodDescriptions());
    map.put("METHODDESC-CloudDB.GetValueMethodDescriptions", MESSAGES.CloudDB__GetValueMethodDescriptions());
    map.put("METHODDESC-CloudDB.StoreValueMethodDescriptions", MESSAGES.CloudDB__StoreValueMethodDescriptions());
    map.put("METHODDESC-ConnectMethodDescriptions", MESSAGES.ConnectMethodDescriptions());
    map.put("METHODDESC-ConnectWithUUIDMethodDescriptions", MESSAGES.ConnectWithUUIDMethodDescriptions());
    map.put("METHODDESC-ContactPicker.OpenMethodDescriptions", MESSAGES.ContactPicker__OpenMethodDescriptions());
    map.put("METHODDESC-ConverseMethodDescriptions", MESSAGES.ConverseMethodDescriptions());
    map.put("METHODDESC-ConverseWithImageMethodDescriptions", MESSAGES.ConverseWithImageMethodDescriptions());
    map.put("METHODDESC-CopyFileMethodDescriptions", MESSAGES.CopyFileMethodDescriptions());
    map.put("METHODDESC-CreateElementMethodDescriptions", MESSAGES.CreateElementMethodDescriptions());
    map.put("METHODDESC-CreateMarkerMethodDescriptions", MESSAGES.CreateMarkerMethodDescriptions());
    map.put("METHODDESC-DatePicker.LaunchPickerMethodDescriptions", MESSAGES.DatePicker__LaunchPickerMethodDescriptions());
    map.put("METHODDESC-DayOfMonthMethodDescriptions", MESSAGES.DayOfMonthMethodDescriptions());
    map.put("METHODDESC-DeAuthorizeMethodDescriptions", MESSAGES.DeAuthorizeMethodDescriptions());
    map.put("METHODDESC-DeleteFileMethodDescriptions", MESSAGES.DeleteFileMethodDescriptions());
    map.put("METHODDESC-DeleteSheetMethodDescriptions", MESSAGES.DeleteSheetMethodDescriptions());
    map.put("METHODDESC-DetectAnomaliesInChartDataMethodDescriptions", MESSAGES.DetectAnomaliesInChartDataMethodDescriptions());
    map.put("METHODDESC-DetectAnomaliesMethodDescriptions", MESSAGES.DetectAnomaliesMethodDescriptions());
    map.put("METHODDESC-DirectMessageMethodDescriptions", MESSAGES.DirectMessageMethodDescriptions());
    map.put("METHODDESC-DisconnectFromChartDataMethodDescriptions", MESSAGES.DisconnectFromChartDataMethodDescriptions());
    map.put("METHODDESC-DisconnectMethodDescriptions", MESSAGES.DisconnectMethodDescriptions());
    map.put("METHODDESC-DismissProgressDialogMethodDescriptions", MESSAGES.DismissProgressDialogMethodDescriptions());
    map.put("METHODDESC-DisplayDropdownMethodDescriptions", MESSAGES.DisplayDropdownMethodDescriptions());
    map.put("METHODDESC-DistanceToFeatureMethodDescriptions", MESSAGES.DistanceToFeatureMethodDescriptions());
    map.put("METHODDESC-DoQueryMethodDescriptions", MESSAGES.DoQueryMethodDescriptions());
    map.put("METHODDESC-DoScanMethodDescriptions", MESSAGES.DoScanMethodDescriptions());
    map.put("METHODDESC-DoesEntryExistMethodDescriptions", MESSAGES.DoesEntryExistMethodDescriptions());
    map.put("METHODDESC-DownloadFileMethodDescriptions", MESSAGES.DownloadFileMethodDescriptions());
    map.put("METHODDESC-DrawArcMethodDescriptions", MESSAGES.DrawArcMethodDescriptions());
    map.put("METHODDESC-DrawIconMethodDescriptions", MESSAGES.DrawIconMethodDescriptions());
    map.put("METHODDESC-DrawLineOfBestFitMethodDescriptions", MESSAGES.DrawLineOfBestFitMethodDescriptions());
    map.put("METHODDESC-DrawRectMethodDescriptions", MESSAGES.DrawRectMethodDescriptions());
    map.put("METHODDESC-DrawShapeMethodDescriptions", MESSAGES.DrawShapeMethodDescriptions());
    map.put("METHODDESC-DrawTextAtAngleMethodDescriptions", MESSAGES.DrawTextAtAngleMethodDescriptions());
    map.put("METHODDESC-DrawTextMethodDescriptions", MESSAGES.DrawTextMethodDescriptions());
    map.put("METHODDESC-DurationMethodDescriptions", MESSAGES.DurationMethodDescriptions());
    map.put("METHODDESC-DurationToDaysMethodDescriptions", MESSAGES.DurationToDaysMethodDescriptions());
    map.put("METHODDESC-DurationToHoursMethodDescriptions", MESSAGES.DurationToHoursMethodDescriptions());
    map.put("METHODDESC-DurationToMinutesMethodDescriptions", MESSAGES.DurationToMinutesMethodDescriptions());
    map.put("METHODDESC-DurationToSecondsMethodDescriptions", MESSAGES.DurationToSecondsMethodDescriptions());
    map.put("METHODDESC-DurationToWeeksMethodDescriptions", MESSAGES.DurationToWeeksMethodDescriptions());
    map.put("METHODDESC-EditImageMethodDescriptions", MESSAGES.EditImageMethodDescriptions());
    map.put("METHODDESC-EditImageWithMaskMethodDescriptions", MESSAGES.EditImageWithMaskMethodDescriptions());
    map.put("METHODDESC-EmailPicker.MoveCursorToEndMethodDescriptions", MESSAGES.EmailPicker__MoveCursorToEndMethodDescriptions());
    map.put("METHODDESC-EmailPicker.MoveCursorToMethodDescriptions", MESSAGES.EmailPicker__MoveCursorToMethodDescriptions());
    map.put("METHODDESC-EmailPicker.MoveCursorToStartMethodDescriptions", MESSAGES.EmailPicker__MoveCursorToStartMethodDescriptions());
    map.put("METHODDESC-EmailPicker.RequestFocusMethodDescriptions", MESSAGES.EmailPicker__RequestFocusMethodDescriptions());
    map.put("METHODDESC-Ev3ColorSensor.GetLightLevelMethodDescriptions", MESSAGES.Ev3ColorSensor__GetLightLevelMethodDescriptions());
    map.put("METHODDESC-Ev3Commands.GetFirmwareVersionMethodDescriptions", MESSAGES.Ev3Commands__GetFirmwareVersionMethodDescriptions());
    map.put("METHODDESC-Ev3Commands.KeepAliveMethodDescriptions", MESSAGES.Ev3Commands__KeepAliveMethodDescriptions());
    map.put("METHODDESC-Ev3Motors.StopMethodDescriptions", MESSAGES.Ev3Motors__StopMethodDescriptions());
    map.put("METHODDESC-Ev3UI.DrawCircleMethodDescriptions", MESSAGES.Ev3UI__DrawCircleMethodDescriptions());
    map.put("METHODDESC-Ev3UI.DrawLineMethodDescriptions", MESSAGES.Ev3UI__DrawLineMethodDescriptions());
    map.put("METHODDESC-Ev3UI.DrawPointMethodDescriptions", MESSAGES.Ev3UI__DrawPointMethodDescriptions());
    map.put("METHODDESC-ExistsMethodDescriptions", MESSAGES.ExistsMethodDescriptions());
    map.put("METHODDESC-ExtendDomainToIncludeMethodDescriptions", MESSAGES.ExtendDomainToIncludeMethodDescriptions());
    map.put("METHODDESC-ExtendRangeToIncludeMethodDescriptions", MESSAGES.ExtendRangeToIncludeMethodDescriptions());
    map.put("METHODDESC-FeatureFromDescriptionMethodDescriptions", MESSAGES.FeatureFromDescriptionMethodDescriptions());
    map.put("METHODDESC-FilePicker.OpenMethodDescriptions", MESSAGES.FilePicker__OpenMethodDescriptions());
    map.put("METHODDESC-File.DeleteMethodDescriptions", MESSAGES.File__DeleteMethodDescriptions());
    map.put("METHODDESC-FillScreenMethodDescriptions", MESSAGES.FillScreenMethodDescriptions());
    map.put("METHODDESC-FirebaseDB.ClearTagMethodDescriptions", MESSAGES.FirebaseDB__ClearTagMethodDescriptions());
    map.put("METHODDESC-FirebaseDB.GetValueMethodDescriptions", MESSAGES.FirebaseDB__GetValueMethodDescriptions());
    map.put("METHODDESC-FirebaseDB.StoreValueMethodDescriptions", MESSAGES.FirebaseDB__StoreValueMethodDescriptions());
    map.put("METHODDESC-FollowMethodDescriptions", MESSAGES.FollowMethodDescriptions());
    map.put("METHODDESC-ForgetLoginMethodDescriptions", MESSAGES.ForgetLoginMethodDescriptions());
    map.put("METHODDESC-FormatDateMethodDescriptions", MESSAGES.FormatDateMethodDescriptions());
    map.put("METHODDESC-FormatDateTimeMethodDescriptions", MESSAGES.FormatDateTimeMethodDescriptions());
    map.put("METHODDESC-FormatTimeMethodDescriptions", MESSAGES.FormatTimeMethodDescriptions());
    map.put("METHODDESC-GameClient.SendMessageMethodDescriptions", MESSAGES.GameClient__SendMessageMethodDescriptions());
    map.put("METHODDESC-GeocodeMethodDescriptions", MESSAGES.GeocodeMethodDescriptions());
    map.put("METHODDESC-GetAllEntriesMethodDescriptions", MESSAGES.GetAllEntriesMethodDescriptions());
    map.put("METHODDESC-GetBackgroundPixelColorMethodDescriptions", MESSAGES.GetBackgroundPixelColorMethodDescriptions());
    map.put("METHODDESC-GetBatteryCurrentMethodDescriptions", MESSAGES.GetBatteryCurrentMethodDescriptions());
    map.put("METHODDESC-GetBatteryLevelMethodDescriptions", MESSAGES.GetBatteryLevelMethodDescriptions());
    map.put("METHODDESC-GetBatteryVoltageMethodDescriptions", MESSAGES.GetBatteryVoltageMethodDescriptions());
    map.put("METHODDESC-GetBrickNameMethodDescriptions", MESSAGES.GetBrickNameMethodDescriptions());
    map.put("METHODDESC-GetCellReferenceMethodDescriptions", MESSAGES.GetCellReferenceMethodDescriptions());
    map.put("METHODDESC-GetColorCodeMethodDescriptions", MESSAGES.GetColorCodeMethodDescriptions());
    map.put("METHODDESC-GetColorMethodDescriptions", MESSAGES.GetColorMethodDescriptions());
    map.put("METHODDESC-GetColorNameMethodDescriptions", MESSAGES.GetColorNameMethodDescriptions());
    map.put("METHODDESC-GetCurrentProgramNameMethodDescriptions", MESSAGES.GetCurrentProgramNameMethodDescriptions());
    map.put("METHODDESC-GetDetailTextMethodDescriptions", MESSAGES.GetDetailTextMethodDescriptions());
    map.put("METHODDESC-GetDistanceMethodDescriptions", MESSAGES.GetDistanceMethodDescriptions());
    map.put("METHODDESC-GetDurationMethodDescriptions", MESSAGES.GetDurationMethodDescriptions());
    map.put("METHODDESC-GetEntriesMethodDescriptions", MESSAGES.GetEntriesMethodDescriptions());
    map.put("METHODDESC-GetEntriesWithXValueMethodDescriptions", MESSAGES.GetEntriesWithXValueMethodDescriptions());
    map.put("METHODDESC-GetEntriesWithYValueMethodDescriptions", MESSAGES.GetEntriesWithYValueMethodDescriptions());
    map.put("METHODDESC-GetFirmwareBuildMethodDescriptions", MESSAGES.GetFirmwareBuildMethodDescriptions());
    map.put("METHODDESC-GetHardwareVersionMethodDescriptions", MESSAGES.GetHardwareVersionMethodDescriptions());
    map.put("METHODDESC-GetImageNameMethodDescriptions", MESSAGES.GetImageNameMethodDescriptions());
    map.put("METHODDESC-GetInputValuesMethodDescriptions", MESSAGES.GetInputValuesMethodDescriptions());
    map.put("METHODDESC-GetInstallerMethodDescriptions", MESSAGES.GetInstallerMethodDescriptions());
    map.put("METHODDESC-GetInstanceListsMethodDescriptions", MESSAGES.GetInstanceListsMethodDescriptions());
    map.put("METHODDESC-GetLocalIpMethodDescriptions", MESSAGES.GetLocalIpMethodDescriptions());
    map.put("METHODDESC-GetMainTextMethodDescriptions", MESSAGES.GetMainTextMethodDescriptions());
    map.put("METHODDESC-GetMessagesMethodDescriptions", MESSAGES.GetMessagesMethodDescriptions());
    map.put("METHODDESC-GetMethodDescriptions", MESSAGES.GetMethodDescriptions());
    map.put("METHODDESC-GetMillisMethodDescriptions", MESSAGES.GetMillisMethodDescriptions());
    map.put("METHODDESC-GetOSBuildMethodDescriptions", MESSAGES.GetOSBuildMethodDescriptions());
    map.put("METHODDESC-GetOSVersionMethodDescriptions", MESSAGES.GetOSVersionMethodDescriptions());
    map.put("METHODDESC-GetOutputStateMethodDescriptions", MESSAGES.GetOutputStateMethodDescriptions());
    map.put("METHODDESC-GetPixelColorMethodDescriptions", MESSAGES.GetPixelColorMethodDescriptions());
    map.put("METHODDESC-GetRangeReferenceMethodDescriptions", MESSAGES.GetRangeReferenceMethodDescriptions());
    map.put("METHODDESC-GetResultValueMethodDescriptions", MESSAGES.GetResultValueMethodDescriptions());
    map.put("METHODDESC-GetRowsMethodDescriptions", MESSAGES.GetRowsMethodDescriptions());
    map.put("METHODDESC-GetRowsWithConditionsMethodDescriptions", MESSAGES.GetRowsWithConditionsMethodDescriptions());
    map.put("METHODDESC-GetSensorValueMethodDescriptions", MESSAGES.GetSensorValueMethodDescriptions());
    map.put("METHODDESC-GetServerLogsMethodDescriptions", MESSAGES.GetServerLogsMethodDescriptions());
    map.put("METHODDESC-GetSoundLevelMethodDescriptions", MESSAGES.GetSoundLevelMethodDescriptions());
    map.put("METHODDESC-GetTachoCountMethodDescriptions", MESSAGES.GetTachoCountMethodDescriptions());
    map.put("METHODDESC-GetTagListMethodDescriptions", MESSAGES.GetTagListMethodDescriptions());
    map.put("METHODDESC-GetTagsMethodDescriptions", MESSAGES.GetTagsMethodDescriptions());
    map.put("METHODDESC-GetTextMethodDescriptions", MESSAGES.GetTextMethodDescriptions());
    map.put("METHODDESC-GetVersionNameMethodDescriptions", MESSAGES.GetVersionNameMethodDescriptions());
    map.put("METHODDESC-GetWifiIpAddressMethodDescriptions", MESSAGES.GetWifiIpAddressMethodDescriptions());
    map.put("METHODDESC-GoBackMethodDescriptions", MESSAGES.GoBackMethodDescriptions());
    map.put("METHODDESC-GoForwardMethodDescriptions", MESSAGES.GoForwardMethodDescriptions());
    map.put("METHODDESC-GoHomeMethodDescriptions", MESSAGES.GoHomeMethodDescriptions());
    map.put("METHODDESC-GoToUrlMethodDescriptions", MESSAGES.GoToUrlMethodDescriptions());
    map.put("METHODDESC-HideInfoboxMethodDescriptions", MESSAGES.HideInfoboxMethodDescriptions());
    map.put("METHODDESC-HighlightDataPointsMethodDescriptions", MESSAGES.HighlightDataPointsMethodDescriptions());
    map.put("METHODDESC-HourMethodDescriptions", MESSAGES.HourMethodDescriptions());
    map.put("METHODDESC-HtmlTextDecodeMethodDescriptions", MESSAGES.HtmlTextDecodeMethodDescriptions());
    map.put("METHODDESC-ImageBot.CreateImageMethodDescriptions", MESSAGES.ImageBot__CreateImageMethodDescriptions());
    map.put("METHODDESC-ImagePicker.OpenMethodDescriptions", MESSAGES.ImagePicker__OpenMethodDescriptions());
    map.put("METHODDESC-ImageSprite.BounceMethodDescriptions", MESSAGES.ImageSprite__BounceMethodDescriptions());
    map.put("METHODDESC-ImageSprite.CollidingWithMethodDescriptions", MESSAGES.ImageSprite__CollidingWithMethodDescriptions());
    map.put("METHODDESC-ImageSprite.MoveIntoBoundsMethodDescriptions", MESSAGES.ImageSprite__MoveIntoBoundsMethodDescriptions());
    map.put("METHODDESC-ImageSprite.MoveToMethodDescriptions", MESSAGES.ImageSprite__MoveToMethodDescriptions());
    map.put("METHODDESC-ImageSprite.MoveToPointMethodDescriptions", MESSAGES.ImageSprite__MoveToPointMethodDescriptions());
    map.put("METHODDESC-ImageSprite.PointInDirectionMethodDescriptions", MESSAGES.ImageSprite__PointInDirectionMethodDescriptions());
    map.put("METHODDESC-ImageSprite.PointTowardsMethodDescriptions", MESSAGES.ImageSprite__PointTowardsMethodDescriptions());
    map.put("METHODDESC-ImportFromCloudDBMethodDescriptions", MESSAGES.ImportFromCloudDBMethodDescriptions());
    map.put("METHODDESC-ImportFromDataFileMethodDescriptions", MESSAGES.ImportFromDataFileMethodDescriptions());
    map.put("METHODDESC-ImportFromListMethodDescriptions", MESSAGES.ImportFromListMethodDescriptions());
    map.put("METHODDESC-ImportFromSpreadsheetMethodDescriptions", MESSAGES.ImportFromSpreadsheetMethodDescriptions());
    map.put("METHODDESC-ImportFromTinyDBMethodDescriptions", MESSAGES.ImportFromTinyDBMethodDescriptions());
    map.put("METHODDESC-ImportFromWebMethodDescriptions", MESSAGES.ImportFromWebMethodDescriptions());
    map.put("METHODDESC-IncrementProgressByMethodDescriptions", MESSAGES.IncrementProgressByMethodDescriptions());
    map.put("METHODDESC-InitializeFromCloudMethodDescriptions", MESSAGES.InitializeFromCloudMethodDescriptions());
    map.put("METHODDESC-InitializeSerialMethodDescriptions", MESSAGES.InitializeSerialMethodDescriptions());
    map.put("METHODDESC-InsertRowMethodDescriptions", MESSAGES.InsertRowMethodDescriptions());
    map.put("METHODDESC-InstallationIdMethodDescriptions", MESSAGES.InstallationIdMethodDescriptions());
    map.put("METHODDESC-InviteMethodDescriptions", MESSAGES.InviteMethodDescriptions());
    map.put("METHODDESC-IsDevicePairedMethodDescriptions", MESSAGES.IsDevicePairedMethodDescriptions());
    map.put("METHODDESC-IsDirectoryMethodDescriptions", MESSAGES.IsDirectoryMethodDescriptions());
    map.put("METHODDESC-IsPressedMethodDescriptions", MESSAGES.IsPressedMethodDescriptions());
    map.put("METHODDESC-JsonObjectEncodeMethodDescriptions", MESSAGES.JsonObjectEncodeMethodDescriptions());
    map.put("METHODDESC-JsonTextDecodeMethodDescriptions", MESSAGES.JsonTextDecodeMethodDescriptions());
    map.put("METHODDESC-JsonTextDecodeWithDictionariesMethodDescriptions", MESSAGES.JsonTextDecodeWithDictionariesMethodDescriptions());
    map.put("METHODDESC-LatitudeFromAddressMethodDescriptions", MESSAGES.LatitudeFromAddressMethodDescriptions());
    map.put("METHODDESC-LeaveInstanceMethodDescriptions", MESSAGES.LeaveInstanceMethodDescriptions());
    map.put("METHODDESC-LineString.DistanceToPointMethodDescriptions", MESSAGES.LineString__DistanceToPointMethodDescriptions());
    map.put("METHODDESC-LineString.ShowInfoboxMethodDescriptions", MESSAGES.LineString__ShowInfoboxMethodDescriptions());
    map.put("METHODDESC-ListDirectoryMethodDescriptions", MESSAGES.ListDirectoryMethodDescriptions());
    map.put("METHODDESC-ListFilesMethodDescriptions", MESSAGES.ListFilesMethodDescriptions());
    map.put("METHODDESC-ListPicker.OpenMethodDescriptions", MESSAGES.ListPicker__OpenMethodDescriptions());
    map.put("METHODDESC-LoadFromURLMethodDescriptions", MESSAGES.LoadFromURLMethodDescriptions());
    map.put("METHODDESC-LogErrorMethodDescriptions", MESSAGES.LogErrorMethodDescriptions());
    map.put("METHODDESC-LogInfoMethodDescriptions", MESSAGES.LogInfoMethodDescriptions());
    map.put("METHODDESC-LogWarningMethodDescriptions", MESSAGES.LogWarningMethodDescriptions());
    map.put("METHODDESC-LoginMethodDescriptions", MESSAGES.LoginMethodDescriptions());
    map.put("METHODDESC-LongitudeFromAddressMethodDescriptions", MESSAGES.LongitudeFromAddressMethodDescriptions());
    map.put("METHODDESC-LsGetStatusMethodDescriptions", MESSAGES.LsGetStatusMethodDescriptions());
    map.put("METHODDESC-LsReadMethodDescriptions", MESSAGES.LsReadMethodDescriptions());
    map.put("METHODDESC-LsWriteMethodDescriptions", MESSAGES.LsWriteMethodDescriptions());
    map.put("METHODDESC-MakeDateMethodDescriptions", MESSAGES.MakeDateMethodDescriptions());
    map.put("METHODDESC-MakeDirectoryMethodDescriptions", MESSAGES.MakeDirectoryMethodDescriptions());
    map.put("METHODDESC-MakeFullPathMethodDescriptions", MESSAGES.MakeFullPathMethodDescriptions());
    map.put("METHODDESC-MakeInstantFromMillisMethodDescriptions", MESSAGES.MakeInstantFromMillisMethodDescriptions());
    map.put("METHODDESC-MakeInstantFromPartsMethodDescriptions", MESSAGES.MakeInstantFromPartsMethodDescriptions());
    map.put("METHODDESC-MakeInstantMethodDescriptions", MESSAGES.MakeInstantMethodDescriptions());
    map.put("METHODDESC-MakeNewInstanceMethodDescriptions", MESSAGES.MakeNewInstanceMethodDescriptions());
    map.put("METHODDESC-MakePhoneCallDirectMethodDescriptions", MESSAGES.MakePhoneCallDirectMethodDescriptions());
    map.put("METHODDESC-MakePhoneCallMethodDescriptions", MESSAGES.MakePhoneCallMethodDescriptions());
    map.put("METHODDESC-MakeTimeMethodDescriptions", MESSAGES.MakeTimeMethodDescriptions());
    map.put("METHODDESC-Map.SaveMethodDescriptions", MESSAGES.Map__SaveMethodDescriptions());
    map.put("METHODDESC-Marker.DistanceToPointMethodDescriptions", MESSAGES.Marker__DistanceToPointMethodDescriptions());
    map.put("METHODDESC-Marker.SetLocationMethodDescriptions", MESSAGES.Marker__SetLocationMethodDescriptions());
    map.put("METHODDESC-Marker.ShowInfoboxMethodDescriptions", MESSAGES.Marker__ShowInfoboxMethodDescriptions());
    map.put("METHODDESC-MessageReadMethodDescriptions", MESSAGES.MessageReadMethodDescriptions());
    map.put("METHODDESC-MessageWriteMethodDescriptions", MESSAGES.MessageWriteMethodDescriptions());
    map.put("METHODDESC-MinuteMethodDescriptions", MESSAGES.MinuteMethodDescriptions());
    map.put("METHODDESC-MonthMethodDescriptions", MESSAGES.MonthMethodDescriptions());
    map.put("METHODDESC-MonthNameMethodDescriptions", MESSAGES.MonthNameMethodDescriptions());
    map.put("METHODDESC-MoveBackwardIndefinitelyMethodDescriptions", MESSAGES.MoveBackwardIndefinitelyMethodDescriptions());
    map.put("METHODDESC-MoveBackwardMethodDescriptions", MESSAGES.MoveBackwardMethodDescriptions());
    map.put("METHODDESC-MoveFileMethodDescriptions", MESSAGES.MoveFileMethodDescriptions());
    map.put("METHODDESC-MoveForwardIndefinitelyMethodDescriptions", MESSAGES.MoveForwardIndefinitelyMethodDescriptions());
    map.put("METHODDESC-MoveForwardMethodDescriptions", MESSAGES.MoveForwardMethodDescriptions());
    map.put("METHODDESC-NowMethodDescriptions", MESSAGES.NowMethodDescriptions());
    map.put("METHODDESC-NxtColorSensor.GetLightLevelMethodDescriptions", MESSAGES.NxtColorSensor__GetLightLevelMethodDescriptions());
    map.put("METHODDESC-NxtDirectCommands.GetFirmwareVersionMethodDescriptions", MESSAGES.NxtDirectCommands__GetFirmwareVersionMethodDescriptions());
    map.put("METHODDESC-NxtDirectCommands.KeepAliveMethodDescriptions", MESSAGES.NxtDirectCommands__KeepAliveMethodDescriptions());
    map.put("METHODDESC-NxtDrive.StopMethodDescriptions", MESSAGES.NxtDrive__StopMethodDescriptions());
    map.put("METHODDESC-NxtLightSensor.GetLightLevelMethodDescriptions", MESSAGES.NxtLightSensor__GetLightLevelMethodDescriptions());
    map.put("METHODDESC-OpenSerialMethodDescriptions", MESSAGES.OpenSerialMethodDescriptions());
    map.put("METHODDESC-PanToMethodDescriptions", MESSAGES.PanToMethodDescriptions());
    map.put("METHODDESC-PasswordTextBox.MoveCursorToEndMethodDescriptions", MESSAGES.PasswordTextBox__MoveCursorToEndMethodDescriptions());
    map.put("METHODDESC-PasswordTextBox.MoveCursorToMethodDescriptions", MESSAGES.PasswordTextBox__MoveCursorToMethodDescriptions());
    map.put("METHODDESC-PasswordTextBox.MoveCursorToStartMethodDescriptions", MESSAGES.PasswordTextBox__MoveCursorToStartMethodDescriptions());
    map.put("METHODDESC-PasswordTextBox.RequestFocusMethodDescriptions", MESSAGES.PasswordTextBox__RequestFocusMethodDescriptions());
    map.put("METHODDESC-PatchFileMethodDescriptions", MESSAGES.PatchFileMethodDescriptions());
    map.put("METHODDESC-PatchTextMethodDescriptions", MESSAGES.PatchTextMethodDescriptions());
    map.put("METHODDESC-PatchTextWithEncodingMethodDescriptions", MESSAGES.PatchTextWithEncodingMethodDescriptions());
    map.put("METHODDESC-Pedometer.PauseMethodDescriptions", MESSAGES.Pedometer__PauseMethodDescriptions());
    map.put("METHODDESC-Pedometer.ResumeMethodDescriptions", MESSAGES.Pedometer__ResumeMethodDescriptions());
    map.put("METHODDESC-Pedometer.SaveMethodDescriptions", MESSAGES.Pedometer__SaveMethodDescriptions());
    map.put("METHODDESC-Pedometer.StartMethodDescriptions", MESSAGES.Pedometer__StartMethodDescriptions());
    map.put("METHODDESC-Pedometer.StopMethodDescriptions", MESSAGES.Pedometer__StopMethodDescriptions());
    map.put("METHODDESC-PhoneNumberPicker.OpenMethodDescriptions", MESSAGES.PhoneNumberPicker__OpenMethodDescriptions());
    map.put("METHODDESC-PlayMethodDescriptions", MESSAGES.PlayMethodDescriptions());
    map.put("METHODDESC-PlaySoundFileMethodDescriptions", MESSAGES.PlaySoundFileMethodDescriptions());
    map.put("METHODDESC-PlayToneMethodDescriptions", MESSAGES.PlayToneMethodDescriptions());
    map.put("METHODDESC-Player.PauseMethodDescriptions", MESSAGES.Player__PauseMethodDescriptions());
    map.put("METHODDESC-Player.StartMethodDescriptions", MESSAGES.Player__StartMethodDescriptions());
    map.put("METHODDESC-Player.StopMethodDescriptions", MESSAGES.Player__StopMethodDescriptions());
    map.put("METHODDESC-Player.VibrateMethodDescriptions", MESSAGES.Player__VibrateMethodDescriptions());
    map.put("METHODDESC-Polygon.DistanceToPointMethodDescriptions", MESSAGES.Polygon__DistanceToPointMethodDescriptions());
    map.put("METHODDESC-Polygon.ShowInfoboxMethodDescriptions", MESSAGES.Polygon__ShowInfoboxMethodDescriptions());
    map.put("METHODDESC-PostFileMethodDescriptions", MESSAGES.PostFileMethodDescriptions());
    map.put("METHODDESC-PostMediaMethodDescriptions", MESSAGES.PostMediaMethodDescriptions());
    map.put("METHODDESC-PostTextMethodDescriptions", MESSAGES.PostTextMethodDescriptions());
    map.put("METHODDESC-PostTextWithEncodingMethodDescriptions", MESSAGES.PostTextWithEncodingMethodDescriptions());
    map.put("METHODDESC-PrintSerialMethodDescriptions", MESSAGES.PrintSerialMethodDescriptions());
    map.put("METHODDESC-PutFileMethodDescriptions", MESSAGES.PutFileMethodDescriptions());
    map.put("METHODDESC-PutTextMethodDescriptions", MESSAGES.PutTextMethodDescriptions());
    map.put("METHODDESC-PutTextWithEncodingMethodDescriptions", MESSAGES.PutTextWithEncodingMethodDescriptions());
    map.put("METHODDESC-ReadCellMethodDescriptions", MESSAGES.ReadCellMethodDescriptions());
    map.put("METHODDESC-ReadColumnMethodDescriptions", MESSAGES.ReadColumnMethodDescriptions());
    map.put("METHODDESC-ReadFileMethodDescriptions", MESSAGES.ReadFileMethodDescriptions());
    map.put("METHODDESC-ReadFromMethodDescriptions", MESSAGES.ReadFromMethodDescriptions());
    map.put("METHODDESC-ReadRangeMethodDescriptions", MESSAGES.ReadRangeMethodDescriptions());
    map.put("METHODDESC-ReadRowMethodDescriptions", MESSAGES.ReadRowMethodDescriptions());
    map.put("METHODDESC-ReadSerialMethodDescriptions", MESSAGES.ReadSerialMethodDescriptions());
    map.put("METHODDESC-ReadSheetMethodDescriptions", MESSAGES.ReadSheetMethodDescriptions());
    map.put("METHODDESC-ReadWithExactFilterMethodDescriptions", MESSAGES.ReadWithExactFilterMethodDescriptions());
    map.put("METHODDESC-ReadWithPartialFilterMethodDescriptions", MESSAGES.ReadWithPartialFilterMethodDescriptions());
    map.put("METHODDESC-ReceiveSigned1ByteNumberMethodDescriptions", MESSAGES.ReceiveSigned1ByteNumberMethodDescriptions());
    map.put("METHODDESC-ReceiveSigned2ByteNumberMethodDescriptions", MESSAGES.ReceiveSigned2ByteNumberMethodDescriptions());
    map.put("METHODDESC-ReceiveSigned4ByteNumberMethodDescriptions", MESSAGES.ReceiveSigned4ByteNumberMethodDescriptions());
    map.put("METHODDESC-ReceiveSignedBytesMethodDescriptions", MESSAGES.ReceiveSignedBytesMethodDescriptions());
    map.put("METHODDESC-ReceiveTextMethodDescriptions", MESSAGES.ReceiveTextMethodDescriptions());
    map.put("METHODDESC-ReceiveUnsigned1ByteNumberMethodDescriptions", MESSAGES.ReceiveUnsigned1ByteNumberMethodDescriptions());
    map.put("METHODDESC-ReceiveUnsigned2ByteNumberMethodDescriptions", MESSAGES.ReceiveUnsigned2ByteNumberMethodDescriptions());
    map.put("METHODDESC-ReceiveUnsigned4ByteNumberMethodDescriptions", MESSAGES.ReceiveUnsigned4ByteNumberMethodDescriptions());
    map.put("METHODDESC-ReceiveUnsignedBytesMethodDescriptions", MESSAGES.ReceiveUnsignedBytesMethodDescriptions());
    map.put("METHODDESC-RecordVideoMethodDescriptions", MESSAGES.RecordVideoMethodDescriptions());
    map.put("METHODDESC-Rectangle.DistanceToPointMethodDescriptions", MESSAGES.Rectangle__DistanceToPointMethodDescriptions());
    map.put("METHODDESC-Rectangle.ShowInfoboxMethodDescriptions", MESSAGES.Rectangle__ShowInfoboxMethodDescriptions());
    map.put("METHODDESC-RefreshMethodDescriptions", MESSAGES.RefreshMethodDescriptions());
    map.put("METHODDESC-ReloadMethodDescriptions", MESSAGES.ReloadMethodDescriptions());
    map.put("METHODDESC-RemoveColumnMethodDescriptions", MESSAGES.RemoveColumnMethodDescriptions());
    map.put("METHODDESC-RemoveDataSourceMethodDescriptions", MESSAGES.RemoveDataSourceMethodDescriptions());
    map.put("METHODDESC-RemoveDirectoryMethodDescriptions", MESSAGES.RemoveDirectoryMethodDescriptions());
    map.put("METHODDESC-RemoveEntryMethodDescriptions", MESSAGES.RemoveEntryMethodDescriptions());
    map.put("METHODDESC-RemoveFirstFromListMethodDescriptions", MESSAGES.RemoveFirstFromListMethodDescriptions());
    map.put("METHODDESC-RemoveFirstMethodDescriptions", MESSAGES.RemoveFirstMethodDescriptions());
    map.put("METHODDESC-RemoveItemAtIndexMethodDescriptions", MESSAGES.RemoveItemAtIndexMethodDescriptions());
    map.put("METHODDESC-RemoveRowMethodDescriptions", MESSAGES.RemoveRowMethodDescriptions());
    map.put("METHODDESC-RequestBallotMethodDescriptions", MESSAGES.RequestBallotMethodDescriptions());
    map.put("METHODDESC-RequestDirectMessagesMethodDescriptions", MESSAGES.RequestDirectMessagesMethodDescriptions());
    map.put("METHODDESC-RequestDirectionsMethodDescriptions", MESSAGES.RequestDirectionsMethodDescriptions());
    map.put("METHODDESC-RequestFollowersMethodDescriptions", MESSAGES.RequestFollowersMethodDescriptions());
    map.put("METHODDESC-RequestFriendTimelineMethodDescriptions", MESSAGES.RequestFriendTimelineMethodDescriptions());
    map.put("METHODDESC-RequestMentionsMethodDescriptions", MESSAGES.RequestMentionsMethodDescriptions());
    map.put("METHODDESC-ResetAxesMethodDescriptions", MESSAGES.ResetAxesMethodDescriptions());
    map.put("METHODDESC-ResetConversationMethodDescriptions", MESSAGES.ResetConversationMethodDescriptions());
    map.put("METHODDESC-ResetInputScaledValueMethodDescriptions", MESSAGES.ResetInputScaledValueMethodDescriptions());
    map.put("METHODDESC-ResetMethodDescriptions", MESSAGES.ResetMethodDescriptions());
    map.put("METHODDESC-ResetMotorPositionMethodDescriptions", MESSAGES.ResetMotorPositionMethodDescriptions());
    map.put("METHODDESC-ResetTachoCountMethodDescriptions", MESSAGES.ResetTachoCountMethodDescriptions());
    map.put("METHODDESC-ResolveActivityMethodDescriptions", MESSAGES.ResolveActivityMethodDescriptions());
    map.put("METHODDESC-ReverseGeocodeMethodDescriptions", MESSAGES.ReverseGeocodeMethodDescriptions());
    map.put("METHODDESC-RotateInDistanceMethodDescriptions", MESSAGES.RotateInDistanceMethodDescriptions());
    map.put("METHODDESC-RotateInDurationMethodDescriptions", MESSAGES.RotateInDurationMethodDescriptions());
    map.put("METHODDESC-RotateInTachoCountsMethodDescriptions", MESSAGES.RotateInTachoCountsMethodDescriptions());
    map.put("METHODDESC-RotateIndefinitelyMethodDescriptions", MESSAGES.RotateIndefinitelyMethodDescriptions());
    map.put("METHODDESC-RotateSyncInDistanceMethodDescriptions", MESSAGES.RotateSyncInDistanceMethodDescriptions());
    map.put("METHODDESC-RotateSyncInDurationMethodDescriptions", MESSAGES.RotateSyncInDurationMethodDescriptions());
    map.put("METHODDESC-RotateSyncInTachoCountsMethodDescriptions", MESSAGES.RotateSyncInTachoCountsMethodDescriptions());
    map.put("METHODDESC-RotateSyncIndefinitelyMethodDescriptions", MESSAGES.RotateSyncIndefinitelyMethodDescriptions());
    map.put("METHODDESC-RunJavaScriptMethodDescriptions", MESSAGES.RunJavaScriptMethodDescriptions());
    map.put("METHODDESC-SaveAsMethodDescriptions", MESSAGES.SaveAsMethodDescriptions());
    map.put("METHODDESC-SaveFileMethodDescriptions", MESSAGES.SaveFileMethodDescriptions());
    map.put("METHODDESC-Screen.HideKeyboardMethodDescriptions", MESSAGES.Screen__HideKeyboardMethodDescriptions());
    map.put("METHODDESC-SdkLevelMethodDescriptions", MESSAGES.SdkLevelMethodDescriptions());
    map.put("METHODDESC-SearchTwitterMethodDescriptions", MESSAGES.SearchTwitterMethodDescriptions());
    map.put("METHODDESC-SecondMethodDescriptions", MESSAGES.SecondMethodDescriptions());
    map.put("METHODDESC-SeekToMethodDescriptions", MESSAGES.SeekToMethodDescriptions());
    map.put("METHODDESC-Send1ByteNumberMethodDescriptions", MESSAGES.Send1ByteNumberMethodDescriptions());
    map.put("METHODDESC-Send2ByteNumberMethodDescriptions", MESSAGES.Send2ByteNumberMethodDescriptions());
    map.put("METHODDESC-Send4ByteNumberMethodDescriptions", MESSAGES.Send4ByteNumberMethodDescriptions());
    map.put("METHODDESC-SendBallotMethodDescriptions", MESSAGES.SendBallotMethodDescriptions());
    map.put("METHODDESC-SendBytesMethodDescriptions", MESSAGES.SendBytesMethodDescriptions());
    map.put("METHODDESC-SendMessageDirectMethodDescriptions", MESSAGES.SendMessageDirectMethodDescriptions());
    map.put("METHODDESC-SendQueryMethodDescriptions", MESSAGES.SendQueryMethodDescriptions());
    map.put("METHODDESC-SendTextMethodDescriptions", MESSAGES.SendTextMethodDescriptions());
    map.put("METHODDESC-ServerCommandMethodDescriptions", MESSAGES.ServerCommandMethodDescriptions());
    map.put("METHODDESC-SetAmbientModeMethodDescriptions", MESSAGES.SetAmbientModeMethodDescriptions());
    map.put("METHODDESC-SetAngleModeMethodDescriptions", MESSAGES.SetAngleModeMethodDescriptions());
    map.put("METHODDESC-SetBackgroundPixelColorMethodDescriptions", MESSAGES.SetBackgroundPixelColorMethodDescriptions());
    map.put("METHODDESC-SetBrickNameMethodDescriptions", MESSAGES.SetBrickNameMethodDescriptions());
    map.put("METHODDESC-SetCenterMethodDescriptions", MESSAGES.SetCenterMethodDescriptions());
    map.put("METHODDESC-SetCmUnitMethodDescriptions", MESSAGES.SetCmUnitMethodDescriptions());
    map.put("METHODDESC-SetColorModeMethodDescriptions", MESSAGES.SetColorModeMethodDescriptions());
    map.put("METHODDESC-SetDateToDisplayFromInstantMethodDescriptions", MESSAGES.SetDateToDisplayFromInstantMethodDescriptions());
    map.put("METHODDESC-SetDateToDisplayMethodDescriptions", MESSAGES.SetDateToDisplayMethodDescriptions());
    map.put("METHODDESC-SetDomainMethodDescriptions", MESSAGES.SetDomainMethodDescriptions());
    map.put("METHODDESC-SetInchUnitMethodDescriptions", MESSAGES.SetInchUnitMethodDescriptions());
    map.put("METHODDESC-SetInputModeMethodDescriptions", MESSAGES.SetInputModeMethodDescriptions());
    map.put("METHODDESC-SetInstanceMethodDescriptions", MESSAGES.SetInstanceMethodDescriptions());
    map.put("METHODDESC-SetLeaderMethodDescriptions", MESSAGES.SetLeaderMethodDescriptions());
    map.put("METHODDESC-SetOutputStateMethodDescriptions", MESSAGES.SetOutputStateMethodDescriptions());
    map.put("METHODDESC-SetPopupMethodDescriptions", MESSAGES.SetPopupMethodDescriptions());
    map.put("METHODDESC-SetRangeMethodDescriptions", MESSAGES.SetRangeMethodDescriptions());
    map.put("METHODDESC-SetRateModeMethodDescriptions", MESSAGES.SetRateModeMethodDescriptions());
    map.put("METHODDESC-SetReflectedModeMethodDescriptions", MESSAGES.SetReflectedModeMethodDescriptions());
    map.put("METHODDESC-SetTimeToDisplayFromInstantMethodDescriptions", MESSAGES.SetTimeToDisplayFromInstantMethodDescriptions());
    map.put("METHODDESC-SetTimeToDisplayMethodDescriptions", MESSAGES.SetTimeToDisplayMethodDescriptions());
    map.put("METHODDESC-ShareFileMethodDescriptions", MESSAGES.ShareFileMethodDescriptions());
    map.put("METHODDESC-ShareFileWithMessageMethodDescriptions", MESSAGES.ShareFileWithMessageMethodDescriptions());
    map.put("METHODDESC-ShareMessageMethodDescriptions", MESSAGES.ShareMessageMethodDescriptions());
    map.put("METHODDESC-ShowAlertMethodDescriptions", MESSAGES.ShowAlertMethodDescriptions());
    map.put("METHODDESC-ShowChooseDialogMethodDescriptions", MESSAGES.ShowChooseDialogMethodDescriptions());
    map.put("METHODDESC-ShowMessageDialogMethodDescriptions", MESSAGES.ShowMessageDialogMethodDescriptions());
    map.put("METHODDESC-ShowPasswordDialogMethodDescriptions", MESSAGES.ShowPasswordDialogMethodDescriptions());
    map.put("METHODDESC-ShowProgressDialogMethodDescriptions", MESSAGES.ShowProgressDialogMethodDescriptions());
    map.put("METHODDESC-ShowTextDialogMethodDescriptions", MESSAGES.ShowTextDialogMethodDescriptions());
    map.put("METHODDESC-SoundRecorder.StartMethodDescriptions", MESSAGES.SoundRecorder__StartMethodDescriptions());
    map.put("METHODDESC-SoundRecorder.StopMethodDescriptions", MESSAGES.SoundRecorder__StopMethodDescriptions());
    map.put("METHODDESC-Sound.PauseMethodDescriptions", MESSAGES.Sound__PauseMethodDescriptions());
    map.put("METHODDESC-Sound.ResumeMethodDescriptions", MESSAGES.Sound__ResumeMethodDescriptions());
    map.put("METHODDESC-Sound.StopMethodDescriptions", MESSAGES.Sound__StopMethodDescriptions());
    map.put("METHODDESC-Sound.VibrateMethodDescriptions", MESSAGES.Sound__VibrateMethodDescriptions());
    map.put("METHODDESC-SpeakMethodDescriptions", MESSAGES.SpeakMethodDescriptions());
    map.put("METHODDESC-SpeechRecognizer.StopMethodDescriptions", MESSAGES.SpeechRecognizer__StopMethodDescriptions());
    map.put("METHODDESC-StartActivityMethodDescriptions", MESSAGES.StartActivityMethodDescriptions());
    map.put("METHODDESC-StartProgramMethodDescriptions", MESSAGES.StartProgramMethodDescriptions());
    map.put("METHODDESC-StopAcceptingMethodDescriptions", MESSAGES.StopAcceptingMethodDescriptions());
    map.put("METHODDESC-StopFollowingMethodDescriptions", MESSAGES.StopFollowingMethodDescriptions());
    map.put("METHODDESC-StopLoadingMethodDescriptions", MESSAGES.StopLoadingMethodDescriptions());
    map.put("METHODDESC-StopProgramMethodDescriptions", MESSAGES.StopProgramMethodDescriptions());
    map.put("METHODDESC-StopSoundMethodDescriptions", MESSAGES.StopSoundMethodDescriptions());
    map.put("METHODDESC-StopSoundPlaybackMethodDescriptions", MESSAGES.StopSoundPlaybackMethodDescriptions());
    map.put("METHODDESC-SystemTimeMethodDescriptions", MESSAGES.SystemTimeMethodDescriptions());
    map.put("METHODDESC-TakePictureMethodDescriptions", MESSAGES.TakePictureMethodDescriptions());
    map.put("METHODDESC-TextBox.HideKeyboardMethodDescriptions", MESSAGES.TextBox__HideKeyboardMethodDescriptions());
    map.put("METHODDESC-TextBox.MoveCursorToEndMethodDescriptions", MESSAGES.TextBox__MoveCursorToEndMethodDescriptions());
    map.put("METHODDESC-TextBox.MoveCursorToMethodDescriptions", MESSAGES.TextBox__MoveCursorToMethodDescriptions());
    map.put("METHODDESC-TextBox.MoveCursorToStartMethodDescriptions", MESSAGES.TextBox__MoveCursorToStartMethodDescriptions());
    map.put("METHODDESC-TextBox.RequestFocusMethodDescriptions", MESSAGES.TextBox__RequestFocusMethodDescriptions());
    map.put("METHODDESC-TextToSpeech.StopMethodDescriptions", MESSAGES.TextToSpeech__StopMethodDescriptions());
    map.put("METHODDESC-Texting.SendMessageMethodDescriptions", MESSAGES.Texting__SendMessageMethodDescriptions());
    map.put("METHODDESC-TimePicker.LaunchPickerMethodDescriptions", MESSAGES.TimePicker__LaunchPickerMethodDescriptions());
    map.put("METHODDESC-TinyDB.ClearTagMethodDescriptions", MESSAGES.TinyDB__ClearTagMethodDescriptions());
    map.put("METHODDESC-TinyDB.GetValueMethodDescriptions", MESSAGES.TinyDB__GetValueMethodDescriptions());
    map.put("METHODDESC-TinyDB.StoreValueMethodDescriptions", MESSAGES.TinyDB__StoreValueMethodDescriptions());
    map.put("METHODDESC-TinyWebDB.GetValueMethodDescriptions", MESSAGES.TinyWebDB__GetValueMethodDescriptions());
    map.put("METHODDESC-TinyWebDB.StoreValueMethodDescriptions", MESSAGES.TinyWebDB__StoreValueMethodDescriptions());
    map.put("METHODDESC-ToggleDirectionMethodDescriptions", MESSAGES.ToggleDirectionMethodDescriptions());
    map.put("METHODDESC-Translator.RequestTranslationMethodDescriptions", MESSAGES.Translator__RequestTranslationMethodDescriptions());
    map.put("METHODDESC-TurnClockwiseIndefinitelyMethodDescriptions", MESSAGES.TurnClockwiseIndefinitelyMethodDescriptions());
    map.put("METHODDESC-TurnCounterClockwiseIndefinitelyMethodDescriptions", MESSAGES.TurnCounterClockwiseIndefinitelyMethodDescriptions());
    map.put("METHODDESC-TweetMethodDescriptions", MESSAGES.TweetMethodDescriptions());
    map.put("METHODDESC-TweetWithImageMethodDescriptions", MESSAGES.TweetWithImageMethodDescriptions());
    map.put("METHODDESC-UnauthenticateMethodDescriptions", MESSAGES.UnauthenticateMethodDescriptions());
    map.put("METHODDESC-UriDecodeMethodDescriptions", MESSAGES.UriDecodeMethodDescriptions());
    map.put("METHODDESC-UriEncodeMethodDescriptions", MESSAGES.UriEncodeMethodDescriptions());
    map.put("METHODDESC-VideoPlayer.PauseMethodDescriptions", MESSAGES.VideoPlayer__PauseMethodDescriptions());
    map.put("METHODDESC-VideoPlayer.StartMethodDescriptions", MESSAGES.VideoPlayer__StartMethodDescriptions());
    map.put("METHODDESC-VideoPlayer.StopMethodDescriptions", MESSAGES.VideoPlayer__StopMethodDescriptions());
    map.put("METHODDESC-ViewContactMethodDescriptions", MESSAGES.ViewContactMethodDescriptions());
    map.put("METHODDESC-WebViewer.ClearCookiesMethodDescriptions", MESSAGES.WebViewer__ClearCookiesMethodDescriptions());
    map.put("METHODDESC-Web.ClearCookiesMethodDescriptions", MESSAGES.Web__ClearCookiesMethodDescriptions());
    map.put("METHODDESC-Web.DeleteMethodDescriptions", MESSAGES.Web__DeleteMethodDescriptions());
    map.put("METHODDESC-WeekdayMethodDescriptions", MESSAGES.WeekdayMethodDescriptions());
    map.put("METHODDESC-WeekdayNameMethodDescriptions", MESSAGES.WeekdayNameMethodDescriptions());
    map.put("METHODDESC-WriteCellMethodDescriptions", MESSAGES.WriteCellMethodDescriptions());
    map.put("METHODDESC-WriteColumnMethodDescriptions", MESSAGES.WriteColumnMethodDescriptions());
    map.put("METHODDESC-WriteRangeMethodDescriptions", MESSAGES.WriteRangeMethodDescriptions());
    map.put("METHODDESC-WriteRowMethodDescriptions", MESSAGES.WriteRowMethodDescriptions());
    map.put("METHODDESC-WriteSerialMethodDescriptions", MESSAGES.WriteSerialMethodDescriptions());
    map.put("METHODDESC-XMLTextDecodeAsDictionaryMethodDescriptions", MESSAGES.XMLTextDecodeAsDictionaryMethodDescriptions());
    map.put("METHODDESC-XMLTextDecodeMethodDescriptions", MESSAGES.XMLTextDecodeMethodDescriptions());
    map.put("METHODDESC-YandexTranslate.RequestTranslationMethodDescriptions", MESSAGES.YandexTranslate__RequestTranslationMethodDescriptions());
    map.put("METHODDESC-YearMethodDescriptions", MESSAGES.YearMethodDescriptions());
    map.put("METHODDESC-doFaultMethodDescriptions", MESSAGES.doFaultMethodDescriptions());
    map.put("METHODDESC-installURLMethodDescriptions", MESSAGES.installURLMethodDescriptions());
    map.put("METHODDESC-isConnectedMethodDescriptions", MESSAGES.isConnectedMethodDescriptions());
    map.put("METHODDESC-isDirectMethodDescriptions", MESSAGES.isDirectMethodDescriptions());
    map.put("METHODDESC-setAssetsLoadedMethodDescriptions", MESSAGES.setAssetsLoadedMethodDescriptions());
    map.put("METHODDESC-setHmacSeedReturnCodeMethodDescriptions", MESSAGES.setHmacSeedReturnCodeMethodDescriptions());
    map.put("METHODDESC-shutdownMethodDescriptions", MESSAGES.shutdownMethodDescriptions());
    map.put("METHODDESC-startHTTPDMethodDescriptions", MESSAGES.startHTTPDMethodDescriptions());
    map.put("METHODDESC-startWebRTCMethodDescriptions", MESSAGES.startWebRTCMethodDescriptions());
    map.put("EVENTDESC-AccelerationChangedEventDescriptions", MESSAGES.AccelerationChangedEventDescriptions());
    map.put("EVENTDESC-ActivityCanceledEventDescriptions", MESSAGES.ActivityCanceledEventDescriptions());
    map.put("EVENTDESC-ActivityErrorEventDescriptions", MESSAGES.ActivityErrorEventDescriptions());
    map.put("EVENTDESC-AfterActivityEventDescriptions", MESSAGES.AfterActivityEventDescriptions());
    map.put("EVENTDESC-AfterChoosingEventDescriptions", MESSAGES.AfterChoosingEventDescriptions());
    map.put("EVENTDESC-AfterDateSetEventDescriptions", MESSAGES.AfterDateSetEventDescriptions());
    map.put("EVENTDESC-AfterFileSavedEventDescriptions", MESSAGES.AfterFileSavedEventDescriptions());
    map.put("EVENTDESC-AfterGettingTextEventDescriptions", MESSAGES.AfterGettingTextEventDescriptions());
    map.put("EVENTDESC-AfterPictureEventDescriptions", MESSAGES.AfterPictureEventDescriptions());
    map.put("EVENTDESC-AfterRecordingEventDescriptions", MESSAGES.AfterRecordingEventDescriptions());
    map.put("EVENTDESC-AfterScanEventDescriptions", MESSAGES.AfterScanEventDescriptions());
    map.put("EVENTDESC-AfterSelectingEventDescriptions", MESSAGES.AfterSelectingEventDescriptions());
    map.put("EVENTDESC-AfterSoundRecordedEventDescriptions", MESSAGES.AfterSoundRecordedEventDescriptions());
    map.put("EVENTDESC-AfterSpeakingEventDescriptions", MESSAGES.AfterSpeakingEventDescriptions());
    map.put("EVENTDESC-AfterTextInputEventDescriptions", MESSAGES.AfterTextInputEventDescriptions());
    map.put("EVENTDESC-AfterTimeSetEventDescriptions", MESSAGES.AfterTimeSetEventDescriptions());
    map.put("EVENTDESC-AirPressureChangedEventDescriptions", MESSAGES.AirPressureChangedEventDescriptions());
    map.put("EVENTDESC-BackPressedEventDescriptions", MESSAGES.BackPressedEventDescriptions());
    map.put("EVENTDESC-Ball.DraggedEventDescriptions", MESSAGES.Ball__DraggedEventDescriptions());
    map.put("EVENTDESC-Ball.EdgeReachedEventDescriptions", MESSAGES.Ball__EdgeReachedEventDescriptions());
    map.put("EVENTDESC-Ball.FlungEventDescriptions", MESSAGES.Ball__FlungEventDescriptions());
    map.put("EVENTDESC-Ball.TouchDownEventDescriptions", MESSAGES.Ball__TouchDownEventDescriptions());
    map.put("EVENTDESC-Ball.TouchUpEventDescriptions", MESSAGES.Ball__TouchUpEventDescriptions());
    map.put("EVENTDESC-Ball.TouchedEventDescriptions", MESSAGES.Ball__TouchedEventDescriptions());
    map.put("EVENTDESC-BeforeGettingTextEventDescriptions", MESSAGES.BeforeGettingTextEventDescriptions());
    map.put("EVENTDESC-BeforePageLoadEventDescriptions", MESSAGES.BeforePageLoadEventDescriptions());
    map.put("EVENTDESC-BeforeSpeakingEventDescriptions", MESSAGES.BeforeSpeakingEventDescriptions());
    map.put("EVENTDESC-BluetoothErrorEventDescriptions", MESSAGES.BluetoothErrorEventDescriptions());
    map.put("EVENTDESC-BoundsChangeEventDescriptions", MESSAGES.BoundsChangeEventDescriptions());
    map.put("EVENTDESC-Button.ClickEventDescriptions", MESSAGES.Button__ClickEventDescriptions());
    map.put("EVENTDESC-Button.GotFocusEventDescriptions", MESSAGES.Button__GotFocusEventDescriptions());
    map.put("EVENTDESC-Button.LongClickEventDescriptions", MESSAGES.Button__LongClickEventDescriptions());
    map.put("EVENTDESC-Button.LostFocusEventDescriptions", MESSAGES.Button__LostFocusEventDescriptions());
    map.put("EVENTDESC-Button.TouchDownEventDescriptions", MESSAGES.Button__TouchDownEventDescriptions());
    map.put("EVENTDESC-Button.TouchUpEventDescriptions", MESSAGES.Button__TouchUpEventDescriptions());
    map.put("EVENTDESC-CalibrationFailedEventDescriptions", MESSAGES.CalibrationFailedEventDescriptions());
    map.put("EVENTDESC-Canvas.DraggedEventDescriptions", MESSAGES.Canvas__DraggedEventDescriptions());
    map.put("EVENTDESC-Canvas.FlungEventDescriptions", MESSAGES.Canvas__FlungEventDescriptions());
    map.put("EVENTDESC-Canvas.TouchDownEventDescriptions", MESSAGES.Canvas__TouchDownEventDescriptions());
    map.put("EVENTDESC-Canvas.TouchUpEventDescriptions", MESSAGES.Canvas__TouchUpEventDescriptions());
    map.put("EVENTDESC-Canvas.TouchedEventDescriptions", MESSAGES.Canvas__TouchedEventDescriptions());
    map.put("EVENTDESC-ChartData2D.EntryClickEventDescriptions", MESSAGES.ChartData2D__EntryClickEventDescriptions());
    map.put("EVENTDESC-Chart.EntryClickEventDescriptions", MESSAGES.Chart__EntryClickEventDescriptions());
    map.put("EVENTDESC-ChatBot.ErrorOccurredEventDescriptions", MESSAGES.ChatBot__ErrorOccurredEventDescriptions());
    map.put("EVENTDESC-CheckBox.ChangedEventDescriptions", MESSAGES.CheckBox__ChangedEventDescriptions());
    map.put("EVENTDESC-CheckBox.GotFocusEventDescriptions", MESSAGES.CheckBox__GotFocusEventDescriptions());
    map.put("EVENTDESC-CheckBox.LostFocusEventDescriptions", MESSAGES.CheckBox__LostFocusEventDescriptions());
    map.put("EVENTDESC-ChoosingCanceledEventDescriptions", MESSAGES.ChoosingCanceledEventDescriptions());
    map.put("EVENTDESC-Circle.ClickEventDescriptions", MESSAGES.Circle__ClickEventDescriptions());
    map.put("EVENTDESC-Circle.DragEventDescriptions", MESSAGES.Circle__DragEventDescriptions());
    map.put("EVENTDESC-Circle.LongClickEventDescriptions", MESSAGES.Circle__LongClickEventDescriptions());
    map.put("EVENTDESC-CloudDBErrorEventDescriptions", MESSAGES.CloudDBErrorEventDescriptions());
    map.put("EVENTDESC-CloudDB.DataChangedEventDescriptions", MESSAGES.CloudDB__DataChangedEventDescriptions());
    map.put("EVENTDESC-CloudDB.FirstRemovedEventDescriptions", MESSAGES.CloudDB__FirstRemovedEventDescriptions());
    map.put("EVENTDESC-CloudDB.GotValueEventDescriptions", MESSAGES.CloudDB__GotValueEventDescriptions());
    map.put("EVENTDESC-CollidedWithEventDescriptions", MESSAGES.CollidedWithEventDescriptions());
    map.put("EVENTDESC-ConnectionAcceptedEventDescriptions", MESSAGES.ConnectionAcceptedEventDescriptions());
    map.put("EVENTDESC-ContactPicker.AfterPickingEventDescriptions", MESSAGES.ContactPicker__AfterPickingEventDescriptions());
    map.put("EVENTDESC-ContactPicker.BeforePickingEventDescriptions", MESSAGES.ContactPicker__BeforePickingEventDescriptions());
    map.put("EVENTDESC-ContactPicker.GotFocusEventDescriptions", MESSAGES.ContactPicker__GotFocusEventDescriptions());
    map.put("EVENTDESC-ContactPicker.LostFocusEventDescriptions", MESSAGES.ContactPicker__LostFocusEventDescriptions());
    map.put("EVENTDESC-ContactPicker.TouchDownEventDescriptions", MESSAGES.ContactPicker__TouchDownEventDescriptions());
    map.put("EVENTDESC-ContactPicker.TouchUpEventDescriptions", MESSAGES.ContactPicker__TouchUpEventDescriptions());
    map.put("EVENTDESC-DatePicker.GotFocusEventDescriptions", MESSAGES.DatePicker__GotFocusEventDescriptions());
    map.put("EVENTDESC-DatePicker.LostFocusEventDescriptions", MESSAGES.DatePicker__LostFocusEventDescriptions());
    map.put("EVENTDESC-DatePicker.TouchDownEventDescriptions", MESSAGES.DatePicker__TouchDownEventDescriptions());
    map.put("EVENTDESC-DatePicker.TouchUpEventDescriptions", MESSAGES.DatePicker__TouchUpEventDescriptions());
    map.put("EVENTDESC-DirectMessagesReceivedEventDescriptions", MESSAGES.DirectMessagesReceivedEventDescriptions());
    map.put("EVENTDESC-DoubleTapAtPointEventDescriptions", MESSAGES.DoubleTapAtPointEventDescriptions());
    map.put("EVENTDESC-EmailPicker.GotFocusEventDescriptions", MESSAGES.EmailPicker__GotFocusEventDescriptions());
    map.put("EVENTDESC-EmailPicker.LostFocusEventDescriptions", MESSAGES.EmailPicker__LostFocusEventDescriptions());
    map.put("EVENTDESC-EmailPicker.TextChangedEventDescriptions", MESSAGES.EmailPicker__TextChangedEventDescriptions());
    map.put("EVENTDESC-Ev3ColorSensor.AboveRangeEventDescriptions", MESSAGES.Ev3ColorSensor__AboveRangeEventDescriptions());
    map.put("EVENTDESC-Ev3ColorSensor.BelowRangeEventDescriptions", MESSAGES.Ev3ColorSensor__BelowRangeEventDescriptions());
    map.put("EVENTDESC-Ev3ColorSensor.ColorChangedEventDescriptions", MESSAGES.Ev3ColorSensor__ColorChangedEventDescriptions());
    map.put("EVENTDESC-Ev3ColorSensor.WithinRangeEventDescriptions", MESSAGES.Ev3ColorSensor__WithinRangeEventDescriptions());
    map.put("EVENTDESC-Ev3TouchSensor.PressedEventDescriptions", MESSAGES.Ev3TouchSensor__PressedEventDescriptions());
    map.put("EVENTDESC-Ev3TouchSensor.ReleasedEventDescriptions", MESSAGES.Ev3TouchSensor__ReleasedEventDescriptions());
    map.put("EVENTDESC-Ev3UltrasonicSensor.AboveRangeEventDescriptions", MESSAGES.Ev3UltrasonicSensor__AboveRangeEventDescriptions());
    map.put("EVENTDESC-Ev3UltrasonicSensor.BelowRangeEventDescriptions", MESSAGES.Ev3UltrasonicSensor__BelowRangeEventDescriptions());
    map.put("EVENTDESC-Ev3UltrasonicSensor.WithinRangeEventDescriptions", MESSAGES.Ev3UltrasonicSensor__WithinRangeEventDescriptions());
    map.put("EVENTDESC-FeatureClickEventDescriptions", MESSAGES.FeatureClickEventDescriptions());
    map.put("EVENTDESC-FeatureDragEventDescriptions", MESSAGES.FeatureDragEventDescriptions());
    map.put("EVENTDESC-FeatureLongClickEventDescriptions", MESSAGES.FeatureLongClickEventDescriptions());
    map.put("EVENTDESC-FeatureStartDragEventDescriptions", MESSAGES.FeatureStartDragEventDescriptions());
    map.put("EVENTDESC-FeatureStopDragEventDescriptions", MESSAGES.FeatureStopDragEventDescriptions());
    map.put("EVENTDESC-FilePicker.AfterPickingEventDescriptions", MESSAGES.FilePicker__AfterPickingEventDescriptions());
    map.put("EVENTDESC-FilePicker.BeforePickingEventDescriptions", MESSAGES.FilePicker__BeforePickingEventDescriptions());
    map.put("EVENTDESC-FilePicker.GotFocusEventDescriptions", MESSAGES.FilePicker__GotFocusEventDescriptions());
    map.put("EVENTDESC-FilePicker.LostFocusEventDescriptions", MESSAGES.FilePicker__LostFocusEventDescriptions());
    map.put("EVENTDESC-FilePicker.TouchDownEventDescriptions", MESSAGES.FilePicker__TouchDownEventDescriptions());
    map.put("EVENTDESC-FilePicker.TouchUpEventDescriptions", MESSAGES.FilePicker__TouchUpEventDescriptions());
    map.put("EVENTDESC-File.GotTextEventDescriptions", MESSAGES.File__GotTextEventDescriptions());
    map.put("EVENTDESC-FinishedAddColumnEventDescriptions", MESSAGES.FinishedAddColumnEventDescriptions());
    map.put("EVENTDESC-FinishedAddRowEventDescriptions", MESSAGES.FinishedAddRowEventDescriptions());
    map.put("EVENTDESC-FinishedAddSheetEventDescriptions", MESSAGES.FinishedAddSheetEventDescriptions());
    map.put("EVENTDESC-FinishedClearRangeEventDescriptions", MESSAGES.FinishedClearRangeEventDescriptions());
    map.put("EVENTDESC-FinishedDeleteSheetEventDescriptions", MESSAGES.FinishedDeleteSheetEventDescriptions());
    map.put("EVENTDESC-FinishedRemoveColumnEventDescriptions", MESSAGES.FinishedRemoveColumnEventDescriptions());
    map.put("EVENTDESC-FinishedRemoveRowEventDescriptions", MESSAGES.FinishedRemoveRowEventDescriptions());
    map.put("EVENTDESC-FinishedWriteCellEventDescriptions", MESSAGES.FinishedWriteCellEventDescriptions());
    map.put("EVENTDESC-FinishedWriteColumnEventDescriptions", MESSAGES.FinishedWriteColumnEventDescriptions());
    map.put("EVENTDESC-FinishedWriteRangeEventDescriptions", MESSAGES.FinishedWriteRangeEventDescriptions());
    map.put("EVENTDESC-FinishedWriteRowEventDescriptions", MESSAGES.FinishedWriteRowEventDescriptions());
    map.put("EVENTDESC-FirebaseDB.DataChangedEventDescriptions", MESSAGES.FirebaseDB__DataChangedEventDescriptions());
    map.put("EVENTDESC-FirebaseDB.FirstRemovedEventDescriptions", MESSAGES.FirebaseDB__FirstRemovedEventDescriptions());
    map.put("EVENTDESC-FirebaseDB.GotValueEventDescriptions", MESSAGES.FirebaseDB__GotValueEventDescriptions());
    map.put("EVENTDESC-FirebaseErrorEventDescriptions", MESSAGES.FirebaseErrorEventDescriptions());
    map.put("EVENTDESC-FollowersReceivedEventDescriptions", MESSAGES.FollowersReceivedEventDescriptions());
    map.put("EVENTDESC-FriendTimelineReceivedEventDescriptions", MESSAGES.FriendTimelineReceivedEventDescriptions());
    map.put("EVENTDESC-FunctionCompletedEventDescriptions", MESSAGES.FunctionCompletedEventDescriptions());
    map.put("EVENTDESC-GPSAvailableEventDescriptions", MESSAGES.GPSAvailableEventDescriptions());
    map.put("EVENTDESC-GPSLostEventDescriptions", MESSAGES.GPSLostEventDescriptions());
    map.put("EVENTDESC-GameClient.WebServiceErrorEventDescriptions", MESSAGES.GameClient__WebServiceErrorEventDescriptions());
    map.put("EVENTDESC-GotAddressEventDescriptions", MESSAGES.GotAddressEventDescriptions());
    map.put("EVENTDESC-GotBallotConfirmationEventDescriptions", MESSAGES.GotBallotConfirmationEventDescriptions());
    map.put("EVENTDESC-GotBallotEventDescriptions", MESSAGES.GotBallotEventDescriptions());
    map.put("EVENTDESC-GotCellDataEventDescriptions", MESSAGES.GotCellDataEventDescriptions());
    map.put("EVENTDESC-GotColumnDataEventDescriptions", MESSAGES.GotColumnDataEventDescriptions());
    map.put("EVENTDESC-GotDirectionsEventDescriptions", MESSAGES.GotDirectionsEventDescriptions());
    map.put("EVENTDESC-GotFeaturesEventDescriptions", MESSAGES.GotFeaturesEventDescriptions());
    map.put("EVENTDESC-GotFileEventDescriptions", MESSAGES.GotFileEventDescriptions());
    map.put("EVENTDESC-GotFilterResultEventDescriptions", MESSAGES.GotFilterResultEventDescriptions());
    map.put("EVENTDESC-GotLocationFromAddressEventDescriptions", MESSAGES.GotLocationFromAddressEventDescriptions());
    map.put("EVENTDESC-GotMessageEventDescriptions", MESSAGES.GotMessageEventDescriptions());
    map.put("EVENTDESC-GotRangeDataEventDescriptions", MESSAGES.GotRangeDataEventDescriptions());
    map.put("EVENTDESC-GotResponseEventDescriptions", MESSAGES.GotResponseEventDescriptions());
    map.put("EVENTDESC-GotResponseWithImageEventDescriptions", MESSAGES.GotResponseWithImageEventDescriptions());
    map.put("EVENTDESC-GotResultEventDescriptions", MESSAGES.GotResultEventDescriptions());
    map.put("EVENTDESC-GotRowDataEventDescriptions", MESSAGES.GotRowDataEventDescriptions());
    map.put("EVENTDESC-GotSheetDataEventDescriptions", MESSAGES.GotSheetDataEventDescriptions());
    map.put("EVENTDESC-GyroscopeChangedEventDescriptions", MESSAGES.GyroscopeChangedEventDescriptions());
    map.put("EVENTDESC-HumidityChangedEventDescriptions", MESSAGES.HumidityChangedEventDescriptions());
    map.put("EVENTDESC-ImageBot.ErrorOccurredEventDescriptions", MESSAGES.ImageBot__ErrorOccurredEventDescriptions());
    map.put("EVENTDESC-ImageCreatedEventDescriptions", MESSAGES.ImageCreatedEventDescriptions());
    map.put("EVENTDESC-ImageEditedEventDescriptions", MESSAGES.ImageEditedEventDescriptions());
    map.put("EVENTDESC-ImagePicker.AfterPickingEventDescriptions", MESSAGES.ImagePicker__AfterPickingEventDescriptions());
    map.put("EVENTDESC-ImagePicker.BeforePickingEventDescriptions", MESSAGES.ImagePicker__BeforePickingEventDescriptions());
    map.put("EVENTDESC-ImagePicker.GotFocusEventDescriptions", MESSAGES.ImagePicker__GotFocusEventDescriptions());
    map.put("EVENTDESC-ImagePicker.LostFocusEventDescriptions", MESSAGES.ImagePicker__LostFocusEventDescriptions());
    map.put("EVENTDESC-ImagePicker.TouchDownEventDescriptions", MESSAGES.ImagePicker__TouchDownEventDescriptions());
    map.put("EVENTDESC-ImagePicker.TouchUpEventDescriptions", MESSAGES.ImagePicker__TouchUpEventDescriptions());
    map.put("EVENTDESC-ImageSprite.DraggedEventDescriptions", MESSAGES.ImageSprite__DraggedEventDescriptions());
    map.put("EVENTDESC-ImageSprite.EdgeReachedEventDescriptions", MESSAGES.ImageSprite__EdgeReachedEventDescriptions());
    map.put("EVENTDESC-ImageSprite.FlungEventDescriptions", MESSAGES.ImageSprite__FlungEventDescriptions());
    map.put("EVENTDESC-ImageSprite.TouchDownEventDescriptions", MESSAGES.ImageSprite__TouchDownEventDescriptions());
    map.put("EVENTDESC-ImageSprite.TouchUpEventDescriptions", MESSAGES.ImageSprite__TouchUpEventDescriptions());
    map.put("EVENTDESC-ImageSprite.TouchedEventDescriptions", MESSAGES.ImageSprite__TouchedEventDescriptions());
    map.put("EVENTDESC-Image.ClickEventDescriptions", MESSAGES.Image__ClickEventDescriptions());
    map.put("EVENTDESC-IncomingCallAnsweredEventDescriptions", MESSAGES.IncomingCallAnsweredEventDescriptions());
    map.put("EVENTDESC-InfoEventDescriptions", MESSAGES.InfoEventDescriptions());
    map.put("EVENTDESC-InitializeEventDescriptions", MESSAGES.InitializeEventDescriptions());
    map.put("EVENTDESC-InstanceIdChangedEventDescriptions", MESSAGES.InstanceIdChangedEventDescriptions());
    map.put("EVENTDESC-InvalidPointEventDescriptions", MESSAGES.InvalidPointEventDescriptions());
    map.put("EVENTDESC-InvitedEventDescriptions", MESSAGES.InvitedEventDescriptions());
    map.put("EVENTDESC-IsAuthorizedEventDescriptions", MESSAGES.IsAuthorizedEventDescriptions());
    map.put("EVENTDESC-LightChangedEventDescriptions", MESSAGES.LightChangedEventDescriptions());
    map.put("EVENTDESC-LineString.ClickEventDescriptions", MESSAGES.LineString__ClickEventDescriptions());
    map.put("EVENTDESC-LineString.DragEventDescriptions", MESSAGES.LineString__DragEventDescriptions());
    map.put("EVENTDESC-LineString.LongClickEventDescriptions", MESSAGES.LineString__LongClickEventDescriptions());
    map.put("EVENTDESC-ListPicker.AfterPickingEventDescriptions", MESSAGES.ListPicker__AfterPickingEventDescriptions());
    map.put("EVENTDESC-ListPicker.BeforePickingEventDescriptions", MESSAGES.ListPicker__BeforePickingEventDescriptions());
    map.put("EVENTDESC-ListPicker.GotFocusEventDescriptions", MESSAGES.ListPicker__GotFocusEventDescriptions());
    map.put("EVENTDESC-ListPicker.LostFocusEventDescriptions", MESSAGES.ListPicker__LostFocusEventDescriptions());
    map.put("EVENTDESC-ListPicker.TouchDownEventDescriptions", MESSAGES.ListPicker__TouchDownEventDescriptions());
    map.put("EVENTDESC-ListPicker.TouchUpEventDescriptions", MESSAGES.ListPicker__TouchUpEventDescriptions());
    map.put("EVENTDESC-ListView.AfterPickingEventDescriptions", MESSAGES.ListView__AfterPickingEventDescriptions());
    map.put("EVENTDESC-LoadErrorEventDescriptions", MESSAGES.LoadErrorEventDescriptions());
    map.put("EVENTDESC-LocationChangedEventDescriptions", MESSAGES.LocationChangedEventDescriptions());
    map.put("EVENTDESC-LongPressAtPointEventDescriptions", MESSAGES.LongPressAtPointEventDescriptions());
    map.put("EVENTDESC-MagneticChangedEventDescriptions", MESSAGES.MagneticChangedEventDescriptions());
    map.put("EVENTDESC-Marker.ClickEventDescriptions", MESSAGES.Marker__ClickEventDescriptions());
    map.put("EVENTDESC-Marker.DragEventDescriptions", MESSAGES.Marker__DragEventDescriptions());
    map.put("EVENTDESC-Marker.LongClickEventDescriptions", MESSAGES.Marker__LongClickEventDescriptions());
    map.put("EVENTDESC-MediaStore.WebServiceErrorEventDescriptions", MESSAGES.MediaStore__WebServiceErrorEventDescriptions());
    map.put("EVENTDESC-MediaStoredEventDescriptions", MESSAGES.MediaStoredEventDescriptions());
    map.put("EVENTDESC-MentionsReceivedEventDescriptions", MESSAGES.MentionsReceivedEventDescriptions());
    map.put("EVENTDESC-MessageReceivedEventDescriptions", MESSAGES.MessageReceivedEventDescriptions());
    map.put("EVENTDESC-NewInstanceMadeEventDescriptions", MESSAGES.NewInstanceMadeEventDescriptions());
    map.put("EVENTDESC-NewLeaderEventDescriptions", MESSAGES.NewLeaderEventDescriptions());
    map.put("EVENTDESC-NoLongerCollidingWithEventDescriptions", MESSAGES.NoLongerCollidingWithEventDescriptions());
    map.put("EVENTDESC-NoOpenPollEventDescriptions", MESSAGES.NoOpenPollEventDescriptions());
    map.put("EVENTDESC-NxtColorSensor.AboveRangeEventDescriptions", MESSAGES.NxtColorSensor__AboveRangeEventDescriptions());
    map.put("EVENTDESC-NxtColorSensor.BelowRangeEventDescriptions", MESSAGES.NxtColorSensor__BelowRangeEventDescriptions());
    map.put("EVENTDESC-NxtColorSensor.ColorChangedEventDescriptions", MESSAGES.NxtColorSensor__ColorChangedEventDescriptions());
    map.put("EVENTDESC-NxtColorSensor.WithinRangeEventDescriptions", MESSAGES.NxtColorSensor__WithinRangeEventDescriptions());
    map.put("EVENTDESC-NxtLightSensor.AboveRangeEventDescriptions", MESSAGES.NxtLightSensor__AboveRangeEventDescriptions());
    map.put("EVENTDESC-NxtLightSensor.BelowRangeEventDescriptions", MESSAGES.NxtLightSensor__BelowRangeEventDescriptions());
    map.put("EVENTDESC-NxtLightSensor.WithinRangeEventDescriptions", MESSAGES.NxtLightSensor__WithinRangeEventDescriptions());
    map.put("EVENTDESC-NxtSoundSensor.AboveRangeEventDescriptions", MESSAGES.NxtSoundSensor__AboveRangeEventDescriptions());
    map.put("EVENTDESC-NxtSoundSensor.BelowRangeEventDescriptions", MESSAGES.NxtSoundSensor__BelowRangeEventDescriptions());
    map.put("EVENTDESC-NxtSoundSensor.WithinRangeEventDescriptions", MESSAGES.NxtSoundSensor__WithinRangeEventDescriptions());
    map.put("EVENTDESC-NxtTouchSensor.PressedEventDescriptions", MESSAGES.NxtTouchSensor__PressedEventDescriptions());
    map.put("EVENTDESC-NxtTouchSensor.ReleasedEventDescriptions", MESSAGES.NxtTouchSensor__ReleasedEventDescriptions());
    map.put("EVENTDESC-NxtUltrasonicSensor.AboveRangeEventDescriptions", MESSAGES.NxtUltrasonicSensor__AboveRangeEventDescriptions());
    map.put("EVENTDESC-NxtUltrasonicSensor.BelowRangeEventDescriptions", MESSAGES.NxtUltrasonicSensor__BelowRangeEventDescriptions());
    map.put("EVENTDESC-NxtUltrasonicSensor.WithinRangeEventDescriptions", MESSAGES.NxtUltrasonicSensor__WithinRangeEventDescriptions());
    map.put("EVENTDESC-OnSettingsEventDescriptions", MESSAGES.OnSettingsEventDescriptions());
    map.put("EVENTDESC-OrientationChangedEventDescriptions", MESSAGES.OrientationChangedEventDescriptions());
    map.put("EVENTDESC-OtherPlayerStartedEventDescriptions", MESSAGES.OtherPlayerStartedEventDescriptions());
    map.put("EVENTDESC-OtherScreenClosedEventDescriptions", MESSAGES.OtherScreenClosedEventDescriptions());
    map.put("EVENTDESC-PageLoadedEventDescriptions", MESSAGES.PageLoadedEventDescriptions());
    map.put("EVENTDESC-PasswordTextBox.GotFocusEventDescriptions", MESSAGES.PasswordTextBox__GotFocusEventDescriptions());
    map.put("EVENTDESC-PasswordTextBox.LostFocusEventDescriptions", MESSAGES.PasswordTextBox__LostFocusEventDescriptions());
    map.put("EVENTDESC-PasswordTextBox.TextChangedEventDescriptions", MESSAGES.PasswordTextBox__TextChangedEventDescriptions());
    map.put("EVENTDESC-PermissionDeniedEventDescriptions", MESSAGES.PermissionDeniedEventDescriptions());
    map.put("EVENTDESC-PermissionGrantedEventDescriptions", MESSAGES.PermissionGrantedEventDescriptions());
    map.put("EVENTDESC-PhoneCallEndedEventDescriptions", MESSAGES.PhoneCallEndedEventDescriptions());
    map.put("EVENTDESC-PhoneCallStartedEventDescriptions", MESSAGES.PhoneCallStartedEventDescriptions());
    map.put("EVENTDESC-PhoneNumberPicker.AfterPickingEventDescriptions", MESSAGES.PhoneNumberPicker__AfterPickingEventDescriptions());
    map.put("EVENTDESC-PhoneNumberPicker.BeforePickingEventDescriptions", MESSAGES.PhoneNumberPicker__BeforePickingEventDescriptions());
    map.put("EVENTDESC-PhoneNumberPicker.GotFocusEventDescriptions", MESSAGES.PhoneNumberPicker__GotFocusEventDescriptions());
    map.put("EVENTDESC-PhoneNumberPicker.LostFocusEventDescriptions", MESSAGES.PhoneNumberPicker__LostFocusEventDescriptions());
    map.put("EVENTDESC-PhoneNumberPicker.TouchDownEventDescriptions", MESSAGES.PhoneNumberPicker__TouchDownEventDescriptions());
    map.put("EVENTDESC-PhoneNumberPicker.TouchUpEventDescriptions", MESSAGES.PhoneNumberPicker__TouchUpEventDescriptions());
    map.put("EVENTDESC-PlayerErrorEventDescriptions", MESSAGES.PlayerErrorEventDescriptions());
    map.put("EVENTDESC-PlayerJoinedEventDescriptions", MESSAGES.PlayerJoinedEventDescriptions());
    map.put("EVENTDESC-PlayerLeftEventDescriptions", MESSAGES.PlayerLeftEventDescriptions());
    map.put("EVENTDESC-Player.CompletedEventDescriptions", MESSAGES.Player__CompletedEventDescriptions());
    map.put("EVENTDESC-Polygon.ClickEventDescriptions", MESSAGES.Polygon__ClickEventDescriptions());
    map.put("EVENTDESC-Polygon.DragEventDescriptions", MESSAGES.Polygon__DragEventDescriptions());
    map.put("EVENTDESC-Polygon.LongClickEventDescriptions", MESSAGES.Polygon__LongClickEventDescriptions());
    map.put("EVENTDESC-PositionChangedEventDescriptions", MESSAGES.PositionChangedEventDescriptions());
    map.put("EVENTDESC-ProgressChangedEventDescriptions", MESSAGES.ProgressChangedEventDescriptions());
    map.put("EVENTDESC-ProximityChangedEventDescriptions", MESSAGES.ProximityChangedEventDescriptions());
    map.put("EVENTDESC-ReadyEventDescriptions", MESSAGES.ReadyEventDescriptions());
    map.put("EVENTDESC-Rectangle.ClickEventDescriptions", MESSAGES.Rectangle__ClickEventDescriptions());
    map.put("EVENTDESC-Rectangle.DragEventDescriptions", MESSAGES.Rectangle__DragEventDescriptions());
    map.put("EVENTDESC-Rectangle.LongClickEventDescriptions", MESSAGES.Rectangle__LongClickEventDescriptions());
    map.put("EVENTDESC-ScreenOrientationChangedEventDescriptions", MESSAGES.ScreenOrientationChangedEventDescriptions());
    map.put("EVENTDESC-Screen.ErrorOccurredEventDescriptions", MESSAGES.Screen__ErrorOccurredEventDescriptions());
    map.put("EVENTDESC-SearchSuccessfulEventDescriptions", MESSAGES.SearchSuccessfulEventDescriptions());
    map.put("EVENTDESC-SensorValueChangedEventDescriptions", MESSAGES.SensorValueChangedEventDescriptions());
    map.put("EVENTDESC-ServerCommandFailureEventDescriptions", MESSAGES.ServerCommandFailureEventDescriptions());
    map.put("EVENTDESC-ServerCommandSuccessEventDescriptions", MESSAGES.ServerCommandSuccessEventDescriptions());
    map.put("EVENTDESC-ShakingEventDescriptions", MESSAGES.ShakingEventDescriptions());
    map.put("EVENTDESC-SimpleStepEventDescriptions", MESSAGES.SimpleStepEventDescriptions());
    map.put("EVENTDESC-Slider.TouchDownEventDescriptions", MESSAGES.Slider__TouchDownEventDescriptions());
    map.put("EVENTDESC-Slider.TouchUpEventDescriptions", MESSAGES.Slider__TouchUpEventDescriptions());
    map.put("EVENTDESC-SoundErrorEventDescriptions", MESSAGES.SoundErrorEventDescriptions());
    map.put("EVENTDESC-Spreadsheet.ErrorOccurredEventDescriptions", MESSAGES.Spreadsheet__ErrorOccurredEventDescriptions());
    map.put("EVENTDESC-StartDragEventDescriptions", MESSAGES.StartDragEventDescriptions());
    map.put("EVENTDESC-StartedMovingEventDescriptions", MESSAGES.StartedMovingEventDescriptions());
    map.put("EVENTDESC-StartedRecordingEventDescriptions", MESSAGES.StartedRecordingEventDescriptions());
    map.put("EVENTDESC-StatusChangedEventDescriptions", MESSAGES.StatusChangedEventDescriptions());
    map.put("EVENTDESC-StopDragEventDescriptions", MESSAGES.StopDragEventDescriptions());
    map.put("EVENTDESC-StoppedMovingEventDescriptions", MESSAGES.StoppedMovingEventDescriptions());
    map.put("EVENTDESC-StoppedRecordingEventDescriptions", MESSAGES.StoppedRecordingEventDescriptions());
    map.put("EVENTDESC-Switch.ChangedEventDescriptions", MESSAGES.Switch__ChangedEventDescriptions());
    map.put("EVENTDESC-Switch.GotFocusEventDescriptions", MESSAGES.Switch__GotFocusEventDescriptions());
    map.put("EVENTDESC-Switch.LostFocusEventDescriptions", MESSAGES.Switch__LostFocusEventDescriptions());
    map.put("EVENTDESC-TachoCountChangedEventDescriptions", MESSAGES.TachoCountChangedEventDescriptions());
    map.put("EVENTDESC-TagListEventDescriptions", MESSAGES.TagListEventDescriptions());
    map.put("EVENTDESC-TagReadEventDescriptions", MESSAGES.TagReadEventDescriptions());
    map.put("EVENTDESC-TagWrittenEventDescriptions", MESSAGES.TagWrittenEventDescriptions());
    map.put("EVENTDESC-TapAtPointEventDescriptions", MESSAGES.TapAtPointEventDescriptions());
    map.put("EVENTDESC-TemperatureChangedEventDescriptions", MESSAGES.TemperatureChangedEventDescriptions());
    map.put("EVENTDESC-TextBox.GotFocusEventDescriptions", MESSAGES.TextBox__GotFocusEventDescriptions());
    map.put("EVENTDESC-TextBox.LostFocusEventDescriptions", MESSAGES.TextBox__LostFocusEventDescriptions());
    map.put("EVENTDESC-TextBox.TextChangedEventDescriptions", MESSAGES.TextBox__TextChangedEventDescriptions());
    map.put("EVENTDESC-TextInputCanceledEventDescriptions", MESSAGES.TextInputCanceledEventDescriptions());
    map.put("EVENTDESC-TimePicker.GotFocusEventDescriptions", MESSAGES.TimePicker__GotFocusEventDescriptions());
    map.put("EVENTDESC-TimePicker.LostFocusEventDescriptions", MESSAGES.TimePicker__LostFocusEventDescriptions());
    map.put("EVENTDESC-TimePicker.TouchDownEventDescriptions", MESSAGES.TimePicker__TouchDownEventDescriptions());
    map.put("EVENTDESC-TimePicker.TouchUpEventDescriptions", MESSAGES.TimePicker__TouchUpEventDescriptions());
    map.put("EVENTDESC-TimedOutEventDescriptions", MESSAGES.TimedOutEventDescriptions());
    map.put("EVENTDESC-TimerEventDescriptions", MESSAGES.TimerEventDescriptions());
    map.put("EVENTDESC-TinyWebDB.GotValueEventDescriptions", MESSAGES.TinyWebDB__GotValueEventDescriptions());
    map.put("EVENTDESC-TinyWebDB.WebServiceErrorEventDescriptions", MESSAGES.TinyWebDB__WebServiceErrorEventDescriptions());
    map.put("EVENTDESC-Translator.GotTranslationEventDescriptions", MESSAGES.Translator__GotTranslationEventDescriptions());
    map.put("EVENTDESC-UpdateDoneEventDescriptions", MESSAGES.UpdateDoneEventDescriptions());
    map.put("EVENTDESC-UpdatedEventDescriptions", MESSAGES.UpdatedEventDescriptions());
    map.put("EVENTDESC-UserEmailAddressSetEventDescriptions", MESSAGES.UserEmailAddressSetEventDescriptions());
    map.put("EVENTDESC-ValueStoredEventDescriptions", MESSAGES.ValueStoredEventDescriptions());
    map.put("EVENTDESC-VideoPlayerErrorEventDescriptions", MESSAGES.VideoPlayerErrorEventDescriptions());
    map.put("EVENTDESC-VideoPlayer.CompletedEventDescriptions", MESSAGES.VideoPlayer__CompletedEventDescriptions());
    map.put("EVENTDESC-Voting.WebServiceErrorEventDescriptions", MESSAGES.Voting__WebServiceErrorEventDescriptions());
    map.put("EVENTDESC-WalkStepEventDescriptions", MESSAGES.WalkStepEventDescriptions());
    map.put("EVENTDESC-WebViewStringChangeEventDescriptions", MESSAGES.WebViewStringChangeEventDescriptions());
    map.put("EVENTDESC-WebViewer.ErrorOccurredEventDescriptions", MESSAGES.WebViewer__ErrorOccurredEventDescriptions());
    map.put("EVENTDESC-Web.GotTextEventDescriptions", MESSAGES.Web__GotTextEventDescriptions());
    map.put("EVENTDESC-YandexTranslate.GotTranslationEventDescriptions", MESSAGES.YandexTranslate__GotTranslationEventDescriptions());
    map.put("EVENTDESC-ZoomChangeEventDescriptions", MESSAGES.ZoomChangeEventDescriptions());
  }
  private static void mapCategories(Map<String, String> map) {


    /* Categories */

    map.put("CATEGORY-Charts", MESSAGES.chartsComponentPallette());
    map.put("CATEGORY-Connectivity", MESSAGES.connectivityComponentPallette());
    map.put("CATEGORY-Data Science", MESSAGES.dataScienceComponentPallette());
    map.put("CATEGORY-Drawing and Animation", MESSAGES.drawingAndAnimationComponentPallette());
    map.put("CATEGORY-Experimental", MESSAGES.experimentalComponentPallette());
    map.put("CATEGORY-Extension", MESSAGES.extensionComponentPallette());
    map.put("CATEGORY-For internal use only", MESSAGES.forInternalUseOnlyComponentPallette());
    map.put("CATEGORY-LEGO® MINDSTORMS®", MESSAGES.legoMindstormsComponentPallette());
    map.put("CATEGORY-Layout", MESSAGES.layoutComponentPallette());
    map.put("CATEGORY-Maps", MESSAGES.mapsComponentPallette());
    map.put("CATEGORY-Media", MESSAGES.mediaComponentPallette());
    map.put("CATEGORY-Sensors", MESSAGES.sensorsComponentPallette());
    map.put("CATEGORY-Social", MESSAGES.socialComponentPallette());
    map.put("CATEGORY-Storage", MESSAGES.storageComponentPallette());
    map.put("CATEGORY-User Interface", MESSAGES.userInterfaceComponentPallette());
    map.put("CATEGORY-Appearance", MESSAGES.AppearancePropertyCategory());
    map.put("CATEGORY-Behavior", MESSAGES.BehaviorPropertyCategory());
    map.put("CATEGORY-Unspecified", MESSAGES.UnspecifiedPropertyCategory());
  }
}
