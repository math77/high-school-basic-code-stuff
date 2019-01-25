import java.util.Scanner;

public class Questao11 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int valor;
		
		int contador = 1;
		int dentroInter = 0;
		int foraInter = 0;
		
		while(contador <= 10){
			System.out.println("Digite um valor");
			valor = leia.nextInt();
			
			if((valor >= 10) && (valor <= 50)){
				dentroInter++;
				
			}else{
				foraInter++;
			}
			contador++;
		}
        System.out.println("Valores dentro do intervalo: " +dentroInter);
        System.out.println("Valores fora do intervalo:  " +foraInter);
	}

}
