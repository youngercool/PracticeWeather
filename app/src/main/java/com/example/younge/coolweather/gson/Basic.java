package com.example.younge.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by younge on 2017/2/27 0027.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
