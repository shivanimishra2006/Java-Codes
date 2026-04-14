//2 thread bnao :
//ek even no. print kare
// ek odd no. print kare

package MULTITHREADING_java;

class EvenThread extends Thread {
    public void run() {
        for (int i = 0; i <= 20; i += 2) {
            System.out.println("Even numbers:" + i);
        }
    }
}

class OddThread implements Runnable {
    public void run() {
        for (int i = 1; i <= 20; i += 2) {
            System.out.println("Odd numbers:" + i);
        }
    }}

class ThreadEOMain{

    public static void main(String[] aaa) {
        EvenThread et = new EvenThread();
        OddThread ot = new OddThread();
        Thread dt = new Thread(ot);

        et.start();
        dt.start();
    }
}