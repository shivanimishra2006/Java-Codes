//Design a Java program with a parent class Animal having attributes name and age, and a 
// method makeSound(). Create two subclasses Dog and Cat that inherit from Animal and 
// override the makeSound() method. 

package Basicsofclassandobjects;

class Animals {
    String name;
    int age;

    Animals(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void makeSound() {
        System.out.println("Animal sound!");
    }
}

class Dog extends Animals {
    Dog(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println(name +" "+"barks!");
    }
}

class Cat extends Animals {
    Cat(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println(name +" "+ "meow!");
    }
}

class MainAnimalcd {
    public static void main(String XZY[]) {
        Animals a1 = new Dog("Simba", 1);
        Animals a2 = new Cat("Kitty", 3);

        a1.makeSound();
        a2.makeSound();
    }
}