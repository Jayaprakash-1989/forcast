/**
 * 
 */
package com.main.controller;

import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.PathParam;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

/**
 * @author Jayaprakash
 *WeatherController.java
2022
 */
@RestController
@RequestMapping("/api")
public class WeatherController {
	
	@RequestMapping(value = "/resturl", method = RequestMethod.GET, produces = {"application/json"})
	public String  getweatherData(@PathParam(value = "location") String location) throws JsonMappingException, JsonProcessingException{
		
		RestTemplate coolRestTemplate = new RestTemplate();
		 String url = "http://api.openweathermap.org/data/2.5/weather?appid=6fec35608e8f9c83cad720df88d50a9f&units=metric&q=" + location;
		 ResponseEntity<String> response = coolRestTemplate.getForEntity(url , String.class);
		 
		/* ObjectMapper mapper = new ObjectMapper();
		 Weather map = mapper.readValue(response.getBody(), Weather.class);*/
		 
		// System.out.println(map);
		
		 return "<h1>success: " + response.getBody() + "</h1>";
	}

}
