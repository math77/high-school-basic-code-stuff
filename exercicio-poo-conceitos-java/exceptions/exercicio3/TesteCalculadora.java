/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio3;

import java.util.Scanner;

/**
 *
 * @author matheus
 */
public class TesteCalculadora {
    
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Calculadora calc = new Calculadora();
        System.out.println("Digite um numero ");
        int num1 = leia.nextInt();
        System.out.println("Digite outro numero ");
        int num2 = leia.nextInt();
        
        try{
            
            System.out.println("Resultado: " +calc.dividir(num1, num2));
            
        }catch(DivideByZeroException ex){
            
            System.out.println(ex.getMessage());
        }
        
    }
    
}
