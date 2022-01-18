package br.com.alura.threads1;
/**
 * Através das Threads podemos executar tarefas em paralelo;
 * Uma classe que implementa a interface Runnable define a tarefa que o Thread executará;
 * O construtor da classe Thread recebe esse Runnable;
 * Devemos inicializar uma Thread explicitamente através do método start();
 * Através do Thread.sleep(millis) podemos mandar uma thread dormir.
 */

import javax.swing.*;

public class ScreenCalculator {

    public static void main(String[] args) {

        JFrame janela = new JFrame("Multiplicação Demorada");

        JTextField primeiro = new JTextField(5);
        JTextField segundo = new JTextField(5);
        JButton botao = new JButton(" = ");
        JLabel resultado = new JLabel("               ?              ");

        botao.addActionListener(new ActionButton(primeiro, segundo, resultado));

        JPanel painel = new JPanel();
        painel.add(primeiro);
        painel.add(new JLabel("x"));
        painel.add(segundo);
        painel.add(botao);
        painel.add(resultado);

        janela.add(painel);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.pack();
        janela.setVisible(true);

    }

}
