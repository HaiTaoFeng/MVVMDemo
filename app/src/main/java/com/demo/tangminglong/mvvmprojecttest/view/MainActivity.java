package com.demo.tangminglong.mvvmprojecttest.view;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.demo.tangminglong.mvvmprojecttest.R;
import com.demo.tangminglong.mvvmprojecttest.databinding.ActivityMainBinding;
import com.demo.tangminglong.mvvmprojecttest.viewmodel.MainViewModel;

public class MainActivity extends AppCompatActivity {
  ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        binding.setViewModel(new MainViewModel(this));
    }
}
