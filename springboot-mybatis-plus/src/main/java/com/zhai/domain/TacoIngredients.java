package com.zhai.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;

@Data
@TableName(value="taco_ingredients")
public class TacoIngredients {
	@TableField
	private final String ingredients_id;
	@TableId
	private Long taco_id;
}
