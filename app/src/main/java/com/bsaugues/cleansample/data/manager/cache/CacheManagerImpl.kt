package com.bsaugues.cleansample.data.manager.cache

import com.bsaugues.cleansample.data.entity.DummyEntity

class CacheManagerImpl : CacheManager {

    private val dummy = DummyEntity()

    override fun getDummy() = dummy
}