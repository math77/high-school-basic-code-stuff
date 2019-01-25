/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 20151114010668
 */
public class Estagiario extends Funcionario {

    public Estagiario() {
        
    }

    public Estagiario(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }

    @Override
    public double calcularSalario() {
         return super.getSalario() / 2;
    }

    
    
    
    
}
