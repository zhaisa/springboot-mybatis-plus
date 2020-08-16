package com.zhai.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.CreditCardNumber;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.gitee.sunchenbin.mybatis.actable.annotation.Column;
import com.gitee.sunchenbin.mybatis.actable.annotation.IsAutoIncrement;
import com.gitee.sunchenbin.mybatis.actable.annotation.IsKey;

import lombok.Data;

@Data
@TableName(value="taco_order")
public class Order implements Serializable {
	
	  private static final long serialVersionUID = 1L;

		@IsKey // actable主键注解
		@IsAutoIncrement // 自增
		@Column
		@TableId(value = "id", type = IdType.AUTO)
	    private Long id;
	    @NotBlank(message="Delivery name is required")
	    private String deliveryName;
	    
	    @NotBlank(message="Street is required")
	    private String deliveryStreet;
	    
	    @NotBlank(message="City is required")
	    private String deliveryCity;
	    
	    @NotBlank(message="State is required")
	    private String deliveryState;
	    
	    @NotBlank(message="Zip code is required")
	    private String deliveryZip;

	    @CreditCardNumber(message="Not a valid credit card number")
	    private String ccNumber;
	    
	    @Pattern(regexp="^(0[1-9]|1[0-2])([\\/])([1-9][0-9])$",
	             message="Must be formatted MM/YY")
	    private String ccExpiration;

	    @Digits(integer=3, fraction=0, message="Invalid CVV")
	    private String ccCVV;

	    private Date placedAt;
	    
	  
	    private List<Taco> tacos = new ArrayList<>();

	    private User user;
	    
	    public void addDesign(Taco design) {
	        this.tacos.add(design);
	    }
	    /*
	     * 
	     */
	   
	    void placedAt() {
	        this.placedAt = new Date();
	    }
}