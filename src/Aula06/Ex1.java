package Aula06;

import java.util.Scanner;

public class Ex1 {

	// Faça um programa que receba dois números e mostre qual deles é o maior.

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println(" Digite um número: ");

		Float primeiroNumero = teclado.nextFloat();

		System.out.println(" Digite outro número: ");

		Float segundoNumero = teclado.nextFloat();

		if (primeiroNumero > segundoNumero) {

			System.out.printf(" O maior número é: %.1f ", primeiroNumero);

		} else {

			System.out.printf(" O maior número é: %.1f ", segundoNumero);

		}

	}

}
