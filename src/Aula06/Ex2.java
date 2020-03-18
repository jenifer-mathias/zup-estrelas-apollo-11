package Aula06;

import java.util.Scanner;

public class Ex2 {

	// Faça um Programa que peça um valor e mostre na tela se o valor é positivo ou
	// negativo.

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println(" Digite um número: ");

		Float numero = teclado.nextFloat();

		if (numero > 0) {

			System.out.println(" O número digitado é positivo. ");

		} else if (numero == 0) {

			System.out.println(" O número digitado é neutro. ");

		} else {
			System.out.printf(" O número digitado é negativo. ");

		}

	}

}
