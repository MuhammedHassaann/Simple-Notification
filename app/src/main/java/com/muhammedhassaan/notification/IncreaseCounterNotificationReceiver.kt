package com.muhammedhassaan.notification

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

class IncreaseCounterNotificationReceiver: BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent?) {
        val service = CounterNotificationService(context)
        service.showNotification(++Counter.value)
    }
}