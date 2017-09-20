package com.cop4331.trav.omniblock;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ToggleButton;

public class StatisticsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statistics);
    }



    public void startService(View view)
    {
        Intent intent = new Intent(this, StatisticService.class);
        startService(intent);
    }

    public void stopService(View view)
    {
        Intent intent = new Intent(this, StatisticService.class);
        stopService(intent);
    }

}
