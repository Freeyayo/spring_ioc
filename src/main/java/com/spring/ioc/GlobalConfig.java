package com.spring.ioc;

import lombok.Data;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
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
//	也可以通过@Qualifier(BEAN_NAME) + 对应的Bean的@Component（BEAN_NAME）进行取值
	private DataConfig dataConfig;
}
