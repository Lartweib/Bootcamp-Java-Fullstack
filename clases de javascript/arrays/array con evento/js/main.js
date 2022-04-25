let emojis = ['🍻','👆','💰','🏆','🍫','😒','😶‍🌫️'];
let mostrarArray = [];


//funciones

function mostrar(item) {
  const mostrar = $('.objets');
  $('p').remove('.mostrar')
  mostrar.append(`<p class="mostrar"></p>`)
  mostrarArray.forEach(function(valor) {
    if (valor===item) {
      $('.mostrar').append(`<span class="${valor}" style="display:none">${valor}</span>`)
      $(`.${item}`).fadeIn('slow')
    }else{
      $('.mostrar').append(`<span class="${valor}">${valor}</span>`);
    }
  });
}
function posFadeOut() {
  const mostrar = $('.objets');
  $('p').remove('.mostrar');
  mostrar.append(`<p class="mostrar"></p>`);
  mostrarArray.forEach(function(valor) { 
    $('.mostrar').append(`${valor}`);
  });
}
function borrar(item) {
  $(`.${item}`).fadeOut('slow',function(){
    posFadeOut
  });
}

function push() {
  if (emojis.length>0){
    let item = emojis[0]
    mostrarArray.push(item);
    emojis.splice(0,1);
    mostrar(item)
  }
}

function unshift() {
  if (emojis.length>0){
    let item = emojis[0]
    mostrarArray.unshift(item);
    emojis.splice(0,1);
    mostrar(item)
  }
}

function insert(pos) {
  if (emojis.length>0){
    let posicion = pos; 
    let item = emojis[0];
    mostrarArray.splice(posicion, 0, item);
    emojis.splice(0,1);
    mostrar(item)
  }
}

function pop() {
  if (mostrarArray.length>0){
    let item = mostrarArray.pop() 
    emojis.splice(emojis.length,0, item);
    borrar(item)
  }
}

function shift() {
  if (mostrarArray.length>0){
    let item = mostrarArray.shift(); 
    emojis.splice(emojis.length,0,item);
    borrar(item);
  }
}

function remove(pos) {
  if (mostrarArray.length>0){
    let posicion = pos; 
    let emoji = mostrarArray[posicion];
    mostrarArray.splice(posicion, 1);
    emojis.splice(emojis.length,0,emoji);
    borrar(emoji)
  }
}

//botones

$('#push').click(push);
$('#unshift').click(unshift);
$('#insertAt').click( () => { 
  let pos=$("#posAdd").val();
  pos = parseInt(pos)
  if (pos>mostrarArray.length){
    pos = mostrarArray.length
  }
  insert(pos);
  });
$('#pop').click(pop);
$('#shift').click(shift);
$('#removeAt').click(() => { 
  let pos=$("#posRemove").val();
  pos = parseInt(pos)
  if (pos>mostrarArray.length -1){
    pos = mostrarArray.length -1
  }
  remove(pos);
  });




