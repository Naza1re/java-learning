package Multithreading;

public class MyThread implements Runnable {

     public volatile int number = 100;



    public static void main(String[] args) {

        Thread thread = new Thread(new MyThread());
        thread.setName("first");
        Thread thread1 = new Thread(new MyThread());
        thread1.setName("second");
        thread1.start();
        thread.start();
        System.out.println();
    }

    @Override
    public synchronized void run() {
        for (int i = 0;i<100;i++) {
            number++;
            System.out.println(number);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            --number;
            System.out.println();
        }
    }
}
