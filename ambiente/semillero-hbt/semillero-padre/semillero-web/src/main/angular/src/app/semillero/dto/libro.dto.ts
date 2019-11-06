/**
 * @description Clase libro que contiene la informacion de un libro
 * 
 * @author Diego Fernando Alvarez Silva <camilo93maring@gmail.com>
 */
export class LibroDTO {

    /**
    * Indicador de resultado.
    */
    public id: number;

    /**
    * Indicador de resultado.
    */
    public nombre: string;

    /**
    * Indicador de resultado.
    */
    public editorial: string;

    /**
    * Indicador de resultado.
    */
    public tematica: string;

    /**
    * Indicador de resultado.
    */
    public numeroPaginas: number;

    /**
    * Indicador de resultado.
    */
    public precio: number;

    /**
    * Indicador de resultado.
    */
    public autores: string;

    /**
    * Indicador de resultado.
    */
    public aColor: boolean;

    /**
    * Indicador de resultado.
    */
    public fechaVenta: Date;

    /**
    * Indicador de resultado.
    */
    public estado: string;
  
}