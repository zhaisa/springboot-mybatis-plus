package com.zhai.sevice;

import java.util.List;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhai.domain.Order;

public interface OrderService extends IService<Order> {

	

List<Order> getOrderPage();


}
