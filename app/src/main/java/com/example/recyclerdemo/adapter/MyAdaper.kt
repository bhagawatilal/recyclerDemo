package com.example.recyclerdemo.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerdemo.R
import com.example.recyclerdemo.model.Model

 class MyAdaper(private  var dataList:ArrayList<Model>,
               var context: Context):RecyclerView.Adapter<MyAdaper.Vh>() {

    inner class Vh(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var id:TextView=itemView.findViewById(R.id.tv_point)
        var description:TextView=itemView.findViewById(R.id.pencilMsg)
        var date:TextView=itemView.findViewById(R.id.date)
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
        val item = LayoutInflater.from(context).inflate(R.layout.row,parent,false)
        return Vh(item)
    }

    override fun onBindViewHolder(holder: Vh, position: Int) {
        holder.id.text=dataList.get(position).id
        holder.description.text=dataList.get(position).discription
        holder.date.text=dataList.get(position).date

    }

    override fun getItemCount(): Int {
       return dataList.size
    }
}