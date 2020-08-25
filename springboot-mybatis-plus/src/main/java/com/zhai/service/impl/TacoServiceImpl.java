package com.zhai.service.impl;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhai.domain.Ingredient;
import com.zhai.domain.Taco;
import com.zhai.mapper.*;
import com.zhai.service.TacoService;

@Service
public class TacoServiceImpl extends ServiceImpl<TacoMapper, Taco>implements TacoService {

}
