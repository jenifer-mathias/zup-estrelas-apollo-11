package Aula06;

import java.util.Scanner;

public class Ex2 {

	// Fa�a um Programa que pe�a um valor e mostre na tela se o valor � positivo ou
	// negativo.

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println(" Digite um n�mero: ");

		Float numero = teclado.nextFloat();

		if (numero > 0) {

			System.out.println(" O n�mero digitado � positivo. ");

		} else if (numero == 0) {

			System.out.println(" O n�mero digitado � neutro. ");

		} else {
			System.out.printf(" O n�mero digitado � negativo. ");

		}

	}

}
