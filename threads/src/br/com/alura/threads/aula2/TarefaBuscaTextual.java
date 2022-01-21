package br.com.alura.threads.aula2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TarefaBuscaTextual implements Runnable {

//    private String path = "c:\\repositories\\autores.txt";
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
            Scanner reader = new Scanner(new File(nomeArquivo));

            while (reader.hasNextLine()) {
                String line = reader.nextLine();
//                System.out.println(line);

                if(line.matches(nomePessoa)) {

                }
                if (line.toLowerCase().contains(nomePessoa.toLowerCase())) {
                    System.out.println("Arquivo procurado: " + nomeArquivo +
                            ",\nNome procurado: " + line + ",\nPosição encontrada: " + count);
                    System.out.println();
                }
                count++;
            }
            reader.close();
        } catch (FileNotFoundException e ) {
            throw new RuntimeException(e);
        }
    }

}
