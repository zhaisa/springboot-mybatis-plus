package com.zhai.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.CreditCardNumber;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.gitee.sunchenbin.mybatis.actable.annotation.Column;
import com.gitee.sunchenbin.mybatis.actable.annotation.IsAutoIncrement;
import com.gitee.sunchenbin.mybatis.actable.annotation.IsKey;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "taco_order")
public class Order implements Serializable {

	private static final long serialVersionUID = 1L;

//		@IsKey // actable主键注解
//		@IsAutoIncrement // 自增
//		@Column
	@TableId(value = "id", type = IdType.AUTO)
	private Long id;
//	    @NotBlank(message="Delivery name is required")
	@TableField(value = "deliveryName")
	private String deliveryName;

//	    @NotBlank(message="Street is required")
	@TableField(value = "deliveryStreet")
	private String deliveryStreet;

//	    @NotBlank(message="City is required")
	@TableField(value = "deliveryCity")
	private String deliveryCity;

//	    @NotBlank(message="State is required")
	@TableField(value = "deliveryState")
	private String deliveryState;

//	    @NotBlank(message="Zip code is required")
	@TableField(value = "deliveryZip")
	private String deliveryZip;

//	    @CreditCardNumber(message="Not a valid credit card number")
	@TableField(value = "ccNumber")
	private String ccNumber;
	@TableField(value = "user_id")
	private Long user_id;
//	    @Pattern(regexp="^(0[1-9]|1[0-2])([\\/])([1-9][0-9])$",
//	             message="Must be formatted MM/YY")
	@TableField(value = "ccExpiration")
	private String ccExpiration;

//	    @Digits(integer=3, fraction=0, message="Invalid CVV")
	@TableField(value = "ccCVV")
	private String ccCVV;
	@TableField(value = "placedAt")
	private Date placedAt;

	@TableField(exist = false)
	private List<Taco> tacos = new ArrayList<>();
	@TableField(exist = false)
	private User user;

	public void addDesign(Taco design) {
		this.tacos.add(design);
	}
	/*
	 * 
	 */
public Order(Long user_id) {
	this.user_id=user.getId();
}
	void placedAt() {
		this.placedAt = new Date();
	}
}