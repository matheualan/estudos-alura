package br.com.alura.threads2;

public class Principal {
    public static void main(String[] args) {

        String path = "C:\\Repositories\\threads.txt";
        String nomeProcurado = "Joe";

        Thread threadAutores = new Thread(new TarefaBuscaTextual("autores.txt", nomeProcurado));
        Thread threadAssinaturas1 = new Thread(new TarefaBuscaNome("assinaturas1.txt", nomeProcurado));
//        Thread threadAssinaturas2 = new Thread(new TarefaBuscaNome("assinaturas2.txt", nomeProcurado));

        threadAutores.start();
        threadAssinaturas1.start();
//        threadAssinaturas2.start();

        TarefaBuscaNome tarefa = new TarefaBuscaNome(path, nomeProcurado);
        Thread thread = new Thread(tarefa);
        thread.start();

    }
}
