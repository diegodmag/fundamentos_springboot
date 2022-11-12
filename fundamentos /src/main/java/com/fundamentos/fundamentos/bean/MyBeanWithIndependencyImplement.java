package com.fundamentos.fundamentos.bean;

import com.fundamentos.fundamentos.bean.*;

public class MyBeanWithIndependencyImplement implements MyBeanWithDependency {
	
	private MyOperation myOperation; 
	
	
	public MyBeanWithIndependencyImplement(MyOperation myOperation) {
		this.myOperation = myOperation;
	}


	@Override
	public void printWithDependency() {
		// TODO Auto-generated method stub
		int num = 1; 
		
	
		System.out.print(myOperation.suma(num));
		System.out.print("Hola desde la implementacion de un bean con dependencia");
	}

}
