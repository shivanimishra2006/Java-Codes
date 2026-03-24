package POLYMORPHISM;

class Calculator
{
    void add(int a,int b)
    {
        System.out.println("Parent addition:"+(a+b));
    }
}
class AdvancedClaculator extends Calculator
{
    @Override
    void add(int a,int b)
    {
        System.out.println("Child class addition:"+(a+b));
    }
    void add(int a,int b,int c)
    {
        System.out.println("Overloads addition taking 3 variables:"+(a+b+c));
    }
    void add(double a,double b)
    {
        System.out.println("Overloads addition:"+(a+b));
    }
}
class OvermlMain
{
    public static void main(String XYZ[])
    {
        AdvancedClaculator adc=new AdvancedClaculator();
        adc.add(20,30);
        adc.add(10,80);
        adc.add(30,50,80);
        adc.add(25.5,45.9);
    }
}