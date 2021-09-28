package com.example.week5
import android.view.LayoutInflater
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import androidx.appcompat.view.menu.ActionMenuItemView
import android.view.ViewGroup
import kotlinx.android.synthetic.main.item_row.view.*

class RecycleViewAdapter(private val names : List<String>): RecyclerView.Adapter<RecycleViewAdapter.ItemViewHolder>() {
    class ItemViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        return ItemViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_row,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
       val name = names[position]

        holder.itemView.apply {
            tvColor.text = name
        }
    }

    override fun getItemCount() = names.size
    }




