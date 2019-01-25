import java.util.Scanner;

public class Questao7 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int[] num = new int[10];
		int maior  = Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;
		int indiceMaior = -1;
		int indiceMenor = -1;
		
		for(int i = 0; i < num.length; i++){
			System.out.println("Digite um número ");
			num[i] = leia.nextInt();
			
		}
		for(int i = 0; i < num.length; i++){
			if(num[i] > maior){
				maior = num[i];
				indiceMaior = i;
			}
        
			if(num[i] < menor){
				menor = num[i];
				indiceMenor = i;
			}
		}
		
		System.out.println("O número maior é " +maior+ " e  o indice " +indiceMaior);
		System.out.println("O número menor é " +menor+ " e o indice " +indiceMenor);
	}

}
