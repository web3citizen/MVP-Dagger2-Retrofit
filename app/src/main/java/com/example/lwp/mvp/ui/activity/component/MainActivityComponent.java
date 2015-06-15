package com.example.lwp.mvp.ui.activity.component;

import com.example.lwp.mvp.AppComponent;
import com.example.lwp.mvp.ui.activity.ActivityScope;
import com.example.lwp.mvp.ui.activity.MainActivity;
import com.example.lwp.mvp.ui.activity.module.MainActivityModule;
import com.example.lwp.mvp.ui.activity.presenter.MainActivityPresenter;

import dagger.Component;

/**
 * Created by clevo on 2015/6/10.
 */
@ActivityScope
@Component(modules = MainActivityModule.class,dependencies = AppComponent.class)
public interface MainActivityComponent {
    MainActivity inject(MainActivity mainActivity);

    MainActivityPresenter presenter();


}
