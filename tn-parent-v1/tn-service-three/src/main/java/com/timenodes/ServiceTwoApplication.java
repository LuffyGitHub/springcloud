/**
 * 功能描述：
 * @Package: com.timenodes 
 * @author: luffy 
 * @date: 2019年3月15日 上午9:32:10 
 */
package com.timenodes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
* @ClassName: ServiceOneApplication.java
* @Description: 服务提供者-one
*
* @author: luffy
* @date: 2019年3月15日 上午9:32:10
*/
@SpringBootApplication
@EnableEurekaClient
public class ServiceTwoApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(ServiceTwoApplication.class, args);
	}
}
