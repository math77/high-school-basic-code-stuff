<?php

class Conexao {

    private $usr = "root";
    private $pass = "ifrn.2018";
    private $url = "localhost";
    private $banco = "google";


    private function getConexao(){
        return new mysqli($this->url, $this->usr, $this->pass, $this->banco);
    }
    
    public static function executar($query){
        $obj = new Conexao();
        $con = $obj->getConexao();
        
        $resultado = $con->query($query);
        $con->close();
        return $resultado;
    } 
}
