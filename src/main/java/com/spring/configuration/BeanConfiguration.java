package com.spring.configuration;

import com.spring.ioc.DataConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {
	
//	@Bean(value = "config")
	@Bean
	public DataConfig dataConfig () {
		DataConfig dataConfig = new DataConfig();
		dataConfig.setDriverName("diverName_fromBean");
		dataConfig.setUrl("localhost:8080");
		dataConfig.setUsername("root");
		dataConfig.setPassword("root");
		return dataConfig;
	}
}
