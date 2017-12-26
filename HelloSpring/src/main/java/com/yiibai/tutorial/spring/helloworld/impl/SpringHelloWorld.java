package com.yiibai.tutorial.spring.helloworld.impl;

import com.yiibai.tutorial.spring.helloworld.*;

public class SpringHelloWorld implements HelloWorld {
	
	@Override
	public void sayHello() {
		System.out.println("Spring Say Hello!!");
	}
}
