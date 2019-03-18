/**
 * 功能描述：
 * @Package: com.timenodes 
 * @author: luffy 
 * @date: 2019年3月15日 下午2:04:26 
 */
package com.timenodes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
* @ClassName: FeignClietnApplication.java
* @Description: 该类的功能描述
*
* @author: luffy
* @date: 2019年3月15日 下午2:04:26
*/
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class FeignClietnApplication {

	    public static void main(String[] args) {
	        SpringApplication.run(FeignClietnApplication.class, args);
	    }
}
