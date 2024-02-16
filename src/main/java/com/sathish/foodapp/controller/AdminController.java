package com.sathish.foodapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("food/admin")
public class AdminController {

	@GetMapping
	public String testApi() {
		return " Hello api is working..";
	}
}
