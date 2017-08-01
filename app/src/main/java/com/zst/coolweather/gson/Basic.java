package com.zst.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by zhangshitao on 8/1/17.
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
