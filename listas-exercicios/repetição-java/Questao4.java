import java.util.Scanner;

public class Questao4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite um número ");
		int num = leia.nextInt();

		for(int i = 1; i <= num; i++){
			if(num%i == 0){

				System.out.println(i);

			}

		}

	}

}
