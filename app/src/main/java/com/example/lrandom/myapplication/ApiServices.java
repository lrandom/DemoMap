package com.example.lrandom.myapplication;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiServices {
    @GET("json/get/bPOtCIBISW?indent=2")
    Call<ArrayList<ModelState>> getStates();
}
