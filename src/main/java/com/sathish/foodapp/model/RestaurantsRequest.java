package com.sathish.foodapp.model;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RestaurantsRequest {
	@NotEmpty
	private String name;
	@NotEmpty
	private String code;
	@NotEmpty
	private String place;
}
