package com.bsaugues.cleansample.presentation.di.module

import com.bsaugues.cleansample.data.manager.cache.CacheManager
import com.bsaugues.cleansample.data.manager.cache.CacheManagerImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
object ManagerModule {

    @JvmStatic
    @Provides
    @Singleton
    fun cacheManager(): CacheManager = CacheManagerImpl()
}