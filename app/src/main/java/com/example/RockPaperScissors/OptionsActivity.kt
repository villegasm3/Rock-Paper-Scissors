package com.example.RockPaperScissors


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SeekBar
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_preferences.*

class OptionsActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_preferences)

        lateinit var slider: SeekBar
        lateinit var value: TextView

        slider = roundBar
        value = maxRoundText

        val roundLimit =
            arrayListOf<String>("3", "6", "9", "12")

        value.text = roundLimit[0]

        slider.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                value.text = roundLimit[roundBar.getProgress()]
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {

            }

            override fun onStopTrackingTouch(p0: SeekBar?) {

            }
        })

        updateButton.setOnClickListener {
            var intent  = Intent(this,MainActivity::class.java)

            intent.putExtra("playerName", usernameEntry.text.toString())
            intent.putExtra("maxRound", value.text.toString())

            startActivity(intent)

        }

    }

}



