package com.androidcodeshop.activityandfragmentlifecycle.viewmodels;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.Transformations;
import android.support.annotation.NonNull;

import com.androidcodeshop.activityandfragmentlifecycle.models.User;

public class NameTransformViewModel extends AndroidViewModel {

    private MutableLiveData<User> userLiveData = new MutableLiveData<>();
    public LiveData<String> userName = Transformations.map(userLiveData, u->
            u.getFirstName() + " " +u.getLastName()
    );

    public NameTransformViewModel(@NonNull Application application) {
        super(application);
    }

    public void setUser(User user){
        this.userLiveData.setValue(user);
    }



}
