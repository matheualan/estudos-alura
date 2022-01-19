package br.com.alura.threads3;

/**
 * Um Thread pode ter um nome;
 * Podemos pegar o Thread atual através do método Thread.currentThread();
 * Para sincronizar threads, devemos utilizar o bloco synchronized(this);
 * O synchronized significa que bloqueamos o objeto para outros threads;
 * A sincronização é feita através de mutex, que nada mais é do que a chave do objeto.
 */

public class Program {
    public static void main(String[] args) {

        Banheiro banheiro = new Banheiro();

        Thread convidado1 = new Thread(new TarefaNumero1(banheiro), "João");
        Thread convidado2 = new Thread(new TarefaNumero2(banheiro), "Pedro");
        Thread convidado3 = new Thread(new TarefaNumero1(banheiro), "Maria");
        Thread convidado4 = new Thread(new TarefaNumero2(banheiro), "Ana");

        convidado1.start();
        convidado2.start();
        convidado3.start();
        convidado4.start();

    }
}
