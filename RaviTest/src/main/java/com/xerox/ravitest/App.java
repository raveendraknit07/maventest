package com.xerox.ravitest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println("checking in github");
        System.out.println("next checking in github");
        
        ApplicationContext context=new ClassPathXmlApplicationContext("Spring.xml");
        Vehicle vehicle1=(Vehicle)context.getBean("vehicle");
        vehicle1.drive();
        Vehicle vehicle=(Vehicle)context.getBean("vehicle");
        vehicle.drive();
        
    }
}
