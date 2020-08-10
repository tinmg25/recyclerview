package com.tmw.recyclerviewexercise4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.tmw.recyclerviewexercise4.adapter.OneAdapter
import com.tmw.recyclerviewexercise4.adapter.ThreeAdapter
import com.tmw.recyclerviewexercise4.adapter.TwoAdapter
import com.tmw.recyclerviewexercise4.model.One
import com.tmw.recyclerviewexercise4.model.Three
import com.tmw.recyclerviewexercise4.model.Two
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var oneList=ArrayList<One>()

        oneList.add(One(R.drawable.yellowchair,"Chairs","1126 items"))
        oneList.add(One(R.drawable.table,"Table","442 items"))
        oneList.add(One(R.drawable.sofa,"Sofa","1865 items"))



        recycler1.apply{
            layoutManager=LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false)
            adapter=OneAdapter(oneList)
        }

        var twoList=ArrayList<Two>()

        twoList.add(Two(R.drawable.greenchair,"Ivonne chair,green","$29.00","Shop"))
        twoList.add(Two(R.drawable.chair2,"Snakeskin Pattern Buckle","$29.00","Shop"))
        twoList.add(Two(R.drawable.chair3,"Armchair Konna green","$29.00","Shop"))

        recycler2.apply {
            layoutManager=LinearLayoutManager(context)
            adapter=TwoAdapter(twoList)
        }

        var threeList=ArrayList<Three>()

        threeList.add(Three(R.drawable.greenchair,"Ruffle Trim Spot Wrap Dress","$29.00","Shop"))
        threeList.add(Three(R.drawable.chair4,"Leaf Floral Print Random","$29.00","Shop"))
        threeList.add(Three(R.drawable.chair5,"Drop Shoulder Geo Pattern","$29.00","Shop"))


        recycler3.apply {
            layoutManager=LinearLayoutManager(context)
            adapter=ThreeAdapter(threeList)
        }
    }
}