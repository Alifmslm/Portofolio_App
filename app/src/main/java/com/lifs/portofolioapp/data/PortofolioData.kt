package com.lifs.portofolioapp.data

import com.lifs.portofolioapp.R

object PortofolioData {

    private val title = arrayOf(
        "App Submisson",
        "App School",
        "App News",
        "App Doa & Dzikir",
        "App Recipe Catalogue",
        "App InfoGempa",
        "App Money Convertion",

    )

    private val poster = intArrayOf(
        R.drawable.g,
        R.drawable.f,
        R.drawable.e,
        R.drawable.z,
        R.drawable.d,
        R.drawable.c,
        R.drawable.b,

    )

    private val link = arrayOf(
        "https://drive.google.com/file/d/1ehcNoPkacBC4cr81_-rMBI89ZbRJKdOw/view?usp=sharing",
        "https://drive.google.com/file/d/19y3HcYuS8ybIT2JYSJ9OcUD8j2x7y9N2/view?usp=sharing",
        "https://drive.google.com/file/d/1ZAj5Lo1hQMZo7EvxvOu0ZXIBoZniO-aV/view?usp=sharing",
        "https://drive.google.com/file/d/17aW2QrtMJcDxV_o5-B-z2FkMRN7nIj8h/view?usp=sharing",
        "https://drive.google.com/file/d/1bP8u_QG860koDLEA7-gtvGd3FH_tHfXQ/view?usp=sharing",
        "https://drive.google.com/file/d/1zV0fllCnvMei003KP_c7lCd3wPoFBjdu/view?usp=sharing",
        "https://drive.google.com/file/d/107bQJZE940ow2_zUaMmLnMGPQRsLkgM2/view?usp=sharing",
    )

    val listAppAndroid : ArrayList<Portofolio>
        get() {
            val list = arrayListOf<Portofolio>()
            for (position in title.indices){
                val android = Portofolio()
                android.title = title[position]
                android.Image = poster[position]
                android.link = link[position]
                list.add(android)
            }
            return list
        }

    //---------------------------------EXPERIENCE DATA--------------------------------------------//

    private val titleExperience = arrayOf(
        "MicroTeaching API Di Kelas",
        "Finish Android Dicoding Pemula Class",
        "Finish Sololearn Kotlin Class",
        "Membuat Banner Vaksinasi feat Aziz",
        "Membuat Poster Vaksinasi feat Noval",
        "Mengikuti Perlombaan UI/UX IDN IT FEST"

    )

    private val detailExperience = arrayOf(
        "Mengajar GETAPI Di kelas bersama aziz dan zaki",
        "Menyelesaikan Kelas Android Pemula Di Dicoding",
        "Menyelesaikan Kelas Kotlin Di Sololearn",
        "Membuat Banner Vaksinasi Bersama Abdul Aziz",
        "Membuat Poster Vaksinasi Bersama Noval",
        "Mengikuti Perlombaan UI/UX IDN IT FEST"
    )

    private val imageExperience = intArrayOf(
        R.drawable.fotosatu,
        R.drawable.kotlin,
        R.drawable.sololearn,
        R.drawable.bannersatu,
        R.drawable.postersatu,
        R.drawable.frameempatui
    )

    val listAppExperience: ArrayList<Portofolio>
        get() {
            val listexperience = arrayListOf<Portofolio>()
            for (position in titleExperience.indices){
              val experience = Portofolio()
              experience.title = titleExperience[position]
              experience.detail = detailExperience[position]
              experience.Image = imageExperience[position]
                listexperience.add(experience)
            }
            return listexperience
        }

    //------------------------UI/UX DATA---------------------------------------------//

    private val titleUIUX = arrayOf(
        "UI/UX Bebas",
        "UI/UX Submission",
        "UI/UX School",
        "UI/UX Beatyourself",
        "UI/UX YukTravell",
    )

    private val imageUIUX = intArrayOf(
        R.drawable.halo3,
        R.drawable.halo2,
        R.drawable.halo1,
        R.drawable.kooko,
        R.drawable.jsjsjsssss,
    )

    private val linkdua = arrayOf(
        "https://www.figma.com/file/4EdNNORAon9fUnFHMm15yq/MyKelas?node-id=0%3A1",
        "https://www.figma.com/proto/cQBnnb6ar5jwReiGmcwAgj/Submission-app?page-id=0%3A1&node-id=3%3A6&viewport=241%2C48%2C0.62&scaling=scale-down&starting-point-node-id=2%3A2",
        "https://www.figma.com/proto/Frkou9kyWBLdbQ64VLNNIZ/School-app?page-id=0%3A1&node-id=2%3A16&viewport=241%2C48%2C0.49&scaling=scale-down&starting-point-node-id=1%3A2",
        "https://www.figma.com/proto/gHMiQpOkwc0yXUOy9e9pjq/ITFEST-2021-Beatyourself?page-id=0%3A1&node-id=2%3A11&viewport=241%2C48%2C0.13&scaling=scale-down&starting-point-node-id=2%3A11&show-proto-sidebar=1",
        "https://www.figma.com/proto/xWKlVDTxRsfC0esu4THMVX/YukTravell?page-id=0%3A1&node-id=1%3A10&viewport=241%2C48%2C0.21&scaling=scale-down&starting-point-node-id=1%3A2&show-proto-sidebar=1"
    )

    val listUIUX: ArrayList<Portofolio>
        get() {
            val listui = arrayListOf<Portofolio>()
            for (position in titleUIUX.indices) {
                val uiux = Portofolio()
                uiux.title = titleUIUX[position]
                uiux.Image = imageUIUX[position]
                uiux.link = linkdua[position]
                listui.add(uiux)
            }
            return listui
        }
}