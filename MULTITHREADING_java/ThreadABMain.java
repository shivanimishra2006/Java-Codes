package MULTITHREADING_java;

class AThread extends Thread {
    synchronized public void run() {
        for (int i = 0; i < 5; i++) {
            if (i % 2 == 0) {
                System.out.println("A");
            } else {
                System.out.println("B");
            }
        }
    }
}

class ThreadABMain {
    public static void main(String[] aaa) {
        AThread ta = new AThread();
        ta.start();
    }
}