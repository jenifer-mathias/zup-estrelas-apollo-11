package Aula09;

import java.util.Scanner;

public class ExAula {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		// Length
		String nomeJeni = "Jeni";
		int tamanho = nomeJeni.length();
		System.out.println(tamanho);

		// charAt
		// String nomeJenifer = "Jeni";
		// char letra = nomeJenifer.charAt(0);
		// System.out.println(letra);

		// contains
		String nomeD = "Jeni";
		boolean existeDentro = nomeD.contains("Silva");
		System.out.println(existeDentro);

		// toUpperCase
		String nome = " JeNi";
		String nomeMaisculo = nome.toUpperCase();
		System.out.println(nome);

		// toLowerCase
		String n = "JeniFER";
		String nMinusculo = n.toLowerCase();
		System.out.println(n);
		
		// replace
		String sequenciaA = "aabbcc";
		String sequenciaB = sequenciaA.replace('a', 'b'); // procura por "a" e tudo que tem "a" ele trocou para "b"
		System.out.println(sequenciaB);

		// indexOf
		String nomeA = "Jenifer Mathias";
		int posLetraA = nomeA.indexOf('a');
		System.out.println(posLetraA);
		
		// lastIndexOf
		String nomeB = "Jenifer Mathias";
		int ultimaLetraB = nomeB.lastIndexOf('i');
		System.out.println(ultimaLetraB);
	}

}
