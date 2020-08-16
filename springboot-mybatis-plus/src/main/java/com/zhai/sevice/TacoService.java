package com.zhai.sevice;

import javax.validation.Valid;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhai.domain.Ingredient;
import com.zhai.domain.Taco;

public interface TacoService extends IService<Ingredient> {

	Taco save(@Valid Taco design);

}
