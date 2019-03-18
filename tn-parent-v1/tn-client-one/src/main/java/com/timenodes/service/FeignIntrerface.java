/**
 * 功能描述：
 * @Package: com.timenodes.service 
 * @author: luffy 
 * @date: 2019年3月15日 下午2:07:34 
 */
package com.timenodes.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.timenodes.fallback.FeignClientFallback;


/**
* @ClassName: FeignClientTest.java
* @Description: 该类的功能描述
*
* @author: luffy
* @date: 2019年3月15日 下午2:07:34
*/
@FeignClient(value = "service-one",fallback = FeignClientFallback.class)
public interface FeignIntrerface {
	
	@RequestMapping("/getUserInfo")
	String getTestResult(@RequestParam("name")String name);
}
