package Exception_Handling_in_java;

import java.lang.Exception;
class VOTE
{
    static void checkedAge(int age) throws Exception
    {
        if(age>=18)
        {
            System.out.println("Eligible to Vote!");
        }
        else
        {
            System.out.println("Not Eligible to Vote!");
        }
    }
    public static void main(String XYZ[])
    {
        try
        {
            int a=10;
            checkedAge(a);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}