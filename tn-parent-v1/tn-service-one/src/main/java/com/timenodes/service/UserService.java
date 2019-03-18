/**
 * 功能描述：
 * @Package: com.timenodes.service.impl 
 * @author: luffy 
 * @date: 2019年3月15日 下午3:40:42 
 */
package com.timenodes.service;

import java.util.List;

import com.timenodes.entity.User;

/**
* @ClassName: IServiceController.java
* @Description: 测试接口
*
* @author: luffy
* @date: 2019年3月15日 下午3:40:42
*/
public interface UserService {

	List<User> getUserInfo(String name);
}
