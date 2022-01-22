package br.com.alura.threads.aula7;

public class TarefaAcessaBanco implements Runnable {

    private final PoolConnection poolConnection;
    private final TransactionManager transactionManager;

    public TarefaAcessaBanco(PoolConnection poolConnection, TransactionManager transactionManager) {
        this.poolConnection = poolConnection;
        this.transactionManager = transactionManager;
    }

    @Override
    public void run() {
        synchronized (poolConnection) {

        }
    }

}
