package br.com.alura.estruturaDados.aula1Vetor;

public class VetorMain {

    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("João");
        Aluno aluno2 = new Aluno("Pedro");
        Aluno aluno3 = new Aluno("Maria");
        Aluno aluno4 = new Aluno("Valéria");
        Vetor lista = new Vetor();

        System.out.println(lista.tamanho());
        lista.adicionaAluno(aluno1);
        lista.adicionaAluno(aluno2);
        lista.adicionaAluno(aluno3);
        lista.adicionaAluno(aluno4);
        System.out.println(lista.tamanho());

        System.out.println(lista);
        System.out.println(lista.contem(aluno1));

        lista.adicionaQualquerLugar(0, aluno4);
        lista.removeAluno(2);
        lista.removeAluno(0);
        System.out.println(lista);

        for (int i = 0; i < 250; i++) {
            Aluno adcAlunos = new Aluno("Joao " + i);
            lista.adicionaAluno(adcAlunos);
        }
        System.out.println(lista);

    }

}
