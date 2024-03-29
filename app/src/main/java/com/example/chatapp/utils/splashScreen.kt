package com.example.chatapp.utils

import android.animation.ObjectAnimator
import android.app.Activity
import android.util.Log
import android.view.View
import android.view.animation.OvershootInterpolator

import androidx.core.animation.doOnEnd
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.example.chatapp.viewModels.MainViewModel


fun splashScreen(activity: Activity, mainViewModel: MainViewModel) {
    val TAG="SplashScreen"
    //Splash Screen Logic
    Log.d(TAG,"Splash-Screen initiated")
    activity.installSplashScreen().apply{
        setKeepOnScreenCondition{
            !mainViewModel.isReady.value
        }
        setOnExitAnimationListener{screen->
            val zoomX= ObjectAnimator.ofFloat(screen.iconView, View.SCALE_X,0.4f,0.0f)
            zoomX.interpolator= OvershootInterpolator()
            zoomX.duration=500L
            zoomX.doOnEnd { screen.remove() }

            val zoomY= ObjectAnimator.ofFloat(screen.iconView, View.SCALE_Y,0.4f,0.0f)
            zoomY.interpolator= OvershootInterpolator()
            zoomY.duration=500L
            zoomY.doOnEnd { screen.remove() }

            zoomX.start()
            zoomY.start()

        }

    }
    Log.d(TAG,"Splash-Screen Completed")
}