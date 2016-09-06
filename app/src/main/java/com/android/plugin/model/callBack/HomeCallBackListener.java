package com.android.plugin.model.callBack;

import com.android.plugin.entity.response.RadiosListEntity;

import java.util.List;

import rx.functions.Action1;

/**
 * Created by cuieney on 16/9/5.
 */
public interface HomeCallBackListener {
    Action1<List<RadiosListEntity>> getDataSuccess();
    Action1<Throwable> getFailedMsg();
}
