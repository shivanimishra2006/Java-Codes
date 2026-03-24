package Interfaces_in_java;

interface Account
{
    void deposit();
    void withdraw();
}
interface Loan
{
    void applyLoan();
}
class Customer implements Account,Loan
{
    String name;
    double balance;
    
    public void  deposit()
    {
        double amount =40000;
        balance+=amount;
        System.out.println("Deposited balance:"+amount);
    }
    public void withdraw()
    {
        double amount=10000;

        if(amount<=balance)
        {
            System.out.println("Withdraw balance:"+amount);
        }
        else
        {
            System.out.println("Insufficient Balance!");
        }
    }
    public void applyLoan()
    {
        if(balance>=100000)
        {
            System.out.println("Loan Approved!");
        }
        else
        {
            System.out.println("Loan Not Approved!");
        }
    }
}
class BankLoan
{
    public static void main(String XYZ[])
    {
        Customer cus=new Customer();
        cus.name="Rohini Bisht";
        cus.balance=2000;

        cus.deposit();
        cus.withdraw();
        cus.applyLoan();
    }
}