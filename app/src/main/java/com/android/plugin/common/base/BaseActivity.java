package com.android.plugin.common.base;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.android.plugin.App;
import com.android.plugin.di.component.ActivityComponent;
import com.android.plugin.di.component.AppComponent;
import com.android.plugin.di.component.DaggerActivityComponent;
import com.android.plugin.di.module.ActivityModule;

import butterknife.ButterKnife;


public abstract class BaseActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        setupActivityComponent(getActivityComponent());
        setupAppComponent(getAppComponent());
        if (savedInstanceState == null) {
            ButterKnife.bind(this);
            init();
        }

    }

    public abstract int getLayoutId();

    public final void init() {
        initView();
        initData();
    }

    public void initData() {
    }

    public abstract void initView();

    protected AppComponent getAppComponent() {
        return App.getInstance().getAppComponent();
    }

    protected void setupAppComponent(AppComponent activityComponent){
    }

    protected abstract void setupActivityComponent(ActivityComponent activityComponent);

    protected ActivityModule getActivityModule() {
        return new ActivityModule(this);
    }

    protected ActivityComponent getActivityComponent() {
        return DaggerActivityComponent.builder()
                .activityModule(getActivityModule())
                .build();
    }
}
