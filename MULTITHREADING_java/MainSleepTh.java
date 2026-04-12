package MULTITHREADING_java;

class SleepThread implements Runnable {
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

class MainSleepTh {
    public static void main(String XYZ[]) {
        Thread s = new Thread(new SleepThread());
        Thread sl = new Thread(new SleepThread());
        s.start();
        sl.start();
    }
}