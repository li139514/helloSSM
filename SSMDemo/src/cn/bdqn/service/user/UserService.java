package cn.bdqn.service.user;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.bdqn.pojo.User;

public interface UserService {
	List<User> selectByAll();
	int deleteById(Integer id);
	int updateById(User user);
	User selectById(int id);
	int toadd(User user);
	int selectCount();
}