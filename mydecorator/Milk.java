package com.atguigu.decorator.mydecorator;

import com.atguigu.decorator.Drink;

public class Milk extends Decorator {

	public Milk(Drink obj) {
		super(obj);
		// TODO Auto-generated constructor stub
		setDes(" еёдл ");
		setPrice(2.0f); 
	}

}
