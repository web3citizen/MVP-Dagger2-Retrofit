package com.example.lwp.mvp.data;

import com.example.lwp.mvp.model.User;

import dagger.Module;
import dagger.Provides;

/**
 * Created by clevo on 2015/6/13.
 */
@Module
public class AppServiceModule {

    @Provides
    User provideUser() {
        User user = new User();
        user.setId("1");
        user.setName("hello world");
        return user;
    }
}
