package br.com.alura.threads5;

public class Banheiro {

    //    private Lock lock = new ReentrantLock();
    private boolean sujo = true;

    public void fazerNumero1() {
//        lock.lock();
        String name = Thread.currentThread().getName();
        System.out.println(name + " batendo na porta.");
        synchronized (this) {
            System.out.println(name + " entrando no banheiro.");
            if (sujo) {
                esperaFora(name);
            }
            System.out.println(name + " fazendo coisa rápida.");
            pleaseWait(2000);
            this.sujo = true;
            System.out.println(name + " dando descarga.");
            System.out.println(name + " lavando as mãos.");
            System.out.println(name + " saindo do banheiro.");
            System.out.println();
//            lock.unlock();
        }

    }

    private void pleaseWait(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void fazerNumero2() {
//        lock.lock();
        String name = Thread.currentThread().getName();
        System.out.println(name + " batendo na porta.");
        synchronized (this) {
            System.out.println(name + " entrando no banheiro.");
            if (sujo) {
                esperaFora(name);
            }
            System.out.println(name + " fazendo coisa demorada...");
            pleaseWait(7000);
            this.sujo = true;
            System.out.println(name + " dando descarga.");
            System.out.println(name + " lavando as mãos.");
            System.out.println(name + " saindo do banheiro.");
            System.out.println();
//            lock.unlock();
        }
    }

    public void limpaBanheiro() {
        String name = Thread.currentThread().getName();
        System.out.println(name + " batendo na porta.");
        synchronized (this) {
            System.out.println(name + " entrando no banheiro.");
            if (!sujo) {
                System.out.println(name + ", banheiro não está sujo, não precisa ser limpo.");
                return;
            }
            System.out.println(name + " limpando banheiro...");
            this.sujo = false;
            pleaseWait(12000);
            System.out.println("Banheiro limpo!");
            System.out.println(name + " saindo.");
            this.notifyAll();
            System.out.println();
        }
    }

    private void esperaFora(String name) {
        System.out.println(name + ", eerrrggg, banheiro sujo! Vou esperar alguém limpar.");
        try {
            this.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
