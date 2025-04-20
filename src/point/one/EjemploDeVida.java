package point.one;

import java.util.Iterator;

public class EjemploDeVida {

	public static void main(String[] args) {

//	1. Repetir el ejercicio 2 del trabajo practico número 2, evitando tener que escribir una 
//	instrucción por cada cumpleaños de la persona para alcanzar la edad deseada. 
	Persona sofia=new Persona("Sofia", "Mujer", 38432153, 2.8, 0.50);
	System.out.println(sofia);
//  En este caso se imprime la ubicacion en memoria de la variable
	
	int aniosDeseados=15;
	
	for(int i=0;i<aniosDeseados;i++) {
		sofia.cumplirAnos();
		System.out.println("años: "+sofia.anios());		
	}
	
	

	}

}
