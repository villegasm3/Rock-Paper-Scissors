package com.example.RockPaperScissors

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_score.*

class ScoreActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        //Gets variables from Secondary Activity
        var pNameMain = intent.getStringExtra("playerNameSecond")
        var playerScoreSecond = intent.getStringExtra("playerScore")
        var computerScoreSecond = intent.getStringExtra("computerScore")


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_score)

        userScore.text = pNameMain
        userNum.text = playerScoreSecond
        computerNum.text = computerScoreSecond


        returnButton.setOnClickListener {
            var intent = Intent(this, MainActivity::class.java)

            startActivity(intent)
        }

    }
}