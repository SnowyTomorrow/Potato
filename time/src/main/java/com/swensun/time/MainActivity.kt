package com.swensun.time

import android.animation.ObjectAnimator
import android.annotation.SuppressLint
import android.os.Bundle
import android.text.format.DateFormat
import android.view.Window
import android.view.WindowManager
import com.swensun.swutils.ui.adjustTextSize
import com.swensun.swutils.ui.getWinWidth
import com.swensun.time.setting.SettingsActivity
import com.trello.rxlifecycle3.components.support.RxAppCompatActivity
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import kotlinx.android.synthetic.main.main_activity.*
import org.jetbrains.anko.startActivity
import java.util.concurrent.TimeUnit

/**
 * @Date 2019-08-07
 * @author sunwen
 * @Project Potato
 */
class MainActivity : RxAppCompatActivity() {

    private val animList = arrayListOf<ObjectAnimator>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window?.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN)
        window?.addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON)
        setContentView(R.layout.main_activity)
        initView()
    }

    private fun initView() {
        startTimeGo()
        ma_tv_setting.setOnClickListener {
            // settingActivity
            startActivity<SettingsActivity>()
            
        }
//        playAnim()
    }

    @SuppressLint("CheckResult")
    private fun startTimeGo() {
        Observable.interval(1, TimeUnit.SECONDS)
            .compose(bindToLifecycle())
            .doOnSubscribe {
                ma_tv_time.adjustTextSize(getWinWidth(), getCurTime())
            }
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe {
                ma_tv_time.adjustTextSize(getWinWidth(), getCurTime())
            }
    }

    private fun playAnim() {
        val anim = ObjectAnimator
            .ofFloat(ma_tv_time, "translationX", 0f + getWinWidth(), 0f - getWinWidth())
            .apply {
                duration = 3000
                repeatMode =  ObjectAnimator.RESTART
                repeatCount = ObjectAnimator.INFINITE
            }
        animList.add(anim)
        anim.start()
    }

    override fun onPause() {
        super.onPause()
        animList.forEach {
            it.cancel()
        }
    }
}

fun getCurTime(): String {
    val now = System.currentTimeMillis()
    return DateFormat.format("HH:mm:ss", now).toString()
}
