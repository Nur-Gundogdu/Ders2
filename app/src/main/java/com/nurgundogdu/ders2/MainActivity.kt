package com.nurgundogdu.ders2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import java.util.Random

class MainActivity : AppCompatActivity() {
    lateinit var diceImage1: ImageView
    lateinit var diceImage2: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.text = "Zar At"
        rollButton.setOnClickListener{
            rollDice()
        }
        val resetButton: Button=findViewById(R.id.reset_button)
        resetButton.text = "Temizle"
        resetButton.setOnClickListener{
            resetDice()
        }

        diceImage1= findViewById(R.id.dice_image1)
        diceImage2= findViewById(R.id.dice_image2)
    }

    private fun rollDice(){
        val randomInt1 = Random().nextInt(6)  + 1
        val drawableResource1 = when (randomInt1){
            1->R.drawable.zar1
            2->R.drawable.zar2
            3->R.drawable.zar3
            4->R.drawable.zar4
            5->R.drawable.zar5
            else->R.drawable.zar6}

        val randomInt2 = Random().nextInt(6)  + 1
        val drawableResource2 = when (randomInt2){
            1->R.drawable.zar1
            2->R.drawable.zar2
            3->R.drawable.zar3
            4->R.drawable.zar4
            5->R.drawable.zar5
            else->R.drawable.zar6
        }

        diceImage1.setImageResource(drawableResource1)
        diceImage2.setImageResource(drawableResource2)
    }
    private fun resetDice(){
        diceImage1.setImageResource(R.drawable.boszar)
        diceImage2.setImageResource(R.drawable.boszar)
    }

}