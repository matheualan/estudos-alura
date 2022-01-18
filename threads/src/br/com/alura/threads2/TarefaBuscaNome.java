package br.com.alura.threads2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TarefaBuscaNome implements Runnable {

    private String path = null;
    private String nomeProcurado = "Joe";
    private FileReader fileReader = null;
    private BufferedReader bufferedReader = null;

    public TarefaBuscaNome(String path, String nomeProcurado) {
        this.path = path;
        this.nomeProcurado = nomeProcurado;
    }

    @Override
    public void run() {
        try {

            int numeroLinha = 1;

            fileReader = new FileReader(path);
            bufferedReader = new BufferedReader(fileReader);
            String linha = bufferedReader.readLine();

            while (linha != null) {
                System.out.println(linha);

                if (linha.contains(nomeProcurado)) {
                    System.out.println(path + " - " + numeroLinha + " - " + linha);
                }
                numeroLinha++;
                linha = bufferedReader.readLine();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);

        } finally {
            try {

                fileReader.close();
                bufferedReader.close();

            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
        }

//        try {
//            Scanner sc = null;
//            File file = null;
//            file = new File(path);
//            sc = new Scanner(file);
//            while (sc.hasNextLine()) {
//                String line = sc.nextLine();
//                System.out.println(line);
//            }
//        } catch (IOException e) {
//            System.err.println(e.getMessage());
//        } finally {
//            if (sc != null) {
//                sc.close();
//            }
//        }

    }

}
