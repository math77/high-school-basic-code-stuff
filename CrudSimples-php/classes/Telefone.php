<?php

/**
 * Description of Telefone
 *
 * @author 20151114010668
 */
class Telefone {
    
    private $idTelefone;
    private $nome;
    private $numero;
    
    function getIdTelefone() {
        return $this->idTelefone;
    }

    function getNome() {
        return $this->nome;
    }

    function getNumero() {
        return $this->numero;
    }

    function setIdTelefone($idTelefone) {
        $this->idTelefone = $idTelefone;
    }

    function setNome($nome) {
        $this->nome = $nome;
    }

    function setNumero($numero) {
        $this->numero = $numero;
    }


}
