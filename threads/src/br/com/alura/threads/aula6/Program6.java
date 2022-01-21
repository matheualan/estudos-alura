package br.com.alura.threads.aula6;

public class Program6 {
    public static void main(String[] args) throws InterruptedException {

        Lista lista = new Lista();

        for (int i = 0; i < 100; i++) {
            new Thread(new TarefaAdicionarElemento(lista, i)).start();
        }

        new Thread(new TarefaImprimir(lista)).start();

    }
}
