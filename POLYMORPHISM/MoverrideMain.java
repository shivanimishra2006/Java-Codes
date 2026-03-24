package POLYMORPHISM;
//METHOD OVERRIDING(Run Time Polymorphism)

class Hello
{
    void print()
    {
        System.out.println("Hello World!");
    }
}
class Display extends Hello
{
    @Override
    void print()
    {
        System.out.println("Hello World in Display Class!");
    }
}
class MoverrideMain
{
    public static void main(String XYZ[])
    {
        Display dis=new Display();
        dis.print();

        Hello h1=new Hello();
        h1.print();
    }
}