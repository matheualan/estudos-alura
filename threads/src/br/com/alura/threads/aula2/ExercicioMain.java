package br.com.alura.threads.aula2;

public class ExercicioMain {
    public static void main(String[] args) {

        Thread thread1 = new Thread(new Exercicio());
        Thread thread2 = new Thread(new Exercicio());
        thread1.start();
        thread2.start();

    }
}
