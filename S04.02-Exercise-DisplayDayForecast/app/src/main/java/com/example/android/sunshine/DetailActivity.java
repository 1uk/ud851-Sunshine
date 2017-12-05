package com.example.android.sunshine;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class DetailActivity extends AppCompatActivity {

    private static final String FORECAST_SHARE_HASHTAG = " #SunshineApp";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Intent myIntent = getIntent();
        TextView mTextView = (TextView) findViewById(R.id.tv_detailed);
        String weatherData = myIntent.getStringExtra(Intent.EXTRA_TEXT);
        mTextView.setText(weatherData);
        Log.v("DetailActivity", weatherData);
        //DONE TODO (2) Display the weather forecast that was passed from MainActivity
    }
}