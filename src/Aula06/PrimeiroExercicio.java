package Aula06;

import java.util.Scanner;

public class PrimeiroExercicio {

	// Leia um valor de comprimento em polegadas e apresente-o convertido em
	// cent�metros.

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println(" Digite um comprimento em polegadas: \n");

		float numero = teclado.nextFloat();

		System.out.printf(" O comprimento digitado em cent�metros �: %.2f \n ", (numero * 2.54));

	}

}
