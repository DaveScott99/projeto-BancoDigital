package entities;

import services.IBanco;

public abstract class Conta implements IBanco {
	
	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;
	
	
	protected int agencia;
	protected int numero;
	protected double saldo;
	protected String tipoConta;
	
	protected Cliente cliente;
	protected Banco banco;
	
	public Conta(Cliente cliente, Banco banco, String tipoConta) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
		this.banco = banco;
		this.tipoConta = tipoConta;
	}
	
	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public Banco getBanco() {
		return banco;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public String getTipoConta() {
		return tipoConta;
	}

	@Override
	public void sacar(double valor) {
		
		if (valor > this.saldo) {
			System.out.println("Saldo insuficiente!!");
		}
		else {
			this.saldo -= valor;
		}
		
	}

	@Override
	public void depositar(double valor) {
		this.saldo += valor;
	}

	@Override
	public void transferir(Conta contaDestino, double valor) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}
	
	protected void imprimirInfosComuns() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Banco: %s", banco.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Conta: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}

}
