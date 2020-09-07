package com.zhai.service;

import java.util.List;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhai.domain.Order;
import com.zhai.domain.User;

public interface OrderService extends IService<Order> {

	int insert(Order order);

//List<Order> getOrderPage();

//	long findOneUserId(long user_id);
}
