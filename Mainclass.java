//ACESS SPECIFIERS

class AcessSpecifier
{
    private int a=10;
    public int b=30;
    protected int c=40;
    int d=50;
    void display()
    {
        System.out.println(a);
    }

}
class Mainclass
{
    public static void main(String args[])
    {
        AcessSpecifier as=new AcessSpecifier();
        //System.out.println(as.a) //error because it is variable of private constructor
        as.display();
        System.out.println(as.b);
        System.out.println(as.c);
        System.out.println(as.d);

    }
}