package MULTITHREADING_java;

class X extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Threading is calling:" + i);
        }
    }
}

class ThreadDemo {
    public static void main(String XYZ[]) {
        X x = new X();
        x.start();
    }
}