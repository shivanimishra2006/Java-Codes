//Single inheritance

class Ab
{
    int a;      //variable is default in nature.
    void Print()
    {
        System.out.println("Parent Class!");
    }
}
class B extends Ab
{
    void display()
    {
        System.out.println("Child Class!");
    }
}
public class Shivani 
{
    public static void main(String XYZ[])
    {
        B b1=new B();
        b1.display();
        b1.Print();
    }
}

