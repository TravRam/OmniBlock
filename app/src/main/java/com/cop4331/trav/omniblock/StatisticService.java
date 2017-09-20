package com.cop4331.trav.omniblock;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.widget.Toast;

/**
 * Created by Luke on 11/28/2015.
 */
public class StatisticService extends Service {


    @Override
    public void onCreate() {
        super.onCreate();
    }


    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Toast.makeText(this, "Statistics Enabled", Toast.LENGTH_LONG).show();
        return START_STICKY;
    }


    @Override
    public void onDestroy()
    {
        Toast.makeText(this, "Statistics Disabled", Toast.LENGTH_LONG).show();
    }



    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
