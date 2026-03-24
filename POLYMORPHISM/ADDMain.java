package POLYMORPHISM;

//Method Overloading (Compile time Polymorphism)

class MethodOver
{
    void add()
    {
        int a=20;int b=30;
        System.out.println("Sum a+b:"+(a+b));
    }
    void add(int a)
    {
        int b=20;
        System.out.println("Sum a+b:"+(a+b));
    }
    void add(double b)
    {
        double a=40.0;
        System.out.println("Sum a+b:"+(a+b));
    }
    void add(int a,int b)
    {
        System.out.println("Sum a+b:"+(a+b));
    }
    void add(int a,int b,int c)         
    {
        System.out.println("Sum a+b:"+(a+b));
    }
}
class ADDMain
{
    public static void main(String XYZ[])
    {
        MethodOver mo=new MethodOver();
        mo.add();
        mo.add(20);
        mo.add(25.5);
        mo.add(50,60);
        mo.add(70,40,30);
    }
}