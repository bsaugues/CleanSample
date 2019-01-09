package com.bsaugues.cleansample

import android.app.Application
import com.bsaugues.cleansample.presentation.di.appComponent
import org.koin.android.ext.android.startKoin
import timber.log.Timber

class CleanSampleApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        initInjection()
        setupTimber()
    }

    private fun initInjection() {
        startKoin(applicationContext, appComponent)
    }

    private fun setupTimber() {
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
    }
}