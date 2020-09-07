package com.zhai.service.impl;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhai.domain.Order;
import com.zhai.domain.User;
import com.zhai.mapper.OrderMapper;
import com.zhai.service.OrderService;
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {
@Autowired
OrderMapper ordermapper;
	@Override
	public int insert(Order order) {
	
		return ordermapper.insert(order);
	}
//	@Override
//	public long findOneUserId(long user_id) {
//		// TODO Auto-generated method stub
//		return ordermapper.findOneUserId(user_id);
//	}





}
