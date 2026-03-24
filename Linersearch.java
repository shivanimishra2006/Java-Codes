import java.util.Scanner;
class Linersearch
{
    public static void main(String XYZ[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int i=0;
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the number to be search:");
        int value=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(arr[i]==value)
            {
                break;
            }
        }
        if(i<n)
        {
            System.out.println("Element found at index"+i+"n the given array!");
        }
        else
        {
            System.out.println("Element not found in the given array!");
        }
    }
}