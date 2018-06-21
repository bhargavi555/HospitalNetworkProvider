package com.Altimetrik.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NetworkProviderController {
	
	@RequestMapping(value="/hospitals",method=RequestMethod.GET)
	public String hospitals() {
		System.out.println("hospitals");
		return "hospitals";
	}
	
	@RequestMapping(value="/specialties",method=RequestMethod.GET)
	public void specialities() {}

}
