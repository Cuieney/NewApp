package com.android.plugin.di.module;

import com.android.plugin.common.base.BaseView;

import dagger.Module;
import dagger.Provides;

/**
 * Created by cuieney on 16/9/6.
 */

@Module
public class PresenterModule {
    private final BaseView mView;

    public PresenterModule(BaseView mView) {
        this.mView = mView;
    }

    @Provides
    BaseView provideBaseView(){
        return mView;
    }



}
