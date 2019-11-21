package com.androidcodeshop.activityandfragmentlifecycle;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.support.annotation.NonNull;
import android.util.Log;

public class MainActivityViewModel extends AndroidViewModel {

    private int x = 10 ;
    private static final String TAG = "MainActivity";
    public MainActivityViewModel(@NonNull Application application) {
        super(application);
    }

    public int getCount(){
        return x;
    }
    @Override
    protected void onCleared() {
        super.onCleared();
        Log.d(TAG, "onCleared: called");
    }
}
