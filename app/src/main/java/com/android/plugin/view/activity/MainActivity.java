package com.android.plugin.view.activity;

import android.support.annotation.NonNull;
import android.util.Log;

import com.android.plugin.R;
import com.android.plugin.common.base.MvpActivity;
import com.android.plugin.common.utils.AppLog;
import com.android.plugin.di.component.ActivityComponent;
import com.android.plugin.entity.response.RadiosListEntity;
import com.android.plugin.presenter.HomePresenter;
import com.android.plugin.view.impl.IHomeView;

import java.util.List;

import javax.inject.Inject;


public class MainActivity extends MvpActivity<IHomeView,HomePresenter> implements IHomeView {

    @Inject
    HomePresenter presenter;

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void initView() {
        presenter.loadingData();
    }

    @Override
    protected void setupActivityComponent(ActivityComponent activityComponent) {
        activityComponent.inject(this);
        Log.i("oye", "setupActivityComponent: dev 测试1");
    }

    @NonNull
    @Override
    public HomePresenter createPresenter() {
        return presenter;
    }

    @Override
    public void toHomeActivity(List<RadiosListEntity> data) {
        AppLog.d(data.toString());
    }

    @Override
    public void showFailedError(Throwable throwable) {
        AppLog.d(throwable.getMessage());
    }
}
