package com.bsaugues.cleansample

import android.app.Application
import com.bsaugues.cleansample.presentation.di.ApplicationComponent
import com.bsaugues.cleansample.presentation.di.DaggerApplicationComponent
import com.bsaugues.cleansample.presentation.di.DaggerComponentProvider
import timber.log.Timber

class CleanSampleApplication : Application(), DaggerComponentProvider {

    override val component: ApplicationComponent by lazy {
        DaggerApplicationComponent.builder()
            .applicationContext(applicationContext)
            .build()
    }

    override fun onCreate() {
        super.onCreate()
        setupTimber()
    }

    private fun setupTimber() {
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
    }
}