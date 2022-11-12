package com.fundamentos.fundamentos.component;

import org.springframework.stereotype.Component;

@Component
public class ComponentTwoImplement implements ComponentDependency {

	@Override
	public void saludar() {
		// TODO Auto-generated method stub
		System.out.print("Hello World from my componentTwo");
	}

}
