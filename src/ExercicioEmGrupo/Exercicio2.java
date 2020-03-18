package ExercicioEmGrupo;

import java.util.Scanner;

public class Exercicio2 {

	// public static int totalVotosCandidato(int votos) {
	// return totalVotosCandidato(votos);
	// }

	public static void main(String[] args) {
		// 2. Em uma elei��o presidencial existem quatro candidatos. Os votos s�o
		// informados por meio de
		// c�digo. Os c�digos utilizados s�o:
		// 1 , 2, 3, 4 - Votos para os respectivos candidatos
		// (voc� deve montar a tabela ex: 1 - Jose/ 2- Jo�o/etc)
		// 5 - Voto Nulo
		// 6 - Voto em Branco

		// Fa�a um programa que calcule e mostre:
		// O total de votos para cada candidato;
		// O total de votos nulos;
		// O total de votos em branco;
		// A percentagem de votos nulos sobre o total de votos;
		// A percentagem de votos em branco sobre o total de votos. Para finalizar o
		// conjunto de
		// votos tem-se o valor zero.

		Scanner teclado = new Scanner(System.in);
		int contadorJose = 0;
		int contadorJoao = 0;
		int contadorTora = 0;
		int contadorRaphaela = 0;
		int contadorNulo = 0;
		int contadorBranco = 0;
		int numeroEscolhido = 0;

		do {
			System.out.println(" BEM VINDO(A) A ELEI��O! ");
			
			System.out.println(" Os n�meros dos candidatos s�o:\n 1 - JOS�\n 2 "
					+ "- JO�O\n 3 - TORA\n 4 - RAPHAELA\n 5 - NULO\n 6 - VOTO EM BRANCO");
			
			System.out.println("Digite o n�mero do seu candidato:");
			numeroEscolhido = teclado.nextInt();

			switch (numeroEscolhido) {

			case 1: {
				contadorJose++;
				System.out.println("O candidato escolhido foi Jos�. Obrigado pelo seu voto.");
			}
				break;

			case 2: {
				contadorJoao++;
				System.out.println("O candidato escolhido foi Jo�o. Obrigado pelo seu voto.");
			}
				break;

			case 3: {
				contadorTora++;
				System.out.println("O candidato escolhido foi Tora. Obrigado pelo seu voto.");
				break;

			}
			case 4: {
				contadorRaphaela++;
				System.out.println("O candidato escolhido foi Raphaela. Obrigado pelo seu voto.");
				break;
			}

			case 5: {
				contadorNulo++;
				System.out.println("Voc� votou nulo. Obrigado pelo seu voto.");
				break;
			}

			case 6: {
				contadorBranco++;
				System.out.println("Voc� votou Branco. Obrigado pelo seu voto.");
				break;
			}

			default:
				System.out.println("N�o atende aos requerimentos por favor digite um candidato v�lido.");
			}
			
		} while (numeroEscolhido != 0);
		
		System.out.printf(" N�mero de pessoas que votaram em Jos�: %d\n", contadorJose);
		System.out.printf(" N�mero de pessoas que votaram em Jo�o: %d\n", contadorJoao);
		System.out.printf(" N�mero de pessoas que votaram em Tora: %d\n", contadorTora);
		System.out.printf(" N�mero de pessoas que votaram em Raphaela: %d\n", contadorRaphaela);
		System.out.printf(" N�mero de pessoas que votaram Nulo: %d\n", contadorNulo);
		System.out.printf(" N�mero de pessoas que votaram em branco: %d\n", contadorBranco);

		int somaTotalVotos = contadorJose + contadorJoao + contadorTora + contadorRaphaela + contadorNulo
				+ contadorBranco;
		
		double porcentagemNulo = contadorNulo * 100 / somaTotalVotos ;
		double porcentagemBranco = contadorBranco * 100 / somaTotalVotos;
		
		System.out.printf("A porcentagem de votos nulos sobre o total de votos � %.2f\n", (porcentagemNulo));
		System.out.printf("A porcentagem de votos em Branco sobre o total de votos � %.2f", (porcentagemBranco));
	}
}
