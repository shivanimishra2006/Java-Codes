class Shape
{
    void area()
    {
        System.out.println("area not defined!");
    }
}
class Circle extends Shape
{
    double radius;
    void area()
    {
        double result=Math.PI*radius*radius*radius;
        System.out.println("Area of circle:"+result);   
    }
}
class Rectangle extends Shape
{
    double len,width;
    void area()
    {
        double res=len*width;
        System.out.println("Area of Rectangle:"+res);
    }
}

class ShapeMain
{
    public static void main(String XYZ[])
    {
        Circle cir=new Circle();
        cir.radius=10.00;
        cir.area();

        Rectangle rec=new Rectangle();
        rec.len=30.00;
        rec.width=40.00;
        rec.area();
    }
}