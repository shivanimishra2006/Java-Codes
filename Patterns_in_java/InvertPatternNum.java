import java.util.Scanner;

class InvertPatternNum
{
    public static void main(String XYZ[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n:");
        int n=sc.nextInt();
        int i,j;
        for(i=1;i<=n;i++)
        {
            for(j=i;j<=n;j++)
            {
                System.out.printf(j+" ");
            }
            System.out.println ();
        }
    }
}