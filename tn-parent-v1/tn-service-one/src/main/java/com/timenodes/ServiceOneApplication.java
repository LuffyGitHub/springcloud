/**
 * 功能描述：
 * @Package: com.timenodes 
 * @author: luffy 
 * @date: 2019年3月15日 上午9:32:10 
 */
package com.timenodes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
* @ClassName: ServiceOneApplication.java
* @Description: 服务提供者-one
*
* @author: luffy
* @date: 2019年3月15日 上午9:32:10
*/
@SpringBootApplication
@EnableDiscoveryClient
public class ServiceOneApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(ServiceOneApplication.class, args);
	}
}
