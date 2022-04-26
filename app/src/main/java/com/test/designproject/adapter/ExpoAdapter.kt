package com.test.designproject.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.test.designproject.R
import com.test.designproject.model.DataSet

class ExpoAdapter(var dataList:ArrayList<DataSet>,context: Context):RecyclerView.Adapter<ExpoAdapter.VH>() {

    var inflater:LayoutInflater= LayoutInflater.from(context)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        return VH(inflater.inflate(R.layout.expo_pick_row,parent,false))
    }

    override fun onBindViewHolder(holder: VH, position: Int) {

        holder.image.setImageResource(dataList[position].res!!)
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    class VH(itemView:View):RecyclerView.ViewHolder(itemView) {


        var image:ImageView=itemView.findViewById(R.id.imageView3)

    }
}