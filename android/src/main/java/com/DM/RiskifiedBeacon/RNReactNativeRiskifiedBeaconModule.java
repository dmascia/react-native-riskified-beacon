package com.DM.RiskifiedBeacon;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;
import com.android.riskifiedbeacon.RiskifiedBeaconMain;
import com.android.riskifiedbeacon.RiskifiedBeaconMainInterface;

public class RNReactNativeRiskifiedBeaconModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;
  private RiskifiedBeaconMainInterface RXBeacon;

  public RNReactNativeRiskifiedBeaconModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "RNReactNativeRiskifiedBeacon";
  }

  @ReactMethod
  public boolean startBeacon(String shopName, String token, Boolean debug) {
    try {

      RXBeacon = new RiskifiedBeaconMain();
      RXBeacon.startBeacon(
        shopName, token, debug, getReactApplicationContext()
      );

      return true;
    } catch (Exception e) {
      return false;
    }
  }

  @ReactMethod
  public boolean updateToken(String newToken) {
    try {

      if (RXBeacon == null) {
        return false;
      }

      RXBeacon.updateSessionToken(newToken);

      return true;
    } catch (Exception e) {
      return false;
    }
  }

  @ReactMethod
  public boolean logRequest(String requestUrl) {
    try {

      if (RXBeacon == null) {
        return false;
      }

      RXBeacon.logRequest(requestUrl);

      return true;
    } catch (Exception e) {
      return false;
    }
  }

  @ReactMethod
  public boolean logSensitiveDeviceInfo() {
    try {

      if (RXBeacon == null) {
        return false;
      }

      RXBeacon.logSensitiveDeviceInfo();

      return true;
    } catch (Exception e) {
      return false;
    }
  }

  @ReactMethod
  public boolean removeLocationUpdates() {
    try {

      if (RXBeacon == null) {
        return false;
      }

      RXBeacon.removeLocationUpdates();

      return true;
    } catch (Exception e) {
      return false;
    }
  }
}
