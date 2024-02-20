package com.sathish.foodapp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sathish.foodapp.model.RestaurantsRequest;
import com.sathish.foodapp.model.RestaurantsResp;
import com.sathish.foodapp.services.RestaurantsService;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("food/admin")
@AllArgsConstructor
public class AdminController {

	@GetMapping
	public String testApi() {
		return " Hello api is working..";
	}
	
	private RestaurantsService restaurantsService;
	
	@PostMapping
	public ResponseEntity<RestaurantsResp> createRestaurant(@Valid @RequestBody RestaurantsRequest restaurantsRequest){
		
		RestaurantsResp restaurantsResp = restaurantsService.createRestaurants(restaurantsRequest);
		
		return new ResponseEntity<RestaurantsResp>(restaurantsResp, HttpStatus.CREATED);
		
	}
}
