package com.muelpatmore.daggerdemo;

import android.app.Application;

import com.muelpatmore.daggerdemo.injection.DaggerTrainingComponent;
import com.muelpatmore.daggerdemo.injection.TrainingComponent;

/**
 * Created by Samuel on 28/11/2017.
 */

public class MyApp extends Application {
    TrainingComponent trainingComponent;

    public TrainingComponent getTrainingComponent() {
        return trainingComponent;
    }

    public void setTrainingComponent(TrainingComponent trainingComponent) {
        this.trainingComponent = trainingComponent;
    }

    @Override
    public void onCreate() {
        super.onCreate();

        trainingComponent= DaggerTrainingComponent.create();
    }
}
