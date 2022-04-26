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

class OfferAdapter(var dataList:ArrayList<DataSet>,contxt:Context):RecyclerView.Adapter<OfferAdapter.VH>() {
    var inflater: LayoutInflater = LayoutInflater.from(contxt)




    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        return VH(inflater.inflate(R.layout.switch_row,parent,false))
    }

    override fun onBindViewHolder(holder: VH, position: Int) {

        //holder.tvname.text=dataList[position].name

        holder.image.setImageResource(dataList[position].res!!)

    }

    override fun getItemCount(): Int {
        return dataList.size;
    }

    class VH(itemView: View): RecyclerView.ViewHolder(itemView) {

        //var tvname: TextView =itemView.findViewById(R.id.tv_cat_name)
        var image: ImageView =itemView.findViewById(R.id.iv_offer)
    }
}