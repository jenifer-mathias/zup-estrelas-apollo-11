package Aula08;

import java.util.Scanner;

public class ExemploFunc {

	public static double mediaTurma(Scanner teclado, int numeroTurma) {
		double somaNotas = 0;

		System.out.printf("Digite quantos alunos sua turma %d possui: \n", (numeroTurma + 1));
		int qtdAluno = teclado.nextInt();
		
		for (int i = 0; i < qtdAluno; i++) {
			System.out.println("Digite a nota do aluno " + (i+1));
			somaNotas += teclado.nextDouble();
		}
		
		return somaNotas / qtdAluno;
	}
	
	public static double mediaSimples(int qtdValores, double somaValores) {
		return somaValores / qtdValores;
	}
	
	
	public static void main(String[] args) {
		// Escrever um programa que calcula a média de n turmas de alunos, cuja
		// quantidade de alunos é informada pelo usuário e depois calcule a média das médias.
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Seja bem-vindo usuário, vamos começar?\n");
		System.out.println("Quantas turmas de alunos você possui?");
		int qtdTurmas = teclado.nextInt();
		
		double medias[] = new double[qtdTurmas];
		for (int i = 0; i < qtdTurmas; i++) {
			medias[i] = mediaTurma(teclado, i);
		}
		
		double somaMedias = 0;
		for (int i = 0; i < medias.length; i++) {
			System.out.printf("A média da turma %d é: %.2f\n", (i+1), medias[i]);
			somaMedias += medias[i];
		}

		System.out.printf("A média das médias é: %.2f", mediaSimples(qtdTurmas, somaMedias));
	}

}