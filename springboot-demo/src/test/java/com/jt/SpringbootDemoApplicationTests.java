package com.jt;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.jt.service.TestDogService;

//运行期加载的类型 启动spring容器
@RunWith(SpringRunner.class)
@SpringBootTest //效果和主启动类类似
public class SpringbootDemoApplicationTests {

	//从容器中获取对象
	@Autowired
	private TestDogService dogService;
	
	@Test
	public void contextLoads() {
		
		String msg = dogService.getDog();
		System.out.println(msg);
	}
}
