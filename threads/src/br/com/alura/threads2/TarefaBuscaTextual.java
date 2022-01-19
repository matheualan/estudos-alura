package br.com.alura.threads2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class TarefaBuscaTextual implements Runnable {

    private String path1 = "c:\\repositories\\autores.txt";
    private String nomeArquivo;
    private String nomePessoa;

    public TarefaBuscaTextual(String nomeArquivo, String nomePessoa) {
        this.nomeArquivo = nomeArquivo;
        this.nomePessoa = nomePessoa;
    }

    @Override
    public void run() {
        try {
            int count = 1;
            Scanner reader = new Scanner(new File(path1));
            while (reader.hasNextLine()) {
                String line = reader.nextLine();

                if (line.toLowerCase().contains(nomePessoa.toLowerCase())) {
                    System.out.println("Arquivo realizado a busca: " + nomeArquivo +
                            ",\nNome encontrado: " + nomePessoa + ",\nPosição: " + count);
                    System.out.println();
                }

//                System.out.println(line);
                count++;
            }
            reader.close();
        } catch (FileNotFoundException e ) {
            throw new RuntimeException(e);
        }
    }

}
