package br.com.alura.threads.aula6;

/**
 * wait() e notify() sempre devem ser chamados dentro de um bloco synchronized;
 * Temos que ter cuidado para não mandar um thread esperar quando não há necessidade;
 */

public class Program6 {
    public static void main(String[] args) {

        Lista lista = new Lista();

        for (int i = 0; i < 100; i++) {
            new Thread(new TarefaAdicionarElemento(lista, i)).start();
        }

        new Thread(new TarefaImprimir(lista), "Imprimir: ").start();

    }
}
