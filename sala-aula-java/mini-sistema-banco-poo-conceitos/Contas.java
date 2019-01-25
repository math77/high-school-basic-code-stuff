package estudos.poo.matheus;

public class Contas {

	public static void main(String[] args) {
		ContaBancaria conta1 = new ContaBancaria();
		
		conta1.setCliente("Matheus");
		conta1.setNumConta(7777);
		conta1.setSaldo(4500);
		
		
		conta1.status();
		
		
		

	}

}
