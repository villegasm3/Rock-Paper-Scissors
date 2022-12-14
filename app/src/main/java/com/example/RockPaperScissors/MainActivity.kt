package com.example.RockPaperScissors

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        //Gets Variables from Preferences
        var pNameMain = intent.getStringExtra("playerName")
        var maxRoundMain = intent.getStringExtra("maxRound")

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        helpBtn.setOnClickListener {
            startActivity(Intent(this, HelpActivity::class.java))

        }

        optionBtn.setOnClickListener {
            startActivity(Intent(this, OptionsActivity::class.java))

        }

        startBtn.setOnClickListener {

            var intentMain  = Intent(this,SecondActivity::class.java)

            intentMain.putExtra("playerNameMain", pNameMain.toString())
            intentMain.putExtra("maxRoundMain", maxRoundMain.toString())

            startActivity(intentMain)


        }

    }
}