package br.com.alura.estruturaDados.aula6Conjunto;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Conjunto {

    private ArrayList<LinkedList<String>> table = new ArrayList<LinkedList<String>>();

    public Conjunto() {
        for (int i = 0; i < 26; i++) {
            table.add(new LinkedList<String>());
        }
    }

    public void adiciona(String palavra) {
        if (!contem(palavra)) {
            int index = calculaIndiceTabela(palavra);
            List<String> lista = table.get(index);
            lista.add(palavra);
        }
    }

    public void remove(String palavra) {
        if (contem(palavra)) {
            int index = calculaIndiceTabela(palavra);
            List<String> lista = table.get(index);
            lista.remove(palavra);
        }
    }

    private boolean contem(String palavra) {
        int index = calculaIndiceTabela(palavra);
        return table.get(index).contains(palavra);
    }

    private int calculaIndiceTabela(String palavra) {
        return palavra.toLowerCase().charAt(0) % 26; //Pega o resto da divisão de 26 pelo código ASCII pego no charAt
    }

    @Override
    public String toString() {
        return "Set {Table's = " + table + "}";
    }

}
