class Fibo
{
    public static void main(String XYZ[])
    {
        int i;
        int n=10;
        int a=0,b=1;
        int c;
        System.out.println("FIBONACCI SERIES:\n");
        for(i=1;i<=n;i++)
        {
            System.out.println("a="+a+"b="+b);
            c=a+b;
            a=b;
            b=c;
        }
    };
};