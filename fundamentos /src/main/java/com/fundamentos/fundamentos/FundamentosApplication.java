package com.fundamentos.fundamentos;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fundamentos.fundamentos.bean.*;
import com.fundamentos.fundamentos.component.*;

@SpringBootApplication
public class FundamentosApplication implements CommandLineRunner {
	
	private ComponentDependency componentDependency ;
	private MyBean myBean;
	private MyBeanWithDependency myBeanWithDependency; 
	
	public FundamentosApplication(@Qualifier("componentTwoImplement") ComponentDependency componentDependency, MyBean myBean, MyBeanWithDependency myBeanWithDependency) {
		this.componentDependency = componentDependency; 	 
		this.myBean = myBean; 
		this.myBeanWithDependency = myBeanWithDependency; 
	}
	
	public static void main(String[] args) {
		SpringApplication.run(FundamentosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		componentDependency.saludar();
		myBean.print(); 
		myBeanWithDependency.printWithDependency();
	}

}
