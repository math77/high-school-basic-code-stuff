import java.util.Scanner;

public class Questao5 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);


		int[] notas = new int[5];
		int[] alunos = new int[5];
		int contador = 0;
		int soma = 0;

		for(int i = 0; i < notas.length; i++){
			System.out.println("Digite uma nota ");
			notas[i] = leia.nextInt();
			soma += notas[i];

		}

		int media = soma / notas.length;

		for(int i = 0; i < notas.length; i++){
			if(notas[i] > media){
				alunos[contador] = notas[i]; 
				contador++;
			}



		}
		
		System.out.println("A média é " +media);
		System.out.println("A quantidade de alunos acima da média são: " +contador);

		for(int i = 0; i < contador; i++){
			System.out.println("As notas dos alunos acima da média são " +alunos[i]);

		}

	}

}
