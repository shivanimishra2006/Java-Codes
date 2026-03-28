package Exception_Handling_in_java;

class Test
{
    public static void main(String XYZ[])
    {
        try
        {
            final int d=10;
            System.out.println("Value of D is:"+d);
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
        finally
        {
            System.out.println("EXCEPTION Find!");
        }
    }
}