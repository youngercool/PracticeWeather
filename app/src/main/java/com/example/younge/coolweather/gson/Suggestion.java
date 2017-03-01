package com.example.younge.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by younge on 2017/2/28 0028.
 */

public class Suggestion {

    @SerializedName("comf")
    public Confort confort;
    @SerializedName("cw")
    public CarWash carWash;

    public Sport sport;

    public class Confort{

        @SerializedName("txt")
        public String info;
    }

    public class CarWash{

        @SerializedName("txt")
        public String info;
    }

    public class Sport{

        @SerializedName("txt")
        public String info;
    }
}
