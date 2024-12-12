package com.example.dicerollerkotlinapp


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {

    private val dice: Dice = Dice(6)
    private lateinit var ivDice: ImageView

    override
    fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ivDice = findViewById(R.id.iv_dice)

        val btnRoll: Button = findViewById(R.id.btn_roll)
        btnRoll.setOnClickListener() {
            Toast.makeText(this, "Rolled", Toast.LENGTH_LONG).show()
            rollDice()
        }
        rollDice()

    }

    private fun rollDice() {
        //val dice: Dice = Dice(6)
        val rolledDice: Int = dice.roll()

        val tvText: TextView = findViewById(R.id.textView)
        tvText.text = rolledDice.toString()
        //println("Rolled Dice is:${rolledDice}")

        //val ivDice: ImageView = findViewById(R.id.iv_dice)
        when (rolledDice) {
            1 -> ivDice.setImageResource(R.drawable.dice_1)
            2 -> ivDice.setImageResource(R.drawable.dice_2)
            3 -> ivDice.setImageResource(R.drawable.dice_3)
            4 -> ivDice.setImageResource(R.drawable.dice_4)
            5 -> ivDice.setImageResource(R.drawable.dice_5)
            6 -> ivDice.setImageResource(R.drawable.dice_6)
        }
    }
}