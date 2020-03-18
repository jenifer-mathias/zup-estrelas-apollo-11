package ExercicioEmGrupo;

import java.util.Scanner;

public class Exercicio5 {

	// Faça um programa que receba o valor de uma dívida

	// e mostre uma tabela com os seguintes dados: valor da dívida, valor dos juros,
	// quantidade de parcelas e valor da parcela.

	// Quantidade de Parcelas                      % de Juros sobre o valor inicial da dívida
	// 1                                                           0
	// 3           // 3 em 3                                       10 // 5 em 5
	// 6                                                           15
	// 9                                                           20
	// 12                                                          25

	// Exemplo de saída do programa:

	// Valor da Dívida                 Valor dos Juros            Quantidade de Parcelas             Valor da Parcela
	// R$ 1.000,00 								0 							1 							R$ 1.000,00
	// R$ 1.100,00 							   100 						    3 							  R$ 366,00
	// R$ 1.150,00 							   150 						    6 							  R$ 191,67

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		double valorJuros = 0;
		double valorParcela = 0;
		double juros = 0.10;

		System.out.println("Informe o valor da dívida: R$");
		double divida = teclado.nextDouble();

		System.out.println("Valor Da divida       Valor dod Juros     quantidade de parcelas       Valor da Parcela  ");
		for (int i = 0; i <= 12; i += 3) {
			if (i == 0) {
				System.out.printf("R$%.2f		%d			%d			R$%.2f\n", divida, 0, i + 1, divida);
			} else {
				valorJuros = divida * juros;
				divida += valorJuros;
				valorParcela = divida / i;
				System.out.printf("R$%.2f		%.2f			%d			R$%.2f\n", divida, valorJuros, i, valorParcela);
			}
		}

	}

}