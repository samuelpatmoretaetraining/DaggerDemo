package com.muelpatmore.daggerdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TrainingScores trainingScores = new TrainingScores();
        String a= trainingScores.mScore;
    }
}
