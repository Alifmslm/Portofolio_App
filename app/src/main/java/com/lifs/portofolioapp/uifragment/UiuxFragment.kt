package com.lifs.portofolioapp.uifragment

import android.annotation.SuppressLint
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.browser.customtabs.CustomTabsIntent
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.lifs.portofolioapp.R
import com.lifs.portofolioapp.adapter.UiUxAdapter
import com.lifs.portofolioapp.data.Portofolio
import com.lifs.portofolioapp.data.PortofolioData
import com.lifs.portofolioapp.databinding.FragmentUiuxBinding

private const val POTOFOLIO_LINK = "https://manylink.co/@Alifmslm"

class UiuxFragment : Fragment() {

    private var _binding: FragmentUiuxBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentUiuxBinding.inflate(inflater, container, false)
        return binding.root
    }

    @SuppressLint("StringFormatInvalid")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val uiuxAdapter = UiUxAdapter()
        uiuxAdapter.setData(PortofolioData.listUIUX)

        uiuxAdapter.onItemCliked = {selectedData : Portofolio ->
            CustomTabsIntent.Builder().build()
                .launchUrl(requireContext(), Uri.parse(selectedData.link))
        }


        with(binding.recycleUi) {
            layoutManager = LinearLayoutManager(requireContext())
            setHasFixedSize(true)
            adapter = uiuxAdapter
        }
        binding.btnUiux.text = getString(
            R.string.app_uiux_btn, PortofolioData.listUIUX.size.toString()
        )
        binding.txtUiux.setOnClickListener {
            CustomTabsIntent.Builder().build()
                .launchUrl(requireContext(), Uri.parse(POTOFOLIO_LINK))
        }
    }
}