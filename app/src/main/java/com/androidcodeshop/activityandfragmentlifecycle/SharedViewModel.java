package com.androidcodeshop.activityandfragmentlifecycle;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.support.annotation.NonNull;

public class SharedViewModel extends AndroidViewModel {


    private MutableLiveData<Integer> countLiveData = new MutableLiveData<>();

    public SharedViewModel(@NonNull Application application) {
        super(application);
        countLiveData.setValue(0);
    }

    public void setCount(int count){
        countLiveData.setValue(count);
    }

    public LiveData<Integer> getCountLiveData(){
         return countLiveData;
    }
}
