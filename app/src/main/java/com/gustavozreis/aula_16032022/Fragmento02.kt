package com.gustavozreis.aula_16032022

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class Fragmento02 : Fragment() {

    companion object {
        fun criarFragmento() = Fragmento02()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragmento_02, container, false)
    }

}