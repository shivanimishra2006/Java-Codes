//MULTILEVEL inheritance

class Abc
{
    int a;      //variable is default in nature.
    void Print()
    {
        System.out.println("Parent Class!");
    }
}
class Bc extends Abc
{
    void display()
    {
        System.out.println("Child Class!");
    }
}
class C extends Bc
{
    void display1()
    {
        System.out.println("Child Class C called!");
    }
}
public class S 
{
    public static void main(String XYZ[])
    {
        C c1=new C();
        c1.display();
        c1.display1();
        c1.Print();
    }
}

