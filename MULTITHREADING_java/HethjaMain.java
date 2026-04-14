// 3 thread bnao 

package MULTITHREADING_java;

class HelloThread extends Thread {
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("Hello");
        }
    }
}

class JavaThread implements Runnable {
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("Java");
        }
    }
}

class ThreadFun implements Runnable {
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("Thread");
        }
    }
}

class HethjaMain {
    public static void main(String XYZ[]) {
        HelloThread ht = new HelloThread();

        JavaThread jt = new JavaThread();
        Thread tt = new Thread(jt);

        ThreadFun tf = new ThreadFun();
        Thread t3 = new Thread(tf);

        ht.start();
        tt.start();
        t3.start();
    }
}