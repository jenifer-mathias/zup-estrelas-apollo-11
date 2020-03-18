package Aula06;

import java.util.Scanner;

public class TerceiroExercicio {

	// Implemente um programa que calcule o ano de nascimento de uma pessoa
	// a partir de sua idade e do ano atual.

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println(" Digite sua idade: \n");

		int idade = teclado.nextInt();

		System.out.println(" Digite o ano atual: \n");

		int ano = teclado.nextInt();

		System.out.printf(" Considerando o seu aniversário atual, você nasceu no ano: %d \n ", ((ano - 1) - idade));

	}

}
