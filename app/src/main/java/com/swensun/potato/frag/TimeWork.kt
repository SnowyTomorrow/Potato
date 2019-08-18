package com.swensun.potato.frag

import android.content.Context
import android.content.SharedPreferences
import androidx.work.Worker
import androidx.work.WorkerParameters
import com.swensun.swutils.shareprefence.SharePreferencesManager
import com.swensun.swutils.util.context
import org.jetbrains.anko.startActivity

val KEY_TIME = "current_time"

class TimeWork(private val context: Context, private val workerParameters: WorkerParameters):
    Worker(context, workerParameters) {
    override fun doWork(): Result {
        SharePreferencesManager.put(KEY_TIME, System.currentTimeMillis())
        return Result.success()
    }
}