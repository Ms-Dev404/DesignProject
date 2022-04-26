package com.test.designproject.adapter

import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.test.designproject.R
import com.test.designproject.model.DataSet

class StatusAdapter(var list:ArrayList<DataSet>,var context:Context,var m:Int):RecyclerView.Adapter<StatusAdapter.VH>() {

    var inflater: LayoutInflater = LayoutInflater.from(context)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {

        var view:View=inflater.inflate(R.layout.shop_row,parent,false)

        if(m==1){

            view=inflater.inflate(R.layout.status_row_layout,parent,false)
        }


        return VH(view)
    }

    override fun onBindViewHolder(holder: VH, position: Int) {



            holder.image.setImageResource(list[position].res!!)
        holder.tvname.text = list[position].name


    }

    override fun getItemCount(): Int {
        return list.size
    }

    class VH(view: View):RecyclerView.ViewHolder(view) {

        var tvname:TextView=view.findViewById(R.id.tv_name)
        var image:ImageView=view.findViewById(R.id.iv_image)


    }
}