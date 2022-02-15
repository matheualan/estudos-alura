package br.com.alura.estruturaDados.aula3ListaDupLigada;

/**
 * Lista Duplamente Ligada possui 2 setas apontando para a anterior e próxima celula
 * Vantagens: Remove elementos no fim da lista com mais facilidade
 */

public class Main {
    public static void main(String[] args) {

        ListaDuplamenteLigada listaDuplaLigada = new ListaDuplamenteLigada();

        System.out.println(listaDuplaLigada);
        listaDuplaLigada.adicionaComeco("Mauricio");
        listaDuplaLigada.adicionaComeco("Paulo");
        System.out.println(listaDuplaLigada);
        listaDuplaLigada.adicionaComeco("Guilherme");
        listaDuplaLigada.adicionaComeco("João");
        System.out.println(listaDuplaLigada);

        listaDuplaLigada.adicionaFim("Marcelo");
        System.out.println(listaDuplaLigada);

        listaDuplaLigada.adicionaMeio(2, "Gabriel");
        System.out.println(listaDuplaLigada);

        Object x = listaDuplaLigada.pega(2);
        System.out.println(x);

        System.out.println(listaDuplaLigada.tamanho());

        listaDuplaLigada.removeComeco();
        System.out.println(listaDuplaLigada);

        listaDuplaLigada.removeFim();
        System.out.println(listaDuplaLigada);

        listaDuplaLigada.adicionaComeco("Joseildo");
        listaDuplaLigada.adicionaMeio(2, "Joselitow");

        System.out.println(listaDuplaLigada);

        listaDuplaLigada.removeMeio(1);
        System.out.println(listaDuplaLigada);

        System.out.println(listaDuplaLigada.contem("Mauricio"));
        System.out.println(listaDuplaLigada.contem("DanDan"));

    }
}
