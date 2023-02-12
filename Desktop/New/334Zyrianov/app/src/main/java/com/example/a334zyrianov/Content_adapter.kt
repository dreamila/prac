package com.example.a334zyrianov

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Content_adapter(val con:Context, val list2:ArrayList<content>):RecyclerView.Adapter<Content_adapter.Link>() {
    class Link(sampleView:View):RecyclerView.ViewHolder(sampleView){
        val svimage:ImageView = sampleView.findViewById(R.id.picture)
        val svtext:TextView = sampleView.findViewById(R.id.name)
        val svtext2:TextView = sampleView.findViewById(R.id.surname)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Content_adapter.Link {
        val root = LayoutInflater.from(con).inflate(R.layout.recentlyviewed, parent, false)
        return Link(root)
    }

    override fun onBindViewHolder(holder: Link, position: Int) {
        holder.svimage.setImageResource(list2[position].imId)
        holder.svtext.setText(list2[position].text_content)
        holder.svtext2.setText(list2[position].text_content2)
    }

    override fun getItemCount(): Int {
        return list2.size
    }
}