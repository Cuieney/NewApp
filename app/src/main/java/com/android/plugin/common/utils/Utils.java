package com.android.plugin.common.utils;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;


/**
 * Created by cuieney on 16/8/25.
 */
public class Utils {

    public static String getApplicationVersionName(Context context) {
        try {
            PackageInfo pinfo = context.getPackageManager().getPackageInfo(
                    context.getPackageName(), 0);
            String versionName = pinfo.versionName;
            return versionName;
        } catch (PackageManager.NameNotFoundException e) {
            return "";
        }
    }

    public static String getApplicationPackageName(Context context) {
        try {
            PackageInfo pinfo = context.getPackageManager().getPackageInfo(
                    context.getPackageName(), 0);
            return pinfo.packageName;
        } catch (PackageManager.NameNotFoundException e) {
            return "";
        }
    }

    /**
     * Check whether the network is available.
     *
     * @param context
     * @return true if the network is available.
     */
    public static boolean isNetworkAvailable(Context context) {
        ConnectivityManager connectivity = (ConnectivityManager) context
                .getSystemService(Context.CONNECTIVITY_SERVICE);
        if (connectivity == null) {
            return false;
        } else {
            NetworkInfo[] info = connectivity.getAllNetworkInfo();
            if (info != null) {
                for (int i = 0; i < info.length; i++) {
                    if (info[i].isConnected()) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    public static boolean isWifiActive(Context context) {
        ConnectivityManager connectivity = (ConnectivityManager) context
                .getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo[] info;
        if (connectivity != null) {
            info = connectivity.getAllNetworkInfo();
            if (info != null) {
                for (int i = 0; i < info.length; i++) {
                    if ((info[i].getTypeName().equalsIgnoreCase("WIFI") || info[i]
                            .getTypeName().equalsIgnoreCase("WI FI"))
                            && info[i].isConnected()) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    /**
     * Check the network is available and not wifi,maybe 2G or 3G data
     * connection.
     *
     * @param context
     * @return true if is not wifi.
     */
    public static boolean isNetworkAvailableAndNotWifi(Context context) {
        return isNetworkAvailable(context) && !isWifiActive(context);
    }

}
