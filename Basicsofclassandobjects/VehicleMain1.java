//Create an abstract class Vehicle with an abstract method startEngine(). Implement this 
//method in two subclasses Car and Motorcycle to demonstrate abstraction in Java.

package Basicsofclassandobjects;

abstract class Vehicle {
    abstract void startEngine();
}

class Car extends Vehicle {
    @Override
    void startEngine() {
        System.out.println("Car engine starts!");
    }
}

class Motorcycle extends Vehicle {
    @Override
    void startEngine() {
        System.out.println("Motorcycle engine starts!");
    }
}

class VehicleMain1 {
    public static void main(String[] aaa) {
        Vehicle v1 = new Car();
        Vehicle v2 = new Motorcycle();

        v1.startEngine();
        v2.startEngine();
    }
}