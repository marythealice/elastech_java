package Atividades;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;




public class AtividadeRevisao {

	public static void main(String[] args) {
		
		// menu para a escolha de qual exercicio rodar
		
		Scanner texto = new Scanner(System.in); // inicializando o scanner
		
		int opcaoMenu;
		
		do {
			
			System.out.println("\nDigite a opcao do exercicio que desaja rodar!"
					+ "\n1- Declaração e uso de variáveis"
					+ "\n2- Operações Aritméticas"
					+ "\n3- Condicional IF/ELSE"
					+ "\n4- Switch"
					+ "\n5- Loop FOR"
					+ "\n6- Loop WHILE"
					+ "\n7- Arrays"
					+ "\n8- ArrayList"
					+ "\n9- IF + LOOP + ARRAY"
					+ "\n10- Sistema de Conta Bancária"
					+ "\n11- Sair\n");
			
			opcaoMenu = texto.nextInt();
			
			switch (opcaoMenu) {
			case 1: {
				
				texto.nextLine(); // tirando o enter do scanner 
				
				System.out.println("Digite seu nome!");
				
				String nome = texto.nextLine(); // usando next line para poder salvar nomes com espacos
				
				System.out.println("Digite sua idade!");
				
				int idade = texto.nextInt();
				
				System.out.println("Digite sua altura em metros!");
				
				double altura = texto.nextDouble();
				
				String mensagem = String.format("Ola %s, voce tem %d anos e sua altura e de %.2f m", nome, idade, altura);
				
				System.out.println(mensagem);
				break;
				
			}
			
			case 2: {
				
				System.out.println("Ola! Digite dois numeros inteiros para que eu faca ooperacoes. O segundo numero nao pode ser zero!");
				
				int numero1 = texto.nextInt();
				
				int numero2 = texto.nextInt();
				
				if(numero2 == 0) {
					
					System.out.println("Voce escolheu zero como segundo numero, entao a divisao nao existe!");
					break;
				}
				
				int soma = numero1 + numero2;
				
				int multiplicacao = numero1 * numero2;
				
				int divisao = numero1 / numero2;
				
				int subtracao = numero1 - numero2;
				
				String message = String.format("A seguir os resultados! Soma = %d, Subtracao = %d, Multiplicacao = %d, Divisao = %d", soma, subtracao, multiplicacao, divisao);
				
				System.out.println(message);
				
				break;
				
			}
			
			case 3:{
				
				System.out.println("Digite sua idade!");
				
				int idade = texto.nextInt();
				
				if(idade >= 18) {
					System.out.println("Você é maior de idade");
				}else {
					System.out.println("Você é menor de idade");
				}
				
				break;
				
			}
			
			case 4:{
				
				
				System.out.println("Digite um numero de 1 a 7 e veja o dia da semana correspondente!");
				
				int numeroDia = texto.nextInt();
				
				String diaSemana = "";
				
				
				switch (numeroDia){
				case 1: {
					diaSemana = "Domingo";
					break;
				}
				
				case 2: {
					diaSemana = "Segunda";
					break;
				}
				
				case 3: {
					diaSemana = "Terca";
					break;
				}
				
				case 4: {
					diaSemana = "Quarta";
					break;
				}
				
				case 5: {
					diaSemana = "Quinta";
					break;
				}
				
				case 6: {
					diaSemana = "Sextou!";
					break;
				}
				
				case 7: {
					diaSemana = "Sabado";
					break;
				}
				default:{
					System.out.println("Voce digitou um numero invalido!");
					break;
				}
			
			
				}
				
				
				if(!diaSemana.isEmpty()) {
					
					System.out.println("O dia da semana e " + diaSemana);
				}
				
				break;
				
			}
			
			case 5:{
				
				System.out.println("Todos os números de 1 a 20 e ao lado de cada um, a indicacao se ele é par ou ímpar");
				
				
				for(int i=1; i<21; i++) {
					
					if(i % 2 == 0) {
						System.out.println("Numero " + i + " e par");
					}
					else {
						
						System.out.println("Numero " + i + " e impar");
					}
					
				}
				
				break;
			}
			
			case 6:{
				
				System.out.println("Digite numeros e, se quiser saber a soma final destes, digite zero");
				
				int numero;
				
				int soma = 0;
				
				
				do {
					
					numero = texto.nextInt();
					
					soma += numero;
					
				}while(numero != 0);
				
				System.out.println("A soma dos numeros digitados e " + soma);
				
				break;
				
			}
			
			case 7:{
				
				int[] arraySoma = new int[5];
				
				int soma = 0;
				
				System.out.println("Digite 5 numeros para preencher o array!");
				
				for(int i=0; i<arraySoma.length; i++) {
					
					arraySoma[i] = texto.nextInt();
					
					soma += arraySoma[i];
				}
				
				System.out.println("Os numeros digitados foram: " + Arrays.toString(arraySoma));
				System.out.println("E a soma desses e igual a " + soma);
				
				break;
				
			}
			
			case 8:{
				
				texto.nextLine();
				
				System.out.println("Digite 5 nomes para adicionar a lista!");
				
				ArrayList<String> arrayNomes = new ArrayList<>();
				
				String nome;
				
				for(int i=0; i<5; i++) {
					
					nome = texto.nextLine();
					
					arrayNomes.add(nome);
				
				}
				
				System.out.println("Essa e a lista de nomes: " + arrayNomes);
				
				System.out.println("\nDigite um nome para saber se ele esta na sua lista!");
				
				String nomeBusca = texto.nextLine();
				
				if(arrayNomes.contains(nomeBusca)) {
					
					System.out.println("O nome " + nomeBusca + " esta na lista!");
				}else {
					
					System.out.println("O nome " + nomeBusca + " nao esta na lista!");
				}
				
				break;
				
			}
			
			case 9:{
				
				int[] array9 = {100,1,77,91,0,32,89,50, 99, 200};
				
				System.out.println("Mostrando os numeros maiores que 50!");
				
				for(int i=0; i < array9.length; i++) {
					
					if(array9[i] > 50) {
						
						System.out.print(array9[i] + " ");
					}
					
				}
				System.out.println();
				break;
			}
			
			case 10:{
				
				// inicializando arraylists paralelos
				
				ArrayList<Integer> arrayConta = new ArrayList<>();
				
				ArrayList<String> arrayNome = new ArrayList<>();
				
				ArrayList<Double> arraySaldo = new ArrayList<>();
				
				int opcaoMenuBanco = 0;
				
				while(opcaoMenuBanco != 6) {
					
					System.out.println("===== MENU BANCO ====="
							+ "\n1- Criar nova conta."
							+ "\n2- Depositar"
							+ "\n3- Sacar"
							+ "\n4- Ver saldo de uma conta"
							+ "\n5- Listar todas as contas"
							+ "\n6- Sair");
					
					opcaoMenuBanco = texto.nextInt();
					
					
					switch (opcaoMenuBanco) {
					case 1: {
						
						
						System.out.println("Digite seu nome!");
						
						texto.nextLine();
						
						String nomeCliente = texto.nextLine();
						
						arrayNome.add(nomeCliente);
						
						System.out.println("Digite um numero inteiro de ate 4 digitos!");
						
						int numeroConta;
						
						int contador = 0;
						
						boolean contaValida = false;
						
						while(!contaValida) {
							
							numeroConta = texto.nextInt();
							
							if(arrayConta.contains(numeroConta)) {
								
								System.out.println("Esse numero de conta ja existe! Tente novamente!");
								
							}else {
								System.out.println("O numero da conta e valido! Adicionando sua conta...");
								
								arrayConta.add(numeroConta);
								
								contador++;
								
								arraySaldo.add(0.0);
								
								contaValida = true;
								
							}
							
							
						}
						
						break;
					}
					
					case 2:{
						
						System.out.println("Digite o numero da sua conta");
						
						int numeroConta = texto.nextInt();
						
						if(!arrayConta.contains(numeroConta)) {
							
							System.out.println("Essa conta nao existe!");
							break;
						}else {
							
							System.out.println("Digite o valor que deseja depositar");
							
							double valorDeposito = texto.nextDouble();
							
							int index = arrayConta.indexOf(numeroConta);
							
							arraySaldo.set(index, arraySaldo.get(index) + valorDeposito);
							
							double saldoNovo =  arraySaldo.get(index);
							
							String mensagem = String.format("Deposito feito com sucesso! Seu saldo atual e de R$ %,.2f", saldoNovo);
							
							System.out.println(mensagem);
						}
						
						break;
					}
					
					case 3:{
						
						System.out.println("Digite o numero da sua conta");
						
						int numeroConta = texto.nextInt();
						
						if(!arrayConta.contains(numeroConta)) {
							
							System.out.println("Essa conta nao existe!");
							break;
						}else {
							
							System.out.println("Digite o valor que deseja sacar");
							
							int index = arrayConta.indexOf(numeroConta);
							
							double valorSaque = texto.nextDouble();
							
							double saldoAtual =  arraySaldo.get(index);
							
							if(valorSaque <= saldoAtual) {
								
								arraySaldo.set(index, arraySaldo.get(index) - valorSaque);
								
								double saldoNovo =  arraySaldo.get(index);
								
								String mensagem = String.format("Saque feito com sucesso! Seu saldo atual e de R$ %,.2f", saldoNovo);
								
								System.out.println(mensagem);
								
								
							}else {
								
								System.out.println("Seu saldo e insuficiente para esse saque.");
								break;
							}
							
							
							
						}
						
						break;
					}
					
					case 4: {
						
						System.out.println("Digite o numero da sua conta");
						
						int numeroConta = texto.nextInt();
						
						if(!arrayConta.contains(numeroConta)) {
							
							System.out.println("Essa conta nao existe!");
							break;
						}else {
							
							int index = arrayConta.indexOf(numeroConta);
							
							double saldoAtual =  arraySaldo.get(index);
							
							String mensagem = String.format("Seu saldo atual e de R$ %,.2f", saldoAtual);
							
							System.out.println(mensagem);
						}
						
						break;
						
					}
					
					case 5:{
						
						System.out.println("Listando todas as contas!");
						
						System.out.println(arrayConta.toString());
						
						break;
						
					}
					
					case 6:{
						
						System.out.println("Saindo do banco...");
						opcaoMenuBanco = 6;
						break;
					}
					
					default: {
						
						System.out.println("Voce digitou um numero invalido");
						break;
					}
						
						
					}
				}
				
				break;
			}
			
			case 11:{
				
				System.out.println("Voce esta saindo do sistema....");
				break;
			}

			default:{
				System.out.println("Voce digitou um numero invalido, redirecionando...");
				
				break;
			}
				
			}
			
		}while(opcaoMenu != 11);
		
		System.out.println("Ate mais!");
		

	}

}
