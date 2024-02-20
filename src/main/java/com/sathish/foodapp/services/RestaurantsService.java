package com.sathish.foodapp.services;

import com.sathish.foodapp.model.RestaurantsRequest;
import com.sathish.foodapp.model.RestaurantsResp;

public interface RestaurantsService {

	RestaurantsResp createRestaurants(RestaurantsRequest restaurantsRequest);
}
