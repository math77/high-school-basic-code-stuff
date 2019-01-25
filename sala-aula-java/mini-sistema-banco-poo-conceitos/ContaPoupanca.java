package estudos.poo.matheus;

public class ContaPoupanca extends ContaBancaria {
	
	
	private int diaRendimento;
	
	
	public int getDiaRendimento() {
		return diaRendimento;
	}

	public void setDiaRendimento(int diaRendimento) {
		this.diaRendimento = diaRendimento;
	}
	
	public void calcularNovoSaldo(float taxaRendimento){
		super.setSaldo(getSaldo() + taxaRendimento);
	}

}
