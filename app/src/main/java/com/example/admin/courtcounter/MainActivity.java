package com.example.admin.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreA = 0, scoreB = 0;
    TextView finalScoreA, finalScoreB;
    Button b1, b2, b3, b4, b5, b6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        finalScoreA = (TextView)findViewById(R.id.txt1);
        finalScoreB = (TextView)findViewById(R.id.txt2);
        b1 = (Button)findViewById(R.id.btn1);
        b2 = (Button)findViewById(R.id.btn2);
        b3 = (Button)findViewById(R.id.btn3);
        b4 = (Button)findViewById(R.id.btn4);
        b5 = (Button)findViewById(R.id.btn5);
        b6 = (Button)findViewById(R.id.btn6);
    }

    public void addOneforTeamA(View view) {
        scoreA = scoreA + 1;
        displayForTeamA(scoreA);
    }

    public void addTwoforTeamA(View view) {
        scoreA = scoreA + 2;
        displayForTeamA(scoreA);
    }

    public void addThreeforTeamA(View view) {
        scoreA = scoreA + 3;
        displayForTeamA(scoreA);
    }
    //Display function for TEAM A
    public void displayForTeamA(int score){
        finalScoreA.setText(String.valueOf(score));
    }

    public void addOneforTeamB(View view) {
        scoreB = scoreB + 1;
        displayForTeamB(scoreB);
    }

    public void addTwoforTeamB(View view) {
        scoreB = scoreB + 2;
        displayForTeamB(scoreB);
    }

    public void addThreeforTeamB(View view) {
        scoreB = scoreB + 3;
        displayForTeamB(scoreB);
    }
    public void displayForTeamB(int score){
        finalScoreB.setText(String.valueOf(score));
    }

    public void resetScore(View view) {
        scoreA = 0;
        scoreB = 0;
        displayForTeamA(scoreA);
        displayForTeamB(scoreB);
    }
}
