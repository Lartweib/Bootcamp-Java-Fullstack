// Ejercicio bombilla

const zoom =$("#zoom")
const level =$("#level")
const textLevel = $("#textLevel")
const textZoom = $("#textZoom")


$(".switch input").on( 'change', function() {
      // Hacer algo si el checkbox ha sido seleccionado
      $(".bOffW").toggleClass('themeHide');
      $(".bOnW").toggleClass('themeHide');
      $(".bOffB").toggleClass('themeHide');
      $(".bOnB").toggleClass('themeHide');
      $("html").toggleClass('themeNight');
});


level.on("input", () => {
  textLevel.text(`Level: ${level.val()}`);
  if (level.val()==="1") {
    $(".bOnW").css("opacity", "0.3");
    $(".bOnB").css("opacity", "0.3");
  }
  else if (level.val()==="2") {
    $(".bOnW").css("opacity", "0.4");
    $(".bOnB").css("opacity", "0.4");
  }
  else if (level.val()==="3") {
    $(".bOnW").css("opacity", "0.5");
    $(".bOnB").css("opacity", "0.5");
  }
  else if (level.val()==="4") {
    $(".bOnW").css("opacity", "0.6");
    $(".bOnB").css("opacity", "0.6");
  }
  else if (level.val()==="5") {
    $(".bOnW").css("opacity", "0.8");
    $(".bOnB").css("opacity", "0.8");
  }
  else if (level.val()==="6") {
    $(".bOnW").css("opacity", "1");
    $(".bOnB").css("opacity", "1");
  }
});

zoom.on("input", () => {
  textZoom.text(`Zoom: ${zoom.val()}`);
  if (zoom.val()==="1") {
    $(".bOffW").css("height", "100px");
    $(".bOnW").css("height", "100px");
    $(".bOffB").css("height", "100px");
    $(".bOnB").css("height", "100px");
  }
  else if (zoom.val()==="2") {
    $(".bOffW").css("height", "200px");
    $(".bOnW").css("height", "200px");
    $(".bOffB").css("height", "200px");
    $(".bOnB").css("height", "200px");
  }
  else if (zoom.val()==="3") {
    $(".bOffW").css("height", "300px");
    $(".bOnW").css("height", "300px");
    $(".bOffB").css("height", "300px");
    $(".bOnB").css("height", "300px");
  }
  else if (zoom.val()==="4") {
    $(".bOffW").css("height", "400px");
    $(".bOnW").css("height", "400px");
    $(".bOffB").css("height", "400px");
    $(".bOnB").css("height", "400px");
  }
  else if (zoom.val()==="5") {
    $(".bOffW").css("height", "500px");
    $(".bOnW").css("height", "500px");
    $(".bOffB").css("height", "500px");
    $(".bOnB").css("height", "500px");
  }
  else if (zoom.val()==="6") {
    $(".bOffW").css("height", "600px");
    $(".bOnW").css("height", "600px");
    $(".bOffB").css("height", "600px");
    $(".bOnB").css("height", "600px");
  }
});


$('#interruptor').click(function(){
  $(".bOffW").toggleClass('hide');
  $(".bOnW").toggleClass('hide');
  $(".bOffB").toggleClass('hide');
  $(".bOnB").toggleClass('hide');
});

