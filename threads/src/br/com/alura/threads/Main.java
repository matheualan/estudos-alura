package br.com.alura.threads;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello System");

        try {
            Thread.sleep(10000);
        } catch (InterruptedException ie) {
            System.out.println(ie.getMessage());
        }

        System.out.println("10 segundos depois...");

    }
}
