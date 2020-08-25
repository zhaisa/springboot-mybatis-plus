package com.zhai.service.impl;

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
import com.zhai.domain.Order;
import com.zhai.domain.TacoOrder;
import com.zhai.mapper.OrderMapper;
import com.zhai.mapper.TacoOrderMapper;
import com.zhai.service.TacoOrderService;
@Service
public class TacoOrderServiceImpl extends ServiceImpl<TacoOrderMapper, TacoOrder> implements TacoOrderService {
@Autowired
TacoOrderMapper tacoordermapper;
	@Override
	public int saveTacoOrder(Long id, Long id2) {
	
		return tacoordermapper.saveTacoOrder(id, id2);
	}

	
}
