package com.zhai.mapper;

import org.apache.ibatis.annotations.Param;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zhai.domain.TacoOrder;

public interface TacoOrderMapper extends BaseMapper<TacoOrder> {
int saveTacoOrder(@Param("tacos_id")Long id,@Param("order_id")Long id2);
}
