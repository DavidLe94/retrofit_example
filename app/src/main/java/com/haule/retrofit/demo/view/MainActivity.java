package com.haule.retrofit.demo.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.haule.retrofit.demo.R;
import com.haule.retrofit.demo.model.Response;
import com.haule.retrofit.demo.networking.ApiServices;
import com.haule.retrofit.demo.networking.ApiUtils;

import retrofit2.Call;
import retrofit2.Callback;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Create handle for the RetrofitInstance interface
        ApiServices apiServices = ApiUtils.getApiService();
        //call api here
        apiServices.getQuestionList("desc", "activity", "stackoverflow")
                .enqueue(new Callback<Response>() {
                    @Override
                    public void onResponse(Call<Response> call, retrofit2.Response<Response> response) {
                        //progress data show to view when success
                    }

                    @Override
                    public void onFailure(Call<Response> call, Throwable t) {
                        //show message when progress failed
                    }
                });
    }
}
