package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {
    int scoreDuoOne = 0;
    int scoreDuoTwo = 0;
    int scoreMatchDuoOne = 0;
    int scoreMatchDuoTwo = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * duo/player 1
     */
    public void add1DuoOne(View view) {
        scoreDuoOne = scoreDuoOne + 1;
        displayForDuoOne(scoreDuoOne);
    }

    public void add3DuoOne(View view) {
        scoreDuoOne = scoreDuoOne + 3;
        displayForDuoOne(scoreDuoOne);
    }

    public void add6DuoOne(View view) {
        scoreDuoOne = scoreDuoOne + 6;
        displayForDuoOne(scoreDuoOne);
    }

    public void add9DuoOne(View view) {
        scoreDuoOne = scoreDuoOne + 9;
        displayForDuoOne(scoreDuoOne);
    }

    /**
     * duo/player 2
     */
    public void add1DuoTwo(View view) {
        scoreDuoTwo = scoreDuoTwo + 1;
        displayForDuoTwo(scoreDuoTwo);
    }

    public void add3DuoTwo(View view) {
        scoreDuoTwo = scoreDuoTwo + 3;
        displayForDuoTwo(scoreDuoTwo);
    }

    public void add6DuoTwo(View view) {
        scoreDuoTwo = scoreDuoTwo + 6;
        displayForDuoTwo(scoreDuoTwo);
    }

    public void add9DuoTwo(View view) {
        scoreDuoTwo = scoreDuoTwo + 9;
        displayForDuoTwo(scoreDuoTwo);
    }

    /**
     * Displays round score for duo/player 1 and condition to add Match points
     */
    public void displayForDuoOne(int score) {
        TextView scoreView = (TextView) findViewById(R.id.duo_one_score);
        scoreView.setText(String.valueOf(score));
        if (scoreDuoOne >= 12) {
            scoreDuoOne = 0;
            displayForDuoOne(scoreDuoOne);
            scoreMatchDuoOne = scoreMatchDuoOne + 1;
            displayMatchForDuoOne(scoreMatchDuoOne);
        }
    }

    /**
     * Displays match score for duo/player 1
     */
    public void displayMatchForDuoOne(int score) {
        TextView scoreView = (TextView) findViewById(R.id.duo_one_match);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays round score for duo/player 2 and condition to add Match points
     */
    public void displayForDuoTwo(int score) {
        TextView scoreView = (TextView) findViewById(R.id.duo_two_score);
        scoreView.setText(String.valueOf(score));
        if (scoreDuoTwo >= 12) {
            scoreDuoTwo = 0;
            displayForDuoTwo(scoreDuoTwo);
            scoreMatchDuoTwo = scoreMatchDuoTwo + 1;
            displayMatchForDuoTwo(scoreMatchDuoTwo);
        }
    }

    /**
     * Displays match score for duo/player 2
     */
    public void displayMatchForDuoTwo(int score) {
        TextView scoreView = (TextView) findViewById(R.id.duo_two_match);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Resets the scores back to zero
     */
    public void resetScore(View view) {
        scoreDuoOne = 0;
        scoreDuoTwo = 0;
        displayForDuoOne(scoreDuoOne);
        displayForDuoTwo(scoreDuoTwo);
        scoreMatchDuoOne = 0;
        scoreMatchDuoTwo = 0;
        displayMatchForDuoOne(scoreMatchDuoTwo);
        displayMatchForDuoTwo(scoreMatchDuoTwo);
    }
}
