package com.example.dicerollerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.buttonRoll)
        rollButton.setOnClickListener { rollDice() }
    }

    private fun rollDice() {
        //Crea un nuevo dado con 6 lados
        val dice = Dice(6)
        val nroSide = dice.roll()

        //le da el valor aleatorio de una cara al textview
        val text: TextView = findViewById(R.id.textView)
        text.text = nroSide.toString()
    }

    class Dice(val nroSides: Int) {
        fun roll(): Int {
            return (1..nroSides).random()
        }
    }
}