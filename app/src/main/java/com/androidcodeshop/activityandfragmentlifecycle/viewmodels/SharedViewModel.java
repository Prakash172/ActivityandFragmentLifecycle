package com.androidcodeshop.activityandfragmentlifecycle.viewmodels;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.support.annotation.NonNull;

public class SharedViewModel extends AndroidViewModel {



    /**
     * Livedata : live data is observable data holder class, with awareness of life-cycle methods
     * 1. Only reflect changes in STARTED and RESUMED state
     * 2. Avoid crashes
     * 3. No Manual life cycle handling required
     * 4. Mostly used inside the viewmodel to avoid random calls on lifecycle changes
     * */
    private MutableLiveData<Integer> countLiveData = new MutableLiveData<>();

    /**
     * This is the dafualt method need to override to use android view model
     * */
    public SharedViewModel(@NonNull Application application) {
        super(application);
    }

    public void setCount(int count){
        countLiveData.setValue(count);
    }

    public LiveData<Integer> getCountLiveData(){
         return countLiveData;
    }
}
