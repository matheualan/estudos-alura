package br.com.alura.threads4;

/**
 * Ao modificar o objeto concorrentemente, coisas inesperadas podem aparecer;
 * Thread safe significa que o código funciona corretamente mesmo com vários threads compartilhando o objeto;
 * Há coleções thread safe, como o java.util.Vector para lista ou java.util.Hashtable para mapas.
 * Collections.synchronizedList(new ArrayList<>());
 * Vector<>();
 */

import java.util.List;
import java.util.Vector;

public class Program {

    public static void main(String[] args) throws InterruptedException {

//        List<String> lista = new ArrayList<>();
//        List<String> lista = Collections.synchronizedList(new ArrayList<>());
        List<String> lista = new Vector<>();

        for (int i = 0; i < 100; i++) {
            new Thread(new TarefaAdicionarElemento(lista, i)).start();
        }

        Thread.sleep(2000);

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(i + " - " + lista.get(i));
        }

    }
}
