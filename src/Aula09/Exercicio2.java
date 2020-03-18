package Aula09;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Exercicio2 {

	// Leia o arquivo criado no exerc�cio anterior a mostre seu conte�do na tela transformando todo
	// texto escrito em mai�sculo.
	
	public static void main(String[] args) throws IOException {
	
		FileReader estruturaArquivo = new FileReader("dadosPessoais.txt");
		BufferedReader leitorArquivo = new BufferedReader(estruturaArquivo);
		
		String linha;
		while ((linha = leitorArquivo.readLine()) != null) {
			System.out.println(linha.toUpperCase());
		}

		leitorArquivo.close();
		estruturaArquivo.close();
	}

}
