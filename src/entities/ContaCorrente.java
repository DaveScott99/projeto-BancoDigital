package entities;

public class ContaCorrente extends Conta {

	public ContaCorrente(Cliente cliente, Banco banco, String tipoConta) {
		super(cliente, banco, tipoConta);
	}

	@Override
	public void extrato() {
		System.out.println("*** Extrato Conta Corrente ***");
		super.imprimirInfosComuns();
	}

}
