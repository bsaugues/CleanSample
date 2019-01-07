package com.bsaugues.cleansample.presentation.di

import android.content.Context
import com.bsaugues.cleansample.presentation.di.module.ManagerModule
import com.bsaugues.cleansample.presentation.di.module.RepositoryModule
import com.bsaugues.cleansample.presentation.ui.viewmodel.DummyViewModel
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [RepositoryModule::class, ManagerModule::class])
interface ApplicationComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun applicationContext(applicationContext: Context): Builder

        fun build(): ApplicationComponent
    }

    val dummyViewModel: DummyViewModel
}