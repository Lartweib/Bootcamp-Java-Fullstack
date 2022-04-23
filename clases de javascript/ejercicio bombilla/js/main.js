// Ejercicio bombilla

const zoom =$("#zoom")
const level =$("#level")
const textLevel = $("#textLevel")
const textZoom = $("#textZoom")



level.on("input", () => {
  textLevel.text(`Level: ${level.val()}`);
  if (level.val()==="1") {
    $(".bOn").css("opacity", "0.3");
  }
  else if (level.val()==="2") {
    $(".bOn").css("opacity", "0.4");
  }
  else if (level.val()==="3") {
    $(".bOn").css("opacity", "0.5");
  }
  else if (level.val()==="4") {
    $(".bOn").css("opacity", "0.6");
  }
  else if (level.val()==="5") {
    $(".bOn").css("opacity", "0.8");
  }
  else if (level.val()==="6") {
    $(".bOn").css("opacity", "1");
  }
});

zoom.on("input", () => {
  textZoom.text(`Zoom: ${zoom.val()}`);
  if (zoom.val()==="1") {
    $(".bOff").css("height", "100px");
    $(".bOn").css("height", "100px");
  }
  else if (zoom.val()==="2") {
    $(".bOff").css("height", "200px");
    $(".bOn").css("height", "200px");
  }
  else if (zoom.val()==="3") {
    $(".bOff").css("height", "300px");
    $(".bOn").css("height", "300px");
  }
  else if (zoom.val()==="4") {
    $(".bOff").css("height", "400px");
    $(".bOn").css("height", "400px");
  }
  else if (zoom.val()==="5") {
    $(".bOff").css("height", "500px");
    $(".bOn").css("height", "500px");
  }
  else if (zoom.val()==="6") {
    $(".bOff").css("height", "600px");
    $(".bOn").css("height", "600px");
  }
});


$('#interruptor').click(function(){
  $(".bOff").toggleClass('hide');
  $(".bOn").toggleClass('hide');
});

