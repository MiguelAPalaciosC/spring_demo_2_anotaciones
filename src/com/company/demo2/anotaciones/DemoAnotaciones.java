package com.company.demo2.anotaciones;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoAnotaciones {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		InstrumentoMusical instrumento = context.getBean("miGuitarra", InstrumentoMusical.class);
		
		System.out.println(instrumento.obtenerSonido());
		
		context.close();
	}

}
