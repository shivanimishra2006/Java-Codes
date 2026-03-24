import java.util.Scanner;

class DiamondPattern
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value n:");
        int n=sc.nextInt();
        int i,j,k;
     /*  Upper part*/
        for(i = 1; i <= n; i++)
        {
            for(j = 1; j < i; j++)
                System.out.print("  ");

            for(k = i; k <= n; k++)
                System.out.print(j + " ");

            System.out.println();
        }

        // Lower part
        for(i = n-1; i >= 1; i--)
        {
            for(j = 1; j < i; j++)
                System.out.print("  ");

            for(k = i; k <= n; k++)
                System.out.print(j + " ");

            System.out.println();
        }
    }
}