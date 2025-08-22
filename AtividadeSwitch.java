package Atividades;

import java.util.Scanner;


public class AtividadeSwitch {

	public static void main(String[] args) {
			
		Scanner texto = new Scanner(System.in);
		
		// Exercicio 1 -> Validacao de mes
		
//		System.out.println("Digite um numero de 1 a 12 para imprimir o nome do mes correspondente!");
//		
//		int numeroDoMes = texto.nextInt();
//		
//		String nomeDoMes = "";
//		
//		if (numeroDoMes >= 1 && numeroDoMes <= 12) {
//			
//			switch (numeroDoMes) {
//			case 1:{
//				nomeDoMes = "Janeiro";
//				System.out.println(nomeDoMes);
//				break;
//			}
//				
//			case 2:{
//				nomeDoMes = "Fevereiro";
//				System.out.println(nomeDoMes);
//				break;
//			}
//	
//			case 3:{
//				nomeDoMes = "Marco";
//				System.out.println(nomeDoMes);
//				break;
//			}
//				
//			case 4:{
//				nomeDoMes = "Abril";
//				System.out.println(nomeDoMes);
//				break;
//			}
//				
//			case 5:{
//				nomeDoMes = "Maio";
//				System.out.println(nomeDoMes);
//				break;
//			}
//				
//			case 6:{
//				nomeDoMes = "Junho";
//				System.out.println(nomeDoMes);
//				break;
//			}
//				
//			case 7:{
//				nomeDoMes = "Julho";
//				System.out.println(nomeDoMes);
//				break;
//			}
//				
//			case 8:{
//				nomeDoMes = "Agosto";
//				System.out.println(nomeDoMes);
//				break;
//			}
//				
//			case 9:{
//				nomeDoMes = "Setembro";
//				System.out.println(nomeDoMes);
//				break;
//			}
//				
//			case 10:{
//				nomeDoMes = "Outubro";
//				System.out.println(nomeDoMes);
//				break;
//			}
//				
//			case 11:{
//				nomeDoMes = "Novembro";
//				System.out.println(nomeDoMes);
//				break;
//			}
//				
//			case 12:{
//				nomeDoMes = "Dezembro";
//				System.out.println(nomeDoMes);
//				break;
//
//			}
//								
//		}}else {
//			
//			System.out.println("Mes invalido!");
//		}
	
		
		
		// Exercicio 2 -> cardapio com opcoes vegetarianas
		
//		System.out.println("Digite uma das opcoes a seguir: 1-Hambúrguer, 2-Pizza, 3-Salada.");
////		
//		int opcaoCardapio = texto.nextInt();
//		
//		switch(opcaoCardapio) {
//		
//			case 1:
//			{
//				System.out.println("Hamburguer");
//				break;
//			}
//			
//			case 2:
//				System.out.println("Gostaria de transformar esse pedido em uma versao vegetariana?");
//				System.out.println("Se sim, digite 1. Caso contrario, digite 2");
//				
//				int opcaoVegetariana = texto.nextInt();
//				if(opcaoVegetariana == 1) {
//					System.out.println("Pizza vegetariana");
//				}else {
//					System.out.println("Pizza normal");
//				}
//				break;
//			case 3:
//				System.out.println("Salada");
//				break;
//			default:{
//				System.out.println("Opcao invalida!");
//				break;
//			}
//		}
//		
		// Exercicio 3-> Tarifa de Transporte
		
//		System.out.println("Digite sua categoria de usuario:"
//				+ "\n Estudante"
//				+ "\n Aposentado"
//				+ "\n Regular");
//		
//		char categoriaUsuario = texto.next().toLowerCase().charAt(0);
//		
//		System.out.println("E horario de pico? Digite sim ou nao!");
//		
//		boolean horarioDePico = texto.next().toLowerCase().charAt(0) == 's';
//		
//		double tarifa = 0;
//		
//		if(horarioDePico) {
//			
//			tarifa = 5.50;
//			System.out.println("A tarifa no horario de pico e: R$" + tarifa);
//		}else {
//			switch(categoriaUsuario) {
//			
//			case 'e': {
//				tarifa = 5.50/2;
//				break;
//			}
//			case 'a': {
//				tarifa = 0;
//				break;
//			}
//			case 'r': {
//				tarifa = 4.40;
//				break;
//			}
//			default:{
//				System.out.println("Digite uma opcao valida!");
//				break;
//			}
//		}
//		
//		String messageString = String.format("O preco da tarifa e R$ %.2f", tarifa);
//		System.out.println(messageString);
		
		
		// Exercicio 4 -> Sistema de notas com conceito
		
//		System.out.println("Digite sua nota.");
//		
//		double nota = texto.nextDouble();
//		
//		String status = "";
//		
//		if(nota < 5) {
//			status = "Reprovado";
//		}else if(nota >= 5 && nota <= 7) {
//			status = "Recuperacao";
//		}else {
//			status = "Aprovado";
//		}
//		
//		System.out.println("Seu status e: " + status);
//		
//		switch (status) {
//		case "Aprovado":{
//			System.out.println("Parabens! Continue assim!");
//			break;
//		}
//			
//		default:{
//			System.out.println("Houve um erro");
//			break;
//		}
//			
//			
//		}
		
		// Exercicio 5-> Operacoes Bancarias
		
//		double saldo = 500.00;
//		
//		System.out.println("Qual operacao bancaria desejaria realizar?"
//				+ "\nSaque - digite saque"
//				+ "\nDeposito - digite deposito");
//		
//		char operacao = texto.next().toLowerCase().charAt(0);
//		
//		if(operacao == 's') {
//			System.out.println("Digite o valor a ser sacado.");
//			
//			double valorSaque = texto.nextDouble();
//			
//			if(valorSaque <= saldo) {
//				System.out.println("Tudo certo, voce tem saldo suficiente para sacar!");
//				
//				saldo = saldo - valorSaque;
//				
//				String mensagemComSaldo = String.format("Seu salto atual e de R$ %,.2f", saldo);
//				
//				System.out.println(mensagemComSaldo);
//			}else if(operacao == 'd') {
//				
//				System.out.println("Digite o valor que deseja depositar");
//				
//				double valorDeposito = texto.nextDouble();
//				
//				saldo = saldo + valorDeposito;
//				
//				String mensagemComSaldo = String.format("Seu salto atual e de R$ %,.2f", saldo);
//				
//				System.out.println(mensagemComSaldo);
//			}else {
//				System.out.println("Voce digitou uma opcao invalida, tente novamente!");
//			}
//		}
		
		
		// Exercicio 6 -> Valor pedagio
		
		
//		System.out.println("Digite seu tipo de veiculo com os numeros a seguir:"
//				+ "\n1 - Moto;"				
//				+ "\n2 - Carro;"
//				+ "\n3 - Caminhao.");
//		
//		int opcaoVeiculo = texto.nextInt();
//		
//		String tipoVeiculoString = "";
//		
//		double valorBase = 0;
//		
//		switch (opcaoVeiculo) {
//		case 1: {
//			tipoVeiculoString = "moto";
//			valorBase = 5;
//			break;
//		}
//		case 2:{
//			tipoVeiculoString = "carro";
//			valorBase = 15;
//			break;
//		}
//		case 3:{
//			tipoVeiculoString = "caminhao";
//			valorBase = 30;
//			
//			System.out.println("Seu caminhao tem eixo extra? Digite sim ou nao.");
//			
//			boolean eixoExtra = texto.next().toLowerCase().charAt(0) == 's';
//			
//			if(eixoExtra) {
//				valorBase = valorBase + 10;
//			}else {
//				valorBase = 30;
//			}
//			
//			break;
//		}
//		default:{
//			System.out.println("Voce digitou uma opcao invalida!");
//			texto.close();
//			return;
//		}
//			
//	}
//		
//	
//		String mensagem = String.format("O valor total a ser pago e de R$ %.2f", valorBase);
//		System.out.println(mensagem);
		
		
		// Exercicio 7 -> Login com Nível de Acesso
		
		
//		String senhaCorreta = "java123";
//		
//		String usuarioAdmin = "admin";
//		
//		String usuarioMid = "usuario";
//		
//		String usuarioGuest = "guest";
//		
//		System.out.println("Digite seu tipo de usuario!");
//		
//		String usuario = texto.next().toLowerCase();
//		
//		System.out.println("Digite a senha do sistema.");
//		
//		String senha = texto.next();
//		
//		if((usuario.equals(usuarioAdmin) || usuario.equals(usuarioMid) 
//				|| usuario.equals(usuarioGuest)) && senha.equals(senhaCorreta)) {
//			
//			switch (usuario) {
//			case "admin": {
//				System.out.println("Voce tem acesso completo ao sistema!");
//				break;
//			}
//			case "usuario":{
//				System.out.println("Voce tem acesso parcial ao sistema!");
//				break;
//			}
//			case "guest":{
//				System.out.println("Voce tem acesso de vizualicao do sistema!");
//				break;
//			}
//			default:
//				System.out.println("Seu usuario e invalido!");
//				break;
//			}
//		}else {
//			System.out.println("Senha ou usuario invalidos!");
//		}
//		
		// Exercicio 8 -> Estações do Ano
		
//		System.out.print("Digite o número do mês (1 a 12): ");
//        
//		int mes = texto.nextInt();
//		
//		// usando switch expression
//
//        String estacao = switch (mes) {
//        case 12, 1, 2 -> "Verão";
//        case 3, 4, 5 -> "Outono";
//        case 6, 7, 8 -> "Inverno";
//        case 9, 10, 11 -> "Primavera";
//        default -> "Mês inválido";
//        };
//        
//        System.out.println("Estação: " + estacao);
//
//        // mensagem extra só para o inverno
//        if (estacao.equals("Inverno")) {
//            System.out.println("Época de chocolate quente!");
//        }
		
		// Exercicio 9 -> Calculadora Inteligente
        
//        System.out.println("Digite o primeiro número:");
//        double numero1 = texto.nextDouble();
//
//        System.out.println("Digite o segundo número:");
//        double numero2 = texto.nextDouble();
//
//        System.out.println("Digite a operação (+, -, *, /):");
//        char operacao = texto.next().charAt(0);
//
//        double resultado = 0;
//        boolean operacaoValida = true;
//
//        switch (operacao) {
//            case '+': {
//                resultado = numero1 + numero2;
//                break;
//            }
//            case '-': {
//                resultado = numero1 - numero2;
//                break;
//            }
//            case '*': {
//                resultado = numero1 * numero2;
//                break;
//            }
//            case '/': {
//                if (numero2 != 0) {
//                    resultado = numero1 / numero2;
//                } else {
//                    System.out.println("Erro: Divisão por zero não é permitida.");
//                    operacaoValida = false;
//                }
//                break;
//            }
//            default: {
//                System.out.println("Operação inválida!");
//                operacaoValida = false;
//                break;
//            }
//        }
//
//        if (operacaoValida) {
//            System.out.println("Resultado: " + resultado);
//        }
//		
		texto.close();

	}
}

	

