package br.com.alura.estruturaDados.aula2;

/**
 * Lista Ligada possui uma seta apontando para a próxima celula
 * Vantagens: Inseri ou remove elementos no fim da lista de forma rápida
 * Desvantagens:
 */

public class Main {
    public static void main(String[] args) {

        ListaLigada listaLigada = new ListaLigada();

        System.out.println(listaLigada);
        listaLigada.adicionaComeco("Mauricio");
        listaLigada.adicionaComeco("Paulo");
        System.out.println(listaLigada);
        listaLigada.adicionaComeco("Guilherme");
        listaLigada.adicionaComeco("João");
        System.out.println(listaLigada);

        listaLigada.adicionaFim("Marcelo");
        System.out.println(listaLigada);

        listaLigada.adicionaMeio(2, "Gabriel");
        System.out.println(listaLigada);

        Object x = listaLigada.pega(2);
        System.out.println(x);

        System.out.println(listaLigada.tamanho());

        listaLigada.removeComeco();
        System.out.println(listaLigada);

    }
}
