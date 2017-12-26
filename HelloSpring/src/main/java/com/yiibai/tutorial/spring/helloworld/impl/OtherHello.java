package com.yiibai.tutorial.spring.helloworld.impl;

import com.yiibai.tutorial.spring.helloworld.HelloWorld;

public class OtherHello implements HelloWorld {

	private String helloStr;

	public void setHelloStr(String helloStr) {
		this.helloStr = helloStr;
	}

	private int intValue;

	public void setIntValue(int value) {
		this.intValue = value;
	}

	@Override
	public void sayHello() {
		for (int i = 0; i < intValue; i++) {
			System.out.println("Other " + helloStr);
		}
	}
}
