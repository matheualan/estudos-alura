package br.com.alura.threads.aula5;

/**
 * ao chamar object.wait() a thread fica no estado de espera
 * estado de espera significa WAITING no mundo de threads
 * uma thread esperando pode ser notificada pelo método object.notifyAll() para retomar sua atividade
 * existem daemon threads para executar tarefas ou serviços secundários
 * daemons serão automaticamente desligados quando todas as outras threads terminarem
 */

public class Program5 {
    public static void main(String[] args) {

        Banheiro banheiro = new Banheiro();

        Thread convidado1 = new Thread(new TarefaNumero1(banheiro), "João");
        Thread convidado2 = new Thread(new TarefaNumero2(banheiro), "Pedro");
        Thread limpeza = new Thread(new TarefaLimpeza(banheiro), "Funcionário da limpeza");
        limpeza.setDaemon(true);//finaliza essa thread qdo nenhuma outra thread esta sendo executada mais
//        Thread convidado3 = new Thread(new TarefaNumero1(banheiro), "Maria");
//        Thread convidado4 = new Thread(new TarefaNumero2(banheiro), "Ana");

        limpeza.setPriority(Thread.MAX_PRIORITY);
        convidado1.setPriority(Thread.MIN_PRIORITY);
        convidado1.start();
        convidado2.start();
        limpeza.start();
//        convidado3.start();
//        convidado4.start();

    }
}
