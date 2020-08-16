package com.zhai.domain;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.gitee.sunchenbin.mybatis.actable.annotation.Column;
import com.gitee.sunchenbin.mybatis.actable.annotation.IsAutoIncrement;
import com.gitee.sunchenbin.mybatis.actable.annotation.IsKey;

import lombok.Data;

@Data
@TableName(value="taco")
public class Taco {
	
	@IsKey // actable主键注解
	@IsAutoIncrement // 自增
	@Column
	@TableId(value = "id", type = IdType.AUTO)
	private Long id;

	
	@Size(min = 5, message = "Name must be at least 5 characters long")
	@TableField(value="name")
	private String name;
	
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
	@TableField(value = "createdAt")
	private Date createdAt;
	/*
	 * 要声明 Taco 及其相关 Ingredient 列表之间的关系，可以使用 @ManyToMany 注解 ingredient 属性。 一个 Taco
	 * 可以有很多 Ingredient，一个 Ingredient 可以是很多 Taco 的一部分。
	 */

	@Size(min = 1, message = "You must choose at least 1 ingredient")
	private List<Ingredient> ingredients;

	/*
	 * 
	 * 还有一个新方法 createdAt()，它用 @PrePersist 注解。将使用它将 createdAt 属性设置为保存 Taco
	 * 之前的当前日期和时间。
	 */

	public void createdAt() {
		this.createdAt = new Date();
	}


	
}
