package com.bsaugues.cleansample.presentation.ui.view.viewdatawrapper

import com.bsaugues.cleansample.data.entity.DummyEntity

class DummyViewDataWrapper constructor(
    private val dummyEntity: DummyEntity
) {
    fun getInfo(): String = dummyEntity.toString()
}