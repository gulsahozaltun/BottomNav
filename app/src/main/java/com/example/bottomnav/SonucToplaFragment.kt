package com.example.bottomnav

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_sonuc_topla.view.*


class SonucToplaFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val tasarim=inflater.inflate(R.layout.fragment_sonuc_topla, container, false)

        val bundle:SonucToplaFragmentArgs by navArgs()
        val toplamGelen=bundle.toplamSonuc
        tasarim.sonucToplama.text=toplamGelen.toString()
        Log.e("gelen sonuc",toplamGelen)
        return tasarim
    }


}