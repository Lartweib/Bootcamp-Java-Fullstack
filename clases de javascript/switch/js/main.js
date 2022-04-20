// Ejercicio 06-1
let random = (Math.round(Math.random()*12));

let mes = random
console.log("Numero elegido aleatoriamente: "+mes)
switch (mes) {
  case 1: console.log("Enero");break;
  case 2: console.log("Febrero");break;
  case 3: console.log("Marzo");break;
  case 4: console.log("Abril");break;
  case 5: console.log("Mayo");break;
  case 6: console.log("Junio");break;
  case 7: console.log("Julio");break;
  case 8: console.log("Agosto");break;
  case 9: console.log("Septiembre");break;
  case 10: console.log("Octubre");break;
  case 11: console.log("Noviembre");break;
  case 12: console.log("Diciembre");break;
  default:
    console.error("ERROR: No es un mes");
    break;
}

// Ejercicio 06-2

let string = prompt("Ingrese un numero del 1 al 5")
let numero = ""
switch (string) {
  case "1": numero = parseInt(string);break;
  case "2": numero = parseInt(string);break;
  case "3": numero = parseInt(string);break;
  case "4": numero = parseInt(string);break;
  case "5": numero = parseInt(string);break;
  default:
    console.error("ERROR: debe indicar un numero del 1 al 5");
    break;
}
console.log("Numero indicado: "+numero + ", Tipo de dato: " + typeof numero)
