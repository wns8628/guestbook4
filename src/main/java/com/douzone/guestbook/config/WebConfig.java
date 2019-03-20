package com.douzone.guestbook.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan("com.douzone.guestbook.controller")
public class WebConfig {

 //뷰리절브
// @Bean
// public ViewResolver viewResolver() {
//	 InternalResourceViewResolver resolver = 
//			 new InternalResourceViewResolver();
//	
//	 resolver.setPrefix("/WEB-INF/views/");
//	 resolver.setSuffix(".jsp");
//	 resolver.setExposeContextBeansAsAttributes(true);
//	 
//	 return resolver;
//	 
// }
 
}
