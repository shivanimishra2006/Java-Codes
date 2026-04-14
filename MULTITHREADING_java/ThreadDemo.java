package MULTITHREADING_java;

class X extends Thread {
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Thread is calling:" + i);
                Thread.sleep(2000);
            }
        } catch (Exception e) {
            System.out.println("Error Ouccered!");
        }
    }
}

class ThreadDemo {
    public static void main(String XYZ[]) {
        X x = new X();
        x.start();
    }
}