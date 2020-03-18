package Aula06;

import java.util.Scanner;

public class Ex6 {

	// Faça um Programa que leia três números e mostre o maior deles.

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println(" Digite um número: ");
		Float primeiroNumero = teclado.nextFloat();

		System.out.println(" Digite outro número: ");
		Float segundoNumero = teclado.nextFloat();

		System.out.println(" Digite outro número: ");
		Float terceiroNumero = teclado.nextFloat();

		if ((primeiroNumero > segundoNumero) && (primeiroNumero > terceiroNumero)) {

			System.out.printf(" O maior número é: %.1f ", primeiroNumero);

		} else if ((segundoNumero > primeiroNumero) && (segundoNumero > terceiroNumero)) {

			System.out.printf(" O maior número é: %.1f ", segundoNumero);

		} else {

			System.out.printf(" O maior número é: %.1f ", terceiroNumero);
		}

	}

}
