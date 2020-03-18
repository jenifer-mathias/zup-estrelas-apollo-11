package ExercicioEmGrupo;

import java.util.Scanner;

public class Exercicio1 {

	// Faça um programa para imprimir:

	// 1
	// 2 2
	// 3 3 3
	// .....
	// n n n n n n ... n

	public static void escreveLinha(int tamanhoDaLinha) {
		System.out.println("");
		for (int j = 0; j < tamanhoDaLinha; j++) {
			System.out.println(tamanhoDaLinha + " ");
		}

	}

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		// Pedimos para o usuário digitar um número

		System.out.println(" ÁRVORE DE NÚMEROS ");

		System.out.println(" Digite um número:\n "); // pedimos para o usuário digitar um número
		int tamanho = teclado.nextInt(); // lemos o número

		for (int i = 0; i <= tamanho; i++) { // primeiro for foi para ir de 1 até númerp lido (coluna)

			// foi utilizado para quebrar e imprimir linha
			// foi utlizado outro for para ir de linha até coluna (repetindo o número da
			// linha)
			// pediu para imprimir o número de colunas
		}

		teclado.close();
	}
}
