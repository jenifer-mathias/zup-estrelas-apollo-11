package Aula06;

import java.util.Scanner;

public class Ex3 {

	// Escreva um programa que, dados dois n�meros inteiros, mostre na tela o maior
	// deles, assim
	// como a diferen�a existente entre ambos.

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println(" Digite um n�mero inteiro: ");

		int primeiroNumero = teclado.nextInt();

		System.out.println(" Digite outro n�mero inteiro: ");

		int segundoNumero = teclado.nextInt();

		if (primeiroNumero > segundoNumero) {

			System.out.printf(" O maior n�mero �: %d ", primeiroNumero);
			int diferenca = primeiroNumero - segundoNumero;
			System.out.printf(" \n A diferen�a entre os n�meros �: %d ", diferenca);

		} else {
			System.out.printf(" O maior n�mero �: %d ", segundoNumero);
			int diferenca = segundoNumero - primeiroNumero;
			System.out.printf(" \n A diferen�a entre os n�meros �: %d ", diferenca);

		}

	}

}
