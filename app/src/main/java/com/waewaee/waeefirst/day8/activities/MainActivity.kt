package com.waewaee.waeefirst.day8.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.waewaee.waeefirst.R
import com.waewaee.waeefirst.day8.services.ForegroundService
import kotlinx.android.synthetic.main.day8_activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.day8_activity_main)

        setSupportActionBar(toolbar)

        btnStartService.setOnClickListener {
            ForegroundService.startService(this, "Jiptoo Service")
        }

        btnEndService.setOnClickListener {
            ForegroundService.stopService(this)
        }

        btnDownloadImage.setOnClickListener {
//            val intent = Intent(this, DownLoadIntentService::class.java)

        }
    }
}