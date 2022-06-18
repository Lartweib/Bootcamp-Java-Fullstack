const PIEDRA = "piedra";
const PAPEL = "papel";
const TIJERAS = "tijeras";

const EMPATE = 0;
const VICTORIA = 1;
const DERROTA = 2;

let puntajeIa = 0;
let puntajeJugador = 0;

let jugando = false;

const piedraBtn = $('#piedra');
const papelBtn = $('#papel');
const tijerasBtn = $('#tijeras');

const imgUsuario = $("#imgUsuario");
const imgIA = $("#imgIA");

const resultadoTexto = $("#texto-inicial");
const mostrarP1= $(".p1 p"); 
const mostrarIa= $(".ia p"); 

piedraBtn.on("click", () => {
    jugar(PIEDRA);
});
papelBtn.on("click", () => {
    jugar(PAPEL);
});
tijerasBtn.on("click", () => {
    jugar(TIJERAS);
});

function reset() {
    puntajeIa = 0;
    puntajeJugador = 0;
    mostrarP1.text(`${puntajeJugador}`);
    mostrarIa.text(`${puntajeIa}`);
    imgUsuario.attr('src',"img/piedra.png");
    imgIA.attr('src',"img/piedra.png");
    resultadoTexto.text("Elige una opción!");
}

function partidaCompleta() {
    if (puntajeJugador === 3) {
        alert(`Has ganado la partida!🏆\nEl resultado final fue: \nJ1: ${puntajeJugador} - IA: ${puntajeIa}`);
        reset();
    } else if (puntajeIa === 3) {
        alert(`Has perdido la partida!😓\nEl resultado final fue: \nJ1: ${puntajeJugador} - IA: ${puntajeIa}`);
        reset();
    }
}

function jugar(opcionUsuario) {
    if(jugando) return;

    jugando = true;

    imgUsuario.attr('src',"img/" + opcionUsuario + ".png");

    resultadoTexto.text("Pensando!");

    const intervalo = setInterval(function(){
        const opcionIA = calcularEleccionIA();
        imgIA.attr('src',"img/" + opcionIA + ".png");
    }, 100);

    setTimeout(function () {

        clearInterval(intervalo);

        const opcionIA = calcularEleccionIA();
        const resultado = calcularResultado(opcionUsuario, opcionIA);

        imgIA.attr('src',"img/" + opcionIA + ".png");

        switch (resultado) {
            case EMPATE:
                resultadoTexto.text("Empataron!");
                partidaCompleta();
                break;
            case VICTORIA:
                resultadoTexto.text("Ganaste!");
                partidaCompleta();
                break;
            case DERROTA:
                resultadoTexto.text("Perdiste!");
                partidaCompleta();
                break;
        }
        jugando = false;
    }, 2300);
}

function calcularEleccionIA() {
    const numero = Math.floor(Math.random() * 3);
    switch (numero) {
        case 0:
            return PIEDRA;
        case 1:
            return PAPEL;
        case 2:
            return TIJERAS;
    }
}

function calcularResultado(opcionUsuario, opcionIA) {
    if (opcionUsuario === opcionIA) {
        return EMPATE;

    } else if (opcionUsuario === PIEDRA) {

        if (opcionIA === PAPEL) {
            puntajeIa++;
            mostrarIa.text(`${puntajeIa}`);
            return DERROTA;
        }
        if (opcionIA === TIJERAS) {
            puntajeJugador++;
            mostrarP1.text(`${puntajeJugador}`);
            return VICTORIA;
        }

    } else if (opcionUsuario === PAPEL) {

        if (opcionIA === TIJERAS) {
            puntajeIa++;
            mostrarIa.text(`${puntajeIa}`);
            return DERROTA;
        };
        if (opcionIA === PIEDRA) {
            puntajeJugador++;
            mostrarP1.text(`${puntajeJugador}`);
            return VICTORIA;
        };

    } else if (opcionUsuario === TIJERAS) {

        if (opcionIA === PIEDRA) {
            puntajeIa++;
            mostrarIa.text(`${puntajeIa}`);
            return DERROTA;
        };
        if (opcionIA === PAPEL) {
            puntajeJugador++;
            mostrarP1.text(`${puntajeJugador}`);
            return VICTORIA;
        };
    }
}

