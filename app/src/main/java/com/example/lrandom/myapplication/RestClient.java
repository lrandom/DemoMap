package com.example.lrandom.myapplication;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RestClient {
    //public static final String ROOT_URL="https://api.unsplash.com";
    public static final String ROOT_URL="http://www.json-generator.com/api/";

    //private ApiServices apiServices;
    public static Retrofit getRetrofitInstance(){
        return new Retrofit.Builder()
                .baseUrl(ROOT_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public static ApiServices getApiService(){
        return getRetrofitInstance().create(ApiServices.class);
    }
}
