package com.jt.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Service;

@Service    //spring容器会加载该对象
@ConfigurationProperties(prefix ="node")
public class TestService {
	
	//定义2个成员变量
	private String  host;
	private Integer port;
	
	//添加get/set方法
	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public Integer getPort() {
		return port;
	}

	public void setPort(Integer port) {
		this.port = port;
	}


	/*
	 * //@Value("${node.host}") private String host; //IP //@Value("${node.port}")
	 * private Integer port; //端口
	 */	
	public String getNode() {
		
		return "获取节点id信息"+host+"~~~获取端口"+port;
	}
	
	
}
