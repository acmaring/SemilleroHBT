/**
 * EjerciciosTest.java
 */
package com.hbt.semillero.servicios;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.hbt.semillero.pojo.*;

/**
 * <b>Descripción:<b> Clase que determina
 * <b>Caso de Uso:<b> 
 * @author camilo
 * @version 
 */
public class EjerciciosTest {
	
	@Test
	public void ejercicio1 () {
		String respuesta = "True";
		
		Assert.assertEquals(respuesta, "True");
	}
	
	private static String brand;
	private static boolean empty;
	
	@Test
	public static void ejercicioIni() {
		//WaterBottle wb = new WaterBottle();
		System.out.println("Empty="+ empty);
		System.out.println(", brand = "+ brand);
		//Este metodo no compila ya que los atributos a los que quiere acceder son staticos
		
		//Ejercicio 2: se organiza con atributos staticos
		
		Assert.assertEquals(empty, "Null");
		Assert.assertEquals(brand, "Null");
	}
	
	//Ejercicio 3
	@Test
	public void ejercicio3Test () {
		//resultado
		boolean esPrimo;
		
		EjerciciosPOJO ejercicio3 = new EjerciciosPOJO();
		
		esPrimo = ejercicio3.ejercicio3(5);
		
		Assert.assertEquals(true, esPrimo);
		
		esPrimo = ejercicio3.ejercicio3(222);
		
		Assert.assertEquals(false, esPrimo);
		
		esPrimo = ejercicio3.ejercicio3(0);
		
		Assert.assertEquals(false, esPrimo);
		
	}
}
