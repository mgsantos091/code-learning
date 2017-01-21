package alura.excercicioJavaUti;

import java.util.Set;
import java.util.TreeSet;

public class TestaTreeSetDecrescente {
	public static void main(String args[]) {
		TreeSet<Integer> conjunto = new TreeSet<Integer>();
		for(int i=0; i<=1000; i++)
			conjunto.add(i);
		Set<Integer> conjuntoOrdenado = conjunto.descendingSet();
		for(Integer x : conjuntoOrdenado)
			System.out.print(x+" ");
	}
}
