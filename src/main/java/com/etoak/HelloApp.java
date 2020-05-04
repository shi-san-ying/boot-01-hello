package com.etoak;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

//启动springboot 得启动类
@EnableAutoConfiguration
@ComponentScan(basePackages = "com.etoak")
public class HelloApp {
	public static void main(String[] args) {
		SpringApplication.run(HelloApp.class, args);
	}
}
