package com.haule.retrofit.demo.networking;

import com.haule.retrofit.demo.model.Response;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiServices {
    //request list questions with 3 params in url
    @GET("questions")
    Call<Response> getQuestionList(
            @Query("order") String order,
            @Query("sort") String sort,
            @Query("site") String site
    );

    //can use POST, PUT, DELETE, ...
}
