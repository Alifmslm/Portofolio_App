package com.lifs.portofolioapp.binding_adapter

import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.BindingAdapter
import coil.load
import com.lifs.portofolioapp.data.Portofolio

@BindingAdapter("uiuxTitle")
fun TextView.setUiuxTitle(data: Portofolio?){
    data?.let {
        text = it.title
    }
}

@BindingAdapter("uiuxImage")
fun ImageView.setUiuxImage(data: Portofolio){
    load(data.Image){
        crossfade(1000)
    }
}