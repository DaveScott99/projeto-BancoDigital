package services;

import entities.Conta;

public interface IBanco {
	
	void sacar(double valor);
	
	void depositar(double valor);
	
	void transferir(Conta contaDestino, double valor);
	
	void extrato();
		
}
