package com.androidcodeshop.activityandfragmentlifecycle.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.androidcodeshop.activityandfragmentlifecycle.R;

/**
 * @author prakash sharma
 * @class This class/Activity is used to provide a common viewmodel across two fragments*/

public class DataSharingBetweenFragmentsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_sharing_between_fragments);
    }
}
