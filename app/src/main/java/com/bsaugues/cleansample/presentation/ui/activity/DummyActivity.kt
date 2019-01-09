package com.bsaugues.cleansample.presentation.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bsaugues.cleansample.R
import com.bsaugues.cleansample.data.utils.observeSafe
import com.bsaugues.cleansample.presentation.ui.viewmodel.DummyViewModel
import kotlinx.android.synthetic.main.activity_dummy.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class DummyActivity : AppCompatActivity() {

    private val viewModel: DummyViewModel by viewModel()

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