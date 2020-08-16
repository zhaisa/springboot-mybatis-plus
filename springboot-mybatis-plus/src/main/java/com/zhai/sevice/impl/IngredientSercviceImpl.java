package com.zhai.sevice.impl;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhai.domain.Ingredient;
import com.zhai.mapper.IngredientMapper;
import com.zhai.sevice.IngredientService;
@Service
public class IngredientSercviceImpl extends ServiceImpl<IngredientMapper,Ingredient> implements IngredientService {




	
//	@Override
//	public Iterable<Ingredient> findAll() {
//		QueryWrapper<Ingredient> queryWrapper=Wrappers.<Ingredient>query();
//		IngredientMapper.selectList(queryWrapper);
//		
//		return IngredientMapper.selectList(queryWrapper);
//	}

	
}
