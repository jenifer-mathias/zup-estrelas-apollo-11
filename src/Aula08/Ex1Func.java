package Aula08;

import java.util.Scanner;

public class Ex1Func {
	
	// Crie uma fun��o que recebe como par�metro um n�mero inteiro e devolve o seu dobro.

	public static int dobro (int numeroInteiro) {
		return numeroInteiro * 2;
	}
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int numeroDigitado = 0;
		System.out.println(" Digite um n�mero inteiro: ");
		numeroDigitado = teclado.nextInt();
		
		System.out.printf(" O dobro do n�mero digitado � %d\n ", dobro (numeroDigitado));

	}

}
