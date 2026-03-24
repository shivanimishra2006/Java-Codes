package Exception_Handling_in_java;

class MultiCatch
{
    public static void main(String XYZ[])
    {
        try
        {
            int a,b,c;
            a=10;
            b=0;
            c=a/b;
            System.out.println("VALUE OF C is :"+c);
        }
        catch(ArithmeticException e)
        {
            System.out.println("SOME Exceptions!"+e);
        }
        catch(Exception e)
        {
            System.out.println("Exception!"+e);
        }
    }
}