package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MyActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e(TAG, "onCreate() called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(TAG, "onResume() called");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(TAG, "Sungmin's onStart() called Baam!");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(TAG, "Sungmin's onRestart() called Baam!");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TAG, "Sungmin's onStop() called Baam!");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(TAG, "Sungmin's onPause() called Baam!");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG, "Sungmin's onDestroy() called Baam!");
    }
}
