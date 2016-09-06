package com.android.plugin.di.module;

import android.content.Context;

import com.android.plugin.common.api.UrlManager;
import com.android.plugin.common.okhttp.CacheInterceptor;
import com.android.plugin.common.okhttp.CookiesManager;
import com.android.plugin.common.utils.AppConfig;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.Cache;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;


@Module
public class RetrofitModule {
    private final Context context;

    public RetrofitModule(Context context) {
        this.context = context;
    }

    @Singleton
    @Provides
    public Retrofit providesRetrofit(Gson gson) {
        return new Retrofit.Builder()
                .baseUrl(UrlManager.BASE_URL)
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();
    }

    @Provides
    public Gson provideGson() {
        return new GsonBuilder().
                serializeNulls().
                create();
    }

    @Provides
    public OkHttpClient provideOkhttpClient(Cache cache, CacheInterceptor cacheInterceptor, CookiesManager cookiesManager) {
        return new OkHttpClient.Builder()
                .cache(cache)//添加缓存
                .addInterceptor(cacheInterceptor)
                .cookieJar(cookiesManager)
                .build();

    }

    @Provides
    public CacheInterceptor providesCacheInterceptor() {
        return new CacheInterceptor(context);
    }


    @Provides
    public Cache provideCache() {
        return new Cache(context.getExternalFilesDir(AppConfig.DEFAULT_JOSN_CACHE), AppConfig.DEFAULT_CACHE_SIZE);
    }

    @Provides
    public CookiesManager providesCookies() {
        return new CookiesManager();
    }


}
