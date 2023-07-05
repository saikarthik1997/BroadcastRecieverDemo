package com.sri.broadcastrecieverdemo

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private val handler = Handler(Looper.getMainLooper())
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

/*      //implicit broadcasts
        val receiver = MyBroadcastReciever()
        val filter = IntentFilter(Intent.ACTION_AIRPLANE_MODE_CHANGED)
        registerReceiver(receiver, filter)
        */

        //custom through reciever
       // registerReceiver(CustomBroadcastReceiver(),IntentFilter("com.sri.broadcastrecieverdemo.ACTION_CUSTOM_BROADCAST"))

        //custom broadcast through manifest
        handler.postDelayed({
            sendBroadcast(Intent(this, CustomBroadcastReceiver::class.java).setAction("com.sri.broadcastrecieverdemo.ACTION_CUSTOM_BROADCAST"))
        }, 2000)

    }
}