package com.udemy.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class MyViewModelFactory(private  val startingNumber: Int):ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MyViewModel::class.java)){
           return MyViewModelFactory(startingNumber) as T
        }
           throw java.lang.IllegalArgumentException("Unknown model class")
    }

}