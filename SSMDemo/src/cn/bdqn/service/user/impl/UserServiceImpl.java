package cn.bdqn.service.user.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.bdqn.dao.user.UserMapper;
import cn.bdqn.pojo.User;
import cn.bdqn.service.user.UserService;
@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper userMapper;

	
	  public void setUserMapper(UserMapper userMapper) { this.userMapper =
	  userMapper; }
	 
	@Override
	public List<User> selectByAll() {
		// TODO Auto-generated method stub
		return userMapper.selectByAll();
	}
	@Override
	public int deleteById(Integer id) {
		// TODO Auto-generated method stub
		return userMapper.deleteById(id);
	}
	@Override
	public User selectById(int id) {
		// TODO Auto-generated method stub
		return userMapper.selectById(id);
	}
	@Override
	public int updateById(User user) {
		// TODO Auto-generated method stub
		return userMapper.updateById(user);
	}

	@Override
	public int toadd(User user) {
		// TODO Auto-generated method stub
		return userMapper.toadd(user);
	}

	@Override
	public int selectCount() {
		// TODO Auto-generated method stub
		return userMapper.selectCount();
	}
}
