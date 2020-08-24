package com.zhai.domain;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;

@Data
@TableName(value="taco_ingredients")
public class TacoIngredients implements Serializable {
	@TableId(type=IdType.ID_WORKER_STR)
	private  String ingredients_id;
	@TableField
	private Long taco_id;
}
