/**
 * 
 */
package com.main.weather.dto;

import java.util.ArrayList;

/**
 * @author 866994
 *Weather.java
2022
 */
public class Weather {

	public double lat;
    public double lon;
    public String timezone;
    public int timezone_offset;
    public Current current;
    public ArrayList<Minutely> minutely;
}
