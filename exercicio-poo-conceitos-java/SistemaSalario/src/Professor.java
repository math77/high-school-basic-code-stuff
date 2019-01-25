/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 20151114010668
 */
public class Professor extends Funcionario {

    public Professor() {
    }

    public Professor(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }
    
    //sobreescrevendo
    public double calcularSalario(){
        return super.calcularSalario() * 3;
    }
}
