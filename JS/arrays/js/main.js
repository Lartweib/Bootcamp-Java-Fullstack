// Ejercicio de arrays

// Ejercicio
// 1. A partir de la pizza sustituΓ­as todos los elemento del array por cervezas:ππ―π£πππ±πππ₯©
let array = ['π','π―','π£','π','π','π±','π','π','π₯©'];
let find = false;
array.forEach(function(valor, indice) {
  if (valor=='π') {
    find = true;
  }
  if (find==true){
    if (valor!=='π'){
      array[indice] = 'π»'
    }
  }
})
console.log(array)
// Ejercicio 2. Encontrar si existe un elemento en el array que sea una piΓ±a. πππππ

let array1= ['π','π','π','π','π'];
let indice = array1.indexOf('π');
console.log(array1)
console.log("El elemento buscado estΓ‘ en el Γ­ndice: ", indice);

// Ejercicio
// 3. Quita la piΓ±a del siguiente array. πππππ

let array2= ['π','π','π','π','π'];
let indice2 = array2.indexOf('π');
console.log(array2)
console.log("El elemento buscado estΓ‘ en el Γ­ndice: ", indice2, "y fue eliminado.");

array2.splice(indice2,1)
console.log("El array queda de la siguiente manera:\n",array2)

// Ejercicio 4. A partir del siguiente array
// πππππ convierte todas las fresas en π

let array3= ['π','π','π','π','π'];
console.log("El array es el siguiente: ",array3)
array3.forEach(function(valor, indice) {
  if (valor=='π') {
      array3[indice] = 'π'
    }
  });
console.log("El array quedo asi: ",array3)

// Ejercicio 5. AΓ±ade el siguiente icono π₯΅ inmediatamente despuΓ©s del cada
// πΆοΈ en el siguiente array: πΆοΈπ₯πΆοΈπ₯πΆοΈπ₯

let array4= ['πΆοΈ','π₯','πΆοΈ','π₯','πΆοΈ'];
console.log("El array es el siguiente: ",array4);
let arrayMod =[];
array4.forEach(function(valor) {
  arrayMod.push(valor);
  if (valor=='πΆοΈ') {
    arrayMod.push('π₯΅');
  }
  });
array4=arrayMod;
console.log("El array quedo asi: ",array4)


// Ejercicio 6. AΓ±ade una π
// cartas comodΓ­n entre medio de dos cartas . Por ejemplo:π΄ππ΄ En el
// siguiente array:
// π΄π΄π΄ππ΄π΄π΄

let array5= ['π΄','π΄','π΄','π','π΄','π΄','π΄'];
console.log("El array es el siguiente: ",array5);
let arrayMod1 =[];
let count = 0;
array5.forEach(function(valor) {
  if (valor=='π΄') {
    count++;
  }else{
    count=0;
  }
  if (count==2) {
    arrayMod1.push('π');
    arrayMod1.push(valor);
    count = 1;
  }
  else{
    arrayMod1.push(valor);
  }
  });
array5=arrayMod1;
console.log("El array quedo asi: ",array5);
