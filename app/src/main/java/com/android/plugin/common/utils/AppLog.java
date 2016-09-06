package com.android.plugin.common.utils;

import com.android.plugin.BuildConfig;
import com.orhanobut.logger.Logger;

import javax.inject.Inject;


public class AppLog {
    private static final String TAG = "App";

    /**
     * initialize the logger.
     */
//    public static void init() {
//        Logger.init(TAG);
//    }
    @Inject
    public AppLog() {
        Logger.init(TAG);
    }

    /**
     * log.i
     *
     * @param msg
     */
    public static void i(String msg) {
        if (BuildConfig.DEBUG) {
            Logger.i(msg);
        }
    }

    /**
     * log.d
     *
     * @param msg
     */
    public static void d(String msg) {
        if (BuildConfig.DEBUG) {
            Logger.d(msg);
        }
    }

    /**
     * log.w
     *
     * @param msg
     */
    public static void w(String msg) {
        if (BuildConfig.DEBUG) {
            Logger.w(msg);
        }
    }

    /**
     * log.e
     *
     * @param msg
     */
    public static void e(String msg) {
        Logger.e(msg);
    }
}
