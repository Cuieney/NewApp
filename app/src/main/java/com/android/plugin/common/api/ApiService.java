package com.android.plugin.common.api;

import com.android.plugin.entity.response.RadiosListEntity;

import java.util.List;

import retrofit2.http.GET;
import rx.Observable;

public interface ApiService {


    @GET("/dynamic-radio-info")
    Observable<List<RadiosListEntity>> getRadiosList();
}
