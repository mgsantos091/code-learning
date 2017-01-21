package alura.excercicioJavaUti;

import java.util.HashSet;
import java.util.Set;

public class TestaHashSetDeConta {

    public static void main(String[] args) {
        Set<Conta> contas = new HashSet<Conta>();

        ContaCorrente c1 = new ContaCorrente(123, "Mauricio");
        ContaCorrente c2 = new ContaCorrente(123, "Adriano");
        ContaCorrente c3 = new ContaCorrente(444, "Luiz");

        contas.add(c1);
        contas.add(c2);
        contas.add(c3);

        System.out.println("Total de contas no HashSet: " + contas.size());
    }
}