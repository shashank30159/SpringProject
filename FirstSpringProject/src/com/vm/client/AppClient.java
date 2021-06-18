package com.vm.client;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.vm.entity.Employee;
import com.vm.entity.Product;


public class AppClient {

	public static void main(String[] args) {
		Resource resource = new ClassPathResource("applicationContext.xml");  
	    BeanFactory factory = new XmlBeanFactory(resource); 
	    
	    Employee employee = (Employee)factory.getBean("employees");
	    employee.displayEmployeeInfo();
	    
	    Product product = (Product)factory.getBean("products");
	    System.out.println(product);
	    
	}

}
