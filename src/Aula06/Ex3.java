package Aula06;

import java.util.Scanner;

public class Ex3 {

	// Escreva um programa que, dados dois números inteiros, mostre na tela o maior
	// deles, assim
	// como a diferença existente entre ambos.

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println(" Digite um número inteiro: ");

		int primeiroNumero = teclado.nextInt();

		System.out.println(" Digite outro número inteiro: ");

		int segundoNumero = teclado.nextInt();

		if (primeiroNumero > segundoNumero) {

			System.out.printf(" O maior número é: %d ", primeiroNumero);
			int diferenca = primeiroNumero - segundoNumero;
			System.out.printf(" \n A diferença entre os números é: %d ", diferenca);

		} else {
			System.out.printf(" O maior número é: %d ", segundoNumero);
			int diferenca = segundoNumero - primeiroNumero;
			System.out.printf(" \n A diferença entre os números é: %d ", diferenca);

		}

	}

}
