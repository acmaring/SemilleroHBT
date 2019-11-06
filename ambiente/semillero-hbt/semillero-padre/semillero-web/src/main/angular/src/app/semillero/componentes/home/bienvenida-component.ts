import { Component, OnInit } from '@angular/core';

/**
 * @description Componente bienvenida, el cual contiene la imagen de bienvenida al semillero
 * 
 * @author Diego Fernando Alvarez Silva <dalvarez@heinsohn.com.co>
 */
@Component({
  selector: 'bienvenida',
  templateUrl: './bienvenida-component.html',
})
export class BienvenidaComponent {

  public urlImagen: string;
  constructor(){
    console.log("enyto al componete bienvenida");
  }

  ngOnInit(): void {
    this.urlImagen = "https://www.elempleo.com/sitios-empresariales/colombia/heinsohn-business-technology/img/elempleo-02.jpg";
    console.log("entro al evenro on init del componente bienvenida")
  }

  public ejecucionEventoClick(parametroEvento : any) : void {
    alert("Hola" + parametroEvento);
  }
}