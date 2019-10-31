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
  constructor(){
    console.log("enyto al componete bienvenida");
  }

  ngOnInit(): void {
    console.log("entro al evenro on init del componente bienvenida")
  }
}