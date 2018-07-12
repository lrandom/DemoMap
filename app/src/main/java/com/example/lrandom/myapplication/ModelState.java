package com.example.lrandom.myapplication;

import com.google.gson.annotations.SerializedName;

public class ModelState {
    @SerializedName("latitude")
    private Float lat;

    @SerializedName("longitude")
    private Float lng;

    @SerializedName("state")
    private String state;


    public Float getLat() {
        return lat;
    }

    public void setLat(Float lat) {
        this.lat = lat;
    }

    public Float getLng() {
        return lng;
    }

    public void setLng(Float lng) {
        this.lng = lng;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
