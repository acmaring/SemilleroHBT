/**
 * GestionarComicPOJOTest.java
 */
package com.hbt.semillero.servicios;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.hbt.semillero.dto.ComicDTO;
import com.hbt.semillero.entidades.EstadoEnum;
import com.hbt.semillero.entidades.TematicaEnum;
import com.hbt.semillero.pojo.GestionarComicPOJO;

/**
 * <b>Descripción:<b> Clase que determina el test para Gestionar Comic
 * <b>Caso de Uso:<b> 
 * @author camilo
 * @version 
 */
public class GestionarComicPOJOTest {
	/**
	 * 
	 * Metodo encargado de testear cuando:
	 * Se agregan los tres Comics
	 * Se modifica un comic
	 * Se elimina un comic
	 * <b>Caso de Uso</b>
	 * @author camilo
	 *
	 */
	@Test
	public void agregarComicTest() {
		/**
		 * Se instancia una lista gestionarComiPOJO
		 */
		GestionarComicPOJO gestionarComicPOJO = new GestionarComicPOJO();
		
		ComicDTO comicDTO = new ComicDTO();
		
		/**
		 * Se asignan los atributos al objeto
		 */
		comicDTO.setId("1");
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
		
		/**
		 * Se agrega un comic a la lista
		 */
		gestionarComicPOJO.agregarComicDTOLista(comicDTO);
		
		/**
		 * Se prueba que se agrege el comic
		 */
		Assert.assertNotNull(gestionarComicPOJO.getListaComics());
		Assert.assertTrue(!gestionarComicPOJO.getListaComics().isEmpty());
		Assert.assertTrue(gestionarComicPOJO.getListaComics().size() == 1);

		comicDTO = new ComicDTO();
		comicDTO.setId("2");
		comicDTO.setNombre("Captain America Corps 1-5 USA");
		comicDTO.setEditorial("Panini Comics");
		comicDTO.setTematicaEnum(TematicaEnum.FANTASTICO);
		comicDTO.setColeccion("BIBLIOTECA MARVEL");
		comicDTO.setNumeroPaginas(128);
		comicDTO.setPrecio(new BigDecimal(5000));
		comicDTO.setAutores("Phillippe Briones, Roger Stern");
		comicDTO.setColor(Boolean.FALSE);
		comicDTO.setFechaVenta(LocalDate.now());
		comicDTO.setEstadoEnum(EstadoEnum.ACTIVO);
		comicDTO.setCantidad(5L);
		
		/**
		 * Se agrega un comic a la lista
		 */
		gestionarComicPOJO.agregarComicDTOLista(comicDTO);
		
		/**
		 * Se prueba que se agrege el comic
		 */
		Assert.assertTrue(gestionarComicPOJO.getListaComics().size() == 2);
		
		comicDTO = new ComicDTO();
		comicDTO.setId("3");
		comicDTO.setNombre("The Spectacular Spider-Man v2 USA");
		comicDTO.setEditorial("Panini Comics");
		comicDTO.setTematicaEnum(TematicaEnum.FANTASTICO);
		comicDTO.setColeccion("MARVEL COMICS");
		comicDTO.setNumeroPaginas(208);
		comicDTO.setPrecio(new BigDecimal(6225));
		comicDTO.setAutores("Straczynski,Deodato Jr.,Barnes,Eaton");
		comicDTO.setColor(Boolean.TRUE);
		comicDTO.setFechaVenta(LocalDate.now());
		comicDTO.setEstadoEnum(EstadoEnum.INACTIVO);
		comicDTO.setCantidad(0L);
		
		/**
		 * Se agrega un comic a la lista
		 */
		gestionarComicPOJO.agregarComicDTOLista(comicDTO);
		
		/**
		 * Se prueba que se agrege el comic
		 */
		Assert.assertTrue(gestionarComicPOJO.getListaComics().size() == 3);
		
		/**
		 * Se modifica el comic 2
		 */
		gestionarComicPOJO.modificarComicDTO("2", "Dragon Ball (Modificado)");
		
		/**
		 * Se prueba que se modifique el comic
		 */
		Assert.assertEquals(gestionarComicPOJO.getListaComics().get(1).getNombre(), "Dragon Ball (Modificado)");
		Assert.assertTrue(gestionarComicPOJO.getListaComics().size() == 3);
		
		/**
		 * Se elimina el comic
		 */
		gestionarComicPOJO.eliminarComic("1");
		
		/**
		 * Prueba que elimina el comic
		 */
		Assert.assertTrue(gestionarComicPOJO.getListaComics().size() == 2);
		Assert.assertEquals(gestionarComicPOJO.getListaComics().get(0).getNombre(), "Dragon Ball (Modificado)");
		
	}
}
