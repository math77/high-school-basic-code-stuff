import java.util.Scanner;

public class Questao7 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int[] num = new int[5];
		int numMax = num[0];
		int numMin = num[0];


		for(int i = 0; i < num.length; i++){
			System.out.println("Digite um número ");
			num[i] = leia.nextInt();

		}

		for(int i = 0; i < num.length; i++){
			if(num[i] > numMax){
				numMax = num[i];
			}
		    if(num[i] < numMin){
				numMin = num[i];
			}
		}

		System.out.println("O maior número é " +numMax);
		System.out.println("O menor número é " +numMin);

	}

}
