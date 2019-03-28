package cn.bdqn.pojo;

import org.springframework.stereotype.Component;

@Component
public class User {
	private int id;
	private String userCode;
	private String userName;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserCode() {
		return userCode;
	}
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	@Override
	public String toString() {
		return "user [id=" + id + ", userCode=" + userCode + ", userName=" + userName + "]";
	}
	public User(int id, String userCode, String userName) {
		super();
		this.id = id;
		this.userCode = userCode;
		this.userName = userName;
	}
	public User() {
		super();
	}
	
	
	
}
