package Aula08;

import java.util.Scanner;

public class Ex3 {

	// Faça um programa que leia dez conjuntos de dois valores,

	// o primeiro representando o número do aluno

	// e o segundo representando a sua altura em centímetros.

	// Encontre o aluno mais alto e o mais baixo.

	// Mostre o número do aluno mais alto e o número do aluno mais baixo, junto com
	// suas alturas.

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int alunoAlto = Integer.MIN_VALUE;
		int alunoBaixo = Integer.MAX_VALUE;

		int NumAlunoAlto = 0;
		int NumAlunoBaixo = 0;

		for (int j = 0; j < 10; j++) {
			System.out.printf(" Número do aluno: %d\n");
			int numeroAluno = teclado.nextInt();
			System.out.printf(" Altura em centímetros: %d\n");
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
		
		System.out.printf(" O número do aluno mais alto é: " + NumAlunoAlto + " e ele tem" + alunoAlto + "centímetros de altura");
		
		System.out.println(" O número do aluno mais baixo é: " + NumAlunoBaixo + "e ele tem" + alunoBaixo + "centímetros de altura");
	}

	
}
