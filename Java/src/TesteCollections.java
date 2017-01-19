import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TesteCollections {
	public static void main(String args[]) {
		ContaCorrente o1 = new ContaCorrente();
		o1.setCorrentista("Objeto 1");
		o1.setSaldo(900d);
		
		ContaCorrente o2 = new ContaCorrente();
		o2.setCorrentista("Objeto 2");
		o2.setSaldo(200d);
		
		ContaCorrente o3 = new ContaCorrente();
		o3.setCorrentista("Objeto 3");
		o3.setSaldo(300d);
		
		ContaCorrente o4 = new ContaCorrente();
		o4.setCorrentista("Objeto 4");
		o4.setSaldo(200d);
		
		List<ContaCorrente> lista = new ArrayList<ContaCorrente>();
		lista.add(o1);
		lista.add(o2);
		lista.add(o3);
		lista.add(o4);
		
		System.out.println(lista);
		
		Collections.sort(lista);
		
		System.out.println(lista);
		
	}

	private static class ContaCorrente implements Comparable<ContaCorrente> {
		private Double saldo;
		private String correntista;

		public Double getSaldo() {
			return saldo;
		}

		public String getCorrentista() {
			return correntista;
		}

		public void setSaldo(Double saldo) {
			this.saldo = saldo;
		}

		public void setCorrentista(String correntista) {
			this.correntista = correntista;
		}

		/*
		 * deve retornar zero, se o objeto comparado for igual a este objeto, 
		 * um número negativo, se este objeto for menor que o objeto dado, 
		 * e um número positivo, se este objeto for maior que o objeto dado
		 * */
		@Override
		public int compareTo(ContaCorrente o) {
			if(saldo < o.getSaldo()) return -1;
			else if (saldo > o.getSaldo()) return 1;
			else return 0;
//			return this.saldo.compareTo(o.getSaldo());
//			return o.getSaldo().compareTo(this.saldo);
		}
		
		@Override
		public String toString() {
			return correntista;
		}
		
	}

}
