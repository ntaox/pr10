package com.example.pr10;

import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;

public class ApiClient {
    public static Retrofit getRetrofit(){
        HttpLoggingInterceptor
        Retrofit  rertofit= new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("http://api.larntech.net/")
                .build();
    }
}
