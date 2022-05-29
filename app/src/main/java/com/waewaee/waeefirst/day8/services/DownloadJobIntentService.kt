package com.waewaee.waeefirst.day8.services

import android.app.DownloadManager
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Environment
import android.util.Log
import android.widget.Toast
import androidx.core.app.JobIntentService
import java.io.File

class DownloadJobIntentService: JobIntentService() {

    companion object {
        private const val JOB_ID = 10

        fun startWork(context: Context, intent: Intent) {
            enqueueWork(context, DownloadJobIntentService::class.java, JOB_ID, intent)
        }
    }

    override fun onHandleWork(intent: Intent) {
        val imagePath = intent.getStringExtra("image_path")

        if (imagePath != null) {
            downloadImage(imagePath)
        } else {
            Log.e("Missing Image Path", "Stopping Service")
            stopSelf()
        }
    }

    override fun onDestroy() {
        Toast.makeText(this, "Stopping Service!", Toast.LENGTH_SHORT).show()
        super.onDestroy()
    }

    private fun downloadImage(imagePath: String) {
        downloadImageNew(imageURL = imagePath)
    }

    private fun downloadImageNew(fileName: String = "${System.currentTimeMillis()}.jpg", imageURL: String) {
        try {
            val dm = getSystemService(Context.DOWNLOAD_SERVICE) as DownloadManager
            val downloadUri = Uri.parse(imageURL)
            val request = DownloadManager.Request(downloadUri)

            request.setAllowedNetworkTypes(DownloadManager.Request.NETWORK_WIFI or DownloadManager.Request.NETWORK_MOBILE)
                .setAllowedOverRoaming(false)
                .setTitle(fileName)
                .setMimeType("image/jpeg") // Your file type. You can use this to download other types of files too.
                .setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
                .setDestinationInExternalPublicDir(
                    Environment.DIRECTORY_PICTURES,
                    File.separator + fileName
                )

            dm.enqueue(request)
//            Toast.makeText(this, "Image download started", Toast.LENGTH_SHORT).show()
            Log.e("aaa", "Download start")
        } catch (e: Exception) {
//            Toast.makeText(this, "Image download failed", Toast.LENGTH_SHORT).show()
            Log.e("aaa", "Download fail")
        }
    }

}