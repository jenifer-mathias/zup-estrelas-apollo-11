package Aula08;

import java.util.Scanner;

public class Ex3Func {

	// Faça uma função que receba a temperatura em graus Celsius e retorne-a convertida 
	// em graus Fahrenheit. O programa deve ser executado n vezes e 
	// parar ao ser digitado o número -1009.	
	// (°C × 9/5) + 32

	public static double fromCelsiusToFarenheit(double celsius) {
		return (celsius * 1.8) + 32;
	}
	
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		System.out.println(" CONVERSOR DE GRAUS ");
		
		double celsius = 0;
		
		while (celsius != -1009) {
			System.out.println(" \n Digite a temperatura em celsius ");
			celsius = teclado.nextDouble();
			
			if (celsius == -1009) {
				break;
			}
			
			System.out.printf(" A temperatura correspondente à %.2fº Celsius é %.2f Farenheit\n ", celsius, fromCelsiusToFarenheit(celsius));
			
		}
		
		
	}

}
