// Ejercicio de arrays

// Ejercicio
// 1. A partir de la pizza sustituías todos los elemento del array por cervezas:🍔🌯🍣🍕🍜🍱🍙🍘🥩
let array = ['🍔','🌯','🍣','🍕','🍜','🍱','🍙','🍘','🥩'];
let find = false;
array.forEach(function(valor, indice) {
  if (valor=='🍕') {
    find = true;
  }
  if (find==true){
    if (valor!=='🍕'){
      array[indice] = '🍻'
    }
  }
})
console.log(array)
// Ejercicio 2. Encontrar si existe un elemento en el array que sea una piña. 🍕🍕🍍🍕🍕

let array1= ['🍕','🍕','🍍','🍕','🍕'];
let indice = array1.indexOf('🍍');
console.log(array1)
console.log("El elemento buscado está en el índice: ", indice);

// Ejercicio
// 3. Quita la piña del siguiente array. 🍕🍕🍍🍕🍕

let array2= ['🍕','🍕','🍍','🍕','🍕'];
let indice2 = array2.indexOf('🍍');
console.log(array2)
console.log("El elemento buscado está en el índice: ", indice2, "y fue eliminado.");

array2.splice(indice2,1)
console.log("El array queda de la siguiente manera:\n",array2)

// Ejercicio 4. A partir del siguiente array
// 🍓🍋🍓🍋🍓 convierte todas las fresas en 🍄

let array3= ['🍓','🍋','🍓','🍋','🍓'];
console.log("El array es el siguiente: ",array3)
array3.forEach(function(valor, indice) {
  if (valor=='🍓') {
      array3[indice] = '🍄'
    }
  });
console.log("El array quedo asi: ",array3)

// Ejercicio 5. Añade el siguiente icono 🥵 inmediatamente después del cada
// 🌶️ en el siguiente array: 🌶️🥛🌶️🥛🌶️🥛

let array4= ['🌶️','🥛','🌶️','🥛','🌶️'];
console.log("El array es el siguiente: ",array4)
let arrayMod =[]
array4.forEach(function(valor, indice) {
  array4.push(valor);
  if (valor=='🌶️') {
    array4.push('🥵');
  }
  });
array4=arrayMod;
console.log("El array quedo asi: ",array4)


// Ejercicio 6. Añade una 🃏
// cartas comodín entre medio de dos cartas . Por ejemplo:🎴🃏🎴 En el
// siguiente array:
// 🎴🎴🎴🃏🎴🎴🎴
