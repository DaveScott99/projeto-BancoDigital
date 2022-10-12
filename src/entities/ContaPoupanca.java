package entities;

public class ContaPoupanca extends Conta {
	
	public ContaPoupanca(Cliente cliente, Banco banco, String tipoConta) {
		super(cliente, banco, tipoConta);
	}

	@Override
	public void extrato() {
		System.out.println("*** Extrato Conta Poupança ***");
		super.imprimirInfosComuns();
	}
}
