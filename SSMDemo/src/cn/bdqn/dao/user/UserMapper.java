package cn.bdqn.dao.user;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.bdqn.pojo.User;

public interface UserMapper {
	List<User> selectByAll();
	int deleteById(@Param("id")Integer id);
	int updateById(@Param("user")User user);
	User selectById(@Param("id")int id);
	int toadd(@Param("user")User user);
	int selectCount();
}
