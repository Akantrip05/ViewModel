package com.udemy.viewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.get
import com.udemy.viewmodel.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


     lateinit var bind : ActivityMainBinding
     lateinit var viewModel: MyViewModel
     lateinit var Myfactory: MyViewModelFactory


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        // data Binding
        bind = DataBindingUtil.setContentView(this,R.layout.activity_main)

        // ViewModel Factory object
        Myfactory = MyViewModelFactory(100)

        // Viewmodel object
        viewModel = ViewModelProvider(this,Myfactory).get(MyViewModel::class.java)


        bind.apply {
            textView.text= viewModel.getCurrent().toString()
            btn.setOnClickListener {
                textView.text = viewModel.getUpdate().toString()
            }
        }
    }
}