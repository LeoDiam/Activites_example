package com.example.activites_example;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Log.d("LIFE_CYCLE", "SecondActivity - onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("LIFE_CYCLE", "SecondActivity - onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("LIFE_CYCLE", "SecondActivity - onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("LIFE_CYCLE", "SecondActivity - onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("LIFE_CYCLE", "SecondActivity - onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("LIFE_CYCLE", "SecondActivity - onDestroy");
    }
}