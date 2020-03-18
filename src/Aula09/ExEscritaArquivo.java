package Aula09;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ExEscritaArquivo {

	public static void main(String[] args) throws IOException {
		FileWriter writer = new FileWriter("exemplo.txt", true);
		Scanner teclado = new Scanner(System.in);

		String texto = "";
		while(!texto.equals("-1")) {
			texto = teclado.nextLine();
			if (texto.equals("-1")) {
				break;
			}
			writer.append("estrela \n" + 
					"cadeira \n" + 
					"geladeira \n" + 
					"cupcake \n" + 
					"leitura \n" + 
					"agasalho \n" + 
					"sorvete \n" + 
					"felicidade \n" + 
					"perfume \n" + 
					"amizade \n" +  
					"dignidade \n" + texto);
		}
		
		teclado.close();
		writer.close();
		
		FileReader fileReader = new FileReader("exemplo.txt");
		BufferedReader reader = new BufferedReader(fileReader);
		
		String linha;
		while ((linha = reader.readLine()) != null) {
			System.out.println(linha);
		}
		
		reader.close();
		fileReader.close();
	}
}