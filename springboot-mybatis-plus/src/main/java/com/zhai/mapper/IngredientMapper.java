package com.zhai.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zhai.domain.Ingredient;
@Component
@Mapper
public interface IngredientMapper extends BaseMapper<Ingredient> {

}
