package com.lifs.portofolioapp.binding_adapter

import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.BindingAdapter
import coil.load
import com.lifs.portofolioapp.data.Portofolio


@BindingAdapter("androidTitle")
fun TextView.setTitleAndroid(data: Portofolio?){
    data?.let {
        text = it.title
    }
}

@BindingAdapter("androidImage")
fun ImageView.setAndroidImage(data: Portofolio){
    load(data.Image){
        crossfade(1000)
    }
}