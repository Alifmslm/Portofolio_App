package com.lifs.portofolioapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.lifs.portofolioapp.R
import com.lifs.portofolioapp.data.Portofolio
import com.lifs.portofolioapp.databinding.ItemUiuxBinding

class UiUxAdapter: RecyclerView.Adapter<UiUxAdapter.ViewHolder>() {

    private val listData = ArrayList<Portofolio>()
    var onItemCliked: ((Portofolio) -> Unit)? = null

    fun setData(newList: List<Portofolio>){
        if (newList == null) return
        listData.clear()
        listData.addAll(newList)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder =
        ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_uiux, parent, false)
        )

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val listData = listData[position]
        holder.bind(listData)
    }

    override fun getItemCount() = listData.size

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val binding = ItemUiuxBinding.bind(itemView)

        fun bind(data: Portofolio){
            binding.uiux = data
            binding.executePendingBindings()
        }

        init {
            binding.root.setOnClickListener {
                onItemCliked?.invoke(listData[adapterPosition])
            }
        }
    }
}