package Aula07;

import java.util.Scanner;

public class Ex3 {

	// Escreva um programa que leia 10 n�meros e escreva o menor valor lido e o
	// maior valor lido.

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int maior = 0;
		int menor = 0;

		System.out.println(" Digite 10 n�meros: ");
		for (int i = 1; i <= 10; i++) {
			System.out.printf("\n", i);
			int numero = teclado.nextInt();

			if ((numero > maior) || (i == 1))
				maior = numero;

			if ((numero < menor) || (i == 1))
				menor = numero;
		}

		System.out.printf(" O maior n�mero digitado �: %d\n ", maior);
		System.out.printf(" O menor n�mero digitado �: %d\n ", menor);
	}

}
