package br.com.alura.estruturaDados.aula1;

import java.util.Objects;

public class Aluno {

    private String name;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Aluno)) return false;
        Aluno aluno = (Aluno) o;
        return name.equals(aluno.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

}