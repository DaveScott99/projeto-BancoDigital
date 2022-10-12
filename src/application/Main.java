package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Banco;
import entities.Cliente;
import entities.Conta;
import entities.ContaCorrente;
import entities.ContaPoupanca;

public class Main {

	static Scanner sc = new Scanner(System.in);
	
	static Conta contaCorrente;
	static Conta contaPoupanca;
	static List<ContaCorrente> contasCC = new ArrayList<>();
	static List<ContaPoupanca> contasPP = new ArrayList<>();
	
	
	public static void main(String[] args) {
		
		menuBanco();
		
	}
	
	public static void menuBanco() {
		
		int resp = 1;
		
		do {
			
			System.out.println();
			
			System.out.println(" ----- MENU BANCO ----- ");
			System.out.println("1 - Criar conta");
			System.out.println("2 - Clientes");
			System.out.println("3 - Menu conta");
			System.out.println("0 - Sair");
			
			resp = sc.nextInt();
			
			switch (resp) {
			case 1:
				criarConta();
				break;
			case 2:
				System.out.println("1 - Conta corrente");
				System.out.println("2 - Conta poupança");
				
				resp = sc.nextInt();
				
				if (resp == 1) {
					System.out.println(" ---- Lista de Clientes Cadastrados ---- ");
					for (Conta c : contasCC) {
						System.out.println(c.getNumero() + "  " + c.getAgencia() + "  " + c.getCliente().getNome() + "  " + c.getBanco().getNome() + "  " + c.getTipoConta());
					}
					
				}
				if (resp == 2) {
					System.out.println(" ---- Lista de Clientes Cadastrados ---- ");
					for (Conta c : contasPP) {
						System.out.println(c.getNumero() + "  " + c.getAgencia() + "  " + c.getCliente().getNome() + "  " + c.getBanco().getNome() + "  " + c.getTipoConta());
					}
				}
				
				break;
			case 3:
				menuConta();
				break;
			}
			
		} while (resp > 0);
		
	}
	
	public static void menuConta() {
		
		System.out.println(" ----- MENU CONTA ----- ");
		System.out.println("1 - Depositar");
		System.out.println("2 - Sacar");
		System.out.println("3 - Transferir");
		System.out.println("4 - Extrato");
		
		int resp = sc.nextInt();
		
		switch (resp) {
		case 1:
			System.out.print("Digite o valor do depósito: R$ ");
			double valor = sc.nextDouble();
			contaCorrente.depositar(valor);
			break;
		case 2:
			System.out.print("Digite o valor do saque: R$ ");
			valor = sc.nextDouble();
			contaCorrente.sacar(valor);
			break;
		case 3:
			System.out.print("Digite o valor que irá transferir: R$ ");
			valor = sc.nextDouble();
			contaCorrente.transferir(contaPoupanca, valor);
		case 4:
			System.out.println("1 - Extrato conta corrente");
			System.out.println("2 - Extrato conta poupança");
			resp = sc.nextInt();
			
			if (resp == 1) {
				System.out.println();
				contaCorrente.extrato();
			}
			
			if (resp == 2) {
				System.out.println();
				contaPoupanca.extrato();
			}
			
			break;
		}
		
	}
	
	public static void criarConta() {
		
		sc.nextLine();
		
		System.out.print("Digite o nome do banco: ");
		String nomeBanco = sc.nextLine();
		
		System.out.print("Digite o nome do titular: ");
		String nomeCliente = sc.nextLine();
	
		System.out.println("Qual conta deseja criar? ");
		System.out.println("1 - Conta corrente");
		System.out.println("2 - Conta poupança");
		int resp = sc.nextInt();
			if (resp == 1) {
				contaCorrente = new ContaCorrente(new Cliente(nomeCliente), new Banco(nomeBanco), "Corrente");
				contasCC.add((ContaCorrente) contaCorrente);
			}
			if (resp == 2) {
				contaPoupanca = new ContaPoupanca(new Cliente(nomeCliente), new Banco(nomeBanco), "Poupanca");
				contasPP.add((ContaPoupanca) contaPoupanca);
			}
			
	}

}
