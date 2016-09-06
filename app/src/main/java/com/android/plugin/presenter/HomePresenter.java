package com.android.plugin.presenter;


import com.android.plugin.common.base.BasePresenter;
import com.android.plugin.entity.response.RadiosListEntity;
import com.android.plugin.model.HomeModel;
import com.android.plugin.model.api.CallBackListener;
import com.android.plugin.view.impl.IHomeView;

import java.util.List;

import javax.inject.Inject;


public class HomePresenter extends BasePresenter<IHomeView> {

    @Inject
    HomeModel homeModel;


    @Inject
    public HomePresenter(){
    }

    public void loadingData(){
        homeModel.getHomeData(new CallBackListener<List<RadiosListEntity>>() {
            @Override
            public void onSuccess(List<RadiosListEntity> radiosListEntities) {
                getView().toHomeActivity(radiosListEntities);
            }

            @Override
            public void onFailed(Throwable throwable) {
                getView().showFailedError(throwable);
            }
        });
    }
}
