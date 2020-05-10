package com.rnheartbeat;

import android.content.Intent;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

import javax.annotation.Nonnull;

public class HeartbeatModule extends ReactContextBaseJavaModule {

    public static final String REACT_CLASS = "Heartbeat";
    private static ReactApplicationContext reactContext;

    public HeartbeatModule(@Nonnull ReactApplicationContext reactContext) {
        super(reactContext);
        HeartbeatModule.reactContext = reactContext;
    }

    @Nonnull
    @Override
    public String getName() {
        return REACT_CLASS;
    }

    @ReactMethod
    public void startService() {
        HeartbeatModule.reactContext.startService(new Intent(HeartbeatModule.reactContext, HeartbeartService.class));
    }

    @ReactMethod
    public void stopService() {
        HeartbeatModule.reactContext.stopService(new Intent(HeartbeatModule.reactContext, HeartbeartService.class));
    }
}
