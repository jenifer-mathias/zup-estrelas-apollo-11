package Aula07;

import java.util.Scanner;

public class Exercicio4 {

	// Fa�a um programa para verificar se um determinado numero inteiro e divis�vel
	// por 3 ou 5,
	// mas n�o simultaneamente pelos dois.

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println(" Digite um n�mero inteiro: ");
		int numeroInteiro = teclado.nextInt();

		if ((numeroInteiro % 3 == 0 || numeroInteiro % 5 == 0) && !(numeroInteiro % 3 == 0 && numeroInteiro % 5 == 0)) {
			System.out.println(" Condi��o atendida! ");

		} else {
			System.out.println(" Condi��o N�O atendida! ");

		}

	}

}
