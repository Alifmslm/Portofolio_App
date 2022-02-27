package com.lifs.portofolioapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.lifs.portofolioapp.R
import com.lifs.portofolioapp.data.Portofolio
import com.lifs.portofolioapp.databinding.ItemAndroidBinding

class AndroidAdapter : RecyclerView.Adapter<AndroidAdapter.AndroidViewHolder>() {

    private val listData = ArrayList<Portofolio>()
    var onItemClicked: ((Portofolio) -> Unit)? = null

    fun setData(newList: List<Portofolio>) {
        if (newList == null) return
        listData.clear()
        listData.addAll(newList)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AndroidViewHolder =
        AndroidViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_android, parent, false)
        )

    override fun onBindViewHolder(holder: AndroidViewHolder, position: Int) {
        val listData = listData[position]
        holder.bind(listData)
    }

    override fun getItemCount() = listData.size
    inner class AndroidViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val binding = ItemAndroidBinding.bind(itemView)

        fun bind(data: Portofolio) {
            binding.android = data
            binding.executePendingBindings()
        }
        init {
            binding.root.setOnClickListener {
                onItemClicked?.invoke(listData[adapterPosition])
            }
        }
    }
}