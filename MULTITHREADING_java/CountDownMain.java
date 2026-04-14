package MULTITHREADING_java;

class CountThread extends Thread {
    public void run() {
        for (int i = 10; i > 0; i--) {
            System.out.println("CountDown Thread is:" + i);
        }
    }
}

class CountDownMain {
    public static void main(String[] aa) {
        CountThread ct = new CountThread();
        ct.start();
    }
}