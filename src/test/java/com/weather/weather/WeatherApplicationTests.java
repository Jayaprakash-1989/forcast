package com.weather.weather;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.main.WeatherApplication;
import com.main.controller.WeatherController;

@SpringBootTest(classes = WeatherApplication.class)
@RunWith(SpringRunner.class)
public class WeatherApplicationTests {

	 @Autowired
	  private WeatherController controller;
	
	@Test
	public void contextLoads() throws JsonMappingException, JsonProcessingException {
		System.out.println(controller.getweatherData("Chennai"));
		assertTrue("The object you enter return null", controller.getweatherData("Chennai"));

	}

	/**
	 * @param string
	 * @param getweatherData
	 */
	private void assertTrue(String string, String getweatherData) {
		
		
		
	}

}
