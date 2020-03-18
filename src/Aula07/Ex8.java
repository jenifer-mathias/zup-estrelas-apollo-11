package Aula07;

import java.util.Scanner;

public class Ex8 {

	// Faça um programa que peça um número inteiro e determine se ele é ou não um
	// número primo.
	// Um número primo é aquele que é divisível somente por ele mesmo e por 1.

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.print("Digite um numero inteiro: ");
		int numeroLido = teclado.nextInt();

		int contaTeste = 0;
		for (int i = numeroLido; i >= 1; i--) {

			if (numeroLido % i == 0) {
				contaTeste++;
			}
		}

		if (contaTeste == 2 || numeroLido == 1) {
			System.out.println(" Numero primo ");
		} else {
			System.out.println(" Numero NÃO é primo ");
		}
	}
}