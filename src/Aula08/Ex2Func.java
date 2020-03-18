package Aula08;

import java.util.Scanner;

public class Ex2Func {

	// Faça uma função que receba 3 números inteiros como parâmetro, representando horas, minutos e segundos,
	//e os converta em segundos.
	
	public static int segundos (int horas, int minutos, int segundos) {
		return (horas * 3600 + minutos * 60 * segundos) ;
	}
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int horas = 0;
		int minutos = 0;
		int segundos = 0;
		
		System.out.println(" Digite a hora: ");
		horas = teclado.nextInt();
		
		System.out.println(" Digite os minutos: ");
	    minutos = teclado.nextInt();
	    
	    System.out.println(" Digite os segundos: ");
	    segundos = teclado.nextInt();
		
		System.out.printf(" A conversão dos números digitados para segundos é: %d\n ", segundos (horas, minutos, segundos));

	}

}
