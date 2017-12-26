package com.yiibai.tutorial.spring;

import com.yiibai.tutorial.spring.helloworld.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.yiibai.customer.dao.CustomerDAO;
import com.yiibai.customer.model.Customer;


public class HelloProgram {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		HelloWorldService service = (HelloWorldService) context.getBean("helloWorldService");

		HelloWorld hw = service.getHelloWorld();

		hw.sayHello();
		
		System.out.println("***********************************");
		
		HelloWorld hw1 = 
                (HelloWorld) context.getBean("otherHelloWorldProxy");
		hw1.sayHello();
		
		CustomerDAO customerDAO = (CustomerDAO) context.getBean("customerDAO");
        Customer customer1 = new Customer(1, "aaa",29);
        Customer customer2 = new Customer(2, "bbb",25);
        Customer customer3 = new Customer(3, "ccc",27);
        customerDAO.insert(customer1);
        customerDAO.insert(customer2);
        customerDAO.insert(customer3);
    	
        
        System.out.println(customerDAO.findByCustomerId(1).getName());
        System.out.println(customerDAO.findByCustomerId(2).getName());
        System.out.println(customerDAO.findByCustomerId(3).getName());
	}
}
