package com.zhai.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zhai.domain.Order;

@Component
@Mapper
public interface OrderMapper extends BaseMapper<Order> {
	int insert(Order order);
//	long findOneUserId(@Param("user_id")long user_id);
}
