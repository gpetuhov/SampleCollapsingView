package com.gpetuhov.android.samplecollapsingview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MainAdapter : RecyclerView.Adapter<MainAdapter.MainViewHolder>() {

    private var itemList = mutableListOf<String>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.item_layout, parent, false)
        return MainViewHolder(view)
    }

    override fun getItemCount() = itemList.size

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        val text = itemList[position]
        holder.bind(text)
    }

    // === Public methods ===

    fun initItems() {
        for (i in 1..300) {
            itemList.add(i.toString())
        }
    }

    // === Inner classes ===

    class MainViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        private var textView = view.findViewById<TextView>(R.id.textView)

        fun bind(text: String) {
            textView.text = text
        }
    }
}