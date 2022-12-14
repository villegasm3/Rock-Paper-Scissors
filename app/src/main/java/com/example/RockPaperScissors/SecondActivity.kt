package com.example.RockPaperScissors

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_preferences.*
import kotlinx.android.synthetic.main.activity_second.*


class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        //Gets variables from Main Activity
        var pNameMain = intent.getStringExtra("playerNameMain")
        var roundNum = intent.getStringExtra("maxRoundMain")

        //Sets default variable for current round and round counter
        var roundCounter = 0

        //Sets default variable for computers hand
        var computerHand = 1

        //Sets default variable for player and computer score
        var playerScore = 0
        var computerScore = 0

        //Sets default name and round number if user doesn't configure settings
        if (pNameMain == "null"){
            pNameMain = "Player"
        }

        if (roundNum == "null"){
            roundNum = "3"
        }

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        var roundMax = roundNum?.toInt()

        rockBtn.setOnClickListener {
            //Sets hand as rock (1), paper (2), or scissors (3) based on random number rolled
            computerHand = (1..3).random()

            if(computerHand == 3){  //Player Win due to computer playing scissors

                //Sets image in app to scissors
                computerSelect.setImageDrawable(getDrawable(R.drawable.scissorimage))

                //Increase player score
                playerScore += 1

                computerHandText.text = "Scissors"
                resultText.text = "You Won!"

            }else if(computerHand == 2){    //Computer Win due to computer playing paper

                //Sets image in app to paper
                computerSelect.setImageDrawable(getDrawable(R.drawable.paperimage))

                //Increase computer score
                computerScore += 1

                computerHandText.text = "Paper"
                resultText.text = "You Lost!"

            }else{  //Tie due to both playing rock

                //Sets image in app to rock
                computerSelect.setImageDrawable(getDrawable(R.drawable.rockimage))

                computerHandText.text = "Rock"
                resultText.text = "You Tied!"

            }

            roundCounter += 1
            roundTextNum.text = roundCounter.toString()

            //Goes to score activity if max round is reached
            if(roundCounter == roundMax){
                var intentSecond  = Intent(this,ScoreActivity::class.java)

                intentSecond.putExtra("playerNameSecond", pNameMain.toString())
                intentSecond.putExtra("playerScore", playerScore.toString())
                intentSecond.putExtra("computerScore", computerScore.toString())

                startActivity(intentSecond)
            }

        }

        paperBtn.setOnClickListener {
            //Sets hand as rock (1), paper (2), or scissors (3) based on random number rolled
            computerHand = (1..3).random()

            if(computerHand == 3){  //Computer Win due to computer playing scissors

                //Sets image in app to scissors
                computerSelect.setImageDrawable(getDrawable(R.drawable.scissorimage))

                //Increase computer score
                computerScore += 1

                computerHandText.text = "Scissors"
                resultText.text = "You Lost!"

            }else if(computerHand == 2){    //Tie due to computer playing paper

                //Sets image in app to paper
                computerSelect.setImageDrawable(getDrawable(R.drawable.paperimage))

                computerHandText.text = "Paper"
                resultText.text = "You Tied!"

            }else{  //Player Win due to computer playing rock

                //Sets image in app to rock
                computerSelect.setImageDrawable(getDrawable(R.drawable.rockimage))

                //Increase player score
                playerScore += 1

                computerHandText.text = "Rock"
                resultText.text = "You Won!"

            }

            roundCounter += 1
            roundTextNum.text = roundCounter.toString()

            //Goes to score activity if max round is reached
            if(roundCounter == roundMax){
                var intentSecond  = Intent(this,ScoreActivity::class.java)

                intentSecond.putExtra("playerNameSecond", pNameMain.toString())
                intentSecond.putExtra("playerScore", playerScore.toString())
                intentSecond.putExtra("computerScore", computerScore.toString())

                startActivity(intentSecond)
            }

        }

        scissorsBtn.setOnClickListener {
            //Sets hand as rock (1), paper (2), or scissors (3) based on random number rolled
            computerHand = (1..3).random()

            if(computerHand == 3){  //Tie due to both playing scissors

                //Sets image in app to scissors
                computerSelect.setImageDrawable(getDrawable(R.drawable.scissorimage))

                computerHandText.text = "Scissors"
                resultText.text = "You Tied!"

            }else if(computerHand == 2){    //Player Win due to computer playing paper

                //Sets image in app to paper
                computerSelect.setImageDrawable(getDrawable(R.drawable.paperimage))

                //Increase player score
                playerScore += 1

                computerHandText.text = "Paper"
                resultText.text = "You Win!"

            }else{  //Computer Win due to computer playing rock

                //Sets image in app to rock
                computerSelect.setImageDrawable(getDrawable(R.drawable.rockimage))

                //Increase computer score
                computerScore += 1

                computerHandText.text = "Rock"
                resultText.text = "You Lost!"

            }

            roundCounter += 1
            roundTextNum.text = roundCounter.toString()

            //Goes to score activity if max round is reached
            if(roundCounter == roundMax){
                var intentSecond  = Intent(this,ScoreActivity::class.java)

                intentSecond.putExtra("playerNameSecond", pNameMain.toString())
                intentSecond.putExtra("playerScore", playerScore.toString())
                intentSecond.putExtra("computerScore", computerScore.toString())

                startActivity(intentSecond)
            }

        }

    }

}