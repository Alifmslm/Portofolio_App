package com.lifs.portofolioapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.lifs.portofolioapp.R
import com.lifs.portofolioapp.data.Portofolio
import com.lifs.portofolioapp.databinding.ItemAndroidBinding
import com.lifs.portofolioapp.databinding.ItemExperienceBinding

class ExperienceAdapter: RecyclerView.Adapter<ExperienceAdapter.ExperienceViewholder>() {
    private val listData = ArrayList<Portofolio>()
    val onItemClicked: ((Portofolio) -> Unit)? = null

    fun setData(newList: List<Portofolio>) {
        if (newList == null) return
        listData.clear()
        listData.addAll(newList)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExperienceViewholder =
        ExperienceViewholder(LayoutInflater.from(parent.context).inflate(R.layout.item_experience,parent,false))


    override fun onBindViewHolder(holder: ExperienceViewholder, position: Int) {
        val listData = listData[position]
        holder.bind(listData)
    }

    override fun getItemCount()= listData.size
    inner class ExperienceViewholder(itemView : View) : RecyclerView.ViewHolder(itemView){
        private val binding = ItemExperienceBinding.bind(itemView)

        fun bind(data: Portofolio) {
            binding.experience = data
            binding.executePendingBindings()
        }
        init {
            binding.root.setOnClickListener {
                onItemClicked?.invoke(listData[adapterPosition])
            }
        }
    }

}