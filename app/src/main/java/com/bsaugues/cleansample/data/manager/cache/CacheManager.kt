package com.bsaugues.cleansample.data.manager.cache

import com.bsaugues.cleansample.data.entity.DummyEntity

interface CacheManager {
    fun getDummy() : DummyEntity
}