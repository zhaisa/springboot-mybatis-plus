package com.zhai.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zhai.domain.Ingredient;
import com.zhai.domain.TacoIngredients;
@Component
@Mapper
public interface TacoIngredientsMapper extends BaseMapper<TacoIngredients> {
//	void save(List<Ingredient> ingredients,long id);
}
