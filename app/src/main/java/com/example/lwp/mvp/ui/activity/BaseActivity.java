package com.example.lwp.mvp.ui.activity;

import android.app.Activity;
import android.os.Bundle;

import com.example.lwp.mvp.AppApplication;
import com.example.lwp.mvp.AppComponent;

/**
 * Created by clevo on 2015/6/10.
 */
public abstract  class BaseActivity extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setupActivityComponent(AppApplication.get(this).getAppComponent());
    }

    protected abstract  void setupActivityComponent(AppComponent appComponent);
}
