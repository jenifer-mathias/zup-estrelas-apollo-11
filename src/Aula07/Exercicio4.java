package Aula07;

import java.util.Scanner;

public class Exercicio4 {

	// Faça um programa para verificar se um determinado numero inteiro e divisível
	// por 3 ou 5,
	// mas não simultaneamente pelos dois.

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println(" Digite um número inteiro: ");
		int numeroInteiro = teclado.nextInt();

		if ((numeroInteiro % 3 == 0 || numeroInteiro % 5 == 0) && !(numeroInteiro % 3 == 0 && numeroInteiro % 5 == 0)) {
			System.out.println(" Condição atendida! ");

		} else {
			System.out.println(" Condição NÃO atendida! ");

		}

	}

}
