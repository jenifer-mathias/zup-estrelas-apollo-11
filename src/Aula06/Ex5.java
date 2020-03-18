package Aula06;

import java.util.Scanner;

public class Ex5 {

	// Faça um algoritmo que calcule a média ponderada das notas de 3 provas.
	// A primeira e a segunda prova tem peso 1 e
	// a terceira tem peso 2.
	// Ao final, mostrar a média do aluno e indicar se o aluno foi aprovado ou
	// reprovado.
	// A nota para aprovação deve ser igual ou superior a 60 pontos.

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println(" Digite a primeira nota: ");
		float nota1 = teclado.nextFloat();

		System.out.println(" Digite a segunda nota: ");
		float nota2 = teclado.nextFloat();
		nota2 = (nota2 * 2);

		System.out.println(" Digite a terceira nota: ");
		float nota3 = teclado.nextFloat();
		nota3 = (nota3 * 3);

		float media = ((nota1 + nota2 + nota3) / 4);

		System.out.printf(" Sua média é: %1.0f ", media);

		if (media >= 60) {
			System.out.printf(" \n Aluno aprovado! ");

		} else {
			System.out.printf(" \n Aluno reprovado! ");

		}

	}

}
