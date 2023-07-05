package com.sri.broadcastrecieverdemo

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class CustomBroadcastReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        if (intent.action == "com.sri.broadcastrecieverdemo.ACTION_CUSTOM_BROADCAST") {
            // Handle the received broadcast here
            Toast.makeText(context, "Custom Broadcast Received", Toast.LENGTH_SHORT).show()
        }
    }
}
