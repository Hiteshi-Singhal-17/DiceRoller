package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private lateinit var diceImageView: ImageView

    companion object {
        const val DICE_SIDES = 6
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        diceImageView = findViewById(R.id.dice_image)

        rollButton.setOnClickListener {
            rollDice()
        }
    }

    /**
     * Sets the image of diceImageView based on a random number between 1 to DICE_SIDES
     */
    private fun rollDice() {
        val diceImageResId = when (Random.nextInt(DICE_SIDES) + 1) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImageView.setImageResource(diceImageResId)
    }
}
