package Aula05;

import java.util.Scanner;

public class QuintoExercicio {

// Leia um numero real e imprima a quinta parte deste número.	

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println(" Digite um número: \n"); // " escreva"
		float numero = teclado.nextFloat(); // "leia"

		System.out.printf(" A quinta parte do número digitado é: \n %.1f", numero / 5);
	}
}
