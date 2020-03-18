package Aula06;

import java.util.Scanner;

public class Ex8 {

	// Faça um programa para a leitura de duas notas parciais de um aluno.
	// O programa deve calcular a média alcançada por aluno e apresentar:
    // A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
    // A mensagem "Reprovado", se a média for menor do que sete;
	// A mensagem "Aprovado com Distinção", se a média for igual a dez.
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);

		System.out.println(" Digite a primeira nota parcial: ");
		float nota1 = teclado.nextFloat();

		System.out.println(" Digite a segunda nota parcial: ");
		float nota2 = teclado.nextFloat();
		
		float media = ((nota1 + nota2) / 2);

		if (media >= 7) {

			System.out.printf(" \n Aluno aprovado! \n média:  %1.0f ", media);
			
		} else if (media == 10) {
			
			System.out.printf(" \n Aluno aprovado com distinção! \n média:  %1.0f, ", media);

		} else {

			System.out.printf(" \n Aluno reprovado! \n média: %1.0f  ", media);

		}

	}

}
