package com.hbt.semillero.servicios;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.hbt.semillero.dto.ComicDTO;
import java.math.BigDecimal;
import com.hbt.semillero.entidades.EstadoEnum;
import com.hbt.semillero.entidades.TematicaEnum;
import com.hbt.semillero.pojo.GestionarComicPOJO;

public class AppTest {

	public void shouldAnswerWithTrue() {

	}

	@Test(enabled = false)
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

	// TODO
	/*
	 * Pendiente hacer un metodo que use el metodo ToString de la entidad COMIC
	 */

	// test para verificar inicialmente que se tiene la misma cantidad de caracteres
	@Test(enabled = false)
	public void invertirCadenaTestCase1() {
		String cadenaTest = "hola";
		String cadenaInvertidaTest;
		int cantCharCadenaTest;
		int cantCharCadenaInvertidaTest;

		cadenaInvertidaTest = invertirCadena(cadenaTest);

		cantCharCadenaTest = cadenaTest.length();
		cantCharCadenaInvertidaTest = cadenaInvertidaTest.length();

		// valor de longitud de cadena invertida para que falle el caso
		// cantCharCadenaInvertidaTest = 1;

		Assert.assertEquals(cantCharCadenaInvertidaTest, cantCharCadenaTest);
	}

	// test para verificar la ultima y la primera letra de la cadena invertida
	@Test(enabled = false)
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

		// Para que el caso falle
		// invertidaPrimeraLetra = cadenaTest.charAt(0);
		// invertidaUltimaLetra = cadenaTest.charAt(cadenaTest.length() - 1);

		// verifica que la primera letra de la cadena invertida es la ultima letra de la
		// cadena original
		Assert.assertEquals(invertidaPrimeraLetra, cadenaUltimaLetra);

		// verifica que la ultima letra de la cadena invertida es la primera letra de la
		// cadena original
		Assert.assertEquals(invertidaUltimaLetra, cadenaPrimeraLetra);
	}

	// test para verificar que la cadena invertida tiene los mismos caracteres que
	// la cadena original
	@Test(enabled = false)
	public void invertirCadenaTestCase3() {
		String cadenaTest = "hola";
		String cadenaInvertidaTest;
		String cadenaOriginal = "";

		cadenaInvertidaTest = invertirCadena(cadenaTest);

		for (int x = cadenaInvertidaTest.length() - 1; x >= 0; x--) {
			cadenaOriginal = cadenaOriginal + cadenaInvertidaTest.charAt(x);
		}

		// Valor de la cadena verificada para que falle el caso
		// StringBuilder nuevaCadenaOriginal = new StringBuilder(cadenaOriginal);
		// nuevaCadenaOriginal.setCharAt(1, 'a');
		// cadenaOriginal = nuevaCadenaOriginal.toString();

		Assert.assertEquals(cadenaOriginal, cadenaTest);
	}

	// test para verificar inicialmente que se tiene la misma cantidad de caracteres
	@Test(enabled = false)
	public void EstadoEnumTest() {

		/*
		 * Intanciar clase EstadoEnum
		 */
		EstadoEnum estadoEnumActivo = EstadoEnum.ACTIVO;
		EstadoEnum estadoEnumInactivo = EstadoEnum.INACTIVO;
		String cadenaActivo;
		String cadenaInactivo;
		int posicionEnum;
		EstadoEnum[] arregloValores;

		/*
		 * Devolver un String con el nombre de la constante (ACTIVO) Devolver un String
		 * con el nombre de la constante (INACTIVO) Devolver un entero con la posición
		 * del enum según está declarada Comparar el enum con el parámetro según el
		 * orden en el que están declarados lo enum Devolver un array que contiene todos
		 * los enum
		 */

		// System.out.println("String estado Activo:" + estadoEnum.name());
		cadenaActivo = estadoEnumActivo.name();
		cadenaInactivo = estadoEnumInactivo.name();
		posicionEnum = estadoEnumActivo.ordinal();
		arregloValores = EstadoEnum.values();

		/*
		 * Compara el string con el nombre de la constante ACTIVO
		 */
		Assert.assertEquals(cadenaActivo, "ACTIVO");

		/*
		 * Compara el string con el nombre de la constante INACTIVO
		 */
		Assert.assertEquals(cadenaInactivo, "INACTIVO");

		Assert.assertEquals(posicionEnum, 1);
	}

	// Prueba para POJO crearComicDTO
	@Test(enabled = false)
	public void crearComiDTOTest() {

		GestionarComicPOJO gestionarComiPOJO = new GestionarComicPOJO();
		gestionarComiPOJO.crearComicDTO();

		Assert.assertNotNull(gestionarComiPOJO.getListaComics());
		Assert.assertTrue(gestionarComiPOJO.getListaComics().size() != 0);// preferiblemente utilizar el metodo isEmpty
		Assert.assertTrue(!gestionarComiPOJO.getListaComics().isEmpty());
	}

	@Test(enabled = false)
	public void crearComicDTOListaTest() {
		GestionarComicPOJO gestionarComicPOJO = new GestionarComicPOJO();

		ComicDTO comicDTO = gestionarComicPOJO.crearComicDTO("101", "Captain America Corps 1-5 USA", "Panini Comics",
				TematicaEnum.FANTASTICO, "BIBLIOTECA MARVEL", 128, new BigDecimal(5000),
				"Phillippe Briones, Roger Stern", Boolean.FALSE, LocalDate.now(), EstadoEnum.ACTIVO, 5L);

		gestionarComicPOJO.agregarComicDTOLista(comicDTO);

		Assert.assertNotNull(gestionarComicPOJO.getListaComics());
		Assert.assertTrue(!gestionarComicPOJO.getListaComics().isEmpty());
		Assert.assertTrue(gestionarComicPOJO.getListaComics().size() == 1);

		comicDTO = new ComicDTO();
		comicDTO.setId("100");
		comicDTO.setNombre("Dragon Ball Yamcha");
		comicDTO.setEditorial("Planeta Cómic");
		comicDTO.setTematicaEnum(TematicaEnum.AVENTURAS);
		comicDTO.setColeccion("Manga Shonen");
		comicDTO.setNumeroPaginas(144);
		comicDTO.setPrecio(new BigDecimal(2100));
		comicDTO.setAutores("Dragon Garow Lee");
		comicDTO.setColor(Boolean.FALSE);
		comicDTO.setFechaVenta(LocalDate.now());
		comicDTO.setEstadoEnum(EstadoEnum.ACTIVO);
		comicDTO.setCantidad(20L);

		gestionarComicPOJO.agregarComicDTOLista(comicDTO);

		Assert.assertTrue(gestionarComicPOJO.getListaComics().size() > 1);

		comicDTO = new ComicDTO();
		comicDTO.setId("100");
		comicDTO.setNombre("Dragon Ball Yamcha");
		comicDTO.setEditorial("Planeta Cómic");
		comicDTO.setTematicaEnum(TematicaEnum.AVENTURAS);
		comicDTO.setColeccion("AVENTURAS");
		comicDTO.setNumeroPaginas(144);
		comicDTO.setPrecio(new BigDecimal(2100));
		comicDTO.setAutores("Dragon Garow Lee");
		comicDTO.setColor(Boolean.FALSE);
		comicDTO.setFechaVenta(LocalDate.now());
		comicDTO.setEstadoEnum(EstadoEnum.ACTIVO);
		comicDTO.setCantidad(20L);

		gestionarComicPOJO.agregarComicDTOLista(comicDTO);

		Assert.assertTrue(gestionarComicPOJO.getListaComics().size() == 3);
	}

	// Prueba para agregar comicDTO
	@Test(enabled = false)
	public void agregrarComicDTOListaTest() {

	}
	
	@Test(enabled = false)
	public void compararCadenaTest() {
		
		String s1 = "street";
		String s2;
		s2 = new String("street");
		
		//Con objetos no utilizar ==, mejor utilizar metodos
		if (s1 == s2) {
			Assert.assertEquals(s2, s1);
		}
		
		if (s1.equals(s2)) {
			Assert.assertEquals(s2, s1);
		}
	}

}
