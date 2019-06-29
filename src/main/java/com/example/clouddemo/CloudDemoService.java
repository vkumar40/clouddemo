package com.example.clouddemo;

import org.springframework.stereotype.Service;

@Service
public class CloudDemoService {
	public CloudDemoService(){
		System.out.println("Cloud Demo Service initiated..");
		
	}
	
	public String sayHello(){
		return "Hello from Cloud Demo ...";
	}
}
