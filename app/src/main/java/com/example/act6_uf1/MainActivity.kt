package com.example.act6_uf1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Referenciem l'EditText i el botó
        val editText: EditText = findViewById(R.id.editText)
        val button: Button = findViewById(R.id.buttonShowToast)

        // Quan es prem el botó, es mostra un Toast amb el valor de l'EditText
        button.setOnClickListener {
            val text = editText.text.toString() // Recollim el text
            Toast.makeText(this, text, Toast.LENGTH_SHORT).show() // Mostrem el Toast
        }
    }
}
