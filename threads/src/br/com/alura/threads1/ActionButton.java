package br.com.alura.threads1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionButton implements ActionListener {

    private JTextField primeiro;
    private JTextField segundo;
    private JLabel resultado;

    public ActionButton(JTextField primeiro, JTextField segundo, JLabel resultado) {
        this.primeiro = primeiro;
        this.segundo = segundo;
        this.resultado = resultado;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Runnable multiplicacao = new Multiplicacao(primeiro, segundo, resultado);
        Thread thread = new Thread(multiplicacao, "Thread Calculador");
        thread.start();
    }

//    @Override
//    public void actionPerformed(ActionEvent e) {
//        long valor1 = Long.parseLong(primeiro.getText());
//        long valor2 = Long.parseLong(segundo.getText());
//        long result = valor1 * valor2;
//        resultado.setText(String.valueOf(result));
//    }

}
