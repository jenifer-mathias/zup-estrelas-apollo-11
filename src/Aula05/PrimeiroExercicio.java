package Aula05;

import java.util.Scanner;

public class PrimeiroExercicio {

	// Fa�a um programa que leia um numero inteiro e o imprima.
	
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println(" Digite um n�mero inteiro: \n");

		int inteiro = teclado.nextInt(); // aqui est� lendo do teclado

		System.out.printf(" O inteiro lido �: %d", inteiro); // Ele vai substituir o %d pelo valor contido na var
																// inteiro

	}
}
