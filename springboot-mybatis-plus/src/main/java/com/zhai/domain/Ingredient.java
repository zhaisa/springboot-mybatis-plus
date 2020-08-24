package com.zhai.domain;





import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.gitee.sunchenbin.mybatis.actable.annotation.Column;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
//@RequiredArgsConstructor
//@NoArgsConstructor(access=AccessLevel.PRIVATE, force=true)
@TableName(value="ingredient")
public class Ingredient implements Serializable {
	
//	@JoinColumn(name = "id", referencedColumnName = "ingredient")
	@TableId(type = IdType.ID_WORKER_STR )
	private  String id;
	private  String name;
	@TableField
	private  Type type;
	
	public static enum Type{
		WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE;
	}
	
}
