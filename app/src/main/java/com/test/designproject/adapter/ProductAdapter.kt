package com.test.designproject.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.test.designproject.R
import com.test.designproject.model.DataSet

class ProductAdapter(var dataList:ArrayList<DataSet>,context: Context):RecyclerView.Adapter<ProductAdapter.VH>() {

    var inflater:LayoutInflater= LayoutInflater.from(context)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        return VH(inflater.inflate(R.layout.row_product,parent,false))
    }

    override fun onBindViewHolder(holder: VH, position: Int) {


        holder.image.setImageResource(dataList[position].resource)

        holder.price.text=dataList[position].name
    }

    override fun getItemCount(): Int {
       return dataList.size
    }

    class VH(itemView: View):RecyclerView.ViewHolder(itemView) {

        var image:ImageView=itemView.findViewById(R.id.imageView)
        var price:TextView=itemView.findViewById(R.id.tv_price)
    }
}