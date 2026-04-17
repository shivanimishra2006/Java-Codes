package MULTITHREADING_java;

class CookingTask extends Thread {
    private String task;

    CookingTask(String task) {
        this.task = task;
    }

    public void run() {
        System.out.println(task + Thread.currentThread().getName() + " is being prepared!");
        // Thread.currentThread().getName();
    }
}

class ResturantMain {
    public static void main(String XYZ[]) {
        Thread dt = new CookingTask("Pasta");
        Thread td = new CookingTask("Momo's");
        Thread ht = new CookingTask("Salad");
        Thread nt = new CookingTask("Dessert");
        Thread ot = new CookingTask("Rice");

        dt.start();
        td.start();
        ht.start();
        nt.start();
        ot.start();
    }
}