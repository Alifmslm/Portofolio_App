package com.lifs.portofolioapp.uifragment

import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.browser.customtabs.CustomTabsIntent
import com.lifs.portofolioapp.R
import com.lifs.portofolioapp.databinding.FragmentProfileBinding

private const val LINK_LINKEIDN = "https://www.linkedin.com/in/abdurrahman-alif-3a0a2121b/"
private const val LINK_GITHUB = "https://github.com/Alifmslm"
private const val LINK_MAIL = "https://mail.google.com/mail/u/0/#inbox?compose=new"
class ProfileFragment : Fragment() {
    private lateinit var binding: FragmentProfileBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentProfileBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.imgLinkedin.setOnClickListener {
            CustomTabsIntent.Builder().build()
                .launchUrl(requireContext(), Uri.parse(LINK_LINKEIDN))
        }
        binding.imgGithub.setOnClickListener {
            CustomTabsIntent.Builder().build()
                .launchUrl(requireContext(), Uri.parse(LINK_GITHUB))
        }
        binding.imgEmail.setOnClickListener {
            CustomTabsIntent.Builder().build()
                .launchUrl(requireContext(), Uri.parse(LINK_MAIL))
        }
        binding.imgPhone.setOnClickListener {
            CustomTabsIntent.Builder().build()
                .launchUrl(requireContext(), Uri.parse("tel:081383093680"))
        }
    }
}