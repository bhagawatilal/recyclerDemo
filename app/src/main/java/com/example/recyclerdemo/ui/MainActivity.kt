package com.example.recyclerdemo.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerdemo.adapter.MyAdaper
import com.example.recyclerdemo.viewModels.MyViewModel
import com.example.recyclerdemo.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var viewModel=ViewModelProviders.of(this).get(MyViewModel::class.java)
        viewModel.init()
        viewModel.getUserMutableLiveData().observe(this, Observer {
            var adap= MyAdaper(it,this);
            recycler.adapter=adap
            recycler.layoutManager=LinearLayoutManager(this)
        })
    }
}
