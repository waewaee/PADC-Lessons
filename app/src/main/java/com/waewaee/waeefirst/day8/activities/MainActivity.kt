package com.waewaee.waeefirst.day8.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.work.*
import com.waewaee.waeefirst.R
import com.waewaee.waeefirst.day8.services.DownloadIntentService
import com.waewaee.waeefirst.day8.services.DownloadJobIntentService
import com.waewaee.waeefirst.day8.services.ForegroundService
import com.waewaee.waeefirst.day8.workmanager.DownloadWorker
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

        // Intent Service
//        btnDownloadImage.setOnClickListener {
//            val intent = Intent(this, DownloadIntentService::class.java)
//            intent.putExtra("image_path", "https://img.freepik.com/free-vector/cute-unicorn-jump-air_70350-360.jpg?w=360")
//            startService(intent)
//        }

        //Job Intent Service
//        btnDownloadImage.setOnClickListener {
//            val intent = Intent(this, DownloadJobIntentService::class.java)
//            intent.putExtra("image_path", "https://img.freepik.com/free-vector/cute-unicorn-jump-air_70350-360.jpg?w=360")
//            DownloadJobIntentService.startWork(this, intent)
//        }

        //Work Manager
        btnDownloadImage.setOnClickListener {

            //Constraints
            val constraints = Constraints.Builder()
                .setRequiredNetworkType(NetworkType.NOT_ROAMING)
                .setRequiresBatteryNotLow(true)
                .setRequiresStorageNotLow(true)
                .build()

            //Work Request
            val downloadWorkRequest: WorkRequest =
                OneTimeWorkRequestBuilder<DownloadWorker>()
                    .setConstraints(constraints)
                    .build()

            //Enqueue Work Manager
            WorkManager
                .getInstance(applicationContext)
                .enqueue(downloadWorkRequest)

        }
    }
}