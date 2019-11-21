package com.androidcodeshop.activityandfragmentlifecycle;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class SecondActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Log.d(TAG, "onCreatem: called");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStartm: called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPausem: called");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d(TAG, "onSaveInstanceStatem: called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResumem: called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStopm: called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroym: called");
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Log.d(TAG, "onBackPressedm: called");
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        Log.d(TAG, "onPostCreatem: called");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.d(TAG, "onPostResumem: called");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestartm: called");
    }

}
