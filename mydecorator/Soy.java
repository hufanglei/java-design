package com.atguigu.decorator.mydecorator;

import com.atguigu.decorator.Drink;

public class Soy extends Decorator{

	public Soy(Drink obj) {
		super(obj);
		// TODO Auto-generated constructor stub
		setDes(" ¶¹½¬  ");
		setPrice(1.5f);
	}

}
