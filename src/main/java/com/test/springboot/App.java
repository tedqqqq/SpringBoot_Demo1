package com.test.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.test.springboot.controller.meetingController;

/**
 * Hello world!
 *
 */
@EnableAutoConfiguration
@SpringBootApplication
public class App 
{
    public static void main( String[] args )
    {
//    	 SpringApplication.run(meetingController.class, args);
    	 SpringApplication.run(App.class, args);
    }
}
