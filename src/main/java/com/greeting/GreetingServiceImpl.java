package com.greeting;


/**
 *
 * @author Lahiru Ruhunage
 */
public class GreetingServiceImpl implements GreetingService{

    @Override
    public String sayHello(String name) {
        return "Hello "+name+" ! Have a nice day...";
    }
    
	
	
	
}
