class MethodF
{
    void display()
    {
        System.out.println("HELLO,JAVA");
        System.out.println("this method is called by main class");
    }
}
class maincl
{
    public static void main(String XYZ[])
    {
        MethodF obj=new MethodF();
        obj.display();
    }
}