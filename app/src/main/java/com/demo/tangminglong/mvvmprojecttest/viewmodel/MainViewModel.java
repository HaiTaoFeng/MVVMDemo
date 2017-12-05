package com.demo.tangminglong.mvvmprojecttest.viewmodel;

import android.content.Context;
import android.content.Intent;
import android.view.View;

import com.demo.tangminglong.mvvmprojecttest.view.DoubleMainActivity;
import com.demo.tangminglong.mvvmprojecttest.view.SingleMainActivity;

/**
 * Created by tangminglong on 17/12/5.
 */

public class MainViewModel {
    private Context context;

    public MainViewModel(Context context) {
        this.context = context;
    }

    public void onClickOne(View view){
        context.startActivity(new Intent(context, SingleMainActivity.class));
    }

    public void onClickTwo(View view){
        context.startActivity(new Intent(context, DoubleMainActivity.class));
    }
}
