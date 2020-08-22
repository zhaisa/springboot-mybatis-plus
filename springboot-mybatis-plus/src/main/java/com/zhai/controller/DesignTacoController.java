package com.zhai.controller;

import java.security.Principal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.additional.query.impl.LambdaQueryChainWrapper;
import com.zhai.domain.Ingredient;
import com.zhai.domain.Ingredient.Type;
import com.zhai.domain.Order;
import com.zhai.domain.Taco;
import com.zhai.domain.User;
import com.zhai.domain.TacoIngredients;
import com.zhai.mapper.IngredientMapper;
import com.zhai.mapper.OrderMapper;
import com.zhai.sevice.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/design")
@SessionAttributes("order")
public class DesignTacoController {

//	@Autowired
//	public DesignTacoController(IngredientRepository ingredientRepo) {
//		this.ingredientRepo = ingredientRepo;
//	}

//	public DesignTacoController(IngredientRepository ingredientRepo, TacoRepository designRepo,UserRepository userRepo) {
//		this.ingredientRepo = ingredientRepo;
//		this.designRepo = designRepo;
//		this.userRepo=userRepo;
//	}
	@Autowired
	IngredientService IngredientService;
	@Autowired
	UserService UserService;
	@Autowired
	TacoService TacoService;
	@Autowired
	com.zhai.mapper.UserMapper UserMapper;
	@Autowired
	com.zhai.mapper.TacoMapper TacoMapper;
	@Autowired
	OrderMapper OrderMapper;
	@Autowired
	TacoIngredientsService TacoIngredientsService;

	@ModelAttribute(name = "order")
	public Order order() {
		return new Order();
	}

	@ModelAttribute(name = "design")
	public Taco design() {
		return new Taco();
	}

	@GetMapping
	public String showDesignForm(Model model, Principal principal) {
		log.info("   --- Designing taco");
		List<Ingredient> ingredients = new ArrayList<>();
		IngredientService.getBaseMapper().selectList(Wrappers.<Ingredient>lambdaQuery())
				.forEach(i -> ingredients.add(i));
		log.info("取值- - -   -  -   - >" + ingredients);

		Type[] types = Ingredient.Type.values();
		for (Type type : types) {
			model.addAttribute(type.toString().toLowerCase(), filterByType(ingredients, type));
		}

		String username = principal.getName();
		QueryWrapper<User> querywrapper = Wrappers.<User>query().eq("username", username);
		User user = UserMapper.selectOne(querywrapper);
		model.addAttribute("user", user);
		return "design2";
	}

	private List<Ingredient> filterByType(List<Ingredient> ingredients, Type type) {
		return ingredients.stream().filter(x -> x.getType().equals(type)).collect(Collectors.toList());
	}

	@PostMapping
	public String processDesign(@Valid Taco design,List<Ingredient> ingredients, Errors errors, @ModelAttribute Order order) {
		// Save the taco design...
		// We'll do this in chapter 3
//		if (errors.hasErrors()) {
//			return "design2";
//		}

		log.info("Processing design: " + design);
		log.info("Processing design: " + ingredients);
		int saved = TacoMapper.insert(design);
		QueryWrapper<Taco> querywrapper = Wrappers.<Taco>query();
		querywrapper.eq("name", design.getName());
		Long id = TacoMapper.selectOne(querywrapper).getId();
		QueryWrapper<Ingredient> querywrapper1=Wrappers.query();
		querywrapper1.eq("id", design.getIngredients());
		List<Ingredient> list = IngredientService.list(querywrapper1);
		UpdateWrapper<TacoIngredients> updatewrapper = Wrappers.update();
		for (Ingredient ing : list) {
			updatewrapper.set("ingredients_id", ing.getId()).set("taco_id", id);
		}
		order.addDesign(design);
		// TacoService.s

		return "redirect:/orders/current";
	}
}
