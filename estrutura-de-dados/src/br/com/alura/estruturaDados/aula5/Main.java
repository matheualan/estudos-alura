package br.com.alura.estruturaDados.aula5;

public class Main {
    public static void main(String[] args) {

        Fila fila = new Fila();
        System.out.println("Lista vazia? " + fila.estaVazia());

        fila.adiciona("Mauricio");
        fila.adiciona("Gabriel");
        System.out.println(fila);

        String remove1 = fila.remove();
        System.out.println("Removido: " + remove1);
        System.out.println(fila);

        System.out.println("Lista vazia? " + fila.estaVazia());

    }
}
