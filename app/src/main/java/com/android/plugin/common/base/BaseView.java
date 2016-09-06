package com.android.plugin.common.base;

public interface BaseView {
    void setPresenter(BasePresenter presenter);

    BasePresenter createPresenter();

}
