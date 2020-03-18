package Aula08;

import java.util.Scanner;

public class Ex1 {

	// Faça um programa que peça para n pessoas a sua idade,
	// ao final o programa devera verificar
	// se a média de idade da turma varia entre 0 e 25,26 e 60 e maior que 60;
	// e então, dizer se a turma é jovem, adulta ou idosa, conforme a média
	// calculada.

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println(" Quantas pessoas têm na turma: ");

		int numeroPessoas = teclado.nextInt();
		int somaIdades = 0;

		for (int n = 0; n <= numeroPessoas; n++) {

			System.out.printf(" Digite sua idade: ");
			somaIdades += teclado.nextInt();
		}

		double media = 0;
		media = somaIdades/ (double) numeroPessoas;

		if (media <= 25) {
			System.out.println(" A turma é majoriatariamente jovem! ");
		
		} else if (media < 60) {
			System.out.println(" A turma é majoritariamente adulta! ");
		
		} else {
			System.out.println(" A turma é majoritariamente idosa! ");

		}

	}
}
