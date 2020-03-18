package Aula05;

import java.util.Scanner;

public class SetimoExercicio {

	// Leia um numero inteiro e imprima o seu antecessor e o seu sucessor.

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println(" Digite um número inteiro: \n");

		int inteiro = teclado.nextInt();

		System.out.printf(" O antecessor do número digitado é: %d \n", (inteiro - 1));
		
		System.out.printf(" O sucessor do número digitado é: %d", (inteiro + 1));
															
		

	}
}