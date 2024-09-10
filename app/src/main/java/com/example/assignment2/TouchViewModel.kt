package com.example.assignment2

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TouchViewModel: ViewModel() {

    private val _touchCount = MutableLiveData<Int>()
    val touchCount: LiveData<Int>
        get() = _touchCount

    init {
        _touchCount.value = 0
    }

    fun incrementTouchCount() {
        _touchCount.value = _touchCount.value?.plus(1)
    }

    fun onReset()   {
        _touchCount.value = 0
    }
}