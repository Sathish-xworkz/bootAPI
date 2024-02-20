package com.sathish.foodapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sathish.foodapp.entity.Restaurants;

public interface RestaurantsRepository extends JpaRepository<Restaurants, Integer> {

}
