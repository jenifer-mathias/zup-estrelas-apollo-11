package ExercicioEmGrupo;

import java.util.Scanner;

public class Exercicio3 {

	// Foi feita uma estat�stica em cinco cidades brasileiras para coletar dados
	// sobre acidentes de tr�nsito.
	// Foram obtidos os seguintes dados:

	// C�digo da cidade;
	// N�mero de ve�culos de passeio (em 1999);
	// N�mero de acidentes de tr�nsito com v�timas (em 1999).

	// Deseja-se saber: Qual o maior e menor �ndice de acidentes de transito e a que
	// cidade pertence;

	// Qual a m�dia de ve�culos nas cinco cidades juntas;

	// Qual a m�dia de acidentes de tr�nsito nas cidades com menos de 2.000 ve�culos
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
			System.out.println("Informe o c�digo da " + (i + 1) + "� cidade:");
			int codCidade = teclado.nextInt();
			System.out.println("Digite a quantidade de ve�culos de passeio nessa cidade em 1999:");
			qtdVeiculos = teclado.nextInt();
			totalVeiculos += qtdVeiculos;
			System.out.println("Informe a quantidade de acidentes de tr�nsito dessa cidade em 1999:");
			qtdAcidentes = teclado.nextInt();

			if (qtdAcidentes > maiorIndice) {
				maiorIndice = qtdAcidentes;
				codMaiorCidade = codCidade;
			}
			if (qtdAcidentes < menorIndice) {
				menorIndice = qtdAcidentes;
				codMenorCidade = codCidade;

				if (qtdVeiculos < 2000) {      // contador    // por if dps do la�o  
					totalAcidentes += qtdAcidentes;
					mediaAcidentes = totalAcidentes / i;
				}

			}
		}

		System.out.printf("O maior indice de acidente � de %d e pertence a Cidade do c�digo %d.\n", maiorIndice,
				codMaiorCidade);
		System.out.printf("O menor indice de acidente � de %d e pertence a Cidade do c�digo %d.\n", menorIndice,
				codMenorCidade);

		double mediaVeiculos = totalVeiculos / 5;

		System.out.printf("A media de veiculos das cinco cidades � %.2f\n", mediaVeiculos);
		System.out.printf("A media de acidentes nas cidades com menos de 2000 veiculos de passeio � %.2f",
				mediaAcidentes);
	}

}