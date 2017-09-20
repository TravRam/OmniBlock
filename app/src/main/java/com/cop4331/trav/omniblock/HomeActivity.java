package com.cop4331.trav.omniblock;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ToggleButton;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        final ToggleButton onOff = (ToggleButton) findViewById(R.id.onOff);

        final Button settings = (Button) findViewById(R.id.settings);

        final Button stats = (Button) findViewById(R.id.stats);


        onOff.setTextColor(Color.RED);

        onOff.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    onOff.setTextOn("Liberate Me");
                    onOff.setTextColor(Color.GREEN);
                } else {
                    onOff.setTextOff("I Want Those Ads");
                    onOff.setTextColor(Color.RED);
                }
            }
        });


        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //settings.setTextColor(Color.BLACK);
                Intent pref = new Intent(HomeActivity.this, SettingsActivity.class);
                startActivity(pref);
            }
        });


        stats.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //stats.setTextColor(Color.BLACK);
                Intent pref = new Intent(HomeActivity.this, StatisticsActivity.class);
                startActivity(pref);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
