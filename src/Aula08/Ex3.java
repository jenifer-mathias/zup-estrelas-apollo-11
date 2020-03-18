package Aula08;

import java.util.Scanner;

public class Ex3 {

	// Fa�a um programa que leia dez conjuntos de dois valores,

	// o primeiro representando o n�mero do aluno

	// e o segundo representando a sua altura em cent�metros.

	// Encontre o aluno mais alto e o mais baixo.

	// Mostre o n�mero do aluno mais alto e o n�mero do aluno mais baixo, junto com
	// suas alturas.

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int alunoAlto = Integer.MIN_VALUE;
		int alunoBaixo = Integer.MAX_VALUE;

		int NumAlunoAlto = 0;
		int NumAlunoBaixo = 0;

		for (int j = 0; j < 10; j++) {
			System.out.printf(" N�mero do aluno: %d\n");
			int numeroAluno = teclado.nextInt();
			System.out.printf(" Altura em cent�metros: %d\n");
			int altura = teclado.nextInt();

			if (altura > alunoAlto) {
				alunoAlto = altura;
				NumAlunoAlto = numeroAluno;
			}

			if (altura < alunoBaixo) {
				alunoBaixo = altura;
				NumAlunoBaixo = numeroAluno;
			}

		}
		
		System.out.printf(" O n�mero do aluno mais alto �: " + NumAlunoAlto + " e ele tem" + alunoAlto + "cent�metros de altura");
		
		System.out.println(" O n�mero do aluno mais baixo �: " + NumAlunoBaixo + "e ele tem" + alunoBaixo + "cent�metros de altura");
	}

	
}
