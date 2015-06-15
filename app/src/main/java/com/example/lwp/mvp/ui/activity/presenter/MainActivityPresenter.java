package com.example.lwp.mvp.ui.activity.presenter;

import com.example.lwp.mvp.model.User;
import com.example.lwp.mvp.ui.activity.MainActivity;

/**
 * Created by clevo on 2015/6/10.
 */
public class MainActivityPresenter {

    private MainActivity mainActivity;
    private User user;

    public MainActivityPresenter(MainActivity mainActivity, User user) {
        this.mainActivity = mainActivity;
        this.user = user;
    }


    public void showUserName(){
        mainActivity.setTextView(user.getName());
    }


}
