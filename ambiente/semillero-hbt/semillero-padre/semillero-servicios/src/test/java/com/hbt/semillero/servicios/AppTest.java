package com.hbt.semillero.servicios;

import org.testng.Assert;
import org.testng.annotations.Test;


public class AppTest {

	public void shouldAnswerWithTrue() {

	}
	
	@Test
	public void primeraPU() {
		Long resultadoEsperado = 150L;
		Long sumando1 = 50L;
		Long sumando2 = 100L;
		Long resultado = sumando1 + sumando2;
		Assert.assertEquals(resultado, resultadoEsperado);
	}
	
	/**
	 * 
	 * Metodo encargado de dada una cadena invertir su posicion y retornarla al
	 * revez
	 * 
	 * @param cadena
	 * @return
	 */
	
	private String invertirCadena(String cadena) {
		String cadenaInvertida = "";
		
		for (int x = cadena.length() - 1; x >= 0; x--) {
			cadenaInvertida = cadenaInvertida + cadena.charAt(x);
		}
		
		return cadenaInvertida;
	}
	
	//test para verificar inicialmente que se tiene la misma cantidad de caracteres
	@Test
	public void invertirCadenaTestCase1() {
		String cadenaTest = "hola";
		String cadenaInvertidaTest;
		int cantCharCadenaTest;
		int cantCharCadenaInvertidaTest;
		
		cadenaInvertidaTest = invertirCadena(cadenaTest);
		
		cantCharCadenaTest = cadenaTest.length();
		cantCharCadenaInvertidaTest = cadenaInvertidaTest.length();
		
		//valor de longitud de cadena invertida para que falle el caso
		//cantCharCadenaInvertidaTest = 1;
		
		Assert.assertEquals(cantCharCadenaInvertidaTest, cantCharCadenaTest);
	}
	
	//test para verificar la ultima y la primera letra de la cadena invertida
	@Test
	public void invertirCadenaTestCase2() {
		String cadenaTest = "hola";
		String cadenaInvertidaTest;
		char cadenaPrimeraLetra = cadenaTest.charAt(0);
		char cadenaUltimaLetra = cadenaTest.charAt(cadenaTest.length() - 1);
		char invertidaPrimeraLetra;
		char invertidaUltimaLetra;
		
		cadenaInvertidaTest = invertirCadena(cadenaTest);
		
		invertidaPrimeraLetra = cadenaInvertidaTest.charAt(0);
		invertidaUltimaLetra = cadenaInvertidaTest.charAt(cadenaInvertidaTest.length() - 1);
		
		//Para que el caso falle
		//invertidaPrimeraLetra = cadenaTest.charAt(0);
		//invertidaUltimaLetra = cadenaTest.charAt(cadenaTest.length() - 1);
		
		//verifica que la primera letra de la cadena invertida es la ultima letra de la cadena original
		Assert.assertEquals(invertidaPrimeraLetra, cadenaUltimaLetra);
		
		//verifica que la ultima letra de la cadena invertida es la primera letra de la cadena original
		Assert.assertEquals(invertidaUltimaLetra, cadenaPrimeraLetra);
	}
	
	//test para verificar que la cadena invertida tiene los mismos caracteres que la cadena original
		@Test
		public void invertirCadenaTestCase3() {
			String cadenaTest = "hola";
			String cadenaInvertidaTest;
			String cadenaOriginal = "";
			
			cadenaInvertidaTest = invertirCadena(cadenaTest);
			
			for (int x = cadenaInvertidaTest.length() - 1; x >= 0; x--) {
				cadenaOriginal = cadenaOriginal + cadenaInvertidaTest.charAt(x);
			}
			
			//Valor de la cadena verificada para que falle el caso
			//StringBuilder nuevaCadenaOriginal = new StringBuilder(cadenaOriginal);
			//nuevaCadenaOriginal.setCharAt(1, 'a');
			//cadenaOriginal = nuevaCadenaOriginal.toString();
			
			Assert.assertEquals(cadenaOriginal, cadenaTest);
		}
}
