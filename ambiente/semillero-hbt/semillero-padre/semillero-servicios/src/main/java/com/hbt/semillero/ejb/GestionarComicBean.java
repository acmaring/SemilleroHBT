/**
 * GestionarComicBean.java
 */
package com.hbt.semillero.ejb;

import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.hbt.semillero.dto.ComicDTO;
import com.hbt.semillero.entidades.Comic;

/**
 * <b>Descripción:<b> Clase que determina
 * <b>Caso de Uso:<b> 
 * @author camilo
 * @version 
 */
@Stateless
public class GestionarComicBean {

	/*
	 * instacia tipo Entity Manager para trabajar con las entidades
	 */
	@PersistenceContext
	private EntityManager em;
	
	//TODO
	/*
	 * Agregar interfaz
	 */
	
	/**
	 * 
	 * Metodo encargado de crear un comic con el entity manager
	 * <b>Caso de Uso</b>
	 * @author camilo
	 * 
	 * @param comicDTO
	 */
	@TransactionAttribute(TransactionAttributeType.REQUIRED)//Si no hay la crea si la hay se une
	public void crearComic(ComicDTO comicDTO) {
		//Entidad nueva
        Comic comic = new Comic();
        comic.setId(comicDTO.getId());
        
        //TODO LLenar con los demás datos de comics
        
        em.persist(comic);
	}
	
	/**
	 * 
	 * Metodo encargado de modificar un comic con el entity manager
	 * <b>Caso de Uso</b>
	 * @author camilo
	 * 
	 * @param comicModificar
	 */
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public void modificarComic(ComicDTO comicModificar) {
		Comic comic = new Comic();
		comic.setId(comicModificar.getId());
		em.merge(comic);
	}
	
	/**
	 * 
	 * Metodo encargado de consultar un comic con el entity manager
	 * <b>Caso de Uso</b>
	 * @author camilo
	 * 
	 * @param id
	 * @return
	 */
	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
	public ComicDTO consultarComic(String id) {
		Comic comic = em.find(Comic.class, id);
		ComicDTO comicDTO = new ComicDTO(comic.getId(), comic.getNombre());
		return comicDTO;
	}
	
	/**
	 * 
	 * Metodo encargado de consultar todos los comics con el entity manager
	 * <b>Caso de Uso</b>
	 * @author camilo
	 * 
	 * @return
	 */
	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
	public List<ComicDTO> consultarTodos() {
		em.createNativeQuery("select c from Comic");
		List<Comic> resultados = (List<Comic>) em.createQuery("select c from Comic").getResultList();
		return null;
	}
}
