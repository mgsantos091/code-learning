package excercicioJavaUti;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TesteOrdenacao {
	public static void main(String args[]) {
		List<ContaPoupanca> lista = new ArrayList<ContaPoupanca>();
		
		ContaPoupanca c1 = new ContaPoupanca();
		c1.numero = 10;
		
		ContaPoupanca c2 = new ContaPoupanca();
		c2.numero = 20;
		
		ContaPoupanca c3 = new ContaPoupanca();
		c3.numero = 30;
		
		lista.add(c2);
		lista.add(c1);
		lista.add(c3);
		
		System.out.println(lista);
		
		Collections.sort(lista);
		
		System.out.println(lista);
		
	}
}
