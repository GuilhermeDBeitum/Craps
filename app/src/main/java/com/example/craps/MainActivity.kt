package com.example.craps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            binding = ActivityMainBinding.inflate(layoutInflater)
            setContentView(binding.root)

            gameCraps()
        }

    private fun gameCraps() {
            val dice : ImageView = binding.dice
            dice.setOnClickListener( View.OnClickListener {
                val drawable = when (Random.nextInt(6) + 1) {
                    1 -> R.drawable.diceum
                    2 -> R.drawable.dicedois
                    3 -> R.drawable.dicetres
                    4 -> R.drawable.dicequatro
                    5 -> R.drawable.dicecinco
                    else -> R.drawable.diceseis
                }
                dice.setImageResource(drawable)
            })
            return
        }
    }
