/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio3;

/**
 *
 * @author matheus
 */
public class DivideByZeroException extends Exception {
    
    public DivideByZeroException(){
        super("Não é possível dividir por zero");
    }
    
    public DivideByZeroException(String mensagem){
        super(mensagem);
    }
}
