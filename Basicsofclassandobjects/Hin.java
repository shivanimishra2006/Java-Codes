//Hirerical inheritance

class A1
{
    int a;      
    void Print()
    {
        System.out.println("Parent Class!");
    }
}
class BD extends A1
{
    void display()
    {
        System.out.println("Child Class!");
    }
}
class C1 extends A1
{
    void display1()
    {
        System.out.println("Child Class C called!");
    }
}
public class Hin
{
    public static void main(String XYZ[])
    {
        C1 ch=new C1();
        ch.display1();
        ch.Print();

        BD b=new BD();
        b.Print();
        b.display(); 
    }
}

