package com.sri.broadcastrecieverdemo

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class MyBroadcastReciever: BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        if (intent.action == Intent.ACTION_AIRPLANE_MODE_CHANGED) {
            val isAirplaneModeOn = intent.getBooleanExtra("state", false)
            if (isAirplaneModeOn) {
                // Airplane mode is turned on
                Toast.makeText(context, "Airplane Mode On", Toast.LENGTH_SHORT).show()
            } else {
                // Airplane mode is turned off
                Toast.makeText(context, "Airplane Mode Off", Toast.LENGTH_SHORT).show()
            }
        }
    }
}