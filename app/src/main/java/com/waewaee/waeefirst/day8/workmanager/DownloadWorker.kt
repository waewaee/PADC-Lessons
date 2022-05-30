package com.waewaee.waeefirst.day8.workmanager

import android.app.DownloadManager
import android.content.Context
import android.net.Uri
import android.os.Environment
import androidx.core.content.getSystemService
import androidx.work.Worker
import androidx.work.WorkerParameters

class DownloadWorker(private val context: Context, workerParams: WorkerParameters): Worker(context, workerParams) {
    override fun doWork(): Result {
        try {
            val request = DownloadManager.Request(Uri.parse("https://img.freepik.com/free-vector/cute-unicorn-jump-air_70350-360.jpg?w=360"))

            request.apply {
                setTitle("Download Image")
                setDescription("Downloading")
                setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE)
                setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, "Downloaded Image")

                val downloadManger = context.getSystemService(Context.DOWNLOAD_SERVICE) as DownloadManager
                downloadManger.enqueue(request)
            }
            return Result.success()
        } catch (e: Exception) {
            return Result.failure()
        }
    }
}