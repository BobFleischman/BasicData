package com.duanemorris.yourprojectnamehere;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.duanemorris.yourprojectnamehere.config.AppConfiguration;

/**
 * Hello world!
 *
 * http://www.tutorialspoint.com/spring/spring_java_based_configuration.htm
 */
public class App 
{
    public static void main( String[] args )
    {
    	   ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfiguration.class);
    	   for (String name : ctx.getBeanDefinitionNames()) {
    		   System.out.println(name);
    	   }
        System.out.println( "Hello World!" );
    }
}
