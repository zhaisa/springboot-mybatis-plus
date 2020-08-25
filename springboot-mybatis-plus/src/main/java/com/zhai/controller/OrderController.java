package com.zhai.controller;


import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zhai.domain.Order;
import com.zhai.domain.Taco;
import com.zhai.domain.TacoOrder;
import com.zhai.domain.User;
import com.zhai.service.OrderService;
import com.zhai.service.TacoOrderService;
import com.zhai.service.UserService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/orders")
@SessionAttributes("order")
@ConfigurationProperties(prefix="taco.orders")
public class OrderController {
	  @Autowired
	  UserService UserService;
	  @Autowired
	  OrderService OrderService;
	  @Autowired
	  TacoOrderService tacoorderservice;
	  
	  TacoOrder tacoorder=new TacoOrder();
	  private OrderProps props;
	  private int pageSize = 20;
	    
	    public void setPageSize(int pageSize) {
	        this.pageSize = pageSize;
	    }
	  @GetMapping("/current")
	    public String orderForm(@AuthenticationPrincipal User user, 
	    	      @ModelAttribute Order order) {
	        if (order.getDeliveryName() == null) {
	          order.setDeliveryName(user.getFullname());
	        }
	        if (order.getDeliveryStreet() == null) {
	          order.setDeliveryStreet(user.getStreet());
	        }
	        if (order.getDeliveryCity() == null) {
	          order.setDeliveryCity(user.getCity());
	        }
	        if (order.getDeliveryState() == null) {
	          order.setDeliveryState(user.getState());
	        }
	        if (order.getDeliveryZip() == null) {
	          order.setDeliveryZip(user.getZip());
	        }
	        
	        return "orderForm";

	    }
	 /*
	  * @AuthenticationPrincipal 的优点在于它不需要强制转换（与身份验证一样），并且将特定于安全性的代码限制为注释本身。当在 processOrder() 中获得 User 对象时，它已经准备好被使用并分配给订单了。
	  *  
	  *  
	  *  
	  */
	  @PostMapping
	  public String processOrder(@Valid Order order, Errors errors,SessionStatus sessionStatus,
			  @AuthenticationPrincipal User user) {
//		  if (errors.hasErrors()) {
//		        return "orderForm";
//		    }
		  log.info("订单"+order);
		  order.setUser(user);
		   Long userid=user.getId();
		   order.setUser_id(userid);
		  OrderService.insert(order);
		QueryWrapper<Order> querywapper1=Wrappers.query();
		querywapper1.eq("user_id", userid);
		Order theorder = OrderService.getOne(querywapper1);
		
		List<Taco> tacos = order.getTacos();
		for(Taco taco:tacos) {
			Long id = taco.getId();
			tacoorder.setTacos_id(id);
			tacoorder.setOrder_id(theorder.getId());
			tacoorderservice.saveTacoOrder(id, theorder.getId());
		}
		
		  sessionStatus.setComplete();
	      log.info("Order submitted: " + order);
	      return "redirect:/";
	  }
	  
	  @GetMapping
	  public String ordersForUser(
	      @AuthenticationPrincipal User user, Model model) {
		  //当前页数，每页返回条数
		  Page<Order> page = new Page<Order>(1,2);
	      model.addAttribute("orders",
	    		  OrderService.page(page));
	      
	      return "orderList";
	  }
}
