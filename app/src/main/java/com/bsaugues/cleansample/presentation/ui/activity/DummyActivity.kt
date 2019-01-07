package com.bsaugues.cleansample.presentation.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bsaugues.cleansample.R
import com.bsaugues.cleansample.data.utils.observeSafe
import com.bsaugues.cleansample.presentation.di.injector
import com.bsaugues.cleansample.presentation.ui.viewmodel.factory.getViewModel
import kotlinx.android.synthetic.main.activity_dummy.*

class DummyActivity : AppCompatActivity() {

    private val viewModel by lazy {
        getViewModel { injector.dummyViewModel }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dummy)

        if (savedInstanceState == null) {
            viewModel.loadDummy()
        }

        viewModel.dummyLiveData().observeSafe(this) {
            dummy_tv.text = "value : ${it.getInfo()}"
        }
    }

}