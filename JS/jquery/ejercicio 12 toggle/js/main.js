// Ejercicio 12

$("#pRed").click(function(){
  $(".container p").toggleClass("red");
});

// $("#pBlue").click(function(){
//   $(".container p").toggleClass("blue");
// });

const botonAzul = document.querySelector("#pBlue");
const parrafo = document.querySelector(".parrafo");

botonAzul.addEventListener("click", ()=>{
  parrafo.classList.toggle("blue");
});
