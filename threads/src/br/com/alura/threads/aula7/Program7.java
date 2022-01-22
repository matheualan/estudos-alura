package br.com.alura.threads.aula7;

public class Program7 {

    public static void main(String[] args) {

        TransactionManager transactionManager = new TransactionManager();
        PoolConnection poolConnection = new PoolConnection();

        new Thread(new TarefaAcessaBanco(poolConnection, transactionManager));

    }
}
