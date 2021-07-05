package com.oceanbrasil.ocean_android_jetpack_30_06_2021

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class TextViewModel : ViewModel() {
    var text = "[Nome]"

}


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textViewModel = ViewModelProvider(this).get(TextViewModel::class.java)

        val textView = findViewById<TextView>(R.id.textView)

        textView.setOnClickListener {
            textViewModel.text = "Elemento Clicado!"
            textView.text = textViewModel.text
        }

        textView.setOnLongClickListener {
            textViewModel.text = "Long ClickListener Clicado"
            true 
        }

    }
}


