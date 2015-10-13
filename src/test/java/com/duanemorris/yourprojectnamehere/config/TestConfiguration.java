package com.duanemorris.yourprojectnamehere.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

@Configuration
@Import({AppConfiguration.class})
public class TestConfiguration {

    @Bean
    public static PropertyPlaceholderConfigurer getPropertyPlaceholderConfigurer()
    {
        PropertyPlaceholderConfigurer ppc = new PropertyPlaceholderConfigurer();
        ppc.setLocation(new ClassPathResource("application.properties"));
        ppc.setIgnoreUnresolvablePlaceholders(true);
        return ppc;
    }

	@Bean
	public DataSource dataSource() {
		return new EmbeddedDatabaseBuilder()
			.setType(EmbeddedDatabaseType.HSQL)
			.build();
	}
	

/*	
	import org.apache.commons.dbcp2.BasicDataSource;

    @Bean
    public DataSource poolDataSource() {
    	BasicDataSource ds = new BasicDataSource();
        ds.setUsername("security");
        ds.setPassword("springsecurity");
        //ds.setUrl("jdbc:mysql://phlmysql01/spring_security?rewriteBatchedStatements=true");
        ds.setUrl("jdbc:mysql://localhost/yourproject?rewriteBatchedStatements=true");
        //ds.setUrl("jdbc:mysql://192.168.2.53/pmamaster?rewriteBatchedStatements=true");
        ds.setDriverClassName("com.mysql.jdbc.Driver");
        ds.setInitialSize(5);
        ds.setTestOnBorrow(true);
        ds.setValidationQuery("select 1");
    	return ds;
    }
*/    
    

}
