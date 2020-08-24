package com.zhai.sevice.impl;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhai.domain.Ingredient;
import com.zhai.domain.TacoIngredients;
import com.zhai.mapper.TacoIngredientsMapper;
import com.zhai.sevice.TacoIngredientsService;
@Service
public class TacoIngredientsServiceImpl extends ServiceImpl<TacoIngredientsMapper, TacoIngredients>implements TacoIngredientsService {


	
}
