package com.tmw.recyclerviewexercise4.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.tmw.recyclerviewexercise4.R
import com.tmw.recyclerviewexercise4.model.Three
import kotlinx.android.synthetic.main.layer3.view.*

class ThreeAdapter(var three: ArrayList<Three>) : RecyclerView.Adapter<ThreeAdapter.ThreeViewHolder>() {
    class ThreeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun threeBind(three: Three) {
            itemView.imgChair3.setImageResource(three.chair)
            itemView.txtName3.text = three.Name
            itemView.txtPrice3.text = three.Price
            itemView.btnTwo.text = three.button
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ThreeViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.layer3, parent, false)
        return ThreeViewHolder(view)
    }

    override fun getItemCount(): Int {
        return three.size
    }

    override fun onBindViewHolder(holder: ThreeViewHolder, position: Int) {
holder.threeBind(three[position])    }
}