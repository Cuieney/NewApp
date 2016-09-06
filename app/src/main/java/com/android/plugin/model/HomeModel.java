package com.android.plugin.model;

import com.android.plugin.App;
import com.android.plugin.entity.response.RadiosListEntity;
import com.android.plugin.model.api.CallBackListener;
import com.android.plugin.model.api.NetWorkDao;

import java.util.List;

import javax.inject.Inject;

import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by cuieney on 16/9/5.
 */
public class HomeModel {

    @Inject
    public HomeModel() {
    }

    public void getHomeData(CallBackListener<List<RadiosListEntity>> backListener) {
        Observable<List<RadiosListEntity>> imageData = App.getInstance()
                .getAppComponent()
                .getApiService()
                .getRadiosList();
        imageData.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(NetWorkDao.getInstance().createSubscriber(backListener));
    }


}
