//In the example below, the class has one public attribute and one private attribute.

// Think of it like real life:

// public - a public park, everyone can enter
// private - your house key, only you can use it

package Access_specifier_in_java;

public class Person {
    public String name = "Alice";
    // private int age = 50;
}

class AttributeMain {
    public static void main(String[] args) {
        Person p = new Person();
        System.out.println(p.name); // This will work because name is public
        // System.out.println(p.age); // This will cause an error because age is private
    }
}