package com.bsaugues.cleansample.data.repository

import com.bsaugues.cleansample.data.entity.DummyEntity
import com.bsaugues.cleansample.data.manager.cache.CacheManager
import io.reactivex.Single

class DummyRepositoryImpl constructor(
    private val cacheManager: CacheManager
) : DummyRepository {

    override fun load(): Single<DummyEntity> = Single.just(cacheManager.getDummy())
}