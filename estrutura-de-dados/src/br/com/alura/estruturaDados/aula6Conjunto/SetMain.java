package br.com.alura.estruturaDados.aula6Conjunto;

import java.util.HashSet;
import java.util.Set;

/**
 * [Conjuntos organizam os elementos por meio de espalhamento de várias tabelinhas dentro de uma tabela mãe]
 * [Conjuntos não aceitam elementos repetidos espalhando os elementos muito bem para ficar fácil fazer uma pesquisa
 * se os elementos já existem ou não]
 * [A implementação HashSet<> faz seu espalhamento usando o método hashCode() herdado de Object]
 */

public class SetMain {
    public static void main(String[] args) {

        Conjunto conjunto = new Conjunto();
        conjunto.adiciona("Mauricio");
        conjunto.adiciona("Guilherme");
        System.out.println(conjunto);
        conjunto.adiciona("Mauricio");
        conjunto.adiciona("Marcelo");
        conjunto.adiciona("Alfreddo");
        conjunto.adiciona("Abigail");
        System.out.println(conjunto);

        conjunto.remove("Mauricio");
        System.out.println(conjunto);

        Set<String> conjuntoDoJava = new HashSet<>();
        conjuntoDoJava.add("Mauricio");
        conjuntoDoJava.add("Paula");
        System.out.println(conjuntoDoJava);

        String x = "Matheus";
        x.hashCode();
        System.out.println(x.hashCode());
        System.out.println("Matheus".hashCode());
        System.out.println("Matheus".hashCode());

    }
}
