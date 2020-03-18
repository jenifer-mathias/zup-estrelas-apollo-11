package ExercicioEmGrupo;

import java.util.Scanner;

public class Exercicio4 {

	// Fa�a um programa que use a fun��o valorPagamento para determinar o valor a
	// ser pago por uma presta��o de uma conta.

	// O programa dever� solicitar ao usu�rio o valor da presta��o e o n�mero de
	// dias em atraso
	// e passar estes valores para a fun��o valorPagamento, que calcular� o valor a
	// ser pago
	// e devolver� este valor ao programa que a chamou.

	// O programa dever� ent�o exibir o valor a ser pago na tela.

	// Ap�s a execu��o o programa dever� voltar a pedir outro valor de presta��o e
	// assim continuar
	// at� que seja informado um valor igual a zero para a presta��o.

	// Neste momento o programa dever� ser encerrado, exibindo o relat�rio do dia,
	// que conter� a quantidade e o valor total de presta��es pagas no dia.

	// O c�lculo do valor a ser pago � feito da seguinte forma.
	// Para pagamentos sem atraso, cobrar o valor da presta��o.
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
		// 4. Fa�a um programa que use a fun��o valorPagamento para determinar o valor a
		// ser pago por uma presta��o de uma conta.

		// O programa dever� solicitar ao usu�rio o valor da
		// presta��o e o
		// n�mero de dias em atraso e passar estes valores para a fun��o valorPagamento,
		// que calcular� o
		// valor a ser pago e devolver� este valor ao programa que a chamou. O programa
		// dever� ent�o
		// exibir o valor a ser pago na tela. Ap�s a execu��o o programa dever� voltar a
		// pedir outro valor
		// de presta��o e assim continuar at� que seja informado um valor igual a zero
		// para a presta��o.
		// Neste momento o programa dever� ser encerrado, exibindo o relat�rio do dia,
		// que conter� a
		// quantidade e o valor total de presta��es pagas no dia. O c�lculo do valor a
		// ser pago � feito da
		// seguinte forma. Para pagamentos sem atraso, cobrar o valor da presta��o.
		// Quando houver
		// atraso, cobrar 3% de multa, mais 0,1% de juros por dia de atraso.

		Scanner teclado = new Scanner(System.in);
		double totalPrestacoes = 0;
		double qtdPrestacao = 0;

		double valorPrestacao = -1;
		do {
			System.out.println("Informe o valor da presta��o:");
			valorPrestacao = teclado.nextDouble();
			totalPrestacoes += valorPrestacao;

			if (valorPrestacao == 0) {
				break;
			}
			System.out.println("Informe os dias de atraso:");
			double diasAtrasos = teclado.nextDouble();

			System.out.printf(" O valor da presta��o com multa � R$%.2f\n",
					valorPagamento(valorPrestacao, (int) diasAtrasos));
			qtdPrestacao++;
		} while (valorPrestacao != 0);

		System.out.printf("O total de presta��es � %.2f e a quantidade de presta��es foi %.	2f", totalPrestacoes,
				qtdPrestacao);
	}
}