package alura;

import alura.excercicioJavaUti.Conta;

public class FazDeposito implements Runnable {

	private Conta conta;

	public FazDeposito(Conta conta) {
		this.conta = conta;
	}
	
	@Override
	public void run() {
		this.conta.deposita(100.0);
	}

}
