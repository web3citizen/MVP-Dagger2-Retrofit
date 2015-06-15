package com.example.lwp.mvp.ui.activity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.lwp.mvp.AppComponent;
import com.example.lwp.mvp.R;
import com.example.lwp.mvp.ui.activity.component.DaggerMainActivityComponent;
import com.example.lwp.mvp.ui.activity.module.MainActivityModule;
import com.example.lwp.mvp.ui.activity.presenter.MainActivityPresenter;

import javax.inject.Inject;

import butterknife.ButterKnife;
import butterknife.InjectView;


public class MainActivity extends BaseActivity {

    @InjectView(R.id.tv)
    TextView textView;

    @Inject
    MainActivityPresenter presenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);
        presenter.showUserName();

    }

    @Override
    protected void setupActivityComponent(AppComponent appComponent) {
        DaggerMainActivityComponent.builder()
                .appComponent(appComponent)
                .mainActivityModule(new MainActivityModule(this))
                .build()
                .inject(this);

    }

    public void setTextView(String username){
        textView.setText(username);
    }




}
