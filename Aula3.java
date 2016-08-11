// Rodrigo Almeida Costa

import java.util.Scanner;

class Aula3{
	public static void main(String[] args){
		//==== Declaração das Variáveis

		int tamanhoVetor;
		int [] Vetor;
		int i 		= 0;
		int menor 	= 0;
		int maior 	= 0;
		int soma 	= 0;


		//==== Definição do tamanho do vetor e alocação de memória para o espaço requisitado pelo usuário

		Scanner entrada = new Scanner (System.in);
		System.out.println("Tamanho do vetor: ");
		tamanhoVetor = entrada.nextInt();

		Vetor = new int[tamanhoVetor];

		//==== Definição dos Valores do Vetor e logo em seguida a verificação do maior e menor, soma dos valores

		while (i < tamanhoVetor){
			System.out.println("Posição " + i + " : ");
			Vetor[i] = entrada.nextInt();

			if (i == 0){
				menor = Vetor[i];
				maior = Vetor[i];
			}
			
			if (menor > Vetor[i]){
				menor = Vetor[i];
			}
			if (maior < Vetor[i]){
				maior = Vetor[i];
			}

			soma += Vetor[i];

			i = i+1;
		}

		i = 0;


		System.out.println("Valores do vetor: ");

		//==== Impressão do vetor

		while (i < tamanhoVetor){
			System.out.println(Vetor[i]);			
			
			i = i + 1;
		}

		//==== Imprime Menor, Maior e a Soma

		System.out.println(" \n  Menor : " + menor);
		System.out.println("  Maior : " + maior);
		System.out.println("  Soma  : " + soma);
		
	}
}
