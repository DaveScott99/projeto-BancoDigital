package entities;

public class ContaPoupanca extends Conta {
	
	public void extrato() {
		System.out.println("*** Extrato Conta Poupança ***");
		super.imprimirInfosComuns();
	}
}
