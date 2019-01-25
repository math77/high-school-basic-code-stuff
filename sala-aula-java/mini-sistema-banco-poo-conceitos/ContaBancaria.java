package estudos.poo.matheus;

public class ContaBancaria {
	
	private String cliente;
	private int numConta;
	private float saldo;
	
	
	
	public String getCliente() {
		return cliente;
	}



	public void setCliente(String cliente) {
		this.cliente = cliente;
	}



	public int getNumConta() {
		return numConta;
	}



	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}



	public float getSaldo() {
		return saldo;
	}



	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}



	public void sacar(float valorSaque){
		if(valorSaque <= this.getSaldo()){
			this.setSaldo(this.getSaldo() - valorSaque);
		}else{
			System.out.println("Saldo insuficiente, impossível sacar!! ");
		}
	}
	
	public void depositar(float valorDeposito){
		if(valorDeposito >= 0){
			this.setSaldo(this.getSaldo() + valorDeposito);
		
		}else{
			System.out.println("Impossível depositar valores negativos! ");
		}
	}
	
	void status(){
		System.out.println("----- DADOS DA CONTA -----");
		System.out.println("Nome do cliente: "  +this.cliente);
		System.out.println("Número da conta: " +this.numConta);
		System.out.println("Saldo atual: " +this.saldo);
	}

}
