package Exception_Handling_in_java;

import java.lang.Exception;
class Division
{
    static void dividetwono() throws Exception
    {
        int a=10;
        int b=0;
        int c=a/b;
        System.out.println("Value of C is :"+c);
    }
    public static void main(String XYZ[])
    {
        try
        {
            dividetwono();
        }
        catch(Exception e)
        {
            System.out.println("Exception occured"+e.getMessage());
        }
    }
}