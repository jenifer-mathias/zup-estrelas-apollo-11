package forca;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class ForcaComentada {
                                                   // final pq a vari�vel n�o pode assumir outro valor
						                           // short pq o � tipo de dado que � capaz de armazenar n�meros inteiros de 16 bits
						                           // (-32.768 e 32.767)
	public final short TENTATIVAS = 6;             // est� em mai�scula porque � uma vari�vel constante
	public char[] palavraAdvinhar;
	public char[] palavraEscondida;
	public String tentativasDeLetras = "";
	public String palavraSorteada;
	public int qtdTentativas = 0;
	public int qtdAchada = 0;
	Scanner teclado = new Scanner(System.in);

	                                                                          // m�todo feito somente para sortear uma palavra
	public String sortearPalavra() throws IOException {                       // p tratar exce��o/ erro de input output (IOException)

		FileReader fileReader = new FileReader("palavras.txt");

		BufferedReader reader = new BufferedReader(fileReader);                           // classe respons�vel por exibir na tela as linhas do
																                          // arquivo txt

		Random random = new Random();                        // classe usada para sortear, nesse caso os n�meros correspondentes as palavras no vetor
										                                           
										 
		int valorSorteado = random.nextInt(10);              // a vari�vel valorSorteado est� recebendo o sorteio realizado pelo
												             // Random.10 (indo de 0 at� 9 posi��es)
		int contador = 0;
		String st;                                           // o valor da linha foi atribu�da a uma vari�vel do tipo String (st)
		while ((st = reader.readLine()) != null) {           // o c�digo roda no la�o linha por linha, indo at� vazio que simboliza o fim do arquivo
													          

			if (contador == valorSorteado) {                 // se a var contador for igual valorSorteado ele para e contador recebe
												             // contador, ou seja, a leitura para, pois o n�mero foi correspondente ao solicitdo
                                                             // se isso n�o acontecer, "imperceptivelmetne" vai retornar a ler a linha e quando der igual, o bloco para
				break; 
			} 

			contador++;
		}
		reader.close();
		fileReader.close();

		return st;
	}
    
	public ForcaComentada() throws IOException {                                       // m�todo que nele consta o jogo em si (usando j� o tratamento de exce��es
		String st = sortearPalavra();                                         // a variavel do tipo String est� recebendo o m�todo sortearPalavra que nele
										                                      // constava a palavra sorteada pela classe Random

		int contador = 0;
		this.palavraSorteada = st;                                            // o this simboliza que o pr�prio objeto est� contendo a var st, ou seja novamente o m�todo sorteasPalavra que cont�m a palavra sorteada
									                                          
		String[] palavraSorteada = st.split("");                              // criou-se o array de String palavraSorteda recebendo a palavra sorteada e o m�todo split est� divindo ela em pequenos peda�os
													                           
		this.palavraAdvinhar = new char[palavraSorteada.length];              // novamente o this est� referindo-se ao char palavraAdvinhar para receber o tamanho da palavra sorteada
																	            													          
		for (String letra : palavraSorteada) {                                // foi usado um for pra saber em quantas partes ser� dividido a string. Usei um loop for-each para preservar a seguran�a do c�digo. "Para cada letra tem a var palavra sorteada
												                             						                              
			this.palavraAdvinhar[contador] = letra.charAt(0);                 // Fun��o charAt justamente para retornar um caractere em determinada posi��o da string
			contador++;                                                       // palavradvinhar recebeu o contador, pois se tiver mais de uma letra igual, na string, ser� substituida ambas letras.
		}
		palavraEscondida = new char[palavraSorteada.length];                  // palavraEscondida est� recebendo o tamanho da palavra sorteada em char
		for (int i = 0; i < palavraSorteada.length; i++) {
			palavraEscondida[i] = '_';                                        // substitui��o de underlines por char
		}
	}

	public void jogo() {                                                      // condi��es/ regras do jogo
		
		System.out.println("\n Bem vindo(a) a forca! ");
		
		//FIXME: Essa condi��o faz com que eu possa errar 7 vezes e n�o 6.
		while (qtdTentativas < TENTATIVAS) {                                 // enquanto qtdTentativas for menor ou igual a TENTATIVAS (constante 6) e 
			if (qtdAchada == palavraEscondida.length) {                       // se a qtdAchada for igual ao tamanho da palavraEscondida, ele ganha o jogo
				System.out.println("Voc� ganhou, parab�ns!");                 // para e retorna a finaliza��o agradecendo por jogar contida no Main
				break;
			}
			
			System.out.println("\n Voc� tem " + (TENTATIVAS - qtdTentativas) + " tentativas. ");    // TENTATIVAS � fixo em 6 e qtdTentativas � o valor que ser� diminuido conforme o usu�rio vai 'perdendo'
			System.out.printf("\n Letras digitadas: " + this.tentativasDeLetras);                 // tentativasDeLetras estava recebendo as letras passadas pelo teclado e pelo this, s� fiz refer�ncia para 'grav�-las' mostras ao usu�rio
			System.out.println();
			for (int i = 0; i < this.palavraAdvinhar.length; i++) {
				System.out.print(palavraEscondida[i] + " ");
			}
			System.out.println(" \n ");
			System.out.println(" Digite uma letra: ");
			char letraDigitada = teclado.next().charAt(0);                      // criou uma var para guardar a a letra recebida pelo teclado e retornou em char. Por padr�o � precisa colocr 0, pois o �ndice do primeiro caractere � 0
			if (this.tentativasDeLetras.indexOf(letraDigitada) < 0) {           // o IndexOf serve para sabermos qual �ndice determinado peda�o da string corresponde, retornando um valor do tipo int. 
				atualizarRegistroDeTentativas(letraDigitada);                   // chamei a minha classe tentativaDeLetras e retornei a letra digitada em int como par�metro  
				atualizarPalavraEscondida(letraDigitada);                       // de mesmo modo foi atualizando as letras para formar a palavra
			} else {
				System.out.println("\n Voc� j� digitou essa letra! ");
			}
		}
		if (this.qtdAchada != this.palavraEscondida.length) {                  // fiz outro se para vlidar se a qtd achada for diferente do tamanho da palavra escondida a pessoa perde o jogo
			System.out.println(" Voc� perdeu! ");
		}
	}

	//FIXME: ADOREI ISSO!
	private void atualizarRegistroDeTentativas(char letraDigitada) {
		this.tentativasDeLetras += " " + letraDigitada;                        // aqui estou concatenando as letras digitadas, formando mesmo o meu registro do que foi lido pelo teclado (tanto acertos como erros)
	}

	private void atualizarPalavraEscondida(char letraDigitada) {               // aqui estou atualizando as minhas tentativas
		boolean encontrado = false;                                           
		for (int i = 0; i < this.palavraAdvinhar.length; i++) {               
			if (this.palavraAdvinhar[i] == letraDigitada) {                    // se palavraAdvinhar na posi��o i for igual a letra digitada
				this.palavraEscondida[i] = letraDigitada;
				encontrado = true;                                             // encontrado que era falso, ser� verdadeiro
				qtdAchada++;                                                   // qtd Achada ser� somada a ela msm
			}
		}
		if (!encontrado) {                                                     // se � encontrado, qtd tentativas ser atualizado
			qtdTentativas++;
		}

	}
}
