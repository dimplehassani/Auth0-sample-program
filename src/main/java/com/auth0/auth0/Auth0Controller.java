package com.auth0.auth0;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Auth0Controller {

	@GetMapping
	@RequestMapping(value = "/api/public", produces = "application/json")
	@ResponseBody
	public String testMessage() {
		return 
				"Welcome to Auth0 -- No Access token required here";
	}
	
	@GetMapping
	@RequestMapping(value = "/api/private")
	public String testPrivateMessage() {
		return "Authenticated! -- You have entered the private scope!";
	}
	
	@GetMapping
	@RequestMapping(value = "/api/general")
	public String testGeneralMessage() {
		return "Authenticated! -- You have entered the General scope!";
	}
}
