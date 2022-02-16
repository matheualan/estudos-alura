package br.com.alura.estruturaDados.aula4Pilha;

import java.util.Stack;

/**
 * Para inserir elementos na pilha usa-se 'push' e para remover 'pop',
 * e 'peek' fala qual o último elemento da pilha que seria removido.
 */

public class PilhaMain {
    public static void main(String[] args) {

        Pilha pilha = new Pilha();

        pilha.push("Mauricio");
        System.out.println(pilha);
        pilha.push("Guilherme");
        System.out.println(pilha);

        String remove1 = pilha.pop();
        System.out.println("Removido: " + remove1);
        String remove2 = pilha.pop();
        System.out.println("Removido: " + remove2);
        System.out.println(pilha.vazia());
        pilha.push("Marcelo");
        System.out.println(pilha.vazia());
        System.out.println(pilha);

        System.out.println();

        Stack<String> stack = new Stack<>();
        stack.push("Godofredo");
        stack.push("Mauriceia");
        System.out.println(stack);
        String stackRemove = stack.pop();
        System.out.println("Removido: " + stackRemove);
        System.out.println(stack);
        stack.push("Mafray");
        String nome = stack.peek();
        System.out.println("Peek: " + nome);
        System.out.println(stack);

    }
}
