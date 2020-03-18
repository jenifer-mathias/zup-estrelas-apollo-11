package forca;

import java.io.IOException;

public class Main {

	public static void main(String[] args) {
	
		Forca forca;
		try {                                                 // tentativa de rodar o c�digo (jogo da forca) ... se ocorrer uma excess�o passa p/ o catch
			forca = new Forca();
			forca.jogo();                                     // e (variavel) que vai tratar o erro
		} catch (IOException e) { 
			System.out.println(" Erro ao encontrar arquivo "); // o catch trata a excess�o e, se � for algo esperado, pularia para um pr�ximo catch e se � resolvesse,  o sistema seria interrompido, lan�ando uma excess�o ao erro
			                                                   // imprimindo o retorno para o fluxo de erros padr�o
		} finally {                                           // bloco opcional q vai excecutar alguma a��o, independente se gerar erro
			System.out.println("\n Obrigada por jogar! ");
		}

	}

}
