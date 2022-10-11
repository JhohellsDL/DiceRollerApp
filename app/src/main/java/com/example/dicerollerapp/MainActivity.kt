package com.example.dicerollerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.buttonRoll)
        rollButton.setOnClickListener { rollDice() }

        rollDice()
    }

    private fun rollDice() {
        //Crea un nuevo dado con 6 lados
        val dice = Dice(6)
        val nroSide = dice.roll()

        //le da el valor aleatorio de una cara al textview
        val dado: ImageView = findViewById(R.id.imageView)

        val imageResource = when (nroSide) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> {R.drawable.dice_6}
        }

        dado.setImageResource(imageResource)
    }

    class Dice(val nroSides: Int) {
        fun roll(): Int {
            return (1..nroSides).random()
        }
    }
}