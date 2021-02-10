package com.example.recyclerdemo.viewModels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.recyclerdemo.model.Model


class MyViewModel: ViewModel() {
   var  userLiveData = MutableLiveData<ArrayList<Model>>()
    var arrayList: ArrayList<Model>? = null



    fun getUserMutableLiveData(): MutableLiveData<ArrayList<Model>> {
        return userLiveData
    }

    fun init() {
        populateList()
        userLiveData!!.value = arrayList
    }

    fun populateList() {
        val user = Model("1","it's testing only","15 aug 1947")
       arrayList=ArrayList()
        arrayList!!.add(user)
        arrayList!!.add(user)
        arrayList!!.add(user)
        arrayList!!.add(user)
        arrayList!!.add(user)
        arrayList!!.add(user)
    }
}
