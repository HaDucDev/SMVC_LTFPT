package com.practice.configuration;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import com.practice.bean.User;

@Configuration //giống <beans> lớn chứa toàn bộ
@EnableWebMvc  // // mvc:annotation-driven
@ComponentScan(basePackages = "com.practice")  // <context:component-scan
public class SpringWebConfig {// cái này giống spring-mvc-servlet.xml
	// còn cái web.xml dưới kệ nó
	@Bean
	public ViewResolver viewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setViewClass(JstlView.class);
		viewResolver.setPrefix("/WEB-INF/views/");
		viewResolver.setSuffix(".jsp");

		return viewResolver;
	}

	
	  // tạo bean để truyền dữ liệu.
	  
	  @Bean 
	  @Qualifier("somot")
	  public User user1() 
	  { 
		  User user1=new User("Hello 1","World 1"); 
		  return user1; 
	  }
	  
	  
	  @Bean	
	  @Qualifier("sohai") 
	  public User user2() 
	  { 
		  User user2=new User("Hello 2","World 2"); 
		  return user2; 
	  }
	 

}