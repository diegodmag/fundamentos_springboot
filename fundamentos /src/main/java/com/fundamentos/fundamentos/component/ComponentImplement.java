package com.fundamentos.fundamentos.component;

import org.springframework.stereotype.Component;

@Component 
public class ComponentImplement implements ComponentDependency {

	@Override
	public void saludar() {
		// TODO Auto-generated method stub
		System.out.print("Hola mundo desde mi componente");
		
	}
	
	 
}
