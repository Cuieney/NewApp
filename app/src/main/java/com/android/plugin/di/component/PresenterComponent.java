package com.android.plugin.di.component;

import com.android.plugin.common.base.BaseActivity;
import com.android.plugin.di.module.PresenterModule;

import dagger.Component;

/**
 * Created by cuieney on 16/9/6.
 */

@Component(modules = PresenterModule.class)
public interface PresenterComponent {
    void inject(BaseActivity activity);
}
