package forca;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class ForcaComentada {
                                                   // final pq a variável não pode assumir outro valor
						                           // short pq o é tipo de dado que é capaz de armazenar números inteiros de 16 bits
						                           // (-32.768 e 32.767)
	public final short TENTATIVAS = 6;             // está em maiúscula porque é uma variável constante
	public char[] palavraAdvinhar;
	public char[] palavraEscondida;
	public String tentativasDeLetras = "";
	public String palavraSorteada;
	public int qtdTentativas = 0;
	public int qtdAchada = 0;
	Scanner teclado = new Scanner(System.in);

	                                                                          // método feito somente para sortear uma palavra
	public String sortearPalavra() throws IOException {                       // p tratar exceção/ erro de input output (IOException)

		FileReader fileReader = new FileReader("palavras.txt");

		BufferedReader reader = new BufferedReader(fileReader);                           // classe responsável por exibir na tela as linhas do
																                          // arquivo txt

		Random random = new Random();                        // classe usada para sortear, nesse caso os números correspondentes as palavras no vetor
										                                           
										 
		int valorSorteado = random.nextInt(10);              // a variável valorSorteado está recebendo o sorteio realizado pelo
												             // Random.10 (indo de 0 até 9 posições)
		int contador = 0;
		String st;                                           // o valor da linha foi atribuída a uma variável do tipo String (st)
		while ((st = reader.readLine()) != null) {           // o código roda no laço linha por linha, indo até vazio que simboliza o fim do arquivo
													          

			if (contador == valorSorteado) {                 // se a var contador for igual valorSorteado ele para e contador recebe
												             // contador, ou seja, a leitura para, pois o número foi correspondente ao solicitdo
                                                             // se isso não acontecer, "imperceptivelmetne" vai retornar a ler a linha e quando der igual, o bloco para
				break; 
			} 

			contador++;
		}
		reader.close();
		fileReader.close();

		return st;
	}
    
	public ForcaComentada() throws IOException {                                       // método que nele consta o jogo em si (usando já o tratamento de exceções
		String st = sortearPalavra();                                         // a variavel do tipo String está recebendo o método sortearPalavra que nele
										                                      // constava a palavra sorteada pela classe Random

		int contador = 0;
		this.palavraSorteada = st;                                            // o this simboliza que o próprio objeto está contendo a var st, ou seja novamente o método sorteasPalavra que contém a palavra sorteada
									                                          
		String[] palavraSorteada = st.split("");                              // criou-se o array de String palavraSorteda recebendo a palavra sorteada e o método split está divindo ela em pequenos pedaços
													                           
		this.palavraAdvinhar = new char[palavraSorteada.length];              // novamente o this está referindo-se ao char palavraAdvinhar para receber o tamanho da palavra sorteada
																	            													          
		for (String letra : palavraSorteada) {                                // foi usado um for pra saber em quantas partes será dividido a string. Usei um loop for-each para preservar a segurança do código. "Para cada letra tem a var palavra sorteada
												                             						                              
			this.palavraAdvinhar[contador] = letra.charAt(0);                 // Função charAt justamente para retornar um caractere em determinada posição da string
			contador++;                                                       // palavradvinhar recebeu o contador, pois se tiver mais de uma letra igual, na string, será substituida ambas letras.
		}
		palavraEscondida = new char[palavraSorteada.length];                  // palavraEscondida está recebendo o tamanho da palavra sorteada em char
		for (int i = 0; i < palavraSorteada.length; i++) {
			palavraEscondida[i] = '_';                                        // substituição de underlines por char
		}
	}

	public void jogo() {                                                      // condições/ regras do jogo
		
		System.out.println("\n Bem vindo(a) a forca! ");
		
		//FIXME: Essa condição faz com que eu possa errar 7 vezes e não 6.
		while (qtdTentativas < TENTATIVAS) {                                 // enquanto qtdTentativas for menor ou igual a TENTATIVAS (constante 6) e 
			if (qtdAchada == palavraEscondida.length) {                       // se a qtdAchada for igual ao tamanho da palavraEscondida, ele ganha o jogo
				System.out.println("Você ganhou, parabéns!");                 // para e retorna a finalização agradecendo por jogar contida no Main
				break;
			}
			
			System.out.println("\n Você tem " + (TENTATIVAS - qtdTentativas) + " tentativas. ");    // TENTATIVAS é fixo em 6 e qtdTentativas é o valor que será diminuido conforme o usuário vai 'perdendo'
			System.out.printf("\n Letras digitadas: " + this.tentativasDeLetras);                 // tentativasDeLetras estava recebendo as letras passadas pelo teclado e pelo this, só fiz referência para 'gravá-las' mostras ao usuário
			System.out.println();
			for (int i = 0; i < this.palavraAdvinhar.length; i++) {
				System.out.print(palavraEscondida[i] + " ");
			}
			System.out.println(" \n ");
			System.out.println(" Digite uma letra: ");
			char letraDigitada = teclado.next().charAt(0);                      // criou uma var para guardar a a letra recebida pelo teclado e retornou em char. Por padrão ñ precisa colocr 0, pois o índice do primeiro caractere é 0
			if (this.tentativasDeLetras.indexOf(letraDigitada) < 0) {           // o IndexOf serve para sabermos qual índice determinado pedaço da string corresponde, retornando um valor do tipo int. 
				atualizarRegistroDeTentativas(letraDigitada);                   // chamei a minha classe tentativaDeLetras e retornei a letra digitada em int como parâmetro  
				atualizarPalavraEscondida(letraDigitada);                       // de mesmo modo foi atualizando as letras para formar a palavra
			} else {
				System.out.println("\n Você já digitou essa letra! ");
			}
		}
		if (this.qtdAchada != this.palavraEscondida.length) {                  // fiz outro se para vlidar se a qtd achada for diferente do tamanho da palavra escondida a pessoa perde o jogo
			System.out.println(" Você perdeu! ");
		}
	}

	//FIXME: ADOREI ISSO!
	private void atualizarRegistroDeTentativas(char letraDigitada) {
		this.tentativasDeLetras += " " + letraDigitada;                        // aqui estou concatenando as letras digitadas, formando mesmo o meu registro do que foi lido pelo teclado (tanto acertos como erros)
	}

	private void atualizarPalavraEscondida(char letraDigitada) {               // aqui estou atualizando as minhas tentativas
		boolean encontrado = false;                                           
		for (int i = 0; i < this.palavraAdvinhar.length; i++) {               
			if (this.palavraAdvinhar[i] == letraDigitada) {                    // se palavraAdvinhar na posição i for igual a letra digitada
				this.palavraEscondida[i] = letraDigitada;
				encontrado = true;                                             // encontrado que era falso, será verdadeiro
				qtdAchada++;                                                   // qtd Achada será somada a ela msm
			}
		}
		if (!encontrado) {                                                     // se ñ encontrado, qtd tentativas ser atualizado
			qtdTentativas++;
		}

	}
}
