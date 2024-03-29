package com.example.android.Bella;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.transition.Fade;

public class WeatherActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Fade s = new Fade();
        s.setDuration(1000);
        getWindow().setEnterTransition(s);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.framelayout);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new ForecastFragment())
                    .commit();
        }
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.

    }

}
