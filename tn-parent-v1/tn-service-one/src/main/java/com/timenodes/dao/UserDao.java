/**
 * 功能描述：
 * @Package: com.timenodes.dao 
 * @author: luffy 
 * @date: 2019年3月15日 下午3:52:44 
 */
package com.timenodes.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import com.timenodes.entity.User;

/**
* @ClassName: UserDao.java
* @Description: 数据库操作层
*
* @author: luffy
* @date: 2019年3月15日 下午3:52:44
*/
@Component
public class UserDao {
	
	@Autowired
    JdbcTemplate jdbcTemplate;
	
	public List<User> getUserInfo(String name) {
		
		User user = null;
		
		List<User> users = new ArrayList<User>();
		
		StringBuffer sql = new StringBuffer();
		
		sql.append("select * from t_user where user_name like '%" + name + "%'");
		SqlRowSet row = jdbcTemplate.queryForRowSet(sql.toString());
		while(row.next()){
			user = new User(row.getString(1), row.getString(2), row.getString(3), row.getString(4));
			users.add(user);
		}
		return users;
	}
}
