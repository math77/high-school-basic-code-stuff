function enviarMsg() {
    var mensagem = document.getElementById("msg").value;
    if (mensagem.trim() === "") {
        alert("Digite uma mensagem, por favor.");
    } else {
        var historico = document.getElementById("historico");
        var p = document.createElement("p");
        p.innerHTML = mensagem;

        //document.getElementById("historico").appendChild(p);
        historico.insertBefore(p, historico.childNodes[0]);
        mensagem.value = "";
    }
}

function contarCaract() {
    var c = document.getElementById("msg").value.length;

    if (c > 20) {
        document.getElementById("msg").value = document.getElementById("msg").value.substring(0, 20);
        c = 20;
    }
    document.getElementById("contador").innerHTML = c + "/20";
}