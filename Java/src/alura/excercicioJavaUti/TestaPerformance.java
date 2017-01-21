package alura.excercicioJavaUti;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

// Crie um c�digo que insira 30 mil n�meros numa ArrayList e pesquise-os. Vamos usar um m�todo de System para cronometrar o tempo gasto:
public class TestaPerformance {
	public static void main(String[] args) {
		System.out.println("Iniciando...");
//		Collection<Integer> teste = new ArrayList<>(); // Tempo gasto: 407
// No caso das listas (ArrayList e LinkedList), a inser��o � bem r�pida e a busca muito lenta!

        Collection<Integer> teste = new HashSet<>(); // Tempo gasto: 11
        // No caso dos conjuntos (TreeSet e HashSet), a inser��o ainda � r�pida, embora um pouco mais lenta do que a das listas. E a busca � muito r�pida!
		long inicio = System.currentTimeMillis();

		int total = 30000;

		for (int i = 0; i < total; i++) {
			teste.add(i);
		}

		for (int i = 0; i < total; i++) {
			teste.contains(i);
		}

		long fim = System.currentTimeMillis();
		long tempo = fim - inicio;
		System.out.println("Tempo gasto: " + tempo);
	}
}
