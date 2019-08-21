package ca.koho.cordova.plugin.firebase.messaging;

import android.util.Log;

import org.apache.cordova.CordovaPlugin;

public class FirebaseMessagingExtensionPlugin extends CordovaPlugin {
    private static final String TAG = "FirebaseMessagingExtensionPlugin";
    @Override
    protected void pluginInitialize() {
        Log.d(TAG, "pluginInitialize");
    }
}