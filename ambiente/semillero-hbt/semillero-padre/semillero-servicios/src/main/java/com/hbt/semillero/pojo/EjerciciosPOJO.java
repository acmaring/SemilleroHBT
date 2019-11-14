/**
 * EjerciciosPOJO.java
 */
package com.hbt.semillero.pojo;

/**
 * <b>Descripción:<b> Clase que determina
 * <b>Caso de Uso:<b> 
 * @author camilo
 * @version 
 */
public class EjerciciosPOJO {
	
	public void ejecicio1 () {
		
	}
	
	public boolean ejercicio3 (int a) {
		//divisores
		int divisores = 0;
		
		//es primo o no
		boolean esPrimo = false;
		
		//recorre numeros posibles divisores
		for (int i = 1; i <= a; i++) {
			if(a % i == 0) {
				divisores++;
			}
		}
		
		//si son dos, 1 y el mismo numero, es primo
		if (divisores == 2) {
			esPrimo = true;
		}
		
		return esPrimo;
	}
	
}
