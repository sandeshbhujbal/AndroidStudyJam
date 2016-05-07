package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA=0;
    int scoreTeamB=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addThreeForTeamA(View v){
        scoreTeamA = scoreTeamA + 3;
        displayScoreForTeamA(scoreTeamA);
    }

    public void addThreeForTeamB(View v){
        scoreTeamB = scoreTeamB + 3;
        displayScoreForTeamB(scoreTeamB);
    }


    public void addTwoForTeamA(View v){
        scoreTeamA = scoreTeamA + 2;
        displayScoreForTeamA(scoreTeamA);

    }

    public void addTwoForTeamB(View v){
        scoreTeamB = scoreTeamB + 2;
        displayScoreForTeamB(scoreTeamB);
    }

    public void addOneForTeamA(View v){
        scoreTeamA = scoreTeamA +1;
        displayScoreForTeamA(scoreTeamA);
    }

    public void addOneForTeamB(View v){
        scoreTeamB = scoreTeamB +1;
        displayScoreForTeamB(scoreTeamB);
    }


    public void displayScoreForTeamA(int score)
    {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));

    }

    public void displayScoreForTeamB(int score)
    {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));

    }
}
