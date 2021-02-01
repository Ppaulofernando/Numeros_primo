package numeros_primos;


import java.util.Scanner;

public class NumerosPrimos {

	public static void main(String[] args) {
		// Número primo: divísivel é só por 1 e ele mesmo.
		
		Scanner leitor = new Scanner(System.in);
		int numeroPrimo;
		int contadorDivisores = 0;
		
		System.out.print("Digite um número: ");
		numeroPrimo = leitor.nextInt();
		
		
		for(int i = 1; i <= numeroPrimo; i++) {
			if(numeroPrimo % i == 0) {
				contadorDivisores++;		
			}
		}	
			
			if (contadorDivisores == 2) {
				System.out.println("Número: " + numeroPrimo + " é primo.");
			} else {
				System.out.println("Número: " + numeroPrimo + " não é primo.");
			} 
			System.out.println("Número de divisores: " + contadorDivisores);
			
			
		leitor.close();	
			
		}
		
	

	

}
