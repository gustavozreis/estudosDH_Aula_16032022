package com.gustavozreis.aula_16032022

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.tabs.TabLayout

class TabLayoutActivity : AppCompatActivity() {

    private val fragmento01 = Fragmento01()
    private val fragmento02 = Fragmento02()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tab_layout)

        val tabLayout: TabLayout = findViewById(R.id.tl_tablayout)

        /*tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab?) {
                when (tab?.position) {
                    0 -> TODO(inserir fragmento 1)
                    1 -> TODO(inserir fragmento 2)
                }

                override fun onTabUnselected(tab: TabLayout.Tab?) {
                }

                override fun onTabReselected(tab: TabLayout.Tab?) {
                }

            }

        })*/

    }

}