package com.example.myfirstapp

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var editTextET: EditText
    private lateinit var textViewTV: TextView
    private lateinit var buttonBTN: Button
    private lateinit var result: TextView
    private lateinit var count: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editTextET = findViewById(R.id.editTextET)
        textViewTV = findViewById(R.id.textTV)
        buttonBTN = findViewById(R.id.buttonBTN)
        result = findViewById(R.id.result)
        count = findViewById(R.id.count)

        onButtonClick(buttonBTN)
    }

    fun onButtonClick(view: View) {

            val sendText = editTextET.text
            result.text = "Текст наоборот: ${sendText.reversed()}"
            count.text = "Количество символов: ${sendText.filter { !it.isWhitespace() }.length.toString()}"
    }
    }
