package Access_specifier_in_java;

class Dog {
    // public method
    public void tail() {
        System.out.println("sound has only one tail!");
    }

    // protected method
    protected void sound() {
        System.out.println("sound of dog is bark!");
    }

    // private method("The method color() from the type Dog is not used locallay!")
    private void color() {
        System.out.println("All dogs has different colors!");
    }

    // default method
    void eat() {
        System.out.println("Dogs eat pedigree food!");
    }
}

class MainAnimal {
    public static void main(String XYZ[]) {
        Dog dog = new Dog();
        dog.tail();
        dog.sound();
        // dog.color() the method color()from the type Dog is not visible.
        dog.eat();
    }
}