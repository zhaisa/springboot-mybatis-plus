package com.zhai.sevice.impl;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.zhai.domain.Ingredient;
import com.zhai.domain.Taco;
import com.zhai.sevice.TacoService;
import com.zhai.mapper.*;

@Service
public class TacoServiceImpl implements TacoService {
@Autowired
TacoMapper TacoMapper;
	@Override
	public boolean save(Ingredient entity) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean saveBatch(Collection<Ingredient> entityList, int batchSize) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean saveOrUpdateBatch(Collection<Ingredient> entityList) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean saveOrUpdateBatch(Collection<Ingredient> entityList, int batchSize) {
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
	public boolean remove(Wrapper<Ingredient> queryWrapper) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean removeByIds(Collection<? extends Serializable> idList) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean updateById(Ingredient entity) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean update(Ingredient entity, Wrapper<Ingredient> updateWrapper) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean updateBatchById(Collection<Ingredient> entityList, int batchSize) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean saveOrUpdate(Ingredient entity) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public Ingredient getById(Serializable id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Ingredient> listByIds(Collection<? extends Serializable> idList) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Ingredient> listByMap(Map<String, Object> columnMap) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Ingredient getOne(Wrapper<Ingredient> queryWrapper, boolean throwEx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Object> getMap(Wrapper<Ingredient> queryWrapper) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public int count(Wrapper<Ingredient> queryWrapper) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Ingredient> list(Wrapper<Ingredient> queryWrapper) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IPage<Ingredient> page(IPage<Ingredient> page, Wrapper<Ingredient> queryWrapper) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> listMaps(Wrapper<Ingredient> queryWrapper) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Object> listObjs(Wrapper<Ingredient> queryWrapper) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IPage<Map<String, Object>> pageMaps(IPage<Ingredient> page, Wrapper<Ingredient> queryWrapper) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Taco save(@Valid Taco design) {
	TacoMapper.insert(design);
		return design;
	}

	@Override
	public <V> V getObj(Wrapper<Ingredient> queryWrapper, Function<? super Object, V> mapper) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <V> List<V> listObjs(Wrapper<Ingredient> queryWrapper, Function<? super Object, V> mapper) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BaseMapper<Ingredient> getBaseMapper() {
		// TODO Auto-generated method stub
		return null;
	}

}
