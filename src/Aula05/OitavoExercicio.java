package Aula05;

import java.util.Scanner;

public class OitavoExercicio {

	// Leia um numero inteiro e imprima a soma do sucessor de seu triplo com o antecessor de seu dobro.
	
	public static void main(String[] args) {
	
		Scanner teclado = new Scanner(System.in);

		System.out.println(" Digite um n�mero inteiro: \n");
		
		int numero = teclado.nextInt();
		
		System.out.printf(" A soma do sucessor do triplo do n�mero escolhido com o antecessor"
				+ " de seu dobro do n�mero escolhido �: %d \n" , (numero * 3 + 1) + (numero * 2 - 1)); 
	

	}

}
