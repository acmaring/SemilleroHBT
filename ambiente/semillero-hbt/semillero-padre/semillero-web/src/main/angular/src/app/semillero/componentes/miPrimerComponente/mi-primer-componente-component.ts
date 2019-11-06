import { Component, OnInit } from "@angular/core";
import { LibroDTO } from '../../dto/libro.dto';
import { JsonPipe } from '@angular/common';


/**
 * @description comoponente que tiene la logica de mi primer componente
 * @author Andres Camilo Marin Gonzalez <camilo93maring@gmail.com>
 */
@Component({
    selector: 'mi-primer-componente',
    templateUrl: './mi-primer-componente-component.html'
})

export class MiPrimerComponente implements OnInit{
    /** Referenciar ComicDTO */
    private lista : any;
    public biblioteca : Array<LibroDTO>;
    public libro : LibroDTO;

    /** Se inicializan las variables del componente */
    ngOnInit() : void {
        this.biblioteca = new Array<LibroDTO>();
        /** Primera instacia */
        this.libro = new LibroDTO();
        this.libro.id = 1;
        this.libro.nombre = "libro Angular";
        this.libro.editorial = "Heinsohn";
        this.libro.tematica = "EDUCACION";
        this.libro.numeroPaginas = 200;
        this.libro.precio = 300000;
        this.libro.autores = "Diego Alvarez, Cindy";
        this.libro.aColor = true;
        this.libro.fechaVenta = new Date();
        this.libro.estado = "ACTIVO";

        this.biblioteca.push(this.libro);

        console.log(this.biblioteca.length);

        /** Segunda instacia */
        this.libro = new LibroDTO();
        this.libro.id = 1;
        this.libro.nombre = "libro Java";
        this.libro.editorial = "Heinsohn";
        this.libro.tematica = "EDUCACION";
        this.libro.numeroPaginas = 200;
        this.libro.precio = 300000;
        this.libro.autores = "Diego Alvarez, Cindy";
        this.libro.aColor = true;
        this.libro.fechaVenta = new Date();
        this.libro.estado = "ACTIVO";

        this.biblioteca.push(this.libro);

        console.log(this.biblioteca.length);

        /** Tercera instacia */
        this.libro = new LibroDTO();
        this.libro.id = 1;
        this.libro.nombre = "libro .Net";
        this.libro.editorial = "Heinsohn";
        this.libro.tematica = "EDUCACION";
        this.libro.numeroPaginas = 200;
        this.libro.precio = 300000;
        this.libro.autores = "Diego Alvarez, Cindy";
        this.libro.aColor = true;
        this.libro.fechaVenta = new Date();
        this.libro.estado = "ACTIVO";

        this.biblioteca.push(this.libro);

        console.log(this.biblioteca.length);

        /** Cuarta instacia */
        this.libro = new LibroDTO();
        this.libro.id = 1;
        this.libro.nombre = "libro JavaScript";
        this.libro.editorial = "Heinsohn";
        this.libro.tematica = "EDUCACION";
        this.libro.numeroPaginas = 200;
        this.libro.precio = 300000;
        this.libro.autores = "Diego Alvarez, Cindy";
        this.libro.aColor = true;
        this.libro.fechaVenta = new Date();
        this.libro.estado = "ACTIVO";

        this.biblioteca.push(this.libro);

        console.log(this.biblioteca.length);

        /** Quinta instacia */
        this.libro = new LibroDTO();
        this.libro.id = 1;
        this.libro.nombre = "libro Python";
        this.libro.editorial = "Heinsohn";
        this.libro.tematica = "EDUCACION";
        this.libro.numeroPaginas = 200;
        this.libro.precio = 300000;
        this.libro.autores = "Diego Alvarez, Cindy";
        this.libro.aColor = true;
        this.libro.fechaVenta = new Date();
        this.libro.estado = "ACTIVO";

        this.biblioteca.push(this.libro);

        console.log(this.biblioteca.length);

        this.lista = JSON.stringify(this.biblioteca);
    }
}