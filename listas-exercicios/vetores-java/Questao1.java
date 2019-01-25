import java.util.Scanner;
public class Questao1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int[] num;
		num = new int [10];

		for(int i = 0; i < num.length; i++){

			System.out.println("Digite um número ");
			num[i] = leia.nextInt();

		}

		for(int i = 0; i < num.length; i++){
			System.out.print(num[i]+ " , ");
		}
	}

}
