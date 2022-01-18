package br.com.alura.threads1;

public class ExercicioMain {
    public static void main(String[] args) {

//        System.out.println("Hello System");
//        try {
//            Thread.sleep(10000);
//        } catch (InterruptedException ie) {
//            System.out.println(ie.getMessage());
//        }
//        System.out.println("10 segundos depois...");

        ExercicioThreads exercicioThreads = new ExercicioThreads();
        Thread thread = new Thread(exercicioThreads);
        thread.start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Pode ser implementado por meio de classe anônima também");
            }
        }).start();

    }
}
