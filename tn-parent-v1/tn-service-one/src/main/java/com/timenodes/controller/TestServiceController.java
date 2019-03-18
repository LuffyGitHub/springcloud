/**
 * 功能描述：
 * @Package: com.timenodes.controller 
 * @author: luffy 
 * @date: 2019年3月15日 下午2:29:01 
 */
package com.timenodes.controller;

import java.net.UnknownHostException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.timenodes.entity.User;
import com.timenodes.service.UserService;
import com.timenodes.service.impl.UserServiceImpl;

import net.sf.json.JSONArray;


/**
* @ClassName: TestServiceController.java
* @Description: 该类的功能描述
*
* @author: luffy
* @date: 2019年3月15日 下午2:29:01
*/
@RestController
public class TestServiceController {
	
	@Autowired
    private DiscoveryClient client; // 服务发现客户端
	
	@Autowired
	UserService userServiceImpl;
	
	@RequestMapping("/getUserInfo")
	public String getTestHello(@RequestParam("name") String name) throws UnknownHostException {
		
		List<ServiceInstance> instances = client.getInstances("SERVICE-ONE");
		ServiceInstance serviceInstance = instances.get(0);
		String host = serviceInstance.getHost();
		int port = serviceInstance.getPort();
		
		List<User> userInfo = userServiceImpl.getUserInfo(name);
		
		JSONArray json = JSONArray.fromObject(userInfo);
		
		String result = "服务器IP:" + host + " 端口号:" + port + " 用户信息: "+ json;
		
		return result;
	}
}
