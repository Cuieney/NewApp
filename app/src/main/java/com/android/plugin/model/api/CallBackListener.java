package com.android.plugin.model.api;

/**
 * Created by cuieney on 16/5/20.
 */
public interface CallBackListener<T> {
    void onSuccess(T t);
    void onFailed(Throwable throwable);
}