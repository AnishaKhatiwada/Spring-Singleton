package com.example.springbean;

import com.example.springbean.bean.SingletonBean;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@Slf4j
@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(Application.class, args);

		SingletonBean singletonBean = context.getBean(SingletonBean.class);

		log.info("Bean1: {}", singletonBean);
		singletonBean.setA(3);
		singletonBean.setB(5);

		SingletonBean singletonBean1 = context.getBean(SingletonBean.class);
		log.info("Bean2: {}", singletonBean1);
		log.info("A: {}", singletonBean.getA());
		log.info("B: {}", singletonBean.getB());
		singletonBean1.setB(2);
		singletonBean1.setA(7);
	}
}