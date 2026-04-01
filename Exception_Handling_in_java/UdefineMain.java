package Exception_Handling_in_java;

class InsufficientBalanceException extends Exception
{
    public void ShowMsg()
    {
        System.out.println("Insufficient Balance!");
    }
}
class BankAccount 
{
    double balance;
    String accountHolder;
    public void withdraw(double amount) throws InsufficientBalanceException
    {
        if(amount<balance)
        {
            balance-=amount;
            System.out.println("withdraw successfully!"+balance);
        }
        else
        {
            throw new InsufficientBalanceException();
        }
    }
}
class UdefineMain
{
    public static void main(String [] xyz)
    {
        BankAccount ba=new BankAccount();
        ba.accountHolder="Rohan";
        ba.balance=8000;
        try
        {
            ba.withdraw(10000);
        }
        catch(InsufficientBalanceException ise)
        {
            ise.ShowMsg();
        }
        catch(Exception e)
        {
            System.out.println("Exception Found!"+e.getMessage());
        }
    }
}