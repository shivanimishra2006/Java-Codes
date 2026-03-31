//USER Defined Exception

package Exception_Handling_in_java;

class UserDefine extends Exception
{
    // Constructor to accept message
    UserDefine(String message)
    {
        super(message);
    }

    static void Checkage(int age) throws UserDefine
    {
        if(age >= 18)
        {
            System.out.println("Eligible to vote !");
        }
        else
        {
            throw new UserDefine("Not Eligible to vote");
        }
    }
    public static void main(String XXYZ[])
    {
        try
        {
            int a = 8;
            Checkage(a);
        }
        catch(UserDefine e)
        {
            System.out.println("Exception occurred! " + e.getMessage());
        }
        catch(Exception e)
        {
            System.out.println("Exception found!");
        }
    }
}