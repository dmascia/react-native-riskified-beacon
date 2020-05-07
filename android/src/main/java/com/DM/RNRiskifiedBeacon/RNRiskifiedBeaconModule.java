package com.DM.RNRiskifiedBeacon;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.android.riskifiedbeacon.RiskifiedBeaconMain;
import com.android.riskifiedbeacon.RiskifiedBeaconMainInterface;

public class RNRiskifiedBeaconModule extends ReactContextBaseJavaModule {

  private static ReactApplicationContext reactContext;
  private RiskifiedBeaconMainInterface RXBeacon;

  public RNRiskifiedBeaconModule(ReactApplicationContext reactContext) {
    super(reactContext);
    reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "RNReactNativeRiskifiedBeacon";
  }

  @ReactMethod
  public void startBeacon(String shopName, String token, Boolean debug) {
    if (RXBeacon == null) {
      RXBeacon = new RiskifiedBeaconMain();
    }

    RXBeacon.startBeacon(
      shopName, token, debug, getReactApplicationContext()
    );
  }

  @ReactMethod
  public void updateToken(String newToken) {
    if (RXBeacon != null) {
      RXBeacon.updateSessionToken(newToken);
    }
  }

  @ReactMethod
  public void logRequest(String requestUrl) {
    if (RXBeacon != null) {
      RXBeacon.logRequest(requestUrl);
    }
  }

  @ReactMethod
  public void logSensitiveDeviceInfo() {
    if (RXBeacon != null) {
      RXBeacon.logSensitiveDeviceInfo();
    }
  }

  @ReactMethod
  public void removeLocationUpdates() {
    if (RXBeacon != null) {
      RXBeacon.removeLocationUpdates();
    }
  }
}
