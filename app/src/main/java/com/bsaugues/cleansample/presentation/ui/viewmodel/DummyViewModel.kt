package com.bsaugues.cleansample.presentation.ui.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.bsaugues.cleansample.data.repository.DummyRepository
import com.bsaugues.cleansample.presentation.ui.view.viewdatawrapper.DummyViewDataWrapper
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposables
import io.reactivex.rxkotlin.subscribeBy
import io.reactivex.schedulers.Schedulers
import timber.log.Timber
import javax.inject.Inject

class DummyViewModel @Inject constructor(
    private val dummyRepository: DummyRepository
) : ViewModel() {

    private var disposable = Disposables.empty()
    private val dummyLiveData = MutableLiveData<DummyViewDataWrapper>()

    override fun onCleared() = disposable.dispose()

    fun dummyLiveData(): LiveData<DummyViewDataWrapper> = dummyLiveData

    fun loadDummy() {
        disposable = dummyRepository.load()
            .map(::DummyViewDataWrapper)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeBy(
                onSuccess = dummyLiveData::postValue,
                onError = Timber::e
            )
    }
}