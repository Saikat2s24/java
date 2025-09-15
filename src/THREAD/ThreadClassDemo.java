package THREAD;

class FirstThread extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                System.out.println("THREAD1:" + i);
                Thread.sleep(100);
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
        }
    }
}

class SecondThread extends Thread {
    public void run() {
        for (int i = 0; i < 200; i++) {
            System.out.println("THREAD2:" + i);
        }
    }
}

public class ThreadClassDemo {
    public static void main(String[] args) {
        FirstThread ft = new FirstThread();
        SecondThread sd = new SecondThread();
        ft.start();
        sd.start();
    }
}
