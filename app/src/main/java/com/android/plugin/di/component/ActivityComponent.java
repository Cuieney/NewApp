package com.android.plugin.di.component;

import android.app.Activity;

import com.android.plugin.di.PerActivity;
import com.android.plugin.di.module.ActivityModule;
import com.android.plugin.view.activity.MainActivity;

import dagger.Component;

@PerActivity
@Component(modules = ActivityModule.class)
public interface ActivityComponent {

    Activity activity();
    void inject(MainActivity activity);
}