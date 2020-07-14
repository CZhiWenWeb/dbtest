package com.democonsumer;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * Hello world!
 */
@SpringBootApplication
@EnableDubbo(scanBasePackages = "com.democonsumer")
public class ConsumerApp {
	public static ApplicationContext applicationContext;

	public static void main(String[] args) {
		applicationContext = SpringApplication.run(ConsumerApp.class, args);
		Action action = (Action) applicationContext.getBean("action");
		System.out.println(action.doSayHello("world"));
	}
}
