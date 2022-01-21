package br.com.alura.threads.aula6;

public class Lista {

    private String[] elementos = new String[1000];
    private int indice = 0;

    public synchronized void adicionaElementos(String elemento) {
        this.elementos[indice] = elemento;
        this.indice++;
        standBy(5000);

        if (this.indice == this.elementos.length) {
            this.notify();
        }
    }

    public int tamanho() {
        return this.elementos.length;
    }

    public String pegaElemento(int posicao) {
        return this.elementos[posicao];
    }

    private void standBy(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
