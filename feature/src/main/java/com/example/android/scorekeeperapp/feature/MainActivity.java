package com.example.android.scorekeeperapp.feature;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.android.scorekeeperapp.feature.R;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sixPointsForTeamA (View v){
        scoreTeamA = scoreTeamA + 6;
        displayForTeamA (scoreTeamA);
    }

    public void threePointsForTeamA (View v){
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA (scoreTeamA);
    }

    public void twoPointsForTeamA (View v){
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA (scoreTeamA);
    }

    public void onePointForTeamA (View v){
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA (scoreTeamA);
    }

    private void display (int number) {
        TextView teamAScore = (TextView) findViewById(
                R.id.team_a_score);
        teamAScore.setText(" " + number);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void onePointForTeamB (View v){
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB (scoreTeamB);
    }

    public void twoPointsForTeamB (View v){
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB (scoreTeamB);
    }

    public void threePointsForTeamB (View v){
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB (scoreTeamB);
    }

    public void sixPointsForTeamB (View v){
        scoreTeamB = scoreTeamB + 6;
        displayForTeamB (scoreTeamB);
    }

    private void display2 (int number) {
        TextView teamBScore = (TextView) findViewById(
                R.id.team_b_score);
        teamBScore.setText(" " + number);
    }


    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void setResetScore (View v){
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
}

