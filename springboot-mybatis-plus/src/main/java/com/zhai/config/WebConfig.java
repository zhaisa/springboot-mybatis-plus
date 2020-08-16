package com.zhai.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.zhai.myinterceptor.MyInterceptor;

@Configuration
public class WebConfig implements WebMvcConfigurer {
	  @Override
	    public void addViewControllers(ViewControllerRegistry registry) {
	        registry.addViewController("/").setViewName("home");
	        registry.addViewController("/login");
	    }
	  
	  @Override
	public void addInterceptors(InterceptorRegistry registry) {
		  registry.addInterceptor(new MyInterceptor()) 
          .addPathPatterns("/design"); 
		
	}
}

