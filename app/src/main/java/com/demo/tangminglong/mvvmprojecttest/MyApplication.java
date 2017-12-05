package com.demo.tangminglong.mvvmprojecttest;

import android.app.Application;
import android.content.Context;

import com.demo.tangminglong.mvvmprojecttest.model.GitHubService;

import rx.Scheduler;
import rx.schedulers.Schedulers;

/**
 * Created by tangminglong on 17/12/4.
 */

public class MyApplication extends Application {
    private GitHubService githubService;
    private Scheduler defaultSubscribeScheduler;

    public static MyApplication get(Context context){
        return (MyApplication) context.getApplicationContext();
    }

    public GitHubService getGithubService() {
        if (githubService == null) {
            githubService = GitHubService.Factory.create();
        }
        return githubService;
    }

    //For setting mocks during testing
    public void setGithubService(GitHubService githubService) {
        this.githubService = githubService;
    }

    public Scheduler defaultSubscribeScheduler() {
        if (defaultSubscribeScheduler == null) {
            defaultSubscribeScheduler = Schedulers.io();
        }
        return defaultSubscribeScheduler;
    }

    //User to change scheduler from tests
    public void setDefaultSubscribeScheduler(Scheduler scheduler) {
        this.defaultSubscribeScheduler = scheduler;
    }

}
