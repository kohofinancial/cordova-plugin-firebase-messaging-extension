package ca.koho.cordova.plugin.firebase.messaging;

import android.util.Log;

import org.apache.cordova.CordovaPlugin;

public class FirebaseMessagingPlugin extends CordovaPlugin {
    private static final String TAG = "FirebaseMessagingPlugin";
    @Override
    protected void pluginInitialize() {
        FirebaseMessagingPlugin.instance = this;
        Log.d(TAG, "pluginInitialize");
    }
}