package application;

import entities.Conta;
import entities.ContaCorrente;
import entities.ContaPoupanca;

public class Main {

	public static void main(String[] args) {
		
		Conta cCorrente = new ContaCorrente();
		Conta cPoupanca = new ContaPoupanca();
		
		cCorrente.depositar(100.00);
		cCorrente.transferir(cPoupanca, 100.00);
		
		cCorrente.extrato();
		cPoupanca.extrato();
		
	}

}
