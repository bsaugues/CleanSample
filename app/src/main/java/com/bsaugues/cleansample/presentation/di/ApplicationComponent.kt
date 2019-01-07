package com.bsaugues.cleansample.presentation.di

import com.bsaugues.cleansample.presentation.di.module.managerModule
import com.bsaugues.cleansample.presentation.di.module.repositoryModule
import com.bsaugues.cleansample.presentation.di.module.viewModelModule
import org.koin.dsl.module.Module

val appComponent: List<Module> = listOf(
    managerModule,
    repositoryModule,
    viewModelModule
)