package estudos.poo.matheus;

public class ContaEspecial extends ContaBancaria {
	
	private float limite;
	
	public void sacar(float valorSaque){
		if(super.getSaldo() <= limite){
			super.setSaldo(super.getSaldo() - valorSaque);
		
		}else{
		   System.out.println("Impossível sacar, valor do saque maior que o limite permitido!");	
		}
	}

}
