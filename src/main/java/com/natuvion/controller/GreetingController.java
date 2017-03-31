package com.natuvion.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.natuvion.domain.Greeting;
import com.natuvion.service.GreetingService;

@RestController
@RequestMapping("/")
public class GreetingController {

	@Autowired
	private GreetingService gs;


	
}//class