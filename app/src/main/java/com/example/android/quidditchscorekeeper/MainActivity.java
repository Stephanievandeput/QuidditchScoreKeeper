package com.example.android.quidditchscorekeeper;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreGryffindor = 0;
    int scoreSlytherin = 0;
    String progress = "The game is on!";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the score for Gryffindor.
     *
     * @param score
     */
    public void displayForGryffindor(int score) {
        TextView scoreView = (TextView) findViewById(R.id.score_gryffindor);
        scoreView.setText(String.valueOf(score));
        if (scoreGryffindor > 0 || scoreSlytherin > 0) {
            progress = "The game is on!";
        }
        displayProgress(progress);
    }

    /**
     * Displays the score for Slytherin.
     *
     * @param score
     */
    public void displayForSlytherin(int score) {
        TextView scoreView = (TextView) findViewById(R.id.score_slytherin);
        scoreView.setText(String.valueOf(score));
        if (scoreGryffindor > 0 || scoreSlytherin > 0) {
            progress = "The game is on!";
        }
        displayProgress(progress);
    }

    /**
     * Displays the progress of the game.
     *
     * @param progress
     */
    public void displayProgress(String progress) {
        TextView scoreView = (TextView) findViewById(R.id.progress_text_view);
        scoreView.setText(String.valueOf(progress));
    }

    /**
     * Adds ten points for Gryffindor.
     *
     * @param view
     */
    public void addTenForGryffindor(View view) {
        scoreGryffindor = scoreGryffindor + 10;
        displayForGryffindor(scoreGryffindor);
        Button resetButton = findViewById(R.id.reset_button);
        resetButton.setEnabled(false);
    }

    /**
     * Adds ten points for Slytherin.
     *
     * @param view
     */
    public void addTenForSlytherin(View view) {
        scoreSlytherin = scoreSlytherin + 10;
        displayForSlytherin(scoreSlytherin);
        Button resetButton = findViewById(R.id.reset_button);
        resetButton.setEnabled(false);
    }

    /**
     * Adds 150 points for Gryffindor and ends the game.
     *
     * @param view
     */
    public void addSnitchForGryffindor(View view) {
        scoreGryffindor = scoreGryffindor + 150;
        displayForGryffindor(scoreGryffindor);
        progress = "The game has ended, Gryffindor has won!";
        displayProgress(progress);
        Button quaffleGryff = findViewById(R.id.quaffle_gryff);
        Button quaffleSlyth = findViewById(R.id.quaffle_slyth);
        Button snitchGryff = findViewById(R.id.snitch_gryff);
        Button snitchSlyth = findViewById(R.id.snitch_slyth);
        Button resetButton = findViewById(R.id.reset_button);
        resetButton.setEnabled(true);
        quaffleGryff.setEnabled(false);
        quaffleSlyth.setEnabled(false);
        snitchGryff.setEnabled(false);
        snitchSlyth.setEnabled(false);
    }

    /**
     * Adds 150 points for Slytherin and ends the game.
     *
     * @param view
     */
    public void addSnitchForSlytherin(View view) {
        scoreSlytherin = scoreSlytherin + 150;
        displayForSlytherin(scoreSlytherin);
        progress = "The game has ended, Slytherin has won!";
        displayProgress(progress);
        Button quaffleGryff = findViewById(R.id.quaffle_gryff);
        Button quaffleSlyth = findViewById(R.id.quaffle_slyth);
        Button snitchGryff = findViewById(R.id.snitch_gryff);
        Button snitchSlyth = findViewById(R.id.snitch_slyth);
        Button resetButton = findViewById(R.id.reset_button);
        resetButton.setEnabled(true);
        quaffleGryff.setEnabled(false);
        quaffleSlyth.setEnabled(false);
        snitchGryff.setEnabled(false);
        snitchSlyth.setEnabled(false);
    }

    /**
     * Resets the score to 0 and enables all score buttons.
     *
     * @param view
     */
    public void resetScore(View view) {
        scoreGryffindor = 0;
        scoreSlytherin = 0;
        progress = "Start Quidditch!";
        displayForGryffindor(scoreGryffindor);
        displayForSlytherin(scoreSlytherin);
        displayProgress(progress);
        Button quaffleGryff = findViewById(R.id.quaffle_gryff);
        Button quaffleSlyth = findViewById(R.id.quaffle_slyth);
        Button snitchGryff = findViewById(R.id.snitch_gryff);
        Button snitchSlyth = findViewById(R.id.snitch_slyth);
        Button resetButton = findViewById(R.id.reset_button);
        resetButton.setEnabled(false);
        quaffleGryff.setEnabled(true);
        quaffleSlyth.setEnabled(true);
        snitchGryff.setEnabled(true);
        snitchSlyth.setEnabled(true);
    }
}



