package ExercicioEmGrupo;

import java.util.Scanner;

public class Exercicio3 {

	// Foi feita uma estatística em cinco cidades brasileiras para coletar dados
	// sobre acidentes de trânsito.
	// Foram obtidos os seguintes dados:

	// Código da cidade;
	// Número de veículos de passeio (em 1999);
	// Número de acidentes de trânsito com vítimas (em 1999).

	// Deseja-se saber: Qual o maior e menor índice de acidentes de transito e a que
	// cidade pertence;

	// Qual a média de veículos nas cinco cidades juntas;

	// Qual a média de acidentes de trânsito nas cidades com menos de 2.000 veículos
	// de passeio.

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		int menorIndice = Integer.MAX_VALUE;
		int maiorIndice = Integer.MIN_VALUE;
		
		int codMenorCidade = Integer.MAX_VALUE;
		int codMaiorCidade = Integer.MIN_VALUE;
		
		int qtdVeiculos = 0;
		int qtdAcidentes = 0;
		int totalVeiculos = 0;
		int veiculosDoisMil = 0;
		double mediaAcidentes = 0;
		double totalAcidentes = 0;

		for (int i = 0; i < 5; i++) {
			System.out.println("Informe o código da " + (i + 1) + "º cidade:");
			int codCidade = teclado.nextInt();
			System.out.println("Digite a quantidade de veículos de passeio nessa cidade em 1999:");
			qtdVeiculos = teclado.nextInt();
			totalVeiculos += qtdVeiculos;
			System.out.println("Informe a quantidade de acidentes de trânsito dessa cidade em 1999:");
			qtdAcidentes = teclado.nextInt();

			if (qtdAcidentes > maiorIndice) {
				maiorIndice = qtdAcidentes;
				codMaiorCidade = codCidade;
			}
			if (qtdAcidentes < menorIndice) {
				menorIndice = qtdAcidentes;
				codMenorCidade = codCidade;

				if (qtdVeiculos < 2000) {      // contador    // por if dps do laço  
					totalAcidentes += qtdAcidentes;
					mediaAcidentes = totalAcidentes / i;
				}

			}
		}

		System.out.printf("O maior indice de acidente é de %d e pertence a Cidade do código %d.\n", maiorIndice,
				codMaiorCidade);
		System.out.printf("O menor indice de acidente é de %d e pertence a Cidade do código %d.\n", menorIndice,
				codMenorCidade);

		double mediaVeiculos = totalVeiculos / 5;

		System.out.printf("A media de veiculos das cinco cidades é %.2f\n", mediaVeiculos);
		System.out.printf("A media de acidentes nas cidades com menos de 2000 veiculos de passeio é %.2f",
				mediaAcidentes);
	}

}