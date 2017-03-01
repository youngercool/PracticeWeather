package com.example.younge.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by younge on 2017/2/28 0028.
 */

public class Forecast {

    @SerializedName("date")
    public String data;

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;
    public class Temperature{

        public String max;
        public String min;
    }

    public class More{
        @SerializedName("txt_d")
        public String info;
    }
}
