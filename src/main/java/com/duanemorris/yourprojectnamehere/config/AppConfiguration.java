package com.duanemorris.yourprojectnamehere.config;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.core.io.ClassPathResource;

@Configuration
@ComponentScan(basePackages={"com.duanemorris.yourprojectnamehere"})
@Import({DataConfiguration.class })
/*
 * Here is how you would import an xml resource
 */
//@ImportResource({
//  "classpath:META-INF/spring/dminfo-app-context.xml",
//})
public class AppConfiguration {

    @Bean
    public static PropertyPlaceholderConfigurer getPropertyPlaceholderConfigurer()
    {
        PropertyPlaceholderConfigurer ppc = new PropertyPlaceholderConfigurer();
        ppc.setLocation(new ClassPathResource("application.properties"));
        ppc.setIgnoreUnresolvablePlaceholders(true);
        return ppc;
    }
}
