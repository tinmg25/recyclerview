package com.tmw.recyclerviewexercise4.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.tmw.recyclerviewexercise4.R
import com.tmw.recyclerviewexercise4.model.Two
import kotlinx.android.synthetic.main.layer2.view.*

class TwoAdapter(var two:ArrayList<Two>):RecyclerView.Adapter<TwoAdapter.TwoViewHolder>() {
    class TwoViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        fun twoBind(two:Two){
            itemView.imgChair2.setImageResource(two.image2)
            itemView.txtName2.text=two.txtName
            itemView.txtPrice2.text=two.txtPrice
            itemView.btnOne.text=two.btnShop
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TwoViewHolder {
        var view=LayoutInflater.from(parent.context).inflate(R.layout.layer2,parent,false)
        return TwoViewHolder(view)
    }

    override fun getItemCount(): Int {
        return two.size
    }

    override fun onBindViewHolder(holder: TwoViewHolder, position: Int) {
        holder.twoBind(two[position])
    }
}