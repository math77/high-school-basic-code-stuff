
public class Questao10 {

	public static void main(String[] args) {
		
		int par = 0;
		int contador = 0;
		
		
		for(int i = 13; i <= 773; i++){
			if(i%2 == 0){
				par = par + i;
				contador++;
				
			}
			
		}
		
		int media = par / contador;
		System.out.println("A média é " +media);

	}

}
