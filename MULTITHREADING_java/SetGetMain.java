//Thread.currentThread();

package MULTITHREADING_java;

class G extends Thread {
    public void run() {
        System.out.println("Name:" + Thread.currentThread().getName());
    }
}

class SetGetMain {
    public static void main(String[] aaa) {
        G gst = new G();
        Thread th = new Thread(gst);
        th.setName("Thread1");
        th.start();
    }
}