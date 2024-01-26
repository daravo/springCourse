package com.daravo.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.daravo.beans.Mundo;

public class App {

	public static void main(String[] args) {


		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/daravo/xml/beans.xml");
		Mundo m = (Mundo) appContext.getBean("mundo");
		
		System.out.println(m.getSaludo());
	}

}
