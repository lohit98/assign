package com.training.org;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


public class MainFile {
	public static void main(String[] args) {
		
		ApplicationContext context =new ClassPathXmlApplicationContext("applicationContext.xml");
		//BeanFactory factory=new XmlBeanFactory(resource);
		Customer e1=(Customer)context.getBean("customer");
		System.out.println(e1);
		
	}

}
