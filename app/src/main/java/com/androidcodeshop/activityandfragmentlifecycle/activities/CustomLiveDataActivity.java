package com.androidcodeshop.activityandfragmentlifecycle.activities;

import android.arch.lifecycle.Observer;
import android.databinding.DataBindingUtil;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.androidcodeshop.activityandfragmentlifecycle.R;
import com.androidcodeshop.activityandfragmentlifecycle.databinding.ActivityCustomLiveDataBinding;
import com.androidcodeshop.activityandfragmentlifecycle.livedata.NameLiveData;

public class CustomLiveDataActivity extends AppCompatActivity {

    ActivityCustomLiveDataBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_custom_live_data);
        final NameLiveData liveData = new NameLiveData();
        liveData.setValue("Name");
        liveData.observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                binding.nameDisplayTv.setText(s);
            }
        });

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                liveData.setValue("Prakash sharma");
            }
        },10000);
    }
}
