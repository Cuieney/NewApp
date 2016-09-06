package com.android.plugin.common.base;


public interface NetLoadView<M> extends BaseView {
    void onSuccess(M data);

    void onFail(Throwable e);
}
