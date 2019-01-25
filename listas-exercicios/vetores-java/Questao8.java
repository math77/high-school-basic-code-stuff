import java.util.Scanner;

public class Questao8 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int[] num = new int[10];

		for(int i = 0; i < num.length; i++){
			System.out.println("Digite um número ");
			num[i] = leia.nextInt();

		}

		System.out.println("Digite um valor a ser procurado ");
		int valor = leia.nextInt();

		for(int i = 0; i < num.length; i++){
			if(valor == num[i]){
				System.out.println("O valor esta no array");
				break;

			}
		}
	}

}
