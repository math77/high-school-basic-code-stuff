import java.util.Scanner;

public class Questao15 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int[] a1 = new int[4];
		int[] a2 = new int[4];
		
		for(int i =0; i < a1.length; i++){
			System.out.println("Digite um número ");
			a1[i] = leia.nextInt();
			
		}
		
		for(int i =0; i < a1.length; i++){
			a2[i] = a1[i] * a1[i];
			
			System.out.println(+a1[i]+ " e o quadrado é " +a2[i]);
		}
		
		int menor = Integer.MAX_VALUE;
		int maior = Integer.MIN_VALUE;
		

	}

}

