package Aula06;

import java.util.Scanner;

public class Ex1 {

	// Fa�a um programa que receba dois n�meros e mostre qual deles � o maior.

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println(" Digite um n�mero: ");

		Float primeiroNumero = teclado.nextFloat();

		System.out.println(" Digite outro n�mero: ");

		Float segundoNumero = teclado.nextFloat();

		if (primeiroNumero > segundoNumero) {

			System.out.printf(" O maior n�mero �: %.1f ", primeiroNumero);

		} else {

			System.out.printf(" O maior n�mero �: %.1f ", segundoNumero);

		}

	}

}
