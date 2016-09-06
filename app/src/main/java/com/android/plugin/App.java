package com.android.plugin;

import android.app.Application;

import com.android.plugin.di.component.AppComponent;
import com.android.plugin.di.component.DaggerAppComponent;
import com.android.plugin.di.module.AppModule;
import com.android.plugin.di.module.RetrofitModule;

/**
 * Created by cuieney on 16/9/5.
 */
public class App extends Application {

    private AppComponent appConponent;
    private static App app;

    public static App getInstance() {
        return app;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        app = this;
        initAppComponent();
    }

    public AppComponent getAppComponent() {
        return appConponent;
    }

    private void initAppComponent() {
        appConponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .retrofitModule(new RetrofitModule(this))
                .build();
    }




}
