package br.com.alura.estruturaDados.aula5;

import java.util.LinkedList;
import java.util.List;

public class Fila {

    List<String> alunos = new LinkedList<>();

    public void adiciona(String nome) {
        alunos.add(nome);
    }

    public String remove() {
        return alunos.remove(0);
    }

    public boolean estaVazia() {
        return alunos.isEmpty();
    }

    @Override
    public String toString() {
        return "Alunos: " + alunos.toString();
    }
    
}
