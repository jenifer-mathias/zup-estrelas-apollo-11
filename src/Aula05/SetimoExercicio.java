package Aula05;

import java.util.Scanner;

public class SetimoExercicio {

	// Leia um numero inteiro e imprima o seu antecessor e o seu sucessor.

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println(" Digite um n�mero inteiro: \n");

		int inteiro = teclado.nextInt();

		System.out.printf(" O antecessor do n�mero digitado �: %d \n", (inteiro - 1));
		
		System.out.printf(" O sucessor do n�mero digitado �: %d", (inteiro + 1));
															
		

	}
}