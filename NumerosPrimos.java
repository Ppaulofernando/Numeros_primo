package numeros_primos;


import java.util.Scanner;

public class NumerosPrimos {

	public static void main(String[] args) {
		// N�mero primo: div�sivel � s� por 1 e ele mesmo.
		
		Scanner leitor = new Scanner(System.in);
		int numeroPrimo;
		int contadorDivisores = 0;
		
		System.out.print("Digite um n�mero: ");
		numeroPrimo = leitor.nextInt();
		
		
		for(int i = 1; i <= numeroPrimo; i++) {
			if(numeroPrimo % i == 0) {
				contadorDivisores++;		
			}
		}	
			
			if (contadorDivisores == 2) {
				System.out.println("N�mero: " + numeroPrimo + " � primo.");
			} else {
				System.out.println("N�mero: " + numeroPrimo + " n�o � primo.");
			} 
			System.out.println("N�mero de divisores: " + contadorDivisores);
			
			
		leitor.close();	
			
		}
		
	

	

}
