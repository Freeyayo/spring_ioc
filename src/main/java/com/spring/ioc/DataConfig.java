package com.spring.ioc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class DataConfig {
	@Value("localhost:5566")
	private String url;
	@Value("driverName")
	private String driverName;
	@Value("root")
	private String username;
	@Value("root")
	private String password;
}
