package com.bsaugues.cleansample.data.repository

import com.bsaugues.cleansample.data.entity.DummyEntity
import io.reactivex.Single

interface DummyRepository {
    fun load(): Single<DummyEntity>
}