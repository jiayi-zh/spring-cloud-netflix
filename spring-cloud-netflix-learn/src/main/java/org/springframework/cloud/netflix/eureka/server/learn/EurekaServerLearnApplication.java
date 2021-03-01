package org.springframework.cloud.netflix.eureka.server.learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Eureka Server Application
 *
 * @author ZhengYu
 * @version 1.0 2021/3/1 12:54
 **/
@EnableEurekaServer
@SpringBootApplication
public class EurekaServerLearnApplication {
	public static void main(String[] args) {
		SpringApplication.run(EurekaServerLearnApplication.class, args);
	}
}
