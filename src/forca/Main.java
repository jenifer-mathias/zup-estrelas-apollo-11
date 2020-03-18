package forca;

import java.io.IOException;

public class Main {

	public static void main(String[] args) {
	
		Forca forca;
		try {                                                 // tentativa de rodar o código (jogo da forca) ... se ocorrer uma excessão passa p/ o catch
			forca = new Forca();
			forca.jogo();                                     // e (variavel) que vai tratar o erro
		} catch (IOException e) { 
			System.out.println(" Erro ao encontrar arquivo "); // o catch trata a excessão e, se ñ for algo esperado, pularia para um próximo catch e se ñ resolvesse,  o sistema seria interrompido, lançando uma excessão ao erro
			                                                   // imprimindo o retorno para o fluxo de erros padrão
		} finally {                                           // bloco opcional q vai excecutar alguma ação, independente se gerar erro
			System.out.println("\n Obrigada por jogar! ");
		}

	}

}
