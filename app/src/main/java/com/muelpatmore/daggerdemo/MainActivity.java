package com.muelpatmore.daggerdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.muelpatmore.daggerdemo.injection.TrainingModule;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    TrainingScores trainingScores;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        injectDagger();

//        TrainingScores trainingScores = new TrainingScores();
        String a= trainingScores.mScore;

        Toast.makeText(this, a, Toast.LENGTH_SHORT).show();
    }

    public void injectDagger(){
        ((MyApp)getApplicationContext()).getTrainingComponent().inject(this);
    }
}
