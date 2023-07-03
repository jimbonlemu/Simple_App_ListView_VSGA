package com.jimbonlemu.aplikasilistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private val countries = arrayOf(
        "Indonesia", "Malaysia", "Singapura", "Thailand", "Filipina", "Vietnam","Uganda"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView = findViewById<ListView>(R.id.listViewCountries)

        val adapter = ArrayAdapter(this, R.layout.list_item, countries)
        listView.adapter = adapter

        listView.setOnItemClickListener { parent, view, position, id ->
            val selectedItem = parent.getItemAtPosition(position) as String
            // Lakukan sesuatu ketika item di klik, contoh:
            showToast("Anda memilih negara jagoan $selectedItem")
        }
    }

    private fun showToast(message: String) {
        Toast.makeText(this, message,Toast.LENGTH_SHORT ).show()
    }
}