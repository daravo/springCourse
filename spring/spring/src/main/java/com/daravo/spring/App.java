package com.daravo.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.daravo.beans.Jugador;
import com.daravo.beans.Mundo;

public class App {

	public static void main(String[] args) {


		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/daravo/xml/beans.xml");
		Jugador per = (Jugador) appContext.getBean("messi");
		
		System.out.println(per.getNombre()+ " " + per.getEquipo().mostrar());
		
		((ConfigurableApplicationContext)appContext).close();
	}

}
