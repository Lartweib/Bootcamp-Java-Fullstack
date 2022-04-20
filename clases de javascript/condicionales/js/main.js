// Ejercicio 03
let random = (Math.round(Math.random()));
console.log("El numero salido aleatoriamente es: " + random)

if (random == 1) {
  console.log("Se arrojo la moneda y ah salido cruz")
}
else {
  console.log("Se arrojo la moneda y ah salido cara")
}

// Ejercicio 04-1
const arrow = (n1, n2, n3) => {
  let suma= n1+n2+n3
  console.log("Los numeros elegidos son: "+n1+","+n2+","+n3)
  return suma
};

console.log("La suma de los numeros es: "+ arrow(1, 5, 6));

// Ejercicio 04-2

const nombre = (nombre, nombre2, apellido) => {
  let nombreCompleto= nombre + " " + nombre2 + " " + apellido;
  console.log(nombreCompleto)
};

nombre("Federico","Daniel","Ara")

// Ejercicio 04-3

num1 = (Math.round(Math.random()*100));
num2 = (Math.round(Math.random()*100));

const mayor = (n1, n2) => {
  let numeroMayor = "";
  if (n1 > n2) {
    numeroMayor = n1;
  }
  else {
    numeroMayor = n2;
  }
  console.log("El numero mas grande entre " + n1 + " y " + n2+ " es " + numeroMayor)
};

mayor(num1, num2)


