function somar() {
    var contar = document.getElementById("contador").innerHTML;
    contar++;
    document.getElementById("contador").innerHTML = contar;
}

function subtrair() {
    var subtrair = document.getElementById("contador").innerHTML;

    if (subtrair > 0) {
        subtrair--;
        document.getElementById("contador").innerHTML = subtrair;
    }
}

function ledBranco(){
    document.getElementById("led").src = "img/led_white.png";
}

function ledVermelho(){
    document.getElementById("led").src = "img/led_red.png";
}

function aumentaFonte(){
    var tam = document.getElementsByTagName("<h2>").style.textSize;
    tam+= 2;
    document.getElementsByTagName("<h2>").style.textSize = "tampx";
}

function diminuiFonte(){
    
}