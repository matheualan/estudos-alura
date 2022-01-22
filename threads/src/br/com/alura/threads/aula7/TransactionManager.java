package br.com.alura.threads.aula7;

public class TransactionManager {

    public void begin() {
        System.out.println("Começando a transação");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
