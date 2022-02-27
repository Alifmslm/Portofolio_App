package com.lifs.portofolioapp.binding_adapter

import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.BindingAdapter
import coil.load
import com.lifs.portofolioapp.data.Portofolio

@BindingAdapter("experienceTitle")
fun TextView.setTitleExperience(data: Portofolio?){
    data?.let {
        text = it.title
    }
}

@BindingAdapter("experienceDetail")
fun TextView.setExperienceDetail(data: Portofolio?){
    data?.let {
        text = it.detail
    }
}

@BindingAdapter("experienceImage")
fun ImageView.setImageExperience(data: Portofolio){
    load(data.Image) {
        crossfade(1000)
    }
}