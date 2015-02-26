package com.paypal.helloworld.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class HelloWorld 
{
    @SuppressWarnings("resource")
	public static void main( String[] args )
    {
    	//Loading definitions from XML file
    	ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
    	HelloWorldService service=(HelloWorldService) context.getBean("helloWorldService");
    	
    	// Print the message
    	String message=service.getMessage();
    	System.out.println("The Message is:"+message);
    	
    	//set a new Message
    	service.setMessage("Hello User!!");
    	message = service.getMessage();
    	System.out.println("Now the Message is:"+message);
    	
    	for(String arg:args)
    	{
    		System.out.println("Arg:"+arg);
    	}
    	System.out.println("Done");
    }
}
