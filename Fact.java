import java.util.Scanner;
class Fact
{
    public static void  main(String XYZ[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        int f=1;
        //int n=5;
        while(i<=n)
        {
            f=f*i;
            i++;
        }
        System.out.println("FACTORIAL OF THE GIVEN NUMBER IS:"+f);
    };
};