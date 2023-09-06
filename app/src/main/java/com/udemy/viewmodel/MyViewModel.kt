package com.udemy.viewmodel

import androidx.lifecycle.ViewModel

class MyViewModel(startingNumber: Int): ViewModel() {

    var counter = 0


    fun getCurrent(): Int {
        return counter
    }
    fun getUpdate(): Int {
        return ++counter
    }
}