package POLYMORPHISM;

class AreaCalculator
{
    void area(double radius)
    {
        double result=Math.PI*radius*radius;
        System.out.println("Area of Circle is:"+result);
    }
    void area(int length,int breadth)
    {
        int result=length*breadth;
        System.out.println("Area of Rectangle is:"+result);
    }
    void area(float base,float height)
    {
        float result=0.5f*base*height;
        System.out.println("Area of Triangle is:"+result);
    }
}
class AREAMain
{
    public static void main(String XYZ[])
    {
        AreaCalculator ac=new AreaCalculator();
        ac.area(20.00);
        ac.area(10,50);
        ac.area(12.0f,10.5f);
    }
}