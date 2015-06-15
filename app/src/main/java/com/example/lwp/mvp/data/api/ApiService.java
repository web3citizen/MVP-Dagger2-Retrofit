package com.example.lwp.mvp.data.api;

import com.example.lwp.mvp.model.User;
import java.util.List;
import retrofit.Callback;
import retrofit.http.GET;

/**
 * Created by clevo on 2015/6/10.
 */
public interface ApiService {

    @GET("/users")
    public void getUsers(Callback<List<User>> callback);
}
