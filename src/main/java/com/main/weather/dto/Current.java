/**
 * 
 */
package com.main.weather.dto;

import java.util.ArrayList;

/**
 * @author 866994
 *Current.java
2022
 */
public class Current {

	public int dt;
    public int sunrise;
    public int sunset;
    public double temp;
    public double feels_like;
    public int pressure;
    public int humidity;
    public double dew_point;
    public double uvi;
    public int clouds;
    public int visibility;
    public double wind_speed;
    public int wind_deg;
    public double wind_gust;
    public ArrayList<WeatherData> weather;
}
