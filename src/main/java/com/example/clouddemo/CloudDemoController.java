package com.example.clouddemo;

import javax.xml.ws.RequestWrapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class CloudDemoController {
	
	@Autowired
	CloudDemoService cds;
	
	@GetMapping
	public String sayHello(){
		return cds.sayHello();
	}
}
