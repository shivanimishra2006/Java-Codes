package POLYMORPHISM;

class ACalculator
{
    void area(double radius)
    {
        double result=Math.PI*radius*radius;
        System.out.println("Area of Circle is:"+result);
    }
}
class Rectangle extends ACalculator
{
    @Override
    void area(int length,int breadth)
    {
        int result=length*breadth;
        System.out.println("Area of Rectangle is:"+result);
    }
}
class Triangle extends ACalculator
{
    @Override
    void area(int length,int breadth)
    {
        float result=0.5f*length*breadth;
        System.out.println("Area of Triangle is:"+result);
    }
}
class MethodoverMain
{
    public static void main(String XYZ[])
    {
        AreaCalculator ac=new ACalculator();
        ac.area(20.00);
        ac=new Rectangle();
        ac.area(10,50);
        ac=new Triangle();
        ac.area(12.0f,10.5f);
    }
}