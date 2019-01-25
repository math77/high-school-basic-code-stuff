import java.util.Scanner;

public class Questao9 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int tabuada;
		
		System.out.println("Digite um número ");
		int num = leia.nextInt();
		
		for(int i = 1; i <= 10; i++){
			tabuada = num*i;
			
			System.out.println(tabuada);
			
		}

	}

}
