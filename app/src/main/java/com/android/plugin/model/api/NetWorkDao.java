package com.android.plugin.model.api;

import rx.Subscriber;

/**
 * Created by cuieney on 16/5/20.
 */
public class NetWorkDao<T> {
    public  static NetWorkDao netWorkDao;

    public NetWorkDao() {
    }

    public synchronized static NetWorkDao getInstance(){
        if (netWorkDao == null) {
            netWorkDao  = new NetWorkDao();
        }
        return netWorkDao;
    }

    public Subscriber createSubscriber(final CallBackListener<? super T> callBackListener){
        Subscriber mSubscriber = new Subscriber<T>(){

            @Override
            public void onCompleted() {

            }

            @Override
            public void onError(Throwable e) {
                callBackListener.onFailed(e);
            }

            @Override
            public void onNext(T t) {
                callBackListener.onSuccess(t);
            }
        };

        return mSubscriber;
    }

}