package com.toastnative.custom.toast;

import android.widget.Toast;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;

public class ModuleToast extends ReactContextBaseJavaModule {
    public ModuleToast(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @Override
    public String getName() {
        return "ModuleToast";
    }

    @ReactMethod
    public void show(String mensagem) {
        Toast toast = Toast.makeText(getReactApplicationContext(), mensagem, Toast.LENGTH_LONG);
        toast.show(); 
    }
}