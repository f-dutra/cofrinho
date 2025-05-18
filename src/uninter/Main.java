package uninter;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		Menu menu = new Menu();
		Moeda moeda;
		Cofrinho cofrinho = new Cofrinho();
				
		int opt = 5, tipo = 5;
		double valor, valorConvertido;
		
		System.out.println("Feito por Felipe da Rosa Dutra Junior");
		while(opt != 0) {
			menu.principal();
			opt = scan.nextInt();
			switch(opt) {
			// Adicionar moeda
			case 1:
				while(tipo > 3 || tipo < 0) {
					menu.adicionar();
					tipo = scan.nextInt();
					moeda = null;
					switch(tipo) {
					// Real
					case 1:
						System.out.println("Digite o valor:");
						valor = scan.nextDouble();
						moeda = new Real(valor);
						break;
					// Dolar
					case 2:
						System.out.println("Digite o valor:");
						valor = scan.nextDouble();
						moeda = new Dolar(valor);
						break;
					// Euro
					case 3:
						System.out.println("Digite o valor:");
						valor = scan.nextDouble();
						moeda = new Euro(valor);
						break;
					// Voltar
					case 0:
						break;
					default:
						System.out.println("Opção inválida!!");
					}
					
					// evita que a moeda seja adicionada com valor null ao selecionar a opção 0
					if(moeda != null) {
						cofrinho.adicionar(moeda);
					}
				}
				break;
			// Remover moeda
			case 2:
				while(tipo > 3 || tipo < 0) {
					menu.remover();
					tipo = scan.nextInt();
					moeda = null;
					switch(tipo) {
					// Real
					case 1:
						System.out.println("Digite o valor:");
						valor = scan.nextDouble();
						moeda = new Real(valor);
						break;
					// Dolar
					case 2:
						System.out.println("Digite o valor:");
						valor = scan.nextDouble();
						moeda = new Dolar(valor);
						break;
					// Euro
					case 3:
						System.out.println("Digite o valor:");
						valor = scan.nextDouble();
						moeda = new Euro(valor);
						break;
					// Voltar
					case 0:
						break;
					default:
						System.out.println("Opção inválida!!");
					}
					
					// evita que a moeda seja adicionada com valor null ao selecionar a opção 0
					if(moeda != null) {
						cofrinho.remover(moeda);
					}
				}
				break;
			// Listar moedas
			case 3:
				cofrinho.listagemMoedas();
				break;
			// Total convertido
			case 4:
				valorConvertido = cofrinho.totalConvertido();
				System.out.println("Valor total convertido: R$"+ valorConvertido);
				break;
			// Sair
			case 0:
				break;
			default:
				System.out.println("Opção inválida!!");
			}
			tipo = 5;
		}
	}
}
