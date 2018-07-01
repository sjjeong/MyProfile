package com.googry.myprofile.base.ui

import android.arch.lifecycle.ViewModel
import com.googry.myprofile.base.source.BaseDataSource
import io.reactivex.disposables.CompositeDisposable

abstract class BaseViewModel(
        var baseDataSource: BaseDataSource? = null) :
        ViewModel() {
    protected val compositeDisposable = CompositeDisposable()

    override fun onCleared() {
        compositeDisposable.clear()
        baseDataSource?.onCleared()
        super.onCleared()
    }
}