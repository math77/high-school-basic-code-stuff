import java.util.Scanner;

public class Questao6 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um número ");
		int num = leia.nextInt();
		
		int fatorial = 1;
		
		for(int i = 1; i <= num; i++){
			fatorial = fatorial * i;
			
		}
         System.out.println("O fatorial é " +fatorial);
	}

}
