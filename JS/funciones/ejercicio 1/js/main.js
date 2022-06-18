const arrow = (nombre, apellido) => {
  console.log(nombre + " " + apellido)
};

arrow("federico", "ara");

function funcion2 (boolean) {
  console.log(boolean)
};

funcion2(true);

function funcionInfinita(...valores) {
  valores.forEach(element => {
    console.log(element)
  });
};

funcionInfinita(1,2,3,4,5);
