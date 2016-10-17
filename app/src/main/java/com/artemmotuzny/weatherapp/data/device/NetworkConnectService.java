package com.artemmotuzny.weatherapp.data.device;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Looper;

/**
 * Created by tema_ on 13.10.2016.
 */

public class NetworkConnectService {
    private ConnectivityManager connectivityManager;

    public NetworkConnectService(Context context) {
        connectivityManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
    }

    public boolean getConnectState(){
        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
        return networkInfo != null && networkInfo.getState() == NetworkInfo.State.CONNECTED;
    }
}
