/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 20151114010668
 */
public class TesteFuncionario {
    public static void main(String[] args) {
        
        Estagiario e1 = new Estagiario();
        Diretor d1 = new Diretor();
        Professor p1 = new Professor();
        System.out.println("Estagiario: " +e1.calcularSalario());
        System.out.println("Diretor: " +d1.calcularSalario());
        System.out.println("Professor " +p1.calcularSalario());
        
        
    }
    
}
