package MULTITHREADING_java;

class Threadq extends Thread {
    static int num = 1;
    static int max = 10;

    int remainder;

    Threadq(int remainder) {
        this.remainder = remainder;
    }

    public void run() {
        while (true) {
            synchronized (Threadq.class) {
                if (num > max)
                    break;

                if (num % 3 == remainder) {
                    System.out.println("Thread " + remainder + " : " + num);
                    num++;
                }
            }
        }
    }
}

class ThreeThreadMain {
    public static void main(String[] args) {

        Threadq t1 = new Threadq(1); // for 1,4,7...
        Threadq t2 = new Threadq(2); // for 2,5,8...
        Threadq t3 = new Threadq(0); // for 3,6,9...

        t1.start();
        t2.start();
        t3.start();
    }
}