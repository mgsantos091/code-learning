package alura.excercicioJavaUti;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestaPerformanceDeAdicionarNaPrimeiraPosicao {
    public static void main(String[] args) {
        System.out.println("Iniciando...");
        long inicio = System.currentTimeMillis();

        // trocar depois por ArrayList                
//        List<Integer> teste = new LinkedList<>(); // Tempo gasto: 0.009
        List<Integer> teste = new ArrayList<>(); // Tempo gasto: 0.269 // LinkedList é melhor para remover/adicionar
        // objetos nas pontas

        for (int i = 0; i < 30000; i++) {
            teste.add(0, i);
        }

        long fim = System.currentTimeMillis();
        double tempo = (fim - inicio) / 1000.0;
        System.out.println("Tempo gasto: " + tempo);
    }
}