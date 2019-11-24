package com.androidcodeshop.activityandfragmentlifecycle.activities;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.androidcodeshop.activityandfragmentlifecycle.R;
import com.androidcodeshop.activityandfragmentlifecycle.databinding.ActivityLiveDataTransformBinding;
import com.androidcodeshop.activityandfragmentlifecycle.models.User;
import com.androidcodeshop.activityandfragmentlifecycle.viewmodels.NameTransformViewModel;

public class LiveDataTransformActivity extends AppCompatActivity {

    NameTransformViewModel transformViewModel;
    ActivityLiveDataTransformBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_live_data_transform);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        transformViewModel = ViewModelProviders.of(this).get(NameTransformViewModel.class);
        transformViewModel.userName.observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                binding.transformContent.outputLabel.setText(s);
            }
        });
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String firstName = binding.transformContent.firstnameEt.getText().toString();
                String lastName = binding.transformContent.lastnameEt2.getText().toString();
                User user = new User(firstName, lastName);
                transformViewModel.setUser(user);
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", new View.OnClickListener() {
//                            @Override
//                            public void onClick(View v) {
//
//                            }
//                        }).show();
            }
        });
    }

}
