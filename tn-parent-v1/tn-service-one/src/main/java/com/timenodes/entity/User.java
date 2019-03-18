/**
 * 功能描述：
 * @Package: com.timenodes.entity 
 * @author: luffy 
 * @date: 2019年3月15日 下午3:41:51 
 */
package com.timenodes.entity;

/**
* @ClassName: User.java
* @Description: 测试用户类
*
* @author: luffy
* @date: 2019年3月15日 下午3:41:51
*/
public class User {
	
	/**
	 * 身份证
	 */
	private String id;
	
	/**
	 * 姓名
	 */
	private String user_namr;
	
	/**
	 * 年龄
	 */
	private String password;
	
	/**
	 * 创建时间
	 */
	private String create_time;

	public User() {}
	/**   
	* @Function: User.java
	* @Description: 该函数的功能描述
	*
	* @param:参数描述
	* @author: luffy
	* @date: 2019年3月15日 下午3:50:02 
	*/
	public User(String id, String user_namr, String password, String create_time) {
		super();
		this.id = id;
		this.user_namr = user_namr;
		this.password = password;
		this.create_time = create_time;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the user_namr
	 */
	public String getUser_namr() {
		return user_namr;
	}

	/**
	 * @param user_namr the user_namr to set
	 */
	public void setUser_namr(String user_namr) {
		this.user_namr = user_namr;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the create_time
	 */
	public String getCreate_time() {
		return create_time;
	}

	/**
	 * @param create_time the create_time to set
	 */
	public void setCreate_time(String create_time) {
		this.create_time = create_time;
	}
}
