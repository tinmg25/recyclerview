package com.tmw.recyclerviewexercise4.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.tmw.recyclerviewexercise4.R
import com.tmw.recyclerviewexercise4.model.One
import kotlinx.android.synthetic.main.layer1.view.*

class OneAdapter(var one:ArrayList<One>):RecyclerView.Adapter<OneAdapter.OneViewHolder>() {
    class OneViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        fun bindOne(one:One){
            itemView.imgChair.setImageResource(one.chair)
            itemView.txtName.text=one.name
            itemView.txtQty.text=one.qty
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OneViewHolder {
        var view=LayoutInflater.from(parent.context).inflate(R.layout.layer1,parent,false)
        return OneViewHolder(view)
    }

    override fun getItemCount(): Int {
        return one.size
    }

    override fun onBindViewHolder(holder: OneViewHolder, position: Int) {
        holder.bindOne(one[position])
    }
}