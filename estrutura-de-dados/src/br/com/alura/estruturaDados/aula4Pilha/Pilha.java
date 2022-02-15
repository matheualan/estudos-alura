package br.com.alura.estruturaDados.aula4Pilha;

import java.util.LinkedList;
import java.util.List;

public class Pilha {

    private List<String> nomes = new LinkedList<>();

//    insere na lista
    public void push(String nome) {
        nomes.add(nome);
    }
//    remove da lista
    public String pop() {
        return nomes.remove(nomes.size() -1);
    }

    public boolean vazia() {
        return nomes.isEmpty() ;
    }

    @Override
    public String toString() {
        return "Pilha: " + nomes.toString();
    }

}
