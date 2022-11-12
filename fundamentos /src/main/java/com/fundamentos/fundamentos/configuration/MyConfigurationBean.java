package com.fundamentos.fundamentos.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fundamentos.fundamentos.bean.*;

@Configuration 
public class MyConfigurationBean {
	
	@Bean 
	public MyBean beanOperation() {
		return new MyBeanImplement2(); 
	}
	
	
	@Bean 
	public MyOperation beanOperationOperation() {
		return new MyOperationImplement();
	}
	
	
	@Bean 
	public MyBeanWithDependency beanOperationOperationWithDependency(MyOperation myOperation){
		return new MyBeanWithIndependencyImplement(myOperation); 
	}

}
