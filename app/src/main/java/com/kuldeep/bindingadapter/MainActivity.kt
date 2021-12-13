package com.kuldeep.bindingadapter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.kuldeep.bindingadapter.data.DataModel
import com.kuldeep.bindingadapter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        val data = DataModel("Data Name","https://media.istockphoto.com/photos/beautiful-morning-light-in-public-park-with-green-grass-field-picture-id841278554")

        binding.dataModel = data
    }
}