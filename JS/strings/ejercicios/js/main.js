// Ejercicio 08-1

function substituir(string) {
  let newString = string.replace(/a/g,"o");
  return newString
}

console.log(substituir(prompt()))

// Ejercicio 08-2

function empiezaCon(string) {
  return console.log(string.startsWith("aca"));
  
}

empiezaCon("academia");
empiezaCon("escuela");

// Ejercicio 08-3

function repetir(string) {
  return console.log(string.repeat(3));
  
}
repetir("hola")
