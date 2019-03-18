/**
 * 功能描述：
 * @Package: com.timenodes.fallback 
 * @author: luffy 
 * @date: 2019年3月15日 下午2:55:57 
 */
package com.timenodes.fallback;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

import com.timenodes.service.FeignIntrerface;

/**
* @ClassName: FeignClient.java
* @Description: 该类的功能描述
*
* @author: luffy
* @date: 2019年3月15日 下午2:55:57
*/
@Component
public class FeignClientFallback implements FeignIntrerface {

	@Override
	public String getTestResult(@RequestParam("name")String name) {
		return "服务信息返回错误";
	}

}
