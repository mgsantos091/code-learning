package excercicioJavaUti;

public class ContaPoupanca extends Conta implements Comparable<ContaPoupanca> {

	public ContaPoupanca(int i, String string) {
		this.numero = i;
		this.nome = string;
	}
	
	public ContaPoupanca() {
		this.numero = 0;
		this.nome = "";
	}

	@Override
	public int compareTo(ContaPoupanca outra) {
		return this.getNumero() - outra.getNumero();
	}

	public void deposita(double d) {
		
	}
}