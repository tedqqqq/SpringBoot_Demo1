package com.test.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.test.springboot.controller.meetingController;

/**
 * Hello world!
 *
 */
@EnableAutoConfiguration
@SpringBootApplication
@MapperScan("com.test.openmeetings.mapper")
@ComponentScan(basePackages = {"com.test.openmeetings.service","com.test.springboot.controller"})
public class App 
{
    public static void main( String[] args )
    {
//    	 SpringApplication.run(meetingController.class, args);
    	 SpringApplication.run(App.class, args);
    }
}
