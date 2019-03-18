/**
 * 功能描述：
 * @Package: com.timenodes.controlller 
 * @author: luffy 
 * @date: 2019年3月15日 下午2:06:16 
 */
package com.timenodes.controlller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.timenodes.service.FeignIntrerface;

/**
* @ClassName: FeignClientTest.java
* @Description: 控制调用测试类
*
* @author: luffy
* @date: 2019年3月15日 下午2:06:16
*/
@RestController
public class FeignClientTest {

	@Autowired
	FeignIntrerface feignIntrerface;
	
	@RequestMapping("/getUserInfo")
	public String getTestResult(@RequestParam("name")String name){
		return feignIntrerface.getTestResult(name);
	}
}
