package Aula06;

import java.util.Scanner;

public class Ex6 {

	// Fa�a um Programa que leia tr�s n�meros e mostre o maior deles.

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println(" Digite um n�mero: ");
		Float primeiroNumero = teclado.nextFloat();

		System.out.println(" Digite outro n�mero: ");
		Float segundoNumero = teclado.nextFloat();

		System.out.println(" Digite outro n�mero: ");
		Float terceiroNumero = teclado.nextFloat();

		if ((primeiroNumero > segundoNumero) && (primeiroNumero > terceiroNumero)) {

			System.out.printf(" O maior n�mero �: %.1f ", primeiroNumero);

		} else if ((segundoNumero > primeiroNumero) && (segundoNumero > terceiroNumero)) {

			System.out.printf(" O maior n�mero �: %.1f ", segundoNumero);

		} else {

			System.out.printf(" O maior n�mero �: %.1f ", terceiroNumero);
		}

	}

}
