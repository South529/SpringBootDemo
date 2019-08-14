package com.jt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//该注解是springBoot标识,必须添加
@SpringBootApplication  //1
public class SpringbootDemoApplication {

	/**
	 * 2.编辑主启动类,内置tomcat服务器默认端口8080
	 * 项目本身就是默认的发布路径
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		SpringApplication.run(SpringbootDemoApplication.class, args);
	}

}
