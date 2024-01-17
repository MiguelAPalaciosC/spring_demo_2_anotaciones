package com.company.demo2.anotaciones;

import org.springframework.stereotype.Component;

@Component("miGuitarra")
public class Guitarra implements InstrumentoMusical {

	@Override
	public String obtenerSonido() {
		return "Obteniendo sonido de la guitarra";
	}

}