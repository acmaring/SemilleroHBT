import { Component, OnInit } from '@angular/core';
import { ComicDTO } from '../../dto/comic.dto';

/**
 * @description la clase CrearPersonaComponent permite crear personas
 * @author Andres Camilo Marin Gonzalez <camilo93maring@gmail.com>
 */
@Component({
    selector: 'crear-persona',
    templateUrl: './crear-persona-component.html'
  })

export class CrearPersonaComponent implements OnInit{
    
  private nombreInstructorGlobalPrivado : string;
  public nombreInstructorGlobalPublic : string;
  public comicDTO : ComicDTO;

  /**
   * Valiable global
   */
  public miVariableGlobal : any = {};

  /** 
   * define un array
   */
  public listaApellidos : Array<any>;
  /**
   * No recomendado para definir array
   */
  public listaNombres = [];
  
  /**
   * OnInit para inicializar variables
   */
  ngOnInit(): void {
    //Aqui se declarn las variables globales
    this.listaApellidos = new Array<any>();

    this.nombreInstructorGlobalPrivado = "Semillero2019";
    this.inicializarComponente();
    let nombreInstructor = "Camilo Marin";
    let nombreInstructorString : string = "Camilo Marin";
    console.log("Nombre instructor: " + nombreInstructor);
    console.log("Nombre instructor: " + nombreInstructorString);
    this.miVariableGlobal.genero = "Masculino";

    let miVariable : any = {
      id : 1,
      nombre: "Camilo",
      direccion : "Carera 23 #70 - 01",
      colores : [1,2,3,4,5,6,7]
    }
    miVariable.genero = "Masculino";

    this.listaApellidos.push(miVariable);
    this.listaApellidos.splice(1,2);

    this.listaApellidos = [];
    alert("Longitud listaNombres" + this.listaNombres.length);

    let miVariableNumber : number = 100.23;
    let miVariableString : string = "Semillero 2019";

    let miMapa = new Map<string, string>();

    miMapa.set("1", "semillero");
    miMapa.get("1");
    let miFecha = new Date();

    console.log(miFecha);

    for (let i = 0; i < this.listaApellidos.length; i++) {
      const element = this.listaApellidos[i];
      console.log(element);
      
    }

    
    this.listaApellidos.forEach(element => {
      console.log(element);
    });

    this.listaApellidos.map(objeto => {
        console.log(objeto);
    });

    this.listaApellidos;

  }

  //metodo original
  /*public inicializarComonente() : Array<string> {
    let retorno;
    let objeto = undefined;
    this.nombreInstructorGlobalPrivado = "Semillero2019";



    return retorno;
  }
  */

  

  public inicializarComponente() : Array<string> {
  let retorno : any;
  let objeto = undefined;
  if(objeto !== null && objeto !== undefined){
      console.log("No es nulo")
  } else {
      console.log("Si es nulo");
  }

  console.log(1 == 1);
  // console.log("1" == 1);
  console.log(1 === 1);
  // console.log("1" === 1);

  this.comicDTO = new ComicDTO();
  this.comicDTO.autores = "Camilo Marin";

  

  return retorno;
}
}