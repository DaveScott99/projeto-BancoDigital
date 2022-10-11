package entities;

public class ContaPoupanca {
	
	private int agencia;
	private int numero;
	private double saldo;
	
	public ContaPoupanca() {
	}
	
	public ContaPoupanca(int agencia, int numero, double saldo) {
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = saldo;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void sacar() {
		
	}
	
	public void depositar() {
		
	}
	
	public void transferir() {
		
	}
	
	
}
