package com.android.plugin.di.component;

import android.content.Context;

import com.android.plugin.common.api.ApiService;
import com.android.plugin.di.module.AppModule;
import com.android.plugin.di.module.RetrofitModule;

import javax.inject.Singleton;

import dagger.Component;


@Singleton
@Component(modules = {AppModule.class, RetrofitModule.class})
public interface AppComponent {
    Context getContext();

    ApiService getApiService();

}
