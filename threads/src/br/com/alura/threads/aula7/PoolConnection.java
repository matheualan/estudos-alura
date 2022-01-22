package br.com.alura.threads.aula7;

public class PoolConnection {

    public String getConnection() {

        System.out.println("Emprestando conexão");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return "connection";
    }
}