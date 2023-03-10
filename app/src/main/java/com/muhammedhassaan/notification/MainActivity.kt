package com.muhammedhassaan.notification

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.muhammedhassaan.notification.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val service = CounterNotificationService(applicationContext)

        binding.btnShowNotification.setOnClickListener {
            service.showNotification(Counter.value)
        }

    }
}