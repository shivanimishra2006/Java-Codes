package MULTITHREADING_java;

class userDefined extends Thread 
{
    public void run() 
    {
        System.out.println("Thread is calling!");
    }
}

class ThreadMain 
{
    public static void main(String... aaa) 
    {
        userDefined ud = new userDefined();
        ud.start(); // start() method for thread class
    }
}
