package Aula08;

import java.util.Random;
import java.util.Scanner;

public class Exercicio5 {

	// Leia um vetor de 10 posiçoes.
	// Contar e escrever quantos valores pares ele possui.

	public static void main(String[] args) {

		int[] vetor = new int[10];        
		Random random = new Random();
		int qtdeNumerosPares = 0;
		String numerosPares = "";

		for (int i = 0; i < vetor.length; i++) {
		    vetor[i] = random.nextInt(10);
		            
		    if (vetor[i] % 2 == 0) {
		        qtdeNumerosPares ++;
		                
		        numerosPares += Integer.toString(vetor[i]).concat(" ");
		    }
		            
		    System.out.print(vetor[i]);
		}
			
		System.out.println(" ");
		System.out.println(" Os valores pares são: ".concat(numerosPares));
		System.out.println(" Quantidade de pares é: ".concat(Integer.toString(qtdeNumerosPares))); 
		
	}}
	