package com.zhai.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhai.domain.TacoOrder;

public interface TacoOrderService extends IService<TacoOrder> {
	int saveTacoOrder(Long id,Long id2);
}
