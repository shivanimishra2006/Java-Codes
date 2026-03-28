package Exception_Handling_in_java;

class A
{
    void run()
    {
        int a,b,c;
        a=10;
        b=0;
        c=a/b;
        System.out.println("VALUE OF C is :"+c);
    }
}
class B extends A
{
    @Override
    void run()
    {
        System.out.println("Class B run!");
        throw new ArithmeticException("Error:Division by zero");
    }
}
class MainPC
{
    public static void main(String XYZ[])
    {
        A ab=new A();
        try
        {
            ab.run();
        }
        catch(ArithmeticException e)
        {
            System.out.println("Exception found!");
        }
    }
}