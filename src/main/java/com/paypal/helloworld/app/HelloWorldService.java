package com.paypal.helloworld.app;

import org.springframework.stereotype.Service;

/**
 * Hello world!
 *
 */
@Service("helloWorldService")
public class HelloWorldService 
{
    private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
    
}
