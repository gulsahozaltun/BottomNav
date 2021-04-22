package com.example.bottomnav

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_cikarma.view.*
import kotlinx.android.synthetic.main.fragment_cikarma.view.buttonCarpma
import kotlinx.android.synthetic.main.fragment_toplama.view.*


class CikarmaFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var sonuc=0
        val tasarim =inflater.inflate(R.layout.fragment_cikarma, container, false)

        tasarim.buttonCarpma.setOnClickListener {
            if(tasarim.valueCarp1.text.toString()=="" && tasarim.valueCarp2.text.toString()=="") {

                Toast.makeText(getActivity(),"Please, enter a number!",Toast.LENGTH_SHORT).show();
            }
            else{
                sonuc = tasarim.valueCarp1.text.toString().toInt() * tasarim.valueCarp2.text.toString().toInt()
                tasarim.valueCarp1.setText("")
                tasarim.valueCarp2.setText("")

                val gecis = CikarmaFragmentDirections.actionCikarmaFragmentToSonucCarpmaFragment(sonuc.toString())
                Navigation.findNavController(it).navigate(gecis)

            }
        }
        // Inflate the layout for this fragment
        return tasarim
    }


}