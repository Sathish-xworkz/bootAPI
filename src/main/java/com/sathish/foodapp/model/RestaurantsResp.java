package com.sathish.foodapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RestaurantsResp {
	private int id;
	private String name;
	private String code;
	private String place;
}
