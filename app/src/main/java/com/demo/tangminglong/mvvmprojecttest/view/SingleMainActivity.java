package com.demo.tangminglong.mvvmprojecttest.view;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.demo.tangminglong.mvvmprojecttest.R;
import com.demo.tangminglong.mvvmprojecttest.RepositoryAdapter;
import com.demo.tangminglong.mvvmprojecttest.databinding.ActivitySingleMainBinding;
import com.demo.tangminglong.mvvmprojecttest.model.Repository;
import com.demo.tangminglong.mvvmprojecttest.viewmodel.SingleMainViewModel;
import com.demo.tangminglong.mvvmprojecttest.viewmodel.SingleMainViewModel.DataListener;

import java.util.List;

public class SingleMainActivity extends AppCompatActivity implements DataListener{
    ActivitySingleMainBinding binding;
    private SingleMainViewModel mainViewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_single_main);
        mainViewModel = new SingleMainViewModel(this,this);
        binding.setViewModel(mainViewModel);
        setSupportActionBar(binding.toolbar);
        setupRecyclerView(binding.reposRecyclerView);

    }

    @Override
    public void onRepositoriesChanged(List<Repository> repositories) {
        Log.i("TML",repositories.toString());
        RepositoryAdapter adapter = (RepositoryAdapter) binding.reposRecyclerView.getAdapter();
        adapter.setRepositories(repositories);
        adapter.notifyDataSetChanged();
    }

    public void setupRecyclerView(RecyclerView recyclerView) {
        RepositoryAdapter adapter = new RepositoryAdapter();
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


    }
}
