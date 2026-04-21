package Constructors_in_java;

class HelloDefault {
    HelloDefault() {
        System.out.println("Hello Constructor!");
    }
}

class MainDefaultCons {
    public static void main(String[] aaa) {
        HelloDefault hd = new HelloDefault();
    }
}