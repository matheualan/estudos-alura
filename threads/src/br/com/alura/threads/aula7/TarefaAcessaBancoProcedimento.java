package br.com.alura.threads.aula7;

public class TarefaAcessaBancoProcedimento implements Runnable {

    private PoolConnection poolConnection;
    private TransactionManager transactionManager;

    public TarefaAcessaBancoProcedimento(PoolConnection poolConnection, TransactionManager transactionManager) {
        this.poolConnection = poolConnection;
        this.transactionManager = transactionManager;
    }

    @Override
    public void run() {
        synchronized (poolConnection) {
            System.out.println("Começando a Transaction Manager");
            transactionManager.begin();

            synchronized (transactionManager) {
                System.out.println("Peguei a conexão");
                poolConnection.getConnection();
            }
        }
    }

}
