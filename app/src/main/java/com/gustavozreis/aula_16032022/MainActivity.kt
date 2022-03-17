package com.gustavozreis.aula_16032022

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // variável botão tablayout
        val btnTabLayout: Button = findViewById(R.id.btn_tablayout)
        // evento de clique do botão tablayout
        btnTabLayout.setOnClickListener {
            val intent = Intent(this, TabLayoutActivity::class.java)
            startActivity(intent)
        }

        // variável botão viewpager
        val btnViewPager: Button = findViewById(R.id.btn_viewpager)
        // evento de clique do botão viewpager
        btnViewPager.setOnClickListener {
            val intent = Intent(this, ViewPagerActivity::class.java)
            startActivity(intent)
        }
    }

}