package com.sathish.foodapp.services;

import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.sathish.foodapp.entity.Restaurants;
import com.sathish.foodapp.model.RestaurantsRequest;
import com.sathish.foodapp.model.RestaurantsResp;
import com.sathish.foodapp.repository.RestaurantsRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class RestaurantsServiceImpl implements RestaurantsService {

	private RestaurantsRepository restaurantsRepository;
	private ModelMapper mapper;

	@Override
	public RestaurantsResp createRestaurants(RestaurantsRequest restaurantsRequest) {
		// TODO Auto-generated method stub
		Restaurants restaurants = mapper.map(restaurantsRequest, Restaurants.class);
		Restaurants savedRestaurants = restaurantsRepository.save(restaurants);
		RestaurantsResp restaurantsResp = mapper.map(savedRestaurants, RestaurantsResp.class);
		return restaurantsResp;
	}

}
