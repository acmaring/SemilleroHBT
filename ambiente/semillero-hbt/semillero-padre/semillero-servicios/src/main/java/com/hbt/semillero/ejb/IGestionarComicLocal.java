/**
 * IGestionarComicLocal.java
 */
package com.hbt.semillero.ejb;

import java.util.List;

import com.hbt.semillero.dto.ComicDTO;

/**
 * <b>Descripción:<b> Clase que determina
 * <b>Caso de Uso:<b> 
 * @author camilo
 * @version 
 */
public interface IGestionarComicLocal {
	
	/**
	 * 
	 * Metodo encargado de crear un comic y persistirlo
	 * 
	 * @author ccastano
	 * 
	 * @param comicNuevo informacion nueva a crear
	 */
	public void crearComic(ComicDTO comicNuevo);

	/**
	 * 
	 * Metodo encargado de consultar un comic modificarlo y guardarlo
	 * 
	 * @author ccastano
	 * 
	 * @param comicModificar informacion nueva a modificar
	 */
	public void modificarComic(Long id, String nombre, ComicDTO comicNuevo);

	/**
	 * 
	 * Metodo encargado de eliminar un comic modificarlo y guardarlo
	 * 
	 * @author ccastano
	 * 
	 * @param comicEliminar informacion a eliminar
	 */
	public void eliminarComic(Long idComic);

	/**
	 * 
	 * Metodo encargado de retornar la informacion de un comic
	 * 
	 * @param idComic identificador del comic a ser consultado
	 * @return comic Resultado de la consulta
	 * @throws Exception si no se recibe idComic
	 */
	public ComicDTO consultarComic(String idComic);

	/**
	 * 
	 * Metodo encargado de retornar una lista de comics
	 * 
	 * @return
	 */
	public List<ComicDTO> consultarComics();
	
}
