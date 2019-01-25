/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio1;

/**
 *
 * @author matheus
 */
public class Calculadora {

    public int somar(int num1, int num2) {
        return num1 + num2;
    }

    public int sutracao(int num1, int num2) {
        return num1 - num2;
    }

    public int multiplicar(int num1, int num2) {
        return num1 * num2;
    }

    public int dividir(int num1, int num2) {

        try {

            return num1 / num2;

        } catch (ArithmeticException ex) {
            System.out.println("Impossível dividir um número por zero");

        }

        return 0;

    }

}
