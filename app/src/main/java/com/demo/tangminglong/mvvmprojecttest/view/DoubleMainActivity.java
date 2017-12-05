package com.demo.tangminglong.mvvmprojecttest.view;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.demo.tangminglong.mvvmprojecttest.R;
import com.demo.tangminglong.mvvmprojecttest.databinding.ActivityDoubleMainBinding;
import com.demo.tangminglong.mvvmprojecttest.viewmodel.Setting;

public class DoubleMainActivity extends AppCompatActivity {

    private ActivityDoubleMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main2);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_double_main);
        binding.setSetting(new Setting());
    }
}
