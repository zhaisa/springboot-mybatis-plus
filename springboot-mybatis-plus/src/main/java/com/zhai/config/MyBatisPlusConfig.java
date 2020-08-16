package com.zhai.config;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
@Configuration
@MapperScan(basePackages = "com.zhai.mapper")
public class MyBatisPlusConfig {
	 	@Bean
	    public PaginationInterceptor paginationInterceptor() {
	        return new PaginationInterceptor();
	    }
}
