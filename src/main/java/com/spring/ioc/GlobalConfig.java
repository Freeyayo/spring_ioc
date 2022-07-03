package com.spring.ioc;

import lombok.Data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Data
@Component
public class GlobalConfig {
	@Value("8080")
	private String port;
	@Value("/")
	private String path;
	@Autowired
	private DataConfig dataConfig;
}
