package com.example.android.footballscore;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int teamAscore=0;
    int teamBscore=0;
    int teamAfoul=0;
    int teamBfoul=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void displayscoreA(int scoreTeamA)
    {
        TextView scoreA =(TextView)findViewById(R.id.scoreA);
        scoreA.setText(""+scoreTeamA);
    }
    public void displayscoreB(int scoreTeamB)
    {
        TextView scoreB =(TextView)findViewById(R.id.scoreB);
        scoreB.setText(""+scoreTeamB);
    }

    public void goalA(View view) {
        teamAscore+=1;
        displayscoreA(teamAscore);
    }

    public void goalB(View view) {
        teamBscore+=1;
        displayscoreB(teamBscore);
    }


    public void displayfoulA(int foulTeamA)
    {
        TextView foulA =(TextView)findViewById(R.id.foulA);
        foulA.setText(""+foulTeamA);
    }
    public void displayfoulB(int foulTeamB)
    {
        TextView foulB =(TextView)findViewById(R.id.foulB);
        foulB.setText(""+foulTeamB);
    }


    public void foulA(View view) {
        teamAfoul+=1;
        displayfoulA(teamAfoul);
    }

    public void foulB(View view) {
        teamBfoul+=1;
        displayfoulB(teamBfoul);
    }

    public void reset(View view) {
        teamAscore=0;
        displayscoreA(teamAscore);
        teamBscore=0;
        displayscoreB(teamBscore);
        teamAfoul=0;
        displayfoulA(teamAfoul);
        teamBfoul=0;
        displayfoulB(teamBfoul);
    }
}
