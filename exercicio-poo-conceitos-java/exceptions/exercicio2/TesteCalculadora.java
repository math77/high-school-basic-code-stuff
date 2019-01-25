/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2;

import java.util.Scanner;

/**
 *
 * @author matheus
 */
public class TesteCalculadora {
    
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Calculadora calc = new Calculadora();
        
        System.out.println("Digite um número ");
        int num1 = leia.nextInt();
        System.out.println("Digite outro número ");
        int num2 = leia.nextInt();
        
        try{
            
            int result = calc.dividir(num1, num2);
            System.out.println("Resultado: " +result);
            
        }catch(ArithmeticException ex){
            System.out.println(ex.getMessage());
        }
    }
    
}
