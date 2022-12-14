package com.example.RockPaperScissors

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_help.*


class HelpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_help)

        helpCloseBtn.setOnClickListener {
            var intent = Intent(this, MainActivity::class.java)

            startActivity(intent)
        }

    }
}