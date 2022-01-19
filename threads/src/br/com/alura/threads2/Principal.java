package br.com.alura.threads2;

public class Principal {
    public static void main(String[] args) {

//        String path = "c:\\repositories\\alura\\threads\\texto1.txt";
        String nomeProcurado = "Joe";

        Thread texto1 = new Thread(new TarefaBuscaTextual("texto1.txt", nomeProcurado));
        Thread texto2 = new Thread(new TarefaBuscaTextual("texto2.txt", nomeProcurado));
        Thread texto3 = new Thread(new TarefaBuscaTextual("texto3.txt", nomeProcurado));

        texto1.start();
        texto2.start();
        texto3.start();

//        TarefaBuscaNome tarefaBN = new TarefaBuscaNome(path, nomeProcurado);
//        Thread thread = new Thread(tarefaBN);
//        thread.start();

    }
}
