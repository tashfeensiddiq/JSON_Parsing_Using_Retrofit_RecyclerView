package com.example.dd.retrofit2;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by dd on 09.05.2017.
 */

public interface RequestInterface {
    @GET("?limit=10")
    Call<JSONResponse> getJSON();
}
