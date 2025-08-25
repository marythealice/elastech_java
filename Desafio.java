package Atividades;


import java.util.Scanner;


public class Desafio {

	public static void main(String[] args) {
		
		// habilitando o scanner
		
		Scanner texto = new Scanner(System.in);
		
		// inicializando a variavel opcaoDesafio fora do loop e o menu
		
		int opcaoDesafio = 0;
		
		do {System.out.println("\nBem vindo ao desafio! Digite qual opcao de problema deseja visualizar!\n"
				+ "\n1 - Sequência de Fibonacci;"
				+ "\n2 - Desenhando um Triângulo de Asteriscos;"
				+ "\n3 - Somas de compra ate parar;"
				+ "\n4 - Adivinhe o numero secreto"
				+ "\n5 - Verificador de numero primo"
				+ "\n6 - sair");
		
			opcaoDesafio = texto.nextInt();
		
			// usando switch para que o usuario escolha alguma das opcoes
		
			switch (opcaoDesafio) {
			case 1: {
				
				System.out.println("Bem vindo(a) à sequência de fibonacci! Quantos numeros da sequencia gostaria de ver?");
				
				int numeroFinbonacci = texto.nextInt();
				
				// fibonacci method
				
				
				System.out.println("A sequencia de fibonacci e:");
				fibonacci(numeroFinbonacci); // printando a sequencia de numeros fibonacci
				
				break;
			}
			
			
			case 2:{
				
				System.out.println("Ola! Qual altura deseja que o triangulo tenha? (em asteriscos rs)");
				
				int alturaTriangulo = texto.nextInt();
				
				printarTrianguloRetangulo(alturaTriangulo);
				
				break;
			}
			case 3:{
				
				double total = SomaComprasAteAcabar(texto);
				
				String mensagemString = String.format("O total da soma das compras e de R$ %,.2f", total);
				System.out.println(mensagemString);
				break;
			}
			case 4:{
				
				SortearNumero(texto);
				break;
			}
			case 5:{
				
				System.out.println("Digite um numero para verificar se ele e primo");
				
				int numero = texto.nextInt();
				
				boolean ePrimo = EPrimo(numero);
				
				if(ePrimo) {
					System.out.println("O numero " + numero + " e primo!");
				}else {
					System.out.println("O numero " + numero + " nao e primo.");
				}
				
				break;
			}
			case 6:{
				System.out.println("Tchau tchau, ate a proxima!");
				break;
			}
				
			default:
				System.out.println("Voce digitou uma opcao invalida, tente novamente");
				break;
			}
		}while(opcaoDesafio != 6);
		
				

	}
		
		// metodo fibonacci
	
		public static void fibonacci(int n) {
			
			// como calcular o numero de fibonacci sem recursao
			
			int a = 0;
			int b = 1;
			int proximo = 0;
			
			for(int i = 0; i  < n; i++) {
				System.out.print( a + " ");
				proximo = a + b; // calculando o proximo "a";
				a = b;   // atualizando os valores
				b = proximo;
			}}
		
		// metodo para printar um triangulo com asteriscos (escolhi o triangulo retangulo para usar apenas 2 loops aninhados)
		// ele fica com a altura que o usuario quiser
		
		public static void printarTrianguloRetangulo(int n) {

			for(int a = 0; a < n; a++){ // loop controlando a altura
				
				for (int b = 0; b <= a; b++) {
					
					System.out.print("* "); // espaco para as colunas de estrelas nao ficarem grudadas
				}
				
				System.out.println(); // printando quebra de linha para as filas de estrelas nao ficarem grudadas
			}
			
		}
		
		
		// metodo para as compras sem parar
		
		public static double SomaComprasAteAcabar(Scanner scanner) {
			
			double valor = 0;
			double total = 0;
			
			System.out.println("Digite o valor do produto. Caso deseje encerra a soma, digite 0.");
			
			do {
				
				System.out.println("Digite o valor do produto: R$ ");
				valor = scanner.nextDouble();
				
				if(valor < 0) {
					System.out.println("Valor invalidado!");
				}else {
					total += valor;
				}
				
			}while(valor != 0);
			
			return total;
		}
		
		// Adivinhe o Número Secreto
		
		public static void SortearNumero(Scanner scanner) {
			
			int palpite;
			int numeroSecreto;
			numeroSecreto = new java.util.Random().nextInt(100) + 1;
			
			do {
				
				System.out.println("Digite um numero para tentar adivinhar o numero secreto (1 a 100) ou 0 para sair.");
				
				palpite = scanner.nextInt();
				
				if (palpite == numeroSecreto) {
					System.out.println("Acertou! Tchau tchau!");
				}
				else if(palpite < numeroSecreto) {
					System.out.println("O seu palpite foi menor que o numero secreto!");
					
				}else {
					System.out.println("O seu palpite foi maior que o numero secreto");
				}
				
			}while(palpite != 0 && palpite != numeroSecreto);
			
		
		}
		
		// 	Verificador de Número Primo
		
		public static boolean EPrimo(int n) {
			
			if(n < 2) return false;
		
			for (int i = 2; i * i <= n; i++) {
				if(n % i == 0) return false;
				
			
			}
			return true;
		}
			
				

}
