package com.xing.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author xingzhe
 * @description
 * @update 2014年6月20日 上午10:48:42
 */
@SpringBootApplication
@MapperScan("com.xing.example.repository")
public class DemoApplication {

	public static void main(String[] args) {
		System.setProperty("app.key", "spring-example");
		SpringApplication.run(DemoApplication.class, args);
	}
}
