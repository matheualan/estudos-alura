package br.com.alura.threads3;

public class Banheiro {

//    private Lock lock = new ReentrantLock();

    public void fazerNumero1() {
//        lock.lock();
        String name = Thread.currentThread().getName();
        System.out.println(name + " batendo na porta");
        synchronized (this) {
            System.out.println(name + " abrindo a porta...");
            System.out.println(name + " fazendo coisa rápida....");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(name + " dando descarga...");
            System.out.println(name + " lavando as mãos...");
            System.out.println(name + " fechando a porta.");
            System.out.println();
//            lock.unlock();
        }

    }

    public void fazerNumero2() {
//        lock.lock();
        String name = Thread.currentThread().getName();
        System.out.println(name + " batendo na porta");
        synchronized (this) {
            System.out.println(name + " abrindo a porta...");
            System.out.println(name + " fazendo coisa demorada....");
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(name + " dando descarga...");
            System.out.println(name + " lavando as mãos...");
            System.out.println(name + " fechando a porta.");
            System.out.println();
//            lock.unlock();
        }
    }

}
