package br.com.alura.estruturaDados.aula5;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Para inserir elementos na fila usa-se 'add' e para remover 'poll',
 * e 'peek' fala qual o último elemento da pilha que seria removido.
 */

public class Main {
    public static void main(String[] args) {

        Fila fila = new Fila();
        System.out.println("Lista vazia? " + fila.estaVazia());

        fila.adiciona("Mauricio");
        fila.adiciona("Gabriel");
        System.out.println(fila);

        String remove1 = fila.remove();
        System.out.println("Removido: " + remove1);
        System.out.println(fila);

        System.out.println("Lista vazia? " + fila.estaVazia());

        Queue<String> filaDoJava = new LinkedList<>();
        filaDoJava.add("Marcondes");
        filaDoJava.poll(); //Remove, mesmo que pop
        System.out.println(filaDoJava.peek());

    }
}
