/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 20151114010668
 */

public class Moto implements IVeiculo {

    private int consumoLitro;
    private int capacidadeTotal;
    private int tanque;
    
    public Moto(){
        
    }

    public Moto(int consumo, int capacidade) {
        this.consumoLitro = consumo;
        this.capacidadeTotal = capacidade;
    }

    @Override
    public void andar(int distancia) {
        System.out.println("A moto vai aindar " + distancia + " Km");
    }

    @Override
    public void abastecer(int litros) {
        if (litros > capacidadeTotal) {
            System.out.println("ooops, você abasteceu mais que a capacidade do tanque");
        } else {
            tanque = litros;

        }

    }

    @Override
    public double consultarTanque() {
        return tanque;
    }

}

