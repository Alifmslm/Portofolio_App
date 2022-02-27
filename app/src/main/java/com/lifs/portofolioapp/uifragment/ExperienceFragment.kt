package com.lifs.portofolioapp.uifragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.lifs.portofolioapp.R
import com.lifs.portofolioapp.adapter.ExperienceAdapter
import com.lifs.portofolioapp.data.PortofolioData
import com.lifs.portofolioapp.databinding.FragmentExperienceBinding


class ExperienceFragment : Fragment() {
    private var cbinding : FragmentExperienceBinding? = null
    private val binding get() = cbinding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        cbinding = FragmentExperienceBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val adapterexperi = ExperienceAdapter()
        adapterexperi.setData(PortofolioData.listAppExperience)

        with(binding.rvExperience){
            layoutManager= StaggeredGridLayoutManager(2,LinearLayoutManager.VERTICAL)
            setHasFixedSize(true)
            adapter = adapterexperi
        }

    }
}