package ExercicioEmGrupo;

import java.util.Scanner;

public class Exercicio1 {

	// Fa�a um programa para imprimir:

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

		// Pedimos para o usu�rio digitar um n�mero

		System.out.println(" �RVORE DE N�MEROS ");

		System.out.println(" Digite um n�mero:\n "); // pedimos para o usu�rio digitar um n�mero
		int tamanho = teclado.nextInt(); // lemos o n�mero

		for (int i = 0; i <= tamanho; i++) { // primeiro for foi para ir de 1 at� n�merp lido (coluna)

			// foi utilizado para quebrar e imprimir linha
			// foi utlizado outro for para ir de linha at� coluna (repetindo o n�mero da
			// linha)
			// pediu para imprimir o n�mero de colunas
		}

		teclado.close();
	}
}
