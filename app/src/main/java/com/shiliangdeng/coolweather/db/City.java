package com.shiliangdeng.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by shiliangdeng on 17/1/15.
 */

public class City extends DataSupport {

    private int id;

    private String CityName;

    private int cityCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return CityName;
    }

    public void setCityName(String cityName) {
        CityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProviceId() {
        return proviceId;
    }

    public void setProviceId(int proviceId) {
        this.proviceId = proviceId;
    }

    private int proviceId;

}
