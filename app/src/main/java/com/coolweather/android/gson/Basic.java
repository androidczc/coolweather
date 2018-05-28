package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 *   城市的天气实体类
 */
public class Basic {
    @SerializedName("city")
    public String cityName;
    @SerializedName("id")
    public String weatherId;
    public Update update;

    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }
}
