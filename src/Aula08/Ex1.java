package Aula08;

import java.util.Scanner;

public class Ex1 {

	// Fa�a um programa que pe�a para n pessoas a sua idade,
	// ao final o programa devera verificar
	// se a m�dia de idade da turma varia entre 0 e 25,26 e 60 e maior que 60;
	// e ent�o, dizer se a turma � jovem, adulta ou idosa, conforme a m�dia
	// calculada.

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println(" Quantas pessoas t�m na turma: ");

		int numeroPessoas = teclado.nextInt();
		int somaIdades = 0;

		for (int n = 0; n <= numeroPessoas; n++) {

			System.out.printf(" Digite sua idade: ");
			somaIdades += teclado.nextInt();
		}

		double media = 0;
		media = somaIdades/ (double) numeroPessoas;

		if (media <= 25) {
			System.out.println(" A turma � majoriatariamente jovem! ");
		
		} else if (media < 60) {
			System.out.println(" A turma � majoritariamente adulta! ");
		
		} else {
			System.out.println(" A turma � majoritariamente idosa! ");

		}

	}
}
