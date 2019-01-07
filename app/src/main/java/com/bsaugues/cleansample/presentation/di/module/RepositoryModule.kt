package com.bsaugues.cleansample.presentation.di.module

import com.bsaugues.cleansample.data.manager.cache.CacheManager
import com.bsaugues.cleansample.data.repository.DummyRepository
import com.bsaugues.cleansample.data.repository.DummyRepositoryImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
object RepositoryModule {

    @JvmStatic
    @Provides
    @Singleton
    fun dummyRepository(cacheManager: CacheManager): DummyRepository = DummyRepositoryImpl(cacheManager)
}