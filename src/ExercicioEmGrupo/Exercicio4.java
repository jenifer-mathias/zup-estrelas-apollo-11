package ExercicioEmGrupo;

import java.util.Scanner;

public class Exercicio4 {

	// Faça um programa que use a função valorPagamento para determinar o valor a
	// ser pago por uma prestação de uma conta.

	// O programa deverá solicitar ao usuário o valor da prestação e o número de
	// dias em atraso
	// e passar estes valores para a função valorPagamento, que calculará o valor a
	// ser pago
	// e devolverá este valor ao programa que a chamou.

	// O programa deverá então exibir o valor a ser pago na tela.

	// Após a execução o programa deverá voltar a pedir outro valor de prestação e
	// assim continuar
	// até que seja informado um valor igual a zero para a prestação.

	// Neste momento o programa deverá ser encerrado, exibindo o relatório do dia,
	// que conterá a quantidade e o valor total de prestações pagas no dia.

	// O cálculo do valor a ser pago é feito da seguinte forma.
	// Para pagamentos sem atraso, cobrar o valor da prestação.
	// Quando houver atraso, cobrar 3% de multa, mais 0,1% de juros por dia de
	// atraso.

	public static double valorPagamento(double prestacao, int diasAtrasos) {

		// Essa variavel vai receber o valor da multa e o juros.
		double pagamento = 0;

		if (diasAtrasos == 0) {
			pagamento = prestacao;
		} else {
			pagamento = (prestacao * 1.03) * (1 + (0.001 * diasAtrasos));
		}

		return pagamento;

	}

	public static void main(String[] args) {
		// 4. Faça um programa que use a função valorPagamento para determinar o valor a
		// ser pago por uma prestação de uma conta.

		// O programa deverá solicitar ao usuário o valor da
		// prestação e o
		// número de dias em atraso e passar estes valores para a função valorPagamento,
		// que calculará o
		// valor a ser pago e devolverá este valor ao programa que a chamou. O programa
		// deverá então
		// exibir o valor a ser pago na tela. Após a execução o programa deverá voltar a
		// pedir outro valor
		// de prestação e assim continuar até que seja informado um valor igual a zero
		// para a prestação.
		// Neste momento o programa deverá ser encerrado, exibindo o relatório do dia,
		// que conterá a
		// quantidade e o valor total de prestações pagas no dia. O cálculo do valor a
		// ser pago é feito da
		// seguinte forma. Para pagamentos sem atraso, cobrar o valor da prestação.
		// Quando houver
		// atraso, cobrar 3% de multa, mais 0,1% de juros por dia de atraso.

		Scanner teclado = new Scanner(System.in);
		double totalPrestacoes = 0;
		double qtdPrestacao = 0;

		double valorPrestacao = -1;
		do {
			System.out.println("Informe o valor da prestação:");
			valorPrestacao = teclado.nextDouble();
			totalPrestacoes += valorPrestacao;

			if (valorPrestacao == 0) {
				break;
			}
			System.out.println("Informe os dias de atraso:");
			double diasAtrasos = teclado.nextDouble();

			System.out.printf(" O valor da prestação com multa é R$%.2f\n",
					valorPagamento(valorPrestacao, (int) diasAtrasos));
			qtdPrestacao++;
		} while (valorPrestacao != 0);

		System.out.printf("O total de prestações é %.2f e a quantidade de prestações foi %.	2f", totalPrestacoes,
				qtdPrestacao);
	}
}