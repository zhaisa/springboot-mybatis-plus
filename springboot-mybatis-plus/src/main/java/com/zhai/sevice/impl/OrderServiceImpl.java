package com.zhai.sevice.impl;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.zhai.domain.Order;
import com.zhai.sevice.OrderService;
@Service
public class OrderServiceImpl implements OrderService {

	@Override
	public boolean save(Order entity) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean saveBatch(Collection<Order> entityList, int batchSize) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean saveOrUpdateBatch(Collection<Order> entityList) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean saveOrUpdateBatch(Collection<Order> entityList, int batchSize) {
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
	public boolean remove(Wrapper<Order> queryWrapper) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean removeByIds(Collection<? extends Serializable> idList) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean updateById(Order entity) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean update(Order entity, Wrapper<Order> updateWrapper) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean updateBatchById(Collection<Order> entityList, int batchSize) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean saveOrUpdate(Order entity) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public Order getById(Serializable id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Order> listByIds(Collection<? extends Serializable> idList) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Order> listByMap(Map<String, Object> columnMap) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Order getOne(Wrapper<Order> queryWrapper, boolean throwEx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Object> getMap(Wrapper<Order> queryWrapper) {
		// TODO Auto-generated method stub
		return null;
	}

	

	@Override
	public int count(Wrapper<Order> queryWrapper) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Order> list(Wrapper<Order> queryWrapper) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IPage<Order> page(IPage<Order> page, Wrapper<Order> queryWrapper) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> listMaps(Wrapper<Order> queryWrapper) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Object> listObjs(Wrapper<Order> queryWrapper) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IPage<Map<String, Object>> pageMaps(IPage<Order> page, Wrapper<Order> queryWrapper) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Order> getOrderPage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <V> V getObj(Wrapper<Order> queryWrapper, Function<? super Object, V> mapper) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <V> List<V> listObjs(Wrapper<Order> queryWrapper, Function<? super Object, V> mapper) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BaseMapper<Order> getBaseMapper() {
		// TODO Auto-generated method stub
		return null;
	}


}
