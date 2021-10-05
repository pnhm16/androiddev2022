package vn.edu.usth.weather;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class WeatherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        ForecastFragment ff =ForecastFragment.newInstance("","");
        getSupportFragmentManager().beginTransaction().add(
                R.id.container, ff).commit();
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.i("Weather", "onResume");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Weather", "onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Weather", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Weather", "onDestroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Weather", "onPause");
    }
}

