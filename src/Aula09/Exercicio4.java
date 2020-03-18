package Aula09;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) throws IOException {
		// Leia n nomes digitados pelo usuário e os grave todos (um em cada linha) em
		// minúsculo em um
		// arquivo chamado "nomes.txt".

		Scanner teclado = new Scanner(System.in);

		System.out.println(" Quantidade de nomes ");
		int qtdNome = teclado.nextInt();

		FileWriter writer = new FileWriter("nomes.txt");
		
		teclado.nextLine();
		for (int i = 0; i < qtdNome; i++) {
			
			System.out.println("Digite seu nome: ");
			String nome = teclado.nextLine();
			
			writer.write(nome.toLowerCase() + "\n");
		}
		
		writer.close();
	}

}
