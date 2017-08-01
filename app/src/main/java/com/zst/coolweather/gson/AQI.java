package com.zst.coolweather.gson;

/**
 * Created by zhangshitao on 8/1/17.
 */

public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
