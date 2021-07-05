package com.oceanbrasil.ocean_android_listas_multithread_25_06_2021

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AbsListView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    val rvLista = findViewById<RecyclerView>(R.id.rvLista)
    rvLista.layoutManager = LinearLayoutManager(this)

    val harryPotter = Filme("Harry Potter", "")
    val senhorDosAneis = Filme("Senhor dos Aneis", "")
    val rambo = Filme("Rambo", "")
    val items = listOf(harryPotter, senhorDosAneis, rambo)
    rvLista.adapter = ItemAdapter(items)
    }
}
