package com.muelpatmore.daggerdemo;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Samuel on 28/11/2017.
 */

@Module
public class TrainingModule {

    @Provides
    TrainingScores getScores() {
        return new TrainingScores();
    }

}
