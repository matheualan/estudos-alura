package br.com.alura.estruturaDados.aula1Vetor;

import java.util.Objects;

public class Aluno {

    private final String name;

    public Aluno(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Aluno[Nome: " + name + "]";
    }

//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) return true;
//        if (!(obj instanceof Aluno)) return false;
//        Aluno aluno = (Aluno) obj;
//        return name.equals(aluno.name);
//    }

    @Override
    public boolean equals(Object obj) {
        Aluno aluno = (Aluno) obj;
        if (aluno == null) return false;
        return aluno.getName().equals(this.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

}