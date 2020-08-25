package com.zhai.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;

@Data
@TableName(value = "taco_order_tacos")
public class TacoOrder {
	@TableField(value = "tacos_id")
	private Long tacos_id;
	@TableId(type = IdType.INPUT)
	private Long order_id;
}
