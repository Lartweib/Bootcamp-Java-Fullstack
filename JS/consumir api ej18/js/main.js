
const chuckIMG = $('.chuck img');
const mostrarFrase = $('.frase p');

solicitudChuck();

$('.container button').on("click", () => {solicitudChuck()})

function solicitudChuck() {
  fetch ('https://api.chucknorris.io/jokes/random')
    .then(response => response.json())
    .then(json => mostrarFrase.text(json.value))
  }


