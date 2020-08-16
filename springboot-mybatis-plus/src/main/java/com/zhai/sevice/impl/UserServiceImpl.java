package com.zhai.sevice.impl;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhai.domain.User;
import com.zhai.mapper.UserMapper;
import com.zhai.sevice.UserService;
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService,UserDetailsService{
@Autowired
UserMapper UserMapper;
	@Override
	public boolean save(User entity) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean saveBatch(Collection<User> entityList, int batchSize) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean saveOrUpdateBatch(Collection<User> entityList) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean saveOrUpdateBatch(Collection<User> entityList, int batchSize) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean removeById(Serializable id) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean removeByMap(Map<String, Object> columnMap) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean remove(Wrapper<User> queryWrapper) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean removeByIds(Collection<? extends Serializable> idList) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean updateById(User entity) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean update(User entity, Wrapper<User> updateWrapper) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean updateBatchById(Collection<User> entityList, int batchSize) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean saveOrUpdate(User entity) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public User getById(Serializable id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<User> listByIds(Collection<? extends Serializable> idList) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<User> listByMap(Map<String, Object> columnMap) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getOne(Wrapper<User> queryWrapper, boolean throwEx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Object> getMap(Wrapper<User> queryWrapper) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public int count(Wrapper<User> queryWrapper) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<User> list(Wrapper<User> queryWrapper) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IPage<User> page(IPage<User> page, Wrapper<User> queryWrapper) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> listMaps(Wrapper<User> queryWrapper) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Object> listObjs(Wrapper<User> queryWrapper) {
		return null;
		
	}

	@Override
	public IPage<Map<String, Object>> pageMaps(IPage<User> page, Wrapper<User> queryWrapper) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findByUsername(String username) {
		QueryWrapper<User> queryWrapper = Wrappers.<User>query()
                .eq("username", username);
		User user=UserMapper.selectOne(queryWrapper);
		return user;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        QueryWrapper<User> queryWrapper = Wrappers.<User>query()
                .eq("username", username);
		User user=UserMapper.selectOne(queryWrapper);
		if(user!=null) {
		return user;}
		throw new UsernameNotFoundException("User"+username+"not found");
	}

	@Override
	public <V> V getObj(Wrapper<User> queryWrapper, Function<? super Object, V> mapper) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <V> List<V> listObjs(Wrapper<User> queryWrapper, Function<? super Object, V> mapper) {
		// TODO Auto-generated method stub
		return null;
	}

	
	}


