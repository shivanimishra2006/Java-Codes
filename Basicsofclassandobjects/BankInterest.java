//Hierarical inheritance

class Bank
{
    double getInterestRate()
    {
        return 0;
    }
}
class SBI extends Bank
{
    double getInterestRate()
    {
        return 8.5;
    }
}
class HDFC extends Bank
{
    double getInterestRate()
    {
        return 9.2;
    }
}
class ICICI extends Bank
{
    double getInterestRate()
    {
        return 7.5;
    }
}
class BankInterest
{
    public static void main(String XYZ[])
    {
        SBI sb=new SBI();
        HDFC hd=new HDFC();
        ICICI ic=new ICICI();

        System.out.println("SBI interest rate:"+sb.getInterestRate()+"%");
        System.out.println("HDFC interest rate:"+hd.getInterestRate()+"%");
        System.out.println("ICICI interest rate:"+ic.getInterestRate()+"%");
    }
}