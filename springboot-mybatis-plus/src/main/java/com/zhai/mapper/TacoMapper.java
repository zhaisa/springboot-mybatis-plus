package com.zhai.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.zhai.domain.Taco;
import com.zhai.domain.User;
@Component
@Mapper
public interface TacoMapper extends BaseMapper<Taco> {
	
//	void inserttacoingredient(@Param(Constants.WRAPPER)Wrapper<User> wrapper);
}
