package com.bsaugues.cleansample.data.manager.cache

import com.bsaugues.cleansample.data.entity.DummyEntity
import javax.inject.Inject

class CacheManagerImpl @Inject constructor() : CacheManager {

    private val dummy = DummyEntity()

    override fun getDummy() = dummy
}