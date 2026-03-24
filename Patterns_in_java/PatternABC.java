import java.util.Scanner;

class PatternABC
{
    public static void main(String XYZ[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n:");
        int n=sc.nextInt();
        int i,j;
        char ch='A';
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.printf(ch+" ");
                ch++;
            }
            System.out.println (" ");
        }
    }
}