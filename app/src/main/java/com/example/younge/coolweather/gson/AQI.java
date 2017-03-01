package com.example.younge.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by younge on 2017/2/27 0027.
 */

public class AQI {
    public AQICity city;

    public class AQICity{

        @SerializedName("aqi")
        public String aqi;
        @SerializedName("pm25")
        public String pm25;
    }
}
