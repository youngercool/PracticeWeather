package com.example.younge.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by younge on 2017/2/28 0028.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{

        @SerializedName("txt")
        public String info;
    }
}
