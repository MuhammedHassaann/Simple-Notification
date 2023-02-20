package com.muhammedhassaan.notification

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

class ResetCounterNotificationReceiver: BroadcastReceiver() {
    override fun onReceive(context: Context, p1: Intent?) {
        val service = CounterNotificationService(context)
        Counter.value = 0
        service.showNotification(Counter.value)
    }
}