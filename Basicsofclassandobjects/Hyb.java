//Hybrid inheritance

class Ac
{
    int a;      //variable is default in nature.
    void Print()
    {
        System.out.println("Parent Class!");
    }
}
class Bx extends Ac
{
    void display()
    {
        System.out.println("Child Class!");
    }
}
class D1 extends Ac
{
    void display1()
    {
        System.out.println("Child Class C called!");
    }
}
class E1 extends Bx
{
    void display2()
    {
        System.out.println("Child Class E1 called!");
    }
}
public class Hyb 
{
    public static void main(String XYZ[])
    {

        E1 e=new E1();
        e.display();
        e.display2();

        D1 d=new D1();
        d.Print();
        d.display1();

        Bx b=new Bx();
        b.Print();
        b.display();
    }
}

