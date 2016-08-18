package com.abhishek;

import org.hibernate.SessionFactory;
import org.hibernate.jpa.HibernateEntityManagerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan({"com.abhishek"})

public class SpringBootDemoApplication {
	
	@Bean  
	public SessionFactory sessionFactory(HibernateEntityManagerFactory hemf){  
	    return hemf.getSessionFactory();  
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoApplication.class, args);
	}
}
