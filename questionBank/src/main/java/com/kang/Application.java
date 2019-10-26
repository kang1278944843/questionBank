package com.kang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement//开启十五
@SpringBootApplication(scanBasePackages="com.kang")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
