package br.com.alura.threads.aula7;

/**
 * Podemos usar um bloco synchronized dentro do outro.
 * Ao obter os recursos, pode acontecer um impasse (interbloqueio).
 * O impasse também é chamado deadlock.
 * Podemos evitar o impasse obtendo as chaves dos objetos na mesma ordem, em todos os threads.
 */

public class Program7 {

    public static void main(String[] args) {

        TransactionManager transactionManager = new TransactionManager();
        PoolConnection poolConnection = new PoolConnection();

        new Thread(new TarefaAcessaBanco(poolConnection, transactionManager), "").start();
        new Thread(new TarefaAcessaBancoProcedimento(poolConnection, transactionManager)).start();

    }
}
