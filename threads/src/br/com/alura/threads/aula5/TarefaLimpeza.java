package br.com.alura.threads.aula5;

public class TarefaLimpeza implements Runnable {

    private Banheiro banheiro;

    public TarefaLimpeza(Banheiro banheiro) {
        this.banheiro = banheiro;
    }

    @Override
    public void run() {
        while (true) {
            banheiro.limpaBanheiro();
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
