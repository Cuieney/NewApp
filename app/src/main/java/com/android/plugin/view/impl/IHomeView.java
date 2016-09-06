package com.android.plugin.view.impl;


import com.android.plugin.common.base.BaseView;
import com.android.plugin.entity.response.RadiosListEntity;

import java.util.List;

public interface IHomeView extends BaseView {

    void toHomeActivity(List<RadiosListEntity> data);
    void showFailedError(Throwable throwable);

}
