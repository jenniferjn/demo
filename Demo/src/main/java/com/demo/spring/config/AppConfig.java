package com.demo.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@PropertySource("classpath:db.properties")
@EnableTransactionManagement
@ComponentScans(value = {
		@ComponentScan("com.demo.spring.dao"),
		@ComponentScan("com.demo.spring.service")
})
public class AppConfig {

	public AppConfig() {
		// TODO Auto-generated constructor stub
	}

}
