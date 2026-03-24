class ADDNUM
{
    int addition()
    {
        int a=40;
        int b=80;
        return a+b;
    }
}
//MAIN CLASS
class Maclass
{
    public static void main (String XYZ[])
    {
        ADDNUM ad=new ADDNUM();
        int res=ad.addition();
        System.out .println("sum is:"+res);
    }
}