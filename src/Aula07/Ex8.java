package Aula07;

import java.util.Scanner;

public class Ex8 {

	// Fa�a um programa que pe�a um n�mero inteiro e determine se ele � ou n�o um
	// n�mero primo.
	// Um n�mero primo � aquele que � divis�vel somente por ele mesmo e por 1.

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
			System.out.println(" Numero N�O � primo ");
		}
	}
}