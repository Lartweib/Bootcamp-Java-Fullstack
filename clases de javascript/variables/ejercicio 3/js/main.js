let string = "esto es un string";
let number = 123;
let boolean = true;
let isNull = null;
let isUndefined = undefined;
let isSymbol = Symbol('Symbol');
let array = [1,2,3,4];
let isFunction = function () {
  console.log("Esto es una funcion")
};

console.log("nombre de variable: " + string + ", tipo de variable:  " + typeof string)
console.log("nombre de variable: " + number+ ", tipo de variable:  " + typeof number)
console.log("nombre de variable: " + boolean + ", tipo de variable:  " + typeof boolean)
console.log("nombre de variable: " + isNull + ", tipo de variable:  " + typeof isNull)
console.log("nombre de variable: " + isUndefined + ", tipo de variable:  " + typeof isUndefined)
console.log("nombre de variable: isSymbol" + ", tipo de variable:  " + typeof isSymbol)
console.log("nombre de variable: " + array + ", tipo de variable:  " + typeof array)
console.log("nombre de variable: isFunction" + ", tipo de variable:  " + typeof isFunction)
