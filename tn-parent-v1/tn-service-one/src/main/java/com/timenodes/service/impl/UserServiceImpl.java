/**
 * 功能描述：
 * @Package: com.timenodes.service 
 * @author: luffy 
 * @date: 2019年3月15日 下午3:44:27 
 */
package com.timenodes.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.timenodes.dao.UserDao;
import com.timenodes.entity.User;
import com.timenodes.service.UserService;

/**
* @ClassName: UserServiceImpl.java
* @Description: 该类的功能描述
*
* @author: luffy
* @date: 2019年3月15日 下午3:44:27
*/
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserDao userDao;
	
	/** 
	* @Function: UserServiceImpl.java
	* @Description: 获取用户信息
	*
	* @param:参数一
	* @return：返回结果描述
	* @throws：异常描述
	*
	* @author: luffy
	* @date: 2019年3月15日 下午3:45:09 
	*/
	@Override
	public List<User> getUserInfo(String name) {
		
		return userDao.getUserInfo(name);
	}

}
