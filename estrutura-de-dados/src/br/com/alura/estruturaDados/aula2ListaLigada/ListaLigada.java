package br.com.alura.estruturaDados.aula2ListaLigada;

public class ListaLigada {

    private Celula primeira = null;
    private Celula ultima = null;
    private int totElementos = 0;

    public void adicionaComeco(Object elemento) {
        Celula novaCelula = new Celula(elemento, primeira);
        this.primeira = novaCelula;
        if (this.totElementos == 0) this.ultima = this.primeira;
        this.totElementos++;
    }

    public void adicionaFim(Object elemento) {
        if (this.totElementos == 0) {
            adicionaComeco(elemento);
        } else {
            Celula novaCelula = new Celula(elemento, null);
            this.ultima.setProximo(novaCelula);
            this.ultima = novaCelula;
            this.totElementos++;
        }
    }

    private boolean posicaoOcupada(int posicao) {
        return posicao >= 0 && posicao < totElementos;
    }

    private Celula pegaCelula(int posicao) {
        if (!posicaoOcupada(posicao)) throw new IllegalArgumentException("Posição inexistente.");
        Celula atual = primeira;
        for (int i = 0; i < posicao; i++) {
            atual = atual.getProximo();
        }
        return atual;
    }

    public void adicionaMeio(int posicao, Object elemento) {
        if (posicao == 0) {
            adicionaComeco(elemento);
        } else if (posicao == this.totElementos) {
            adicionaFim(elemento);
        } else {
            Celula anterior = this.pegaCelula(posicao - 1);
            Celula nova = new Celula(elemento, anterior.getProximo());
            anterior.setProximo(nova);
            this.totElementos++;
        }
    }

    public Object pega(int posicao) {
        return this.pegaCelula(posicao).getElemento();
    }

    public void removeComeco() {
        if (this.totElementos == 0) throw new IllegalArgumentException("Lista vazia.");
        this.primeira = this.primeira.getProximo();
        this.totElementos--;
        if (this.totElementos == 0) this.ultima = null;
    }

    public void remove(int posicao) {

    }

    public int tamanho() {
        return this.totElementos;
    }

    public boolean contem(Object obj) {
        return false;
    }

    @Override
    public String toString() {
        if (this.totElementos == 0) return "[]";
        Celula atual = primeira;
        StringBuilder builder = new StringBuilder("[");
        for (int i = 0; i < totElementos; i++) {
            builder.append(atual.getElemento());
            builder.append(", ");
            atual = atual.getProximo();
        }
        builder.append("]");
        return builder.toString();
    }
}
