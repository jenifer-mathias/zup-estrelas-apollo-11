package Aula06;

import java.util.Scanner;

public class QuintoExercicio {

	// Faça um programa que leia o valor de um produto 
	//e imprima o valor com desconto, tendo em
	//vista que o desconto foi de 12%.
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println(" Digite o valor de um produto: ");
		
		Float produto = teclado.nextFloat();
		
		Float desconto = (float) (produto * 0.12);
		
		System.out.printf(" O valor do produto com 12%% de desconto é: %.2f", (produto - desconto)); 

	}

}
