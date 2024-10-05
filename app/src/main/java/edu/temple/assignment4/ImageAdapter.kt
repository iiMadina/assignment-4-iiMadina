package edu.temple.assignment4

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class ImageAdapter(private val imageItems: Array<ImageItem>, private val callback: (ImageItem) -> Unit) :
    RecyclerView.Adapter<ImageAdapter.ImageItemViewHolder>() {

    inner class ImageItemViewHolder(layout: View) : RecyclerView.ViewHolder(layout) {
        val imageView = layout.findViewById<ImageView>(R.id.imageView)
        init {
            imageView.setOnClickListener {
                callback(imageItems[adapterPosition])
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageItemViewHolder {
        return ImageItemViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.recycler_view_item, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return imageItems.size
    }

    override fun onBindViewHolder(holder: ImageItemViewHolder, position: Int) {
        holder.imageView.setImageResource(imageItems[position].image)
    }
}