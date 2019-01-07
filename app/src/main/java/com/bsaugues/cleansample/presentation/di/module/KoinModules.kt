package com.bsaugues.cleansample.presentation.di.module

import com.bsaugues.cleansample.data.manager.cache.CacheManager
import com.bsaugues.cleansample.data.manager.cache.CacheManagerImpl
import com.bsaugues.cleansample.data.repository.DummyRepository
import com.bsaugues.cleansample.data.repository.DummyRepositoryImpl
import com.bsaugues.cleansample.presentation.ui.viewmodel.DummyViewModel
import org.koin.androidx.viewmodel.ext.koin.viewModel
import org.koin.dsl.module.module

val managerModule = module {
    single<CacheManager> { CacheManagerImpl() }
}

val repositoryModule = module {
    single<DummyRepository> { DummyRepositoryImpl(cacheManager = get()) }
}

val viewModelModule = module {
    viewModel { DummyViewModel(dummyRepository = get()) }
}