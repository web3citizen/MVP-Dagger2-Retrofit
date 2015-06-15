package com.example.lwp.mvp;

import android.app.Application;
import android.content.Context;

import com.example.lwp.mvp.data.AppServiceModule;
import com.example.lwp.mvp.data.api.ApiServiceModule;

/**
 * Created by clevo on 2015/6/9.
 */
public class AppApplication  extends Application{

    private AppComponent appComponent;


    public static AppApplication get(Context context){
        return (AppApplication)context.getApplicationContext();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent=DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .apiServiceModule(new ApiServiceModule())
                .appServiceModule(new AppServiceModule())
                .build();
    }


    public AppComponent getAppComponent() {
        return appComponent;
    }
}
