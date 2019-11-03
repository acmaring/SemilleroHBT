/**
 * GestionarComicPOJO.java
 */
package com.hbt.semillero.pojo;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.hbt.semillero.dto.ComicDTO;
import com.hbt.semillero.entidades.EstadoEnum;
import com.hbt.semillero.entidades.TematicaEnum;

/**
 * <b>Descripción:<b> Clase que determina <b>Caso de Uso:<b>
 * 
 * @author camilo
 * @version
 */
public class GestionarComicPOJO {

	private List<ComicDTO> listaComics = null;

	public ComicDTO crearComicDTO(String id, String nombre, String editorial, TematicaEnum tematicaEnum,
			String coleccion, Integer numeroPaginas, BigDecimal precio, String autores, Boolean color,
			LocalDate fechaVenta, EstadoEnum estadoEnum, Long cantidad) {
		
		ComicDTO comicDTO = new ComicDTO(id, nombre, editorial, tematicaEnum, coleccion, numeroPaginas, precio, autores,
				color, fechaVenta, estadoEnum, cantidad);

		return comicDTO;
	}

	public void agregarComicDTOLista(ComicDTO comicDTO) {
		if (listaComics == null) {
			listaComics = new ArrayList<ComicDTO>();
		}
		listaComics.add(comicDTO);
	}

	public void crearComicDTO() {

		ComicDTO comicDTO = new ComicDTO();

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

		if (listaComics == null) {
			listaComics = new ArrayList<ComicDTO>();

		}
		listaComics.add(comicDTO);

	}

	public void modificarComicDTO(int i, ComicDTO comicDTO) {
		listaComics.set(i, comicDTO);
	}

	public void modificarComicDTO(String id, String nombre) {
		ComicDTO comicAModificar = null;
		for (int i = 0; i < listaComics.size(); i++) {
			comicAModificar = listaComics.get(i);
			if (comicAModificar.getId().equals(id)) {
				comicAModificar.setNombre(nombre);
				return;
			}
		}
	}
	
	public void eliminarComic(String id) {
		ComicDTO comicAEliminar = null;
		
		int tamanioListaComic = listaComics.size();
		int posicionListaComic = 0;
		while (posicionListaComic < tamanioListaComic) {
			comicAEliminar = listaComics.get(posicionListaComic);
			if (comicAEliminar.getId().equals(id)) {
				listaComics.remove(posicionListaComic);
				return;
			}
			posicionListaComic++;
		}
	}

	/**
	 * Metodo encargado de retornar el valor del atributo listaComics
	 * 
	 * @return El listaComics asociado a la clase
	 */
	public List<ComicDTO> getListaComics() {
		return listaComics;
	}

	/**
	 * Metodo encargado de modificar el valor del atributo listaComics
	 * 
	 * @param listaComics El nuevo listaComics a modificar.
	 */
	public void setListaComics(List<ComicDTO> listaComics) {
		this.listaComics = listaComics;
	}

}
