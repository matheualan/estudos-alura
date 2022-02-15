package br.com.alura.estruturaDados.aula3ListaDupLigada;

public class ListaDuplamenteLigada {

    private Celula primeira;
    private Celula ultima;
    private int totElementos;

    public void adicionaComeco(Object elemento) {
//        Celula novaCelula = new Celula(primeira, elemento);
//        this.primeira = novaCelula;
//        if (this.totElementos == 0) this.ultima = this.primeira;
        if (this.totElementos == 0) {
            Celula novaCelula = new Celula(elemento);
            this.primeira = novaCelula;
            this.ultima = novaCelula;
        } else {
            Celula novaCelula = new Celula(this.primeira, elemento);
            this.primeira.setAnterior(novaCelula);
            this.primeira = novaCelula;
        }
        this.totElementos++;
    }

    public void adicionaFim(Object elemento) {
        if (this.totElementos == 0) {
            adicionaComeco(elemento);
        } else {
            Celula novaCelula = new Celula(elemento);
            this.ultima.setProximo(novaCelula);
            novaCelula.setAnterior(this.ultima);
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
            Celula anterior = pegaCelula(posicao - 1);
            Celula proxima = anterior.getProximo();
            Celula nova = new Celula(anterior.getProximo(), elemento);
            nova.setAnterior(anterior);
            anterior.setProximo(nova);
            proxima.setAnterior(nova);
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

    public void removeMeio(int posicao) {
        if (posicao == 0) {
            removeComeco();
        } else if (posicao == this.totElementos -1) {
            this.removeFim();
        } else {
            Celula anterior = this.pegaCelula(posicao -1);
            Celula atual = anterior.getProximo();
            Celula proxima = atual.getProximo();
            anterior.setProximo(proxima);
            proxima.setAnterior(anterior);
            this.totElementos--;
        }
    }

    public void removeFim() {
        if (this.totElementos == 1) {
            this.removeComeco();
        } else {
            Celula penultima = this.ultima.getAnterior();
            penultima.setProximo(null);
            this.ultima = penultima;
            this.totElementos--;
        }
    }

    public int tamanho() {
        return this.totElementos;
    }

    public boolean contem(Object elemento) {
        Celula atual = this.primeira;
        while (atual != null) {
            if (atual.getElemento().equals(elemento)) return true;
            atual = atual.getProximo();
        }
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
