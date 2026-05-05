//Write a Java program to create a class Rectangle with attributes length and width. Include 
//methods to calculate area and perimeter, and demonstrate object creation and method 
//invocation in the main method. 

package Basicsofclassandobjects;

class Rectangle1 {
    double length;
    double width;

    Rectangle1(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double calculateArea() {
        return length * width;
    }

    double calculatePerimeter() {
        return 2 * (length + width);
    }
}

class MainRect {
    public static void main(String[] aaa) {
        Rectangle1 r1 = new Rectangle1(20, 15);
        double r2 = r1.calculateArea();
        double r3 = r1.calculatePerimeter();

        System.out.println("Area of rectangle is:" + r2);
        System.out.println("Perimeter of rectangle is:" + r3);
    }
}