package MULTITHREADING_java;

class Thread1 implements Runnable // interface
{
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread 1 is calling:" + i);
        }
    }
}

class RunThreadMain {
    public static void main(String XYZ[]) {
        Thread td = new Thread(new Thread1());
        Thread t = new Thread(new Thread1());
        t.start();
        td.start();
    }
}