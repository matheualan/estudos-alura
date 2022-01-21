package br.com.alura.threads.aula2;

public class Exercicio implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 101; i++) {
            Thread threadAtual = Thread.currentThread();
            System.out.println("Id Thread: " + threadAtual.getId() + " - " + i);
        }
    }

}
