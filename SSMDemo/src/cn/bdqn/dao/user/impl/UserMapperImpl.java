package cn.bdqn.dao.user.impl;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import cn.bdqn.dao.user.UserMapper;
import cn.bdqn.pojo.User;
@Repository("userMapper")
public class UserMapperImpl extends SqlSessionDaoSupport implements UserMapper {

	@Autowired
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		super.setSqlSessionFactory(sqlSessionFactory);
	}
	
	
	public List<User> selectByAll() {
		// TODO Auto-generated method stub
		return this.getSqlSession().getMapper(UserMapper.class).selectByAll();
	}


	@Override
	public int updateById(User user) {
		// TODO Auto-generated method stub
		return this.getSqlSession().getMapper(UserMapper.class).updateById(user);
	}


	@Override
	public int deleteById(Integer id) {
		// TODO Auto-generated method stub
		return this.getSqlSession().getMapper(UserMapper.class).deleteById(id);
	}

	@Override
	public User selectById(int id) {
		// TODO Auto-generated method stub
		return this.getSqlSession().getMapper(UserMapper.class).selectById(id);
	}


	@Override
	public int toadd(User user) {
		// TODO Auto-generated method stub
		return this.getSqlSession().getMapper(UserMapper.class).toadd(user);
	}


	@Override
	public int selectCount() {
		// TODO Auto-generated method stub
		return this.getSqlSession().getMapper(UserMapper.class).selectCount();
	}
}
