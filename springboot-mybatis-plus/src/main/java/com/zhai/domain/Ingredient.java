package com.zhai.domain;





import com.baomidou.mybatisplus.annotation.TableName;
import com.gitee.sunchenbin.mybatis.actable.annotation.Column;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@NoArgsConstructor(access=AccessLevel.PRIVATE, force=true)
@TableName(value="ingredient")
public class Ingredient {
	
//	@JoinColumn(name = "id", referencedColumnName = "ingredient")
	private final String id;
	private final String name;
	@Column(name="type")
	private final Type type;
	
	public static enum Type{
		WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE;
	}
	
}
