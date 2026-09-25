package THREAD;

class FirstThreads extends Thread {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("THREAD1:" + i);
        }
    }
}

class SecondThreads extends Thread {
    public void run() {
        for (int i = 101; i <= 175; i++) {
            System.out.println("THREAD2:" + i);
        }
    }
}

public class ThreadShedulingDemo {
    public static void main(String[] args) {

        FirstThreads ft = new FirstThreads();
        SecondThreads sd = new SecondThreads();

        sd.setPriority(10);
        ft.setPriority(1);

        ft.start();
        sd.start();
    }
}