package Atividades;

import java.util.Scanner;


public class AtividadeLoops {

	public static void main(String[] args) {
		
		Scanner texto = new Scanner(System.in);
		
		
		// Exercicio 1 -> Tabuada personalizada
		
//		System.out.println("Digite um numero inteiro!");
//		
//		int numero = texto.nextInt();
//		
//		int resultado = 0;
//		
//		for(int i=1; i < 11; i++) {
//			
//			resultado = numero * i;
//			
//			String mensagem = String.format("%d x %d = %d", numero, i, resultado);
//			System.out.println(mensagem);
//			
//		}
		
		// Exercicio 2 -> Soma dos numeros pares
		
//		int soma = 0;
//		
//		for(int i=0; i<=100; i += 2) {
//			soma += i;
//		}
//		
//		System.out.println("O resultado da soma e: " + soma);
		
		
		// Exercicio 3 -> Validacao de entrada
		
//		int idade = 0;
//		
//		do {
//			
//			System.out.println("Digite sua idade");
//			
//			idade = texto.nextInt();
//			
//		}while(idade < 0 || idade > 100);
//		
//		
//		System.out.println("Sua idade e: " + idade + " ano(s)");
		
		
		// Exercicio 4 -> Contagem regressiva de 0 a 1
		
//		int contador = 10;
//		
//		while(contador >= 1) {
//			
//			System.out.println("Contagem regressiva! " + contador);
//			
//			contador--;
//		}
		
		// Exercicio 5 -> Somar numeros ate que o usuario digite 0
		
//		double numeroUsuario = 0;
//		
//		double soma = 0;
//		
//		System.out.println("Digite um numero e iremos somar ao anterior!"
//				+ "\nQuando digitar 0, a soma vai para e voce sabera a soma total!");
//		
//		do {
//
//			numeroUsuario = texto.nextDouble();
//			soma += numeroUsuario;
//			
//		}while(numeroUsuario != 0);
//		
//		String mensagem = String.format("A soma final e: %.2f", soma);
//		System.out.println(mensagem);
		
		
		texto.close();
	
	}

}
