/**
 * GestionarComicBean.java
 */
package com.hbt.semillero.ejb;

import java.util.ArrayList;
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
public class GestionarComicBean implements IGestionarComicLocal{

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
	@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)//Si no hay la crea si la hay se une
	public void crearComic(ComicDTO comicDTO) {
		//Entidad nueva
        Comic comic = convertirComicDTOToComic(comicDTO);
        
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
		Comic comic = em.find(Comic.class, Long.parseLong(id));
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

	/** 
	 * @see com.hbt.semillero.ejb.IGestionarComicLocal#modificarComic(java.lang.Long, java.lang.String, com.hbt.semillero.dto.ComicDTO)
	 */
	@Override
	public void modificarComic(Long id, String nombre, ComicDTO comicNuevo) {
		// TODO Auto-generated method stub
		Comic comicModificar;
		
		if (comicNuevo == null) {
			comicModificar = em.find(Comic.class, id);
		} else {
			comicModificar = convertirComicDTOToComic(comicNuevo);
		}
		//TODO validar en bd actualiza y sino inserta
		comicModificar.setNombre(nombre);
		em.merge(comicModificar);
	}

	/** 
	 * @see com.hbt.semillero.ejb.IGestionarComicLocal#eliminarComic(java.lang.Long)
	 */
	@Override
	public void eliminarComic(Long idComic) {
		// TODO Auto-generated method stub
		
	}

	/** 
	 * @see com.hbt.semillero.ejb.IGestionarComicLocal#consultarComics()
	 */
	@Override
	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
	public List<ComicDTO> consultarComics() {
		// TODO Auto-generated method stub
		List<ComicDTO> resultadosComicDTO = new ArrayList<ComicDTO>();
		List<Comic> resultados = em.createQuery("select c from Comic c").getResultList();
		for (Comic comic : resultados) {
			resultadosComicDTO.add(convertirComicToComicDTO(comic));
		}
		return resultadosComicDTO;
	}
	
	private Comic convertirComicDTOToComic(ComicDTO comicDTO) {
		
		Comic comic = new Comic();
        if(comicDTO.getId()!=null) {
            comic.setId(comicDTO.getId());
        }
        comic.setNombre(comicDTO.getNombre());
        comic.setEditorial(comicDTO.getEditorial());
        comic.setTematicaEnum(comicDTO.getTematicaEnum());
        comic.setColeccion(comicDTO.getColeccion());
        comic.setNumeroPaginas(comicDTO.getNumeroPaginas());
        comic.setPrecio(comicDTO.getPrecio());
        comic.setAutores(comicDTO.getAutores());
        comic.setColor(comicDTO.getColor());
        comic.setFechaVenta(comicDTO.getFechaVenta());
        comic.setEstadoEnum(comicDTO.getEstadoEnum());
        comic.setCantidad(comicDTO.getCantidad());
        return comic;
	}
	
	private ComicDTO convertirComicToComicDTO(Comic comic) {
        ComicDTO comicDTO = new ComicDTO();
        if(comic.getId()!=null) {
         comicDTO.setId(comic.getId().toString());
        }
        comicDTO.setNombre(comic.getNombre());
        comicDTO.setEditorial(comic.getEditorial());
        comicDTO.setTematicaEnum(comic.getTematicaEnum());
        comicDTO.setColeccion(comic.getColeccion());
        comicDTO.setNumeroPaginas(comic.getNumeroPaginas());
        comicDTO.setPrecio(comic.getPrecio());
        comicDTO.setAutores(comic.getAutores());
        comicDTO.setColor(comic.getColor());
        comicDTO.setFechaVenta(comic.getFechaVenta());
        comicDTO.setEstadoEnum(comic.getEstadoEnum());
        comicDTO.setCantidad(comic.getCantidad());
        return comicDTO;
    }
}
