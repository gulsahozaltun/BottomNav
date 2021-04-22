package com.example.bottomnav

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_sonuc_carpma.view.*
import kotlinx.android.synthetic.main.fragment_sonuc_topla.view.*


class SonucCarpmaFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val tasarim=inflater.inflate(R.layout.fragment_sonuc_carpma, container, false)
        val bundle:SonucCarpmaFragmentArgs by navArgs()
        val carpimGelen=bundle.carpimSonuc
        tasarim.sonucCarpma.text=carpimGelen.toString()

        return tasarim
    }


}