package com.google.gwt.i18n.client.impl;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import java.util.HashMap;

public class LocaleInfoImpl_shared extends com.google.gwt.i18n.client.impl.LocaleInfoImpl {
  private static native String getLocaleNativeDisplayName(
      JavaScriptObject nativeDisplayNamesNative,String localeName) /*-{
    return nativeDisplayNamesNative[localeName];
  }-*/;
  
  HashMap<String,String> nativeDisplayNamesJava;
  private JavaScriptObject nativeDisplayNamesNative;
  
  @Override
  public String[] getAvailableLocaleNames() {
    return new String[] {
      "default",
      "ja",
      "ko",
      "zh",
    };
  }
  
  @Override
  public String getLocaleNativeDisplayName(String localeName) {
    if (GWT.isScript()) {
      if (nativeDisplayNamesNative == null) {
        nativeDisplayNamesNative = loadNativeDisplayNamesNative();
      }
      return getLocaleNativeDisplayName(nativeDisplayNamesNative, localeName);
    } else {
      if (nativeDisplayNamesJava == null) {
        nativeDisplayNamesJava = new HashMap<String, String>();
        nativeDisplayNamesJava.put("ja", "日本語");
        nativeDisplayNamesJava.put("ko", "한국어");
        nativeDisplayNamesJava.put("zh", "中文");
      }
      return nativeDisplayNamesJava.get(localeName);
    }
  }
  
  @Override
  public boolean hasAnyRTL() {
    return false;
  }
  
  private native JavaScriptObject loadNativeDisplayNamesNative() /*-{
    return {
      "ja": "日本語",
      "ko": "한국어",
      "zh": "中文"
    };
  }-*/;
}
