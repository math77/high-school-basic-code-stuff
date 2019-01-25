/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2;

/**
 *
 * @author matheus
 */
public class Calculadora {

    public int somar(int num1, int num2) {
        return num1 + num2;
    }

    public int subtrair(int num1, int num2) {
        return num1 - num2;
    }

    public int multiplicar(int num1, int num2) {
        return num1 * num2;
    }

    public int dividir(int num1, int num2) throws ArithmeticException {

        if (num2 == 0) {
            throw new ArithmeticException("Não é possível dividir um número por zero, vá estudar matemática");
        } else {

            return num1 / num2;
        }
    }
}
