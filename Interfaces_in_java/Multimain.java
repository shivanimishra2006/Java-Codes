package Interfaces_in_java;

interface Vehicle
{
    void start();
    void stop();
}
interface Engine
{
    void fuel();
}
class Car implements Vehicle,Engine
{
    public void start()
    {
        System.out.println("CAR START!");
    }
    public void stop()
    {
        System.out.println("CAR STOPS!");
    }
    public void fuel()
    {
        System.out.println("Fuel type:PETROL !");
    }
}
class Multimain
{
    public static void main(String XYZ[])
    {
        Car c=new Car();
        c.start();
        c.stop();
        c.fuel();
    }
}