package br.com.alura.estruturaDados.aula1;

import java.util.Arrays;

public class Vetor {

    private Aluno[] alunos = new Aluno[100];
    private int totAlunos = 0;

    public void adicionaAluno(Aluno aluno) {
        this.alunos[totAlunos] = aluno;
        totAlunos++;

//        MÉTODO LENTO
//        for (int i = 0; i < alunos.length; i++) {
//            if (alunos[i] == null) {
//                alunos[i] = aluno;
//                break;
//            }
//        }
    }

    private boolean posicaoValida(int posicao) {
        return posicao >= 0 && posicao <= totAlunos;
    }

    public void adicionarQualquerLugar(int posicao, Aluno aluno) {
        if(!posicaoValida(posicao)) throw new IllegalArgumentException("Posição inválida.");
        for (int i = totAlunos - 1; i >= posicao; i--) {
            alunos[i+1] = alunos[i];
        }
        alunos[posicao] = aluno;
        totAlunos++;
    }

    public Aluno pegaAluno(int posicao) {
        if (!posicaoOcupada(posicao)) throw new IllegalArgumentException("Posição inválida");
        return alunos[posicao];
    }

    private boolean posicaoOcupada(int posicao) {
        return posicao >= 0 && posicao < totAlunos;
    }

    public void removeAluno(int posicao) {
        for (int i = posicao; i < this.totAlunos -1; i++) {
            this.alunos[i] = this.alunos[i+1];
        }
        totAlunos--;
        this.alunos[totAlunos] = null;
    }

    public boolean contem(Aluno aluno) {
        for (int i = 0; i < totAlunos; i++) {
            if (alunos[i].equals(aluno)) return true;
        }
        return false;
    }

    public int tamanho() {
        return totAlunos;
    }


    @Override
    public String toString() {
        return "Alunos = " + Arrays.toString(alunos) + " / ";
    }
}
