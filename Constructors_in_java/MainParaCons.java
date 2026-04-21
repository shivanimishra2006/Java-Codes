package Constructors_in_java;

class AddParametrised {
    AddParametrised(int a, int b) {
        System.out.println("Addition of a and b is:" + (a+b));
    }
}

class MainParaCons {
    public static void main(String[] aaa) {
        AddParametrised ap = new AddParametrised(40, 80);
    }
}