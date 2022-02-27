package com.lifs.portofolioapp.uifragment

import android.annotation.SuppressLint
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.browser.customtabs.CustomTabsClient
import androidx.browser.customtabs.CustomTabsIntent
import androidx.recyclerview.widget.LinearLayoutManager
import com.lifs.portofolioapp.adapter.AndroidAdapter
import com.lifs.portofolioapp.R
import com.lifs.portofolioapp.data.Portofolio
import com.lifs.portofolioapp.data.PortofolioData
import com.lifs.portofolioapp.databinding.FragmentAndroidBinding

private const val POTOFOLIO_LINK = "https://manylink.co/@Alifmslm"

class AndroidFragment : Fragment() {

    private var _binding: FragmentAndroidBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentAndroidBinding.inflate(inflater, container, false)
        return binding.root
    }

    @SuppressLint("StringFormatInvalid")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val androidAdapter = AndroidAdapter()
        androidAdapter.setData(PortofolioData.listAppAndroid)

        androidAdapter.onItemClicked = {selectedData :Portofolio ->
            CustomTabsIntent.Builder().build()
                .launchUrl(requireContext(), Uri.parse(selectedData.link))
        }


        with(binding.recyclerAndroid) {
            layoutManager = LinearLayoutManager(requireContext())
            setHasFixedSize(true)
            adapter = androidAdapter
        }
        binding.btnAndroid.text = getString(
            R.string.app_android_btn,
            PortofolioData.listAppAndroid.size.toString()
        )

        binding.txtAndroid.setOnClickListener {
            CustomTabsIntent.Builder().build()
                .launchUrl(requireContext(), Uri.parse(POTOFOLIO_LINK))
        }
    }
}