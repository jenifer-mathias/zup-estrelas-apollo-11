package Aula08;

import java.util.Scanner;

public class Exercicio4 {

	// Fa�a um programa que leia um vetor de 8 posi��es e, em seguida,
	// leia tamb�m dois valores X e Y quaisquer correspondentes a duas posi�oes no
	// vetor.
	// Ao final seu programa dever� escrever a soma dos valores encontrados nas
	// respectivas posi��es X e Y.

	public static void main(String[] args) {

		double[] numerosLidos = new double[8];

		Scanner teclado = new Scanner(System.in);

		for (int i = 0; i < numerosLidos.length; i++) {
			System.out.printf(" Digite um n�mero real : \n ");
			numerosLidos[i] = teclado.nextDouble();
		}

		System.out.println(" Digite um n�mero inteiro de 0-7 correspondente a posi��o do vetor: ");
		int posicaoX = teclado.nextInt();
		System.out.println(" Digite um n�mero inteiro de 0-7 correspondente a posi��o do vetor");
		int posicaoY = teclado.nextInt();

		System.out.printf(" A soma das posi��es digitadas �: %.2f\n ", (numerosLidos[posicaoX] + numerosLidos[posicaoY]));

	}

}
