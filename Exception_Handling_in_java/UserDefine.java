//USER Defined Exception

package Exception_Handling_in_java;

class UserdefinedException extends Exception
{
    public void Show()
    {
        System.out.println("Insufficient Balance!");
    }
}
class TestVoteAge
{
    static void Checkage(int age) throws UserdefinedException
    {
        if(age >= 18)
        {
            System.out.println("Eligible to vote !");
        }
        else
        {
            System.out.println("Not eligible for vote!");
        }
    }
}

class UserDefine
{
    public static void main(String XXYZ[])
    {
        TestVoteAge tva=new TestVoteAge();
        try
        {
            int a = 8;
            tva.Checkage(a);
        }
        catch(UserdefinedException e)
        {
            System.out.println("Exception occurred! " + e.getMessage());
        }
        catch(Exception e)
        {
            System.out.println("Exception found!");
        }
    }
}