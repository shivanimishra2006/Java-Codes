class ABC
{
    int a;
    int b;

    void display()
    {
        System.out.println("value of a:"+a);
        System.out.println("value of b:"+b);
    }
}

class Mclass
{
    public static void main(String XYZ [])
    {
        ABC a1=new ABC();
        a1.a=20;
        a1.b=90;
        a1.display();
    }
}