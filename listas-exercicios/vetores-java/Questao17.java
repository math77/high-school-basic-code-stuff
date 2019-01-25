import java.util.Scanner;

public class Questao17 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int[] vetor1 = new int[5];
		int[] vetor2 = new int[5];
		int[] vetor3 = new int[5];
		
		for(int i = 0; i < vetor1.length; i++){
			System.out.println("Digite um número para o primeiro vetor ");
			vetor1[i] = leia.nextInt();
			
		}
		
		for(int i = 0; i < vetor2.length; i++){
			System.out.println("Digite um número para o segundo vetor ");
			vetor2[i] = leia.nextInt();
			
		}
        
		for(int i = 0; i < vetor3.length; i++){
			vetor3[i] = vetor1[i] * vetor2[i];
			
			System.out.println("A multiplicação de " +vetor1[i]+ " x " +vetor2[i]+ " = " +vetor3[i]);
		}
	}

}
