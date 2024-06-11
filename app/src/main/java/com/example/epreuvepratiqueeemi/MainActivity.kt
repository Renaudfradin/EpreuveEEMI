package com.example.epreuvepratiqueeemi

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editTextA = findViewById<EditText>(R.id.editTextA)
        val editTextB = findViewById<EditText>(R.id.editTextB)
        val textViewResult = findViewById<TextView>(R.id.textViewResult)

        val buttonAddition = findViewById<Button>(R.id.buttonAddition)
        buttonAddition.setOnClickListener {
            val result = Calculator.addition(
                editTextA.text.toString().toDouble(),
                editTextB.text.toString().toDouble()
            )
            textViewResult.text = "Résultat : $result"
        }

        val buttonSubtraction = findViewById<Button>(R.id.buttonSubtraction)
        buttonSubtraction.setOnClickListener {
            val result = Calculator.subtraction(
                editTextA.text.toString().toDouble(),
                editTextB.text.toString().toDouble()
            )
            textViewResult.text = "Résultat : $result"
        }

        val buttonDivision = findViewById<Button>(R.id.buttonDivision)
        buttonDivision.setOnClickListener {
            val result = Calculator.division(
                editTextA.text.toString().toDouble(),
                editTextB.text.toString().toDouble()
            )
            textViewResult.text = "Résultat : $result"
        }
    }
}