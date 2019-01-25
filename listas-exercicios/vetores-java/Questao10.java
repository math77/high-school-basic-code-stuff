import java.util.Scanner;

public class Questao10 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int[] valor = new int[50];
		int valorMax = valor[0];


		for(int i = 0; i < valor.length; i++){
			System.out.println("Digite o valor da pontuação  ");
			valor[i] = leia.nextInt();

			if((valor[i] >= 0) && (valor[i] <= 100)){
				if(valor[i] > valorMax){
					valorMax = valor[i];
				}
				System.out.println("Valor válido! ");

			}else{

				System.out.println("Valor inválido! ");

			}

		}

		System.out.println("Essas são as pontuações: ");
		for(int i = 0; i < valor.length; i++){
			System.out.println("   " +valor[i]);

		}

		System.out.println("A maior pontuação foi: " +valorMax);

		for(int i = 0; i < valor.length; i++){
			if(valor[i] > 100){
				System.out.println("O valor " +valor[i]+ " não é uma pontuação válida ");
			}
		}
	}

}



