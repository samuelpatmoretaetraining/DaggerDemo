package com.muelpatmore.daggerdemo.injection;

import com.muelpatmore.daggerdemo.MainActivity;

import dagger.Component;

/**
 * Created by Samuel on 28/11/2017.
 */

@Component(modules = TrainingModule.class)
public interface TrainingComponent {

    void inject(MainActivity mainActivity);
}
