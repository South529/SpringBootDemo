package com.jt.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

/**
 * 1.spring容器加载dog.properties
 * 2.使用value为属性赋值
 * @author Administrator
 *
 */
@Service
@PropertySource("classpath:/properties/dog.properties")
public class TestDogService {
	@Value("${dog.id}")
	private Integer id;
	@Value("${dog.name}")
	private String name;
	
	
	public String getDog() {
		
		return id + ":" + name; 
	}
}
